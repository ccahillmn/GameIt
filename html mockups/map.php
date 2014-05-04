<?php include 'header.php'; ?>

<div class="row">

	<!--Sidebar-->
	<?php include 'sidebar.php'; ?>

	<!--Map-->
	<div id="map" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
		<h1>Environmental Science</h1>
		<img class="col-md-12" src="../images/map.png" title="Ennvironmental Science Curriculum Map">
		<div id="tooltip" class="btn" data-toggle="modal" data-target="#myModal" title="Activity: What's your Wast Line? (70 pts.)"></div>
	
	
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
		<div class="modal-content">
		  <div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
			<h4 class="modal-title" id="myModalLabel">Challenge: What's your Waste Line? </h4>
		  </div>
		  <div class="modal-body">
				<p><img src="../images/enviro.jpg" class="img-thumbnail left">For seven days, collect all of your refuse in two separate containers - one for garbage and one for recycling. Analyze your collection for amount, ration, content and other variable. Write a report of your findings and ideas for reducing your refuge.</p>
				<p><strong>Countdown:</strong> 10 days : 3 hours : 28 mins</p>
				<p><strong>XP:</strong> 70 pts.</p>
		  </div>
		  <div class="modal-footer">
			<button type="button" class="btn btn-success">Go to activity</button>
		  </div>
		</div>
	  </div>
	</div>

<?php include 'footer.php'; ?>