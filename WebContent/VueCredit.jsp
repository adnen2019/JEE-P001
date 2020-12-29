<%@page import="web.CreditModel"%>
<% CreditModel cm=(CreditModel)request.getAttribute("mensu"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Credit Bancaire</title>
</head>
<body>
	<div>
		<form action="/hello" method="post">
			<table>
				<tr>
					<td>Montant:</td>
					<td>
					<input type="text" name="montant" value=<% out.println(cm.getMontant());%>>
					</td>
					<td>dt</td>
				</tr>
				
				<tr>
					<td>Duree</td>
					<td>
					<input type="text" name="duree" value=<% out.println(cm.getDuree());%>>
					</td>
					<td>mois</td>
				</tr>
				
				<tr>
					<td>Taux</td>
					<td>
					<input type="text" name="taux" value=<% out.println(cm.getTaux());%>>
					</td>
					<td>%</td>
				</tr>
			</table>
			<button type="submit">Calculer</button>
		</form>
	</div>
	<div>
	Mensualité=<% out.println(cm.getMensualite()); %>
	</div>
	
</body>
</html>