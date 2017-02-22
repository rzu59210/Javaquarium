<%@page import="com.javaquarium.action.ListerEspeceAction"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic-1.2.tld" prefix="logic"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.3.0/pure-min.css">
<style>
body {
	width: 1080px;
	margin: auto;
}
.button-success,
.button-error,
.button-warning,
.button-secondary {
    color: white;
    border-radius: 4px;
    text-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
}
.button-success{
	background: rgb(28, 184, 65); /* this is a green */
}
.button-error {
    background: rgb(202, 60, 60); /* this is a maroon */
}
</style>
<title><bean:message key="message.app.title"/></title>
</head>
<body>
	<div id="content">
		<h1>Bienvenue</h1>

		<table class="pure-table pure-table-bordered">
			<thead>
				<tr>
					<th><bean:message key="message.app.colNom" /></th>
					<th><bean:message key="message.app.colDesc"/></th>
					<th><bean:message key="message.app.colColor"/></th>
					<th><bean:message key="message.app.colDim"/></th>
					<th><bean:message key="message.app.colPrix"/></th>
					<th><bean:message key="message.app.colDetail"/></th>
					<th><bean:message key="message.app.colOther"/></th>
				</tr>
			</thead>
			
			<logic:iterate id="poisson" name="<%=ListerEspeceAction.SESSION_LISTE_POISSON %>">
				<tr>
					<td><bean:write name="poisson" property="espece" /></td>
					<td><bean:write name="poisson" property="description" /></td>
					<td><bean:write name="poisson" property="couleur" /></td>
					<td><bean:write name="poisson" property="dimension" /></td>
					<td><bean:write name="poisson" property="prix" /></td>
					<td>RAS</td>
					<td><button class="button-success pure-button">Modifier</button> <button class="button-error pure-button">Supprimer</button></td>
				</tr>
			</logic:iterate>
		</table>
		</br> <a href="jsp/UC02_ajouterPoisson.jsp">Ajouter un poisson</a>
	</div>
</body>
</html>