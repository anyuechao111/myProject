<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="panel panel-primary">
    <div class="panel-heading">修改</div>
    <div class="panel-body">
        <form id="updateForm">
        	<input type="hidden" name="id" value="${test.id}">
        	<div class="form-group">
				<input type="text" class="form-control" value="${test.name}" name="name" placeholder="名称">
			</div>
			<div class="form-group">
				<input type="number" name="price" value="${test.price}" class="form-control" placeholder="价格" />
			</div>
			<div class="form-group">
				<input type="text" name="date" value="${test.showDate}" class="form-control" placeholder="时间" onFocus="WdatePicker({dateFmt:'yyyy-MM-dd'})"/>
			</div>
        </form>
    </div>
    <div class="panel-footer"></div>
</div>
</body>
</html>