<%@page import="com.javaquarium.action.LoginAction"%>
<%@page import="com.javaquarium.action.ListerEspeceAction"%>
<%@page import="com.javaquarium.action.AjoutUserPoissonAction"%>
<%@page import="com.javaquarium.util.SessionUtils"%>
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
table{
	margin-top: 50px;
}
a{
	color : white
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
		<h1>
		Bienvenue
		<%=request.getSession().getAttribute(LoginAction.SESSION_USERNAME)%>
		</h1>
		<h2>Vous avez : <b><%=SessionUtils.countNumberOfPoisson(request.getSession().getAttribute(
					AjoutUserPoissonAction.SESSION_USER_POISSONS))%></b> poisson(s)</h2>

		<div id="buttonAction">
			<a class="btn btn-xs btn-success"
				href="/Javaquarium/sauvegarderPoisson.do">
				<button class="button-success pure-button">
				Sauvegarder
				</button></a>
			
			<a  href="/Javaquarium/viderPoisson.do">
				<button class="button-error pure-button">Vider</button>
			</a>
			
		</div>
		<table class="pure-table pure-table-bordered">
			<thead>
				<tr>
					<th><bean:message key="message.app.colNom" /></th>
					<th><bean:message key="message.app.colDesc"/></th>
					<th><bean:message key="message.app.colColor"/></th>
					<th><bean:message key="message.app.colDim"/></th>
					<th><bean:message key="message.app.colPrix"/></th>
					<th><bean:message key="message.app.colDetail"/></th>
					
				</tr>
			</thead>
			
			<logic:iterate id="poisson" scope="session" name="<%=ListerEspeceAction.SESSION_LISTE_POISSON%>">
				<tr>
					<td><bean:write name="poisson" property="espece" /></td>
					<td><bean:write name="poisson" property="description" /></td>
					<td><bean:write name="poisson" property="couleur" /></td>
					<td><bean:write name="poisson" property="dimension" /></td>
					<td><bean:write name="poisson" property="prix" /></td>
					<td>
						<a
						href="/Javaquarium/ajoutUserPoisson.do?espece=<bean:write 
						name="poisson" property="espece" />">
						<button class="button-success pure-button">Enregistrer</button>
						</a>
						<a 
						href="/Javaquarium/supprimerPoisson.do?espece=<bean:write 
						name="poisson" property="espece" />">
						<button class="button-error pure-button">Supprimer</button>
						</a>
						
					</td>
				</tr>
			</logic:iterate>
		</table>
		</br>
		<a href="jsp/UC02_ajouterPoisson.jsp">
		<button class="button-success pure-button">
		 	Ajouter un poisson
		 </button>
		 </a>
	</div>
</body>
</html>