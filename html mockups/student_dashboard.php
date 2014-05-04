<?php include 'header.php'; ?>

<div class="row">

	<!--Sidebar-->
	<?php include 'sidebar.php'; ?>

	<!--Dashboard-->
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
		<div id="dashboard" role="main">
			<section id="myquests">
				<h1 class="left">Quests</h1>
				<div class="btn-group left">
                  <button type="button" class="btn btn-success">Select Class</button>
                  <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown"><span class="caret"></span></button>
                  <ul class="dropdown-menu" style="right: 0; left: auto;">
                    <li><a href="#">Environment Science</a></li>
                    <li><a href="#">Geometry</a></li>
                    <li><a href="#">U.S. History</a></li>
                  </ul>
                </div>
				<ul id="quests" class="well clear">
					<li><span class="glyphicon glyphicon-chevron-left"></span></li>
					<li><img src="../images/badge1.png" class="img-responsive" alt="Responsive image"></li>
					<li><img src="../images/badge2.png" class="img-responsive" alt="Responsive image"></li>
					<li><img src="../images/badge3.png" class="img-responsive" alt="Responsive image"></li>
					<li><img src="../images/badge4.png" class="img-responsive" alt="Responsive image"></li>
					<li><img src="../images/badge5.png" class="img-responsive" alt="Responsive image"></li>
					<li><img src="../images/badge6.png" class="img-responsive" alt="Responsive image"></li>
					<li><span class="glyphicon glyphicon-chevron-right"></span></li>
				</ul>
			</section>
			<section id="leaderboards">
				<h1>Leaderboards</h1>
				<div class="row">
					<div class="board col-md-4">
						<div class="panel panel-primary">
							<div class="panel-heading"><h2>Environmental Science</h2></div>
							<div class="panel-body">
								<table class="table">
							<thead>
								<tr>
									<th>#</th>
									<th>Name</th>
									<th>Points</th>
									<th>Change</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>13</td>
									<td>Gwen</td>
									<td>520</td>
									<td><span class="glyphicon glyphicon-arrow-up"></span></td>
								</tr>
								<tr>
									<td>14</td>
									<td><strong>You</strong></td>
									<td>471</td>
									<td><span class="glyphicon glyphicon-arrow-up"></span></td>
								</tr>
								<tr>
									<td>15</td>
									<td>Steve</td>
									<td>325</td>
									<td><span class="glyphicon glyphicon-arrow-down"></span></td>
								</tr>
							</tbody>
						</table>
							</div>
						</div>
					</div>
					<div class="board col-md-4">
						<div class="panel panel-primary">
							<div class="panel-heading"><h2>Geometry</h2></div>
							<div class="panel-body">
								<table class="table">
									<thead>
										<tr>
											<th>#</th>
											<th>Name</th>
											<th>Points</th>
											<th>Change</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>Group 3</td>
											<td>520</td>
											<td><span class="glyphicon glyphicon-arrow-up"></span></td>
										</tr>
										<tr>
											<td>2</td>
											<td><strong>Your Group</strong></td>
											<td>471</td>
											<td><span class="glyphicon glyphicon-arrow-down"></span></td>
										</tr>
										<tr>
											<td>3</td>
											<td>Group 1</td>
											<td>325</td>
											<td><span class="glyphicon glyphicon-resize-horizontal"></span></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<div class="board col-md-4">
						<div class="panel panel-primary">
							<div class="panel-heading"><h2>U.S. History</h2></div>
							<div class="panel-body">
								<table class="table">
									<thead>
										<tr>
											<th>#</th>
											<th>Name</th>
											<th>Points</th>
											<th>Change</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>Bill</td>
											<td>520</td>
											<td><span class="glyphicon glyphicon-arrow-up"></span></td>
										</tr>
										<tr>
											<td>2</td>
											<td><strong>You</strong></td>
											<td>471</td>
											<td><span class="glyphicon glyphicon-arrow-down"></span></td>
										</tr>
										<tr>
											<td>3</td>
											<td>Sue</td>
											<td>325</td>
											<td><span class="glyphicon glyphicon-arrow-up"></span></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</section>
			<section id="challenges">
				<h1>Challenges</h1>
				<div id="challenges">
					<div class="row">
						<div class="challenge col-md-6"> 
							<div class="panel panel-warning">
								<div class="panel-heading"><h2><strong>Geometry:</strong> Weekly Challenge<h2></div>
								<div class="panel-body">
									<img src="../images/geo.png" class="photo img-thumbnail">
									<p>Provide solutions for three problems of your choosing from Unit 1</p>
								</div>
							</div>
						</div>
						<div class="challenge col-md-6"> 
							<div class="panel panel-danger">
								<div class="panel-heading"><h2><strong>Enviro Sci:</strong> Bounty from Sarah H.</h2></div>
								<div class="panel-body">
									<img src="../images/girl.png" class="photo img-thumbnail">
									<p>Make me a screencast explaining the cycle of decomposition</p>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
					<div class="challenge col-md-6"> 
						<div class="panel panel-danger">
							<div class="panel-heading"><h2><strong>Geometry:</strong> Bounty from Dan C.</h2></div>
							<div class="panel-body">
								<img src="../images/boy.png" class="photo img-thumbnail">
								<p>Create a 3D model demonstrating the benefits of the RTFM approach.</p>
							</div>
						</div>
					</div>
					<div class="challenge col-md-6"> 
						<div class="panel panel-warning">
							<div class="panel-heading"><h2><strong>U.S. History:</strong> Weekly Challenge</h2></div>
							<div class="panel-body">
								<img src="../images/flag.jpg" class="photo img-thumbnail">
								<p>Find a primary document written by a southern slave during the Civil War.</p>
							</div>
						</div>
					</div>
				</div>
				</div>
				<button type="button" class="btn btn-success col-md-4 col-md-offset-4">See More</button>
			</section>	
		</div>
	

<?php include 'footer.php'; ?>

