<%@ taglib uri="/WEB-INF/tld/struts-bean-1.2.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-html-1.2.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic-1.2.tld" prefix="logic" %>
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
		<html:form styleClass="pure-form pure-form-aligned" action="connexion">
			<fieldset>
				<legend></legend>
				<div class="pure-control-group">
					<label for="name">Username</label>
					 <html:text property="pseudo" />
				</div>

				<div class="pure-control-group">
					<label for="password">Password</label> 
					<html:password property="password" />
				</div>

				<div class="pure-controls">
					<html:submit property="submit" styleClass="pure-button pure-button-primary">Envoyer</html:submit>
					<html:reset property="reset" styleClass="pure-button pure-button-warning">Reset</html:reset>
				</div>
				  <a class="btn btn-primary col-sm-offset-1" href="/Javaquarium/jsp/UC03_enregistrerUser.jsp">
            		S'enregistrer
				  </a>
			</fieldset>
		</html:form>
	</div>

</body>
</html>