package com.javaquarium.business;

import java.util.ArrayList;
import java.util.List;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.beans.web.PoissonVO;
import com.javaquarium.dao.IPoissonDAO;
import com.javaquarium.dao.PoissonDAO;

/**
 * @author kevin <b>addPoisson</> add Poisson <b>getAllPoisson</b> return
 *         Poisson
 * 
 */
/**
 * @author kevin
 *
 */
public class PoissonService implements IPoissonService {

	private IPoissonDAO poissonDAO;
	
	/**
	 * Constructor
	 */
	public PoissonService(){
		this.poissonDAO = new PoissonDAO();
	}
	
	@Override
	public List<PoissonVO> getAllPoisson() {
		final List<PoissonDO> listPoisson =  poissonDAO.getAllPoisson();
		final List<PoissonVO> poisson = new ArrayList<PoissonVO>(listPoisson.size());
		for(final PoissonDO poissons : listPoisson){
			poisson.add(mapPoisson(poissons));
		}
		return poisson;	
	}
	@Override
	public void addPoisson(final PoissonVO poisson) {
		System.out.println("PoissonService addPoisson : " + poisson);
		PoissonDO p = this.mapPoisson(poisson);
		poissonDAO.addPoisson(p);
	}
	
	/**
	 * @param p
	 * @return poisson
	 */
	public PoissonVO mapPoisson(final PoissonDO p){
		PoissonVO poisson = null;
		if (p != null) {
			poisson = new PoissonVO();
			poisson.setCode(p.getId());
			poisson.setCouleur(p.getCouleur());
			poisson.setDescription(p.getDescription());
			poisson.setDimension(p.getLargeur() + "x" + p.getLongueur());
			poisson.setEspece(p.getEspece());
			poisson.setPrix(p.getPrix() + "");
		}
		System.out.println("mapPoisson PoissonService p : " + p);
		System.out.println("mapPoisson PoissonService : " + poisson);
		return poisson;		
	}
	
	
	@Override
	public PoissonVO getPoisson(final String espece) {
		return mapPoisson(poissonDAO.getPoisson(espece));
	}
	

	@Override
	public PoissonDO mapPoisson(final PoissonVO poisson) {
		System.out.println("PoissonVO  " + poisson);
		PoissonDO poissonDO = null;
		if (poisson != null) {
			poissonDO = new PoissonDO();
			poissonDO.setCode(poisson.getCode());
			poissonDO.setCouleur(poisson.getCouleur());
			poissonDO.setDescription(poisson.getDescription());
		//	poissonDO.setDimension(poisson.getLargeur() + "x" + poisson.getLongeur());
			poissonDO.setEspece(poisson.getEspece());
			poissonDO.setPrix(poisson.getPrix());
		}
		return poissonDO;		
	}

}
