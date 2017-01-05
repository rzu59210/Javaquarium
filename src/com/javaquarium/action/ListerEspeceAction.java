package com.javaquarium.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.javaquarium.business.IPoissonService;
import com.javaquarium.business.PoissonService;

/**
 * @author kevin
 * Page Web : Lister les especes de poissons
 */
public class ListerEspeceAction extends Action {
	public static final String SESSION_LISTE_POISSON = "listePoisson";
	private IPoissonService poisson ;
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest req,
			final HttpServletResponse res) {
		poisson = new PoissonService();
		req.getSession().setAttribute(SESSION_LISTE_POISSON, poisson.getAllPoisson());

		return mapping.findForward("success");

	}
}
