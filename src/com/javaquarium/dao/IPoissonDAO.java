package com.javaquarium.dao;

import java.util.List;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.beans.web.PoissonVO;

public interface IPoissonDAO {
	/**
	 * @return all the registred poisson
	 */
	List<PoissonDO> getAllPoisson();
	/**
	 * @param name
	 * the name of the desired poisson object
	 * @return the corresponding PoissonDO object
	 */
	PoissonDO getPoisson(String name);
	/**
	 * @param p
	 *  PoissonDO object insert to the database
	 */
	void addPoisson(PoissonDO p);
	
}
