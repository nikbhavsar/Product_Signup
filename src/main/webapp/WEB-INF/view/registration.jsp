<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>


</head>

<body>

	<c:choose>
		<c:when test="${mode=='MODE_HOMEPAGE' }">
			<div class="container" id="homediv">
				<div class="jumbotron text-center">
					<h1>Welcome to Product Signup Experience</h1>
					<a href="/register">Click me to Register!!</a>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_REGISTER' }">
			<div class="container text-center">
				<h3>Registration</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="register-user">
					<input type="hidden" name="id" value="${user.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">Username</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="username"
								value="${user.username }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name"
								value="${user.name }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Address</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="address"
								value="${user.address }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Email </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="email"
								value="${user.email }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Password</label>
						<div class="col-md-7">
							<input type="password" class="form-control" name="password"
								value="${user.password }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Register" />
					</div>
				</form>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_PAYMENT' }">
			<div class="container text-center">
				<h3>Registration</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="finish-payment">
					<input type="hidden" name="id" value="${payment.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">Card Number</label>
						<div class="col-md-7">
							<input type="number" max="12" class="form-control"
								name="cardNumber" value="${payment.username }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Expiry Month</label>
						<div class="col-md-3">
							<input type="number" max="2" class="form-control"
								name="expiryMonth" value="${payment.expiryMonth }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Expiry Year</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="expiryYear"
								value="${payment.expiryYear }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">cvv</label>
						<div class="col-md-7">
							<input type="password" max="3" class="form-control" name="cvv"
								value="${payment.cvv }" />
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">Address</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="address"
									value="${payment.address }" />
							</div>
						</div>

					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Pay Now" />
					</div>
				</form>
			</div>
		</c:when>

	</c:choose>
</body>
</html>