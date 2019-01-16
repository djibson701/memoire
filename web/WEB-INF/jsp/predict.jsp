<%-- 
    Document   : predict
    Created on : 14 janv. 2019, 22:42:52
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
        <title>Calcul du risque</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <div class="container">
            <div class="row centered-form">
                <div class="col-lg-2"></div>
                <div class="col-lg-8 col-sm-6 col-md-4 col-sm-offset-2">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Panel 1</h3>
                        </div>
                        <div class="panel-body">
                            <form role="form">
                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="text" name="first" class="form-control input-sm"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                            <input type="text" name="last" class="form-control input-sm"/>
                                        </div>
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                    <input type="email" name="email" class="form-control input-sm"/>
                                </div>
                                
                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-4">
                                        <div class="form-group">
                                            <input type="text" name="fm" class="form-control input-sm"/>
                                        </div>
                                    </div>
                                    
                                    <div class="col-xs-6 col-sm-6 col-md-4">
                                        <div class="form-group">
                                            <input type="text" name="fn" class="form-control input-sm"/>
                                        </div>
                                    </div>
                                </div>
                                <input type="submit" value="Valider" class="btn btn-info btn-block"/>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2"></div>
            </div>
        </div>
    </body>
</html>
