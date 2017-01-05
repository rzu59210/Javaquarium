package com.javaquarium.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaquarium.beans.data.PoissonDO;
import com.javaquarium.util.HibernateUtils;

/**
 * @author kevin
 *	Classic DAO 
 */
public class PoissonDAO implements IPoissonDAO {

	@SuppressWarnings("unchecked")
	public List<PoissonDO> getAllPoisson(){
		Session s = HibernateUtils.getSession();
		try{
			Query q = s.createQuery("from PoissonDO");
			return (List<PoissonDO>) q.list();
		}finally{
			s.close();
		}
		
	}

	@Override
	public PoissonDO getPoisson(String name) {
		Session s = HibernateUtils.getSession();
		PoissonDO p = null;
		Query q = s.createQuery("from PoissonDO where c_espece = :poissonName");
		q.setString("poissonName" , name);
		p = (PoissonDO) q.uniqueResult();
		return p;
	}

	@Override
	public void addPoisson(PoissonDO p) {
		Session s = HibernateUtils.getSession();
		Transaction tx = s.beginTransaction();
		System.out.println(p);
		s.save(p);
		tx.commit();
		s.close();
	}
	
}
