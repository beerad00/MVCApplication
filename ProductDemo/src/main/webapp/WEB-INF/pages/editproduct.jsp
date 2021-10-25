<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored="false" %>

<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
</head>
<body>
<nav class="navbar navbar-dark bg-primary">
<ul class="nav navbar-nav">
<li><a href="home" class="btn btn-primary">Home</a></li>
<li><a href="addProduct" class="btn btn-primary">Add</a></li>
</ul>
</nav>
<frm:form action="updateProduct" method="post" class="form-horizontal">
<div class="form-group">
<div class="col-xs-3">
<h2><label for="id" >Update</label></h2>
<frm:hidden path="id" class="form-control" placeholder='Id'/>
</div>
</div>

<div class="form-group">
<div class="col-xs-3">
<label for="name" >Name</label>
<frm:input path="name" class="form-control" placeholder='Name'/>
</div>
</div>

<div class="form-group">
<div class="col-xs-3">
<label for="price" >Price</label>
<frm:input path="price" class="form-control" placeholder='Price'/>
</div>
</div>

<div class="form-group">
<div class="col-xs-3">
<input type="submit" class="btn btn-primary" value="Save" >
</div>
</div>
</frm:form>
</body>
