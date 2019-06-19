<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<script src="/jquery/jquery-1.11.1.min.js"></script>
<script>
</script>
</head>
<body>
<form:form method="POST" action="/spring-mvc-java/addEmployee"
  modelAttribute="employee">
    <form:label path="name">Name</form:label>
    <form:input path="name" />
     
    <form:label path="id">Id</form:label>
    <form:input path="id" />
     
    <input type="submit" value="Submit" />
</form:form>
<div id="div1"><h2></h2></div>
<button>get</button>

</body>
</html>