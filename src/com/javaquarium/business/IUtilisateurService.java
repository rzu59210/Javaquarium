package com.javaquarium.business;

import java.util.List;

import com.javaquarium.beans.data.UserDO;
import com.javaquarium.beans.web.UserVO;

public interface IUtilisateurService {
	/**
	 * @return list des utilisateurs enregistrés
	 */
	List<UserVO> getAllUser();
	/**
	 * @param user
	 * @return Objet LoginDO correspondant LoginVO
	 */
	UserDO map(UserVO user);
	/**
	 * @param user
	 * @return Objet LoginDO correspondant LoginVO
	 */
	UserVO map(UserDO user);

	/**
	 * @param user
	 * Utilisateur qui doit être enregistré dans la base de données
	 */
	void addUser(UserVO user);

	/**
	 * @param login
	 * LoginDO représent le login
	 * @return LoginVO 
	 */
	UserVO getUser(String login);

	/**
	 * @param login
	 *           Login de LoginVO
	 * @param password
	 *           MDP de LoginVO
	 * @return true si utilisateur trouvé
	 */
	boolean validateLogin(String login, String password); 
	
	
}
