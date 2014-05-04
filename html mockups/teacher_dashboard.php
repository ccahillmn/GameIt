<?php include 'header.php'; ?>
<div class="row">
    <!--Sidebar-->
    <?php include 'teacher_sidebar.php'; ?>
    <!--Dashboard-->
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        <div id="dashboard" role="main">
            <script type="text/javascript">
                google.load("visualization", "1", {packages:["corechart"]});
                google.setOnLoadCallback(drawChart);
                function drawChart() {
                    var data = google.visualization.arrayToDataTable([
                        ['Quest', 'Not Started', 'In Progress', 'Completed'],
                        ['Geo Quest One', 5, 10, 6],
                        ['Geo Quest two', 7, 12, 2],
                        ['Envio Sci Quest', 4, 5, 15],
                        ['Another Quest', 10, 9, 1]
                    ]);

                    var options = {
                        chartArea : {
                            left: '10%',
                            top: '10%',
                            width: '100%',
                            height: '75%'
                        },
                        legend: {
                            position: 'top',
                            alignment: 'end'
                        },
                        colors: ['#669999', '#2c3e50', '#FFCC66']
                    };
                    var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
                    chart.draw(data, options);
                }
            </script>
            <script type="text/javascript">
                google.load("visualization", "1", {packages:["corechart"]});
                google.setOnLoadCallback(drawChart);
                function drawChart() {
                    var data = google.visualization.arrayToDataTable([
                        ['Week', 'Completed Quests'],
                        ['Week 1',  4],
                        ['Week 2',  12],
                        ['Week 3',  6],
                        ['Week 4',  14]
                    ]);

                    var options =
                    {
                        chartArea : {
                            left: '10%',
                            top: '10%',
                            width: '100%',
                            height: '75%'
                        },
                        legend: {
                            position: 'top',
                            alignment: 'end'
                        },
                        curveType: 'function',
                        colors: ['#2c3e50']
                    };

                    var chart = new google.visualization.LineChart(document.getElementById('chart_div2'));
                    chart.draw(data, options);
                }
            </script>
            <section id="Progress">
                <h1>Progress Reporting</h1>
                <div id="progress">
                    <table class="reportTable">
                        <tr>
                            <td><div id="chart_div" style="width: 500px; height: 350px;"></div></td>
                            <td><div id="chart_div2" style="width: 500px; height: 350px;"></div></td>
                        </tr>
                    </table>
<!--                    <div class="row">-->
<!--                        <div id="chart_div" style="width: 550px; height: 350px;"></div>-->
<!--                    </div>-->
<!--                    <div class="row" >-->
<!--                        <div id="chart_div2" style="width: 550px; height: 350px;"></div>-->
<!--                    </div>-->
                </div>
            </section>

            <section id="challenges">
                <h1>Pending Bounties</h1>
                <div id="challenges">
                    <div class="row">
                        <div class="challenge col-md-6">
                            <div class="panel panel-danger">
                                <div class="panel-heading"><h2><strong>Geometry:</strong> Bounty from Will R.<h2></div>
                                <div class="panel-body">
                                    <img src="../images/geo.png" class="photo img-thumbnail">
                                    <p>Help me figure out the ....</p>
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
                            <div class="panel panel-danger">
                                <div class="panel-heading"><h2><strong>Geometry:</strong> Bounty from Lindsay M.</h2></div>
                                <div class="panel-body">
                                    <img src="../images/flag.jpg" class="photo img-thumbnail">
                                    <p>Help me figure out the ...</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <button type="button" class="btn btn-success col-md-4 col-md-offset-4">See More</button>
            </section>
        </div>
        <?php include 'footer.php'; ?>
