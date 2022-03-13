<%@ include file="common/header.jspf"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<article>

	<h1 class="text-center p-5" style="align: center;color: white;font-family: Georgia;	font-size: 2.5em;text-align: left;margin-top: 10px;margin-left:15px;"><em>Medical Representatives Schedule</em></h1>

	<div class="row">
		<div class="col">
			<!-- Dummy tag for maintaining structure of cards -->
		</div>
		<div class="card bg-light text-center" style="width: 25rem; height: 28rem;">
			<img class="card-img-top"
				src="https://blog-assets.freshworks.com/freshdesk/wp-content/uploads/2020/03/05162316/Shift-schedules.jpg"
				alt="img planner and calender">
			<div class="card-body">
				<h5 class="card-title" style="align: center;color: black;font-family: Georgia, Fantasy;">Select Date</h5><br>
				<p class="card-text" style="align: center;font-size:15px;color: black;font-family: Lucida Handwriting, Cursive;">To view the schedule of the representatives
				</p>


				<form action="/user/createSchedule" method="post">

					<div style="color: red; margin: 20px">
						<c:choose>
							<c:when test="${errorMessage}">
							<p style="align: center;font-size:15px;color: red;font-family: Lucida Handwriting, Cursive;">
							Please Enter today's / upcoming date</p>
							</c:when>
							<c:otherwise>
							</c:otherwise>
						</c:choose>

					</div>


					<div style="color: red"></div>
					<div>
						<div>
							<i style="font-size: 24px; margin: 0 0 5px 0;" class="fa">&#xf073;
							</i> <span style="padding: 5px;align: center;font-size:15px;color: black;font-family: Lucida Handwriting, Cursive;">Date of meeting</span> <input style="font-family: Lucida Handwriting, Cursive;font-size:13px;" type="date" name="scheduleStartDate"
								value="" required="true">
						</div>
					</div>
					<div>
						<div>
						<br>
							<input type="submit" class="btn btn-info m-3" name="submit"
								value="View schedule" style="font-family:Gill Sans, Cursive;width: 250px;height: 35px;">
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="col">
			<!-- Dummy tag for maintaining structure of cards -->
		</div>
	</div>

</article>

<%@ include file="common/footer.jspf"%>