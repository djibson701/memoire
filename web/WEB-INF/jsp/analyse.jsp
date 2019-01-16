<%-- 
    Document   : analyse
    Created on : 14 janv. 2019, 22:43:23
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <title>Analyses</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        
        
        <script type="text/javascript">
            window.onload=function(){
                var dps=[[]];
                var chart=new CanvasJS.Chart("charContainer",{
                    animationEnable:true,
                    exportEnable:true,
                    title:{
                        text:"Simple column chart"
                    },
                    data:[{
                            type:"colum",
                            indexLabelFontColor:"#5A5757",
                            dataPoints:dps[0]
                    }]
                });
                var xValue;
                var yValue;
                var indexLabel;
                <c:forEach items="${analysesContr}" var="dataPoints" varStatus="loop">
                    <c:forEach items="${dataPoints}" var="dataPoint">
                        xValue=parseInt("${dataPonts.x}");
                        yValue=parseFloat("${dataPoints.y}");
                        indexLabel="${dataPointsindexLabel}";
                        dps[parseInt("${loop.index}")].push({
                            x:xValue,
                            y:yValue,
                            indexLabel:indexLabel
                        });
                    </c:forEach>   
                </c:forEach>
                    chart.render();
            }
        </script>
        
        
        <!--<div id="chartContainer" style="height: 300px;width: 400px;"></div>-->
        
        
        <!--<div id="chartContainer" style="height: 300px;width: 400px;"></div>-->
        <script type="text/javascript">
            window.onload=function (){
                var chart=new CanvasJS.Chart("chartContainer",{
                    theme:"theme1",
                    title:{
                        text:"Basic Column Chart - CanvasJS"
                    },
                    animationEnable:false,
                    data:[
                        {
                            type:"column",
                            dataPoints:[
                                {label:"apple",y:10},
                                {label:"orange",y:15},
                                {label:"banana",y:25},
                                {label:"mango",y:30},
                                {label:"grape",y:28}
                            ]
                        }
                    ]
                });
                chart.render();
            }
        </script>
        
    </body>
</html>
