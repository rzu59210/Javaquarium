package com.javaquarium.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.javaquarium.business.IPoissonService;
import com.javaquarium.business.IUserPoissonService;
import com.javaquarium.business.PoissonService;
import com.javaquarium.business.UserPoissonService;

/**
 * @author kevin Page Web : Lister les especes de poissons
 */
public class ListerEspeceAction extends Action {
	
		
	public static final String SESSION_LISTE_POISSON = "listePoisson";
	private static final String FW_SUCCESS = "success";

	private IPoissonService poisson;

	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest req,
			final HttpServletResponse res) {
		final IPoissonService poissonService = new PoissonService();
		final IUserPoissonService userPoissonService = new UserPoissonService();

		// Récupérer les especes de poissons de la base de données
		req.getSession().setAttribute(SESSION_LISTE_POISSON, poissonService.getAllPoisson());

		// Récupérer les poissons de l'utilisateur si la variable de session est
		// vide
		@SuppressWarnings("unchecked")
		Map<String, Integer> userPoissons = (Map<String, Integer>) req.getSession().getAttribute(
				com.javaquarium.action.AjoutUserPoissonAction.SESSION_USER_POISSONS);
		
		
		System.out.println("userPoisson " + userPoissons);

		if (userPoissons == null) {
			userPoissons = userPoissonService.getUserAllUserPoisson((String) req.getSession().getAttribute(
					com.javaquarium.action.LoginAction.SESSION_USERNAME));
			req.getSession().setAttribute(com.javaquarium.action.AjoutUserPoissonAction.SESSION_USER_POISSONS,
					userPoissons);
		}

		String forward = FW_SUCCESS;
		
		return mapping.findForward(forward);

}
}
