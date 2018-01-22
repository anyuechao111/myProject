<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/common/myInclude.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="panel panel-primary">
    <div class="panel-heading">查询</div>
    <div class="panel-body">
    	<div class="btn-group">
		    <button type="button" class="btn btn-success" onclick="updateInfo()">
		    	<span class="glyphicon glyphicon-plane">修改</span>
		    </button>
	  	</div>
    	<table id="testTableId"></table>
    </div>
    <div class="panel-footer"></div>
</div>
<script type="text/javascript">
$(function (){
	$("#testTableId").bootstrapTable({
		 url:"<%=request.getContextPath()%>/test/querylist.do",	
		 method:"post",
		 striped: true,  	// 斑马线效果     默认false 
		 //只允许选中一行
		 singleSelect:true,
		 //选中行是不选中复选框或者单选按钮
		 clickToSelect:true,
		 showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
		 cardView: false,                    //是否显示详细视图
		 uniqueId: "drugId",                 //每一行的唯一标识，一般为主键列
		 showColumns: true,                  //是否显示所有的列
		 showRefresh: true,                  //是否显示刷新按钮
		 minimumCountColumns: 2,     //  最少留两列
		 detailView: false,                  //是否显示父子表
		 //发送到服务器的数据编码类型  
		contentType:'application/x-www-form-urlencoded;charset=UTF-8',   //数据编码纯文本  offset=0&limit=5
		toolbar:'#tabToolBar',   //  工具定义位置
		columns:[
		     	{field:'',title:'',width:50,class:"danger",checkbox:true},
				{field:'id',title:'ID', class:'warning',width:100},
				{field:'name',title:'名称', class:'success',width:100},
				{field:'price',title:'价格', class:'danger',width:100},
				{field:'date',title:'时间', class:'info',width:100},
				{field:'',title:'', class:'info',width:100,}
			 ],
		         
		         //传递参数（*）
				 queryParams: function(params) {
					 	var whereParams = {    
					 			/*
					 				分页  自定义的参数         默认传 limit（展示几条）    offset（从第几条开始    起始条数）           
					 			*/
					 			"pageSize":params.limit,
					 			"start":params.offset,
					 	}
						 return whereParams;
					 },
					 //前台--排序字段
					 //sortName:'proPrice',
					 //sortOrder:'desc',
					 //前台--搜索框
					 search:true,
					 //启动回车键做搜索功能
					 searchOnEnterKey:true,
			   	    //分页方式   后台请求的分页方式
					 sidePagination:'server',
					 pagination: true,                   //是否显示分页（*）
					 pageNum: 1,                       //每页的记录行数（*）
					 pageSize: 3,                       //每页的记录行数（*）
					 pageList: [3, 6, 9,12],        //可供选择的每页的行数（*） 
	});
		
})

function updateInfo(){
	var data = $("#testTableId").bootstrapTable("getSelections");
	if (data.length == 0) {
		bootbox.alert("请选择修改的信息");
		return ;
	}
	bootbox.dialog({
		title:"修改信息",
		message:function(){
			var teacherPage = "";
			$.ajax({
				url:"<%=request.getContextPath()%>/test/toUpdatePage.do",
				data:{"id":data[0].id},
				async:false,
				success:function(data){
					teacherPage = data;
				},
				error:function(){
					bootbox.alert("系统错误");
				}
			})
			return teacherPage;
		},
		buttons:{
			"save":{
				label:"保存信息",
				className:"btn-success",
				callback:function(){
					$.ajax({
						url:"<%=request.getContextPath()%>/test/saveOrUpdateInfo.do",
						type:"post",
						data:$("#updateForm").serialize(),
						success:function(){
							bootbox.alert("保存成功");
							$("#testTableId").bootstrapTable("refresh");
						},
						error:function(){
							bootbox.alert("系统错误");
						}
					})
				},
			},
			"unSave":{
				label:"取消",
				className:"btn-info",
				callback:function(){
					//return true;//FALSE不关闭
				}
			}
		}
	})
}
</script>
</body>
</html>
