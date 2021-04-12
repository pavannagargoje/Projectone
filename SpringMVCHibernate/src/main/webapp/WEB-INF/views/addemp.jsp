<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add Customer</div>
    </div>
    <div class="panel-body">
     <form:form action="saveCustomer" cssClass="form-horizontal"
      method="post" modelAttribute="employee">

      <!-- need to associate this data with customer id -->
      <form:hidden path="id" />

      <div class="form-group">
       <label for="username" class="col-md-3 control-label">Username</label>
       <div class="col-md-9">
        <form:input path="username" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="password" class="col-md-3 control-label">Password</label>
       <div class="col-md-9">
        <form:input path="password" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <label for="email" class="col-md-3 control-label">Email</label>
       <div class="col-md-9">
        <form:input path="email" cssClass="form-control" />
       </div>
      </div>
      
       <div class="form-group">
       <label for="designation" class="col-md-3 control-label">Designation</label>
       <div class="col-md-9">
        <form:input path="designation" cssClass="form-control" />
       </div>
      </div>
      
       <div class="form-group">
       <label for="mobileno" class="col-md-3 control-label">Mobile No.</label>
       <div class="col-md-9">
        <form:input path="mobileno" cssClass="form-control" />
       </div>
      </div>
      
      <div class="form-group" >
       <label for="role" class="col-md-3 control-label">Role</label>
       <div class="col-md-9">
        <form:input path="role" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Submit</form:button>
       </div>
       <br>
       <a href="home">Show Employee</a>
      </div>

     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>