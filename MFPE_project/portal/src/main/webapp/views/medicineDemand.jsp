<%@ include file="common/header.jspf"%>

<article>
	<div class="container">
		<h1 class="text-center m-4" style="align: center;color: white;font-family: Georgia;	font-size: 2.5em;text-align: left;margin-top: 10px;margin-left:15px;"><em>Place Order</em></h1>

		<div class="w-50 p-3 mx-auto border bg-light rounded text-center" style="width: 18rem; height: 32rem;">
			<div>
				<img class="card-img-top"
					src="http://learnmongodbthehardway.com/images/originals/shopping_cart_racing.png"
					alt="img place order" style="width: 12rem; height: 12rem;">
			</div>
			<div class="card-body">
				<h3 class="card-title" style="align: center;color: black;font-family: Georgia, Fantasy;">Enter details</h3>
				<p class="card-text" style="align: center;font-size:15px;color: black;font-family: Lucida Handwriting, Cursive;">Fill in the required details below.</p>

			</div>
			<div>
				<form action="/user/getMedicineSupply" method="post"
					onsubmit="return validate();" style="align: center;font-size:14px;color: black;font-family: Lucida Handwriting, Cursive;">
					<div class="form-group row">
						<label for="medicineName" class="col-sm-3 col-form-label" >Medicine</label>
						<div class="col-sm-9">



							<select id="medicineName" name="medicineName" style="float: left; height:38px; width:380px;">
								<option value="Crocin">Crocin</option>
								<option value="Digoxin">Digoxin</option>
								<option value="Misoprostol">Misoprostol</option>
								<option value="Percocet">Percocet</option>
								<option value="Oxycodone">Oxycodone</option>
								<option value="Orthoherb">Orthoherb</option>
								<option value="Cholecalciferol">Cholecalciferol</option>
								<option value="Gaviscon">Gaviscon</option>
								<option value="Dolo-650">Dolo-650</option>
								<option value="Hilact">Hilact</option>
								<option value="Cyclopam">Cyclopam</option>
							</select>




							<!-- 	<input type="text" class="form-control" id="medicine"
								name="medicine" placeholder="Type here" required="required">  -->
						</div>
					</div>
					<div class="form-group row">
						<label for="demandCount" class="col-sm-3 col-form-label">Demand
							Count</label>
						<div class="col-sm-9">
							<input type="number" class="form-control" id="demandCount"
								name="demandCount" placeholder="Enter value" min="1"
								required="required">
						</div>
					</div>

					<input type="submit" class="btn btn-primary" name="submit"
						value="Submit" style="font-family:Gill Sans, Cursive;width: 200px;height: 35px;">
				</form>
			</div>
		</div>

	</div>
</article>

<%@ include file="common/footer.jspf"%>