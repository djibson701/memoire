<%-- 
    Document   : statistiques
    Created on : 14 janv. 2019, 22:44:14
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="bootstrap/dist/css/bootstrap.min.css"/>
        <link type="text/css" rel="stylesheet" href="bootstrap/dist/css/bootstrap.css"/>
        <script type="text/javascript" src="bootstrap/dist/js/jquery.js"></script>
        <script type="text/javascript" src="bootstrap/dist/js/bootstrap.js"></script>
        <script type="text/javascript" src="bootstrap/dist/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="bootstrap/dist/canvas/canvasjs.min.js"></script>
        <!--<script type="text/javascript" src="bootstrap/dist/canvas/canvasjs.react.js"></script>-->
        <script type="text/javascript" src="bootstrap/dist/canvas/jquery.canvasjs.min.js"></script>
        <title>statistiques</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <div id="chartContainer" style="height: 500px;width: 1300px;"></div>
        <script type="text/javascript">
            window.onload=function (){
                var chart=new CanvasJS.Chart("chartContainer",{
                    theme:"theme1",
                    title:{
                        text:"Estimated age-standardized incidence rates (World) in 2018, worldwide, both sexes, all ages"
                    },
                    animationEnable:false,
                    data:[
                        {
                            type:"column",
                            dataPoints:[
                                {label:"Breast",y:46.3},
                                {label:"Prostate",y:29.3},
                                {label:"Lung",y:22.5},
                                {label:"Colorectum",y:19.7},
                                {label:"Cervix uteri",y:13.1},
                                {label:"Stomach",y:11.1},
                                {label:"Liver",y:9.3},
                                {label:"Corpus uteri",y:8.4},
                                {label:"Thyroid",y:6.7},
                                {label:"Ovary",y:6.6}                  
                            ]
                        }
                    ]
                });
                chart.render();
            }
        </script>
    </body>
</html>
