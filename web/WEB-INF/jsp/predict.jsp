<%-- 
    Document   : predict
    Created on : 14 janv. 2019, 22:42:52
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" isELIgnored="false">
        <link type="text/css" rel="stylesheet" href="bootstrap/dist/css/bootstrap.min.css"/>
        <link type="text/css" rel="stylesheet" href="bootstrap/dist/css/bootstrap.css"/>
        <link type="text/css" rel="stylesheet" href="bootstrap/dist/css/style.css"/>
        <script type="text/javascript" src="bootstrap/dist/js/jquery.js"></script>
        <script type="text/javascript" src="bootstrap/dist/js/bootstrap.js"></script>
        <script type="text/javascript" src="bootstrap/dist/js/bootstrap.min.js"></script>
        <title>Calcul du risque</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                <%--    
                <f:form action="resultats.html" method="GET" class="form" modelAttribute="Risk">
                    <input type="text" name="sexe" placeholder="Sexe"/><br/>
                    <input type="text" name="classeage" placeholder="classeage"/><br/>
                    <input type="text" name="statutmarital" placeholder="statutmarital"/><br/>
                    <input type="text" name="statutfumeur" placeholder="statutfumeur"/><br/>
                    <input type="text" name="statutsocial" placeholder="statutsocial"/><br/>
                    <input type="submit" value="Valider" />
                </f:form>
                --%>

                <div class="col-lg-5">
                    <div class="panel panel-default">
                        <div class="panel-heading">Formulaire de saisi </div>
                        <div class="panel-body">
                            <f:form method="GET" action="resultats.html" modelAttribute="Risk">
                                <fieldset>    	
                                    <legend>Sur vous</legend>
                                    <div class="panel panel-default">
                                        <div class="panel-body">


                                            <%--Sexe--%>

                                            <div id="div_id_gender" class="form-group required">
                                                <label for="id_gender"  class="control-label col-md-4  requiredField">Sexe <span class="asteriskField">*</span> </label>
                                                <div class="controls col-md-8 "  style="margin-bottom: 10px">
                                                    <label class="radio-inline"> <input type="radio" name="gender" id="id_gender_1"   style="margin-bottom: 10px" name="masculin">Masculin</label>
                                                    <label class="radio-inline"> <input type="radio" name="gender" id="id_gender_2"   style="margin-bottom: 10px" name="feminin">Feminin </label>
                                                </div>
                                            </div>

                                            <%--Classe d'age--%>

                                            <select class="form-control" id="ca" name="classeage">
                                                <option>Classe d'age</option>
                                                <option>30_04</option>
                                                <option>35_39</option>
                                                <option>70_74</option>
                                            </select>

                                            <%--Statut marital--%>

                                            <select class="form-control" id="sm" name="situation">
                                                <option>Situation</option>
                                                <option>Celibataire</option>
                                                <option>Jamais marié</option>
                                            </select>
                                            <br/>

                                        </div>
                                    </div>

                                    <legend>Localisation</legend>
                                    <div class="panel panel-default">
                                        <div class="panel-body">

                                            <%--Lieu de residence--%>

                                            <select class="form-control" id="lieu" name="lieu">
                                                <option>Lieu de résidence</option>
                                                <option>DNML</option>
                                                <option>South</option>
                                            </select>

                                            <%--Pays de residence--%>

                                            <select class="form-control" id="contry" name="country">
                                                <option>Pays de résidence</option>
                                                <option>DSN</option>
                                                <option>DNN</option>
                                            </select>
                                            <br/>
                                        </div>
                                    </div>

                                    <legend>Comportement</legend>
                                    <div class="panel panel-default">
                                        <div class="panel-body">

                                            <select class="form-control" id="smoking" name="fumeur">
                                                <option>Etat Fumeur</option>
                                                <option>Jamais</option>
                                                <option>Fumeur</option>
                                                <option>Ex Fumeur</option>
                                            </select>

                                        </div>
                                    </div>
                                    <br/>
                                    <input type="submit" name="valider" value="Valider" class="btn btn-primary btn btn-info" id="submit-id-signup" />
                                </fieldset>
                            </f:form>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                </div><!--Formulaire-->

            </div>
        </div>
    </body>
</html>
