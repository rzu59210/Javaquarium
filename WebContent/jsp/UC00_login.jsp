<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.3.0/pure-min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
body {
	width: 1080px;
	margin: auto;
}

#content {
	width: 500px;
	margin: auto;
	margin-top: 100px;
}
</style>
<title>Connexion</title>
</head>
<body>
	<div id="error">
		<html:errors />
	</div>
	<div id="content">
		<form class="pure-form pure-form-aligned" action="connexion">
			<fieldset>
				<div class="pure-control-group">
					<label for="name">Username</label> <input id="name" type="text"
						placeholder="Username">
				</div>

				<div class="pure-control-group">
					<label for="password">Password</label> <input id="password"
						type="password" placeholder="Password">
				</div>

				<div class="pure-controls">
					<button type="submit" class="pure-button pure-button-primary">Envoyer</button>
					<button type="" class="pure-button pure-button-primary">Reset</button>
				</div>
			</fieldset>
		</form>
	</div>

</body>
</html>