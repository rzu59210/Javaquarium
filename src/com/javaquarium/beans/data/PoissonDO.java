package com.javaquarium.beans.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="t_poisson")
public class PoissonDO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="c_id")
	private Integer id;
	
	@Column(name="c_code")
	private Integer code;
	
	@Column(name="c_espece")
	private String espece;
	
	@Column(name="c_description")
	private String description;
	
	@Column(name="c_couleur")
	private String couleur;
	
	@Column(name="c_longueur")
	private String longueur;
	
	@Column(name="c_largeur")
	private String largeur;
	
	
	@Column(name="c_prix")
	private String prix;
	
	
	
	/**
	 * @return the longueur
	 */
	public String getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(String longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public String getLargeur() {
		return largeur;
	}
	
	
	
	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(String largeur) {
		this.largeur = largeur;
	}

	
	public PoissonDO(){}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the espece
	 */
	public String getEspece() {
		return espece;
	}

	/**
	 * @param espece the espece to set
	 */
	public void setEspece(String espece) {
		this.espece = espece;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the prix
	 */
	public String getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(String prix) {
		this.prix = prix;
	}
	

	
}
	
	
	