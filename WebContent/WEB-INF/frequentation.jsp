
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fréquentation</title>
</head>
<body>
	<form method="post" action="/dettepds2app/bonjour">
	<p>
	<label for="annee">année</label>
	<input type="text" id="annee" name="annee"/>
	<p>
	<p>
	<label for="mois">mois</label>
	<input type="text" id="mois" name="mois"/>
	</p>
	<p>
	<input type="submit"/>
	</form>
	<table>
	<tr>
	<td>fréquentation</td>
	<td>mois</td>
	<td>année</td>
	<td> estimation theorique</td>
	<td> ABSCisse</td>
	</tr>
	<c:if test="${ !empty freq }">
	<p> toto</p>
	<c:forEach items="${freq }" var="i">
	<tr>
	<td><c:out value="${i.count }"></c:out></td>
	<td><td> <c:out value="${i.moi }"></c:out></td></td>
	<td><td> <c:out value="${i.annee }"></c:out></td></td>
	<td> <c:out value="${i.theorie }"></c:out></td>
	<td> <c:out value="${i.nbmois }"></c:out></td>
	</tr>
	</c:forEach>
	</c:if>
	
	</table>

</body>
</html>
