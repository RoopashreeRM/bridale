<!DOCTYPE html>

<head>
<link rel="stylesheet"href="style.css">
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    background-color:black;
}</style>
<link href="https://fastcdn.org/Animate.css/3.4.0/animate.min.css" rel="stylesheet">
</head>
<body>
<table>
<form action ="RegisterController1" method="post">
<tr>
<td>
<input type ="text" name="username" placeholder="enter username" values="${username}">
</td>

<td>
<p style="color:red">${error['usernameerror']}</p>
</td>
</tr>
<tr>
<td>
<input type ="text" name="age" placeholder="enter age"  values="${age}">
</td>
<td>
<p style="color:red">${error['ageerror']}</p>
</td>
</tr>
<tr>
<td>
<input type ="text" name="password" placeholder="enter password" values="${password}">
</td>
<td>
<p style="color:red">${error['passworderror']}</p>
</td>
</tr>
<tr>
<td>
<input type ="password" name="cpassword" placeholder="Confirm password">
</td>
</tr>
<tr>
<td>
<input type="submit" value="send">
</td>
</tr>
<tr>
<td>

<a class ="btn btn-warning" href="login1.jsp">login
</a>
</td>
</tr>

</form>

<div class="row">
<div class="col-md-4">
<div class="animated jello"id="navigation1">
<img src="images/lovey.jpg" style="width:70%">
</div>
</div>

<div class="col-md-offset-4" "col-md-12">
<div class="animated jello"id="navigation1">
<img src="images/7cc.gif" style="width:100%">
</div>
</div>
</table>

</body>
</html>