<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BADR JSP MVC</title>
</head>
<body>
<form action="Controleur.php" method="post">
     Mot cle :<input type="text" name="Motcle" >
     <input type="submit"  value="9leb">
</form>
<table border="1"  width="80%" >   
<tr>
<th>ID</th> <th>Nom</th> <th>Prix</th>
</tr>
<c:forEach items="${Modele.produits}" var="p" >
    <tr>
          <td>${p.idProd } </td>
          <td>${p.nomProd } </td>
          <td>${p.prix } </td>

   </tr>
</c:forEach>
</table>
</body>
</html>