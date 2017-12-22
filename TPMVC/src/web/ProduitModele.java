package web ;

import java.util.ArrayList;
import java.util.List;

import metier.Produit;

public class ProduitModele {
	
public String getMotcle() {
		return Motcle;
	}
	public void setMotcle(String motcle) {
		Motcle = motcle;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
private String Motcle;
private List<Produit> produits= new  ArrayList<>();
		
	}


