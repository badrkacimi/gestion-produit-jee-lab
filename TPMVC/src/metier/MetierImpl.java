package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements IMetierCatalogue {


	public List<Produit> getProduitsParMC(String mc) {
		 List<Produit>  prods=new ArrayList<Produit>();
		 Connection conn=SingletonConnection.getConnection();
		 try {
			 PreparedStatement  ps=conn.prepareStatement("SELECT * FROM produits where NOM_PRODUIT like  ?");
			 ps.setString(1, "%"+ mc+"%");
			 ResultSet rs=ps.executeQuery();
			 while (rs.next()) {
				 Produit p=new Produit();
				 p.setIdProd(rs.getLong("ID_PRODUIT"));
				 p.setNomProd(rs.getString("NOM_PRODUIT"));
				 p.setPrix(rs.getDouble("PRIX"));
				 prods.add(p);
			 }
			 
		 }catch(SQLException e){
			 e.printStackTrace();
		 }
		 return prods;
	}

	public void addProd(Produit P) {
		
	}

}
