<%@ include file="common/header.jspf"%>


<article>

	<div class="container">
		<h1 class="article-heading text-center m-4" style="align: center;color: white;font-family: Georgia;	font-size: 2.5em;text-align: left;margin-top: 10px;margin-left:15px;"><em>Medicine Stock</em></h1>
		<table class="table table-striped table-bordered bg-light rounded" style="font-family:Gill Sans, Cursive;">
				<tr class="text-center bg-secondary text-white" style="font-size: 1.3em; font-family:Gill Sans, Cursive;">
				
					<th>Id</th>
					<th>Name</th>
					<th>Chemical Composition</th>
					<th>Target Ailment</th>
					<th>Pharmacy Name</th>
					<th style="width: 7em; font-family:Gill Sans, Cursive;">Date Of Expiry</th>
					<th> Stock</th>
				</tr>
			</thead>
			<c:forEach items="${medicineStockList}" var="medicineStock">
				<tr>
					<td>${medicineStock.id}</td>
					<td>${medicineStock.name}</td>
					<td>${medicineStock.chemicalComposition}</td>
					<td>${medicineStock.targetAilment}</td>
					<td>${medicineStock.pharmacyName}</td>
					<td>${medicineStock.dateOfExpiry}</td>
					<td class="text-center">${medicineStock.numberOfTabletsInStock}</td>
				</tr>

			</c:forEach>

		</table>
	</div>
</article>


<%@ include file="common/footer.jspf"%>