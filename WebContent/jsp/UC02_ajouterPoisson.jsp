<%@ taglib uri="/WEB-INF/tld/struts-bean-1.2.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/tld/struts-html-1.2.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic-1.2.tld" prefix="logic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.3.0/pure-min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
#content {
	width: 1080px;
	margin: auto;
}
</style>
<title>Ajouter une espece</title>
</head>
<body>
	<div id="error"></div>
	<div id="content">

		<html:form styleClass="pure-form pure-form-aligned" action="ajout">
			<fieldset>
				<legend>
					<bean:message key="message.ajouterPoisson.title" />
				</legend>
				<div class="pure-control-group">
					<label for="name"><bean:message
							key="message.ajouterPoisson.input.espece" /></label>
					<html:text property="espece" />
				</div>
				<div class="pure-control-group">
					<label for="Description"><bean:message
							key="message.ajouterPoisson.input.description" /></label>
					<html:text property="description" />
				</div>
				<div class="pure-control-group">
					<label for="couleur"><bean:message
							key="message.ajouterPoisson.input.couleur" /></label>
					<html:text property="couleur" />
				</div>
				<div class="pure-control-group">
					<label for="longueur"><bean:message
							key="message.ajouterPoisson.input.longeur" /></label>
					<html:text property="longeur" />
				</div>
				<div class="pure-control-group">
					<label for="largeur"><bean:message
							key="message.ajouterPoisson.input.largeur" /></label>
					<html:text property="largeur" />
				</div>
				<div class="pure-control-group">
					<label for="prix"><bean:message
							key="message.ajouterPoisson.input.prix" /></label>
					<html:text property="prix" />
				</div>

			</fieldset>
			<html:submit property="submit"
				styleClass="button-success pure-button">
				<bean:message key="message.ajouterPoisson.button.ajouter" />
			</html:submit>

		</html:form>
	</div>
</body>
</html>