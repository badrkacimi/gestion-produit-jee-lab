package web;
import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.IMetierCatalogue;
import metier.MetierImpl;
import metier.Produit;


public class ControleurServlet extends HttpServlet { 
	private  IMetierCatalogue metier;

	public void init() throws ServletException { 
		metier=new MetierImpl();
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String mc=request.getParameter("Motcle");
		ProduitModele mod=new ProduitModele();
		mod. setMotcle(mc);
		List<Produit> prods=metier.getProduitsParMC(mc);
		mod.setProduits(prods);
		request.setAttribute("Modele", mod);
		request.getRequestDispatcher("Produit.jsp").forward(request, response);
	}
}
