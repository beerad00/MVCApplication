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

<div class="card">
<div>
<table class="table table-striped table-responsive-md">
<thead>
<tr> 
<th>Id</th> <th>Name</th> <th>Price</th> <th>Edit</th> <th>Delete</th>
</tr>
</thead>
<c:forEach var="product" items="${list}">
<tr>
	<td>${product.id}</td>
	<td>${product.name}</td>
	<td>${product.price}</td>
	<td><a href="editProduct?id=${product.id}"  class="btn btn-primary"><i class="fa fa-pencil" aria-hidden="true"></i>Edit</a></td>
	<td><a href="deleteProduct?id=${product.id}"  class="btn btn-primary"><i class="fa fa-trash" aria-hidden="true"></i> </a></td>
</tr>
</c:forEach>
</table>
</div>
</div>
</body>
