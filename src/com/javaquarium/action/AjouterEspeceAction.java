package com.javaquarium.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.business.IPoissonService;
import com.javaquarium.business.PoissonService;

/**
 * @author kevin Page Web : Ajouter un poisson
 */
public class AjouterEspeceAction extends Action {
	private static final String SUCCESS = "success";
	private static final String ERROR = "error";

	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest req,
			final HttpServletResponse res) {
		String forward = SUCCESS;
		IPoissonService poissonService = new PoissonService();
		PoissonVO poisson = poissonService.getPoisson(((PoissonVO) form).getEspece());
		if (poisson == null) {
			System.out.println("Largeur : " + ((PoissonVO) form).getLargeur());
			poissonService.addPoisson((PoissonVO) form);
		} else {
			ActionErrors errors = new ActionErrors();
			errors.add("Erreur poisson déjà existant ", new ActionMessage("Erreur !"));
			saveErrors(req, errors);
			forward = ERROR;
		}
		return mapping.findForward(forward);
	}

}
