package com.javaquarium.beans.web;

import org.apache.struts.action.ActionForm;

public class PoissonVO extends ActionForm {

	private final long id = 903;
	private Integer code;
	private String espece;
	private String description;
	private String couleur;
	private String dimension;
	private String prix;
	private String largeur;
	private String longeur;

	/**
	 * @return the largeur
	 */
	public String getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur
	 *            the largeur to set
	 */
	public void setLargeur(String largeur) {
		this.largeur = largeur;
	}

	/**
	 * @return the longeur
	 */
	public String getLongeur() {
		return longeur;
	}

	/**
	 * @param longeur
	 *            the longeur to set
	 */
	public void setLongeur(String longeur) {
		this.longeur = longeur;
	}

	public PoissonVO() {
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
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
	 * @param espece
	 *            the espece to set
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
	 * @param description
	 *            the description to set
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
	 * @param couleur
	 *            the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the dimension
	 */
	public String getDimension() {
		return dimension;
	}

	/**
	 * @param dimension
	 *            the dimension to set
	 */
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	/**
	 * @return the prix
	 */
	public String getPrix() {
		return prix;
	}

	/**
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(String prix) {
		this.prix = prix;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

}
