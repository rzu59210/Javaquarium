package com.javaquarium.business;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;

import com.javaquarium.beans.data.UserDO;
import com.javaquarium.beans.web.LoginVO;
import com.javaquarium.beans.web.UserVO;
import com.javaquarium.dao.IUserDAO;
import com.javaquarium.dao.UserDAO;
import com.javaquarium.util.PasswordHashUtils;

public class LoginService implements IUtilisateurService {

	private IUserDAO dao;
	
	public LoginService(){
		dao = new UserDAO();
	}
	@Override
	public List<UserVO> getAllUser() {
		final List<UserDO> listUser = dao.getAllUser();
		List<UserVO> users = new ArrayList<UserVO>(listUser.size());
		for (final UserDO user : listUser) {
			users.add(map(user));
		}
		return users;
	}

	@Override
	public UserDO map(UserVO user) {
		UserDO u = null;
		if (user != null) {
			u = new UserDO();
			u.setLogin(user.getLogin());
			try {
				u.setPasswordHash(PasswordHashUtils.createHash(user.getPassword()));
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (InvalidKeySpecException e) {
				e.printStackTrace();
			}
		}
		return u;
	}

	@Override
	public UserVO map(UserDO user) {
		UserVO u = null;
		if (user != null) {
			u = new UserVO();
			u.setLogin(user.getLogin());
			u.setPassword(null);
			u.setPasswordRepeat(null);
		}
		return u;
	}

	@Override
	public void addUser(UserVO user) {
		System.out.println("Je passe ici " + user);
		UserDO u = this.map(user);
		dao.addUser(u);
		
	}

	@Override
	public UserVO getUser(String login) {
		System.out.println("UserVo" + login);
		return map(dao.getUser(login));
	}

	@Override
	public boolean validateLogin(String login, String password) {
		boolean returnVal = false;
		UserDO databaseUser = dao.getUser(login);
		if (databaseUser != null) {
			try {
				returnVal = PasswordHashUtils.validatePassword(password, databaseUser.getPasswordHash());
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (InvalidKeySpecException e) {
				e.printStackTrace();
			}
		}
		return returnVal;
	}

}
