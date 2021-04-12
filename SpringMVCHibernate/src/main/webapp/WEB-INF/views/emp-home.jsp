<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>javabykiran</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
 <div class="container">
  <div class="col-md-offset-1 col-md-10">
  
   
   
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Employee </div>
    </div>
    <div class="panel-body">
     <table class="table table-dark table-striped">
     <thead class="thead-dark">
      <tr>
       <th>ID</th>
       <th>Username</th>
       <th>Designation</th>
       <th>Email</th>
       <th>Action</th>
      </tr>
</thead>
      <!-- loop over and print our customers -->
      <c:forEach var="employee" items="${alllist}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="/updateForm">
        <c:param name="employeeId" value="${employee.id}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
      

       <tr>
        <td>${employee.id}</td>
        <td>${employee.username}</td>
        <td>${employee.designation}</td>
        <td>${employee.email}</td>
      

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         
        
        </td>

       </tr>

      </c:forEach>

     </table>

    </div>
   </div>
  </div>

 </div>
</body>
</html>