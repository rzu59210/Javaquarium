package com.javaquarium.action;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.javaquarium.beans.web.LoginVO;
import com.javaquarium.beans.web.UserVO;
import com.javaquarium.business.IUtilisateurService;
import com.javaquarium.business.LoginService;
import com.javaquarium.business.PoissonService;

public class RegisterAction extends Action {
	/**
	 * Forward called every times.
	 */
	private static final String FW_SUCCESS = "success";
	private static final String FW_FORM_ERROR = "form_error";

	/**
	 * The login name of the authenticated user.
	 */
	public static final String SESSION_USERNAME = "login";

	@SuppressWarnings("deprecation")
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest req,
			final HttpServletResponse res) {
		String forward = FW_SUCCESS;
				
				IUtilisateurService userService = new LoginService();
				UserVO oldUser = userService.getUser(((UserVO)form).getLogin());
				
				Properties properties = new Properties();
				String propertiesFileName = "ApplicationResources.properties";
				
				if (oldUser == null) {
					userService.addUser((UserVO)form);
				} else {
					ActionErrors errors = new ActionErrors();
					System.out.println("Erreur ! " + errors);

					errors.add("errors.field.login.already.exist", 
							new ActionMessage("errors.field.login.already.exist"));
					saveErrors(req, errors);
					forward = FW_FORM_ERROR;
				}
				
		return mapping.findForward(forward);
	}
}
