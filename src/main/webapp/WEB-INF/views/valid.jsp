<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validate Form</title>
</head>
<body>
	<h2>Validate Form Spring MVC</h2>
	<c:if test="${not empty success}">
		<p style="color: blue">${success}</p>
	</c:if>
	<c:url value="/valid" var="valid"></c:url>
	<form action="${valid}" method="post" enctype="multipart/form-data">
		<p>
			<form:errors path="error.name" cssStyle="color:red;font-style:italic" ></form:errors><br />
			<label>Họ tên</label>
			<input type="text" name="name" value="${user.name}" />
		</p>
		<p>
			<form:errors path="error.age" cssStyle="color:red;font-style:italic" ></form:errors><br />
			<label>Tuổi</label>
			<input type="text" name="age" value="${user.age}" />
		</p>
		<p>
			<form:errors path="error.avatar" cssStyle="color:red;font-style:italic" ></form:errors><br />
			<label>Ảnh đại diện</label>
			<input type="file" name="picture" />
		</p>
		<p>
			<input type="submit" value="Submit" />
		</p>
	</form>
</body>
</html>