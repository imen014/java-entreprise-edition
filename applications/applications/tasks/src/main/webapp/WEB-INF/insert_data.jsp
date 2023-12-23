<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insertion tasks</title>
</head>
<body>
<form action="InsertDataServlet"  method="post">

<label for="description_task"> Veuillez introduire la description de tache : </label>
<input type="text"  name="description_task" id="description_task" />

<label for="state_task"> Veuillez introduire l'etat de tache </label>
<input type="text" name="state_task"  id="description_task" />

<input type="submit" value="validez">

</form>

</body>
</html>