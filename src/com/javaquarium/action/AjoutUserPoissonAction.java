package com.javaquarium.action;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;



public class AjoutUserPoissonAction extends Action {
	/**
	 * Forward called every times.
	 */
	private static final String FW_SUCCESS = "success";

	/**
	 * The login name of the authenticated user.
	 */
	public static final String SESSION_USER_POISSONS = "user_poissons";

	/**
	 * The poissonVO primary key
	 */
	public static final String POISSON_PRIMARY_KEY = "espece";
	
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest req,
			final HttpServletResponse res) {

		final String especeParameterValue = req.getParameter(POISSON_PRIMARY_KEY);
		
		/* cl�e : espece_id / valeur : nombre de poissons de cet utilisateur */
		@SuppressWarnings("unchecked")
		Map<String, Integer> userPoissons = (Map<String, Integer>) req.getSession().getAttribute(
				SESSION_USER_POISSONS);

		int count = 0;
		
		/* user has not registred any poisson yet */
		if (userPoissons == null) {
			userPoissons = new HashMap<String, Integer>();
		}
		if (userPoissons.get(especeParameterValue) != null) {
			count = userPoissons.get(especeParameterValue);
		}
		
		userPoissons.put(especeParameterValue, count + 1);
		
		req.getSession().setAttribute(
				com.javaquarium.action.AjoutUserPoissonAction.SESSION_USER_POISSONS, userPoissons);

		final String forward = FW_SUCCESS;
		
		return mapping.findForward(forward);
}

}
