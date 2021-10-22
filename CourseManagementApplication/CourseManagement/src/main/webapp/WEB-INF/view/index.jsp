<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>index</title>
  </head>
  <body>
 <center>
<br/><br/>
<br/>
<h1>Welcome to TECH Courses..!!!</h1>
<br/>
<h2>All Details...</h2>

<a href="add">Add-Data</a>
&nbsp;&nbsp;&nbsp;&nbsp;
 
<a href="/">Show-Data</a> 


<br/><br/>


<table border=4, border-color: red>
<tr>
<th>Course_Id</th>
<th>Course_Name</th>
<th>Person name</th>
<th>City</th>
<th>Fees</th>
<th>Action</th>


</tr>

<tr>
<c:forEach items="${courselist}" var="sobj">
<tr>
<td>${sobj.getCid()}</td>
<td>${sobj.getCname()}</td>
<td>${sobj.getPname()}</td>
<td>${sobj.getCity()}</td>
<td>${sobj.getFees()}</td>

<td><a href="edit/${sobj.getCid()}">Edit</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="delete/${sobj.getCid()}">Delete</a> 
</td>

</tr>

</c:forEach>



</table>
</center>




</body>



</html>