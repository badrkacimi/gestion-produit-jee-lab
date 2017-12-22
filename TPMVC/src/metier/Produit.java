package metier;

import java.io.Serializable;

public class Produit implements Serializable {
	private Long idProd;
	private String nomProd;
	private double prix;
	public Long getIdProd() {
		return idProd;
	}
	public void setIdProd(Long idProd) {
		this.idProd = idProd;
	}
	public String getNomProd() {
		return nomProd;
	}
	public Produit() {
		super();
	}
	public Produit(String nomProd, double prix) {
		super();
		this.nomProd = nomProd;
		this.prix = prix;
	}
	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
