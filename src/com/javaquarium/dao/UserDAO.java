package com.javaquarium.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javaquarium.beans.data.UserDO;
import com.javaquarium.util.HibernateUtils;

public class UserDAO implements IUserDAO {

	@Override 
	public List<UserDO> getAllUser() {
		Session s = HibernateUtils.getSession();
		try {
			Query q = s.createQuery("from UserDO");
			return (List<UserDO>) q.list();
		} finally {
			s.close();
		}
	}

	@Override
	public UserDO getUser(String name) {
		System.out.println("UserDO getUser" + name);
		Session s = HibernateUtils.getSession();
		UserDO u = null;
		try {
			Query q = s.createQuery("from UserDO where c_login = :myLogin");
			q.setString("myLogin", name);
			System.out.println("GetUser USERDO " + name);
			u = (UserDO) q.uniqueResult();
		} finally {
			s.close();
		}
		return u;
	}

	@Override
	public void addUser(UserDO u) { 
		Session s = HibernateUtils.getSession();
		try {
			Transaction t = s.beginTransaction();
			s.save(u);
			t.commit();
		} finally {
			s.close();
		}		
	}

}
