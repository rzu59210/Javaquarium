package com.javaquarium.business;

import java.util.List;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.beans.web.PoissonVO;

/**
 * @author kevin
 * 
 */
public interface IPoissonService {
	
	/**
	 * @return allPoisson
	 */
	List<PoissonVO> getAllPoisson();
	/**
	 * @param poisson
	 * @return PoissonDO object
	 */
	PoissonVO mapPoisson(PoissonDO poisson);
	/**
	 * @param poisson
	 * @return PoissonVO object
	 */
	PoissonDO mapPoisson(PoissonVO poisson);
	/**
	 * @param espece
	 * @return le poissonVO correspondant 
	 */
	PoissonVO getPoisson(String espece);
	
	/**
	 * @param poisson
	 * add a poisson
	 */
	void addPoisson(PoissonVO poisson);
	
	

}
