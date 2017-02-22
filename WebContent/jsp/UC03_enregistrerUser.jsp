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
<title>S'enregistrer</title>
</head>
<body>
<div id="content">
<html:form styleClass="pure-form pure-form-aligned" action="register">
<fieldset>
<ul class="list-group">
     <html:errors/>
</ul>
<legend>S'enregistrer</legend>
      <div class="pure-control-group">
		    <label for="login">
		      <bean:message
							key="message.enregistrerUser.input.name.login" />
		      <html:text property="login" /> 
	      </label>
	    </div>
	    <div class="pure-control-group">
		    <label for="password">
		       <bean:message
							key="message.enregistrerUser.input.name.password" />
		      <html:password property="password"/>
		    </label>   
	    </div>
	    <div class="pure-control-group">
        <label for="password-repeat">
           <bean:message
							key="message.enregistrerUser.input.name.repeat_password" />
          <html:password property="passwordRepeat"/>
        </label>
        
          
      </div>
	    <br />
	    <div class="form-group">
	      <div class="col-sm-offset-3 col-sm-9">
			    <html:submit property="submit" styleClass="btn btn-success">
			          <bean:message
							key="message.enregistrerUser.button.enregistrer" />
			    </html:submit>
		      <html:reset property="reset" styleClass="btn btn-danger">
		          <bean:message
							key="message.enregistrerUser.button.reset" />
		      </html:reset>
		      <a class="btn btn-primary col-sm-offset-1" href="/Javaquarium/jsp/UC00_login.jsp">
            	    <bean:message
							key="message.enregistrerUser.button.connexion" />
          	</a>
	      </div>
      </div>
      </fieldset>
</html:form>
</div>
</body>
</html>