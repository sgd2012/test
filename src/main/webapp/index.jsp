<html>
<body>
<h2>Hello World!</h2>
<form action="<%=request.getContextPath() %>/rest/index">
	bookname:<input type="text" name="name" id="name">  
	author:<input type="text" name="author" id="author">  
	<input type="submit" value="Add">  
</form>
</body>
</html>
