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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                <br/>
                <div class="panel panel-default">
                    <div class="panel-heading">Formulaire de saisi </div>
                    <div class="panel-body">
                        <form method="POST" action="">
                            <fieldset class="col-md-6">    	
                                <legend>Sur vous</legend>
                                <div class="panel panel-default">
                                    <div class="panel-body">


                                    <%--Sexe--%>

                                    <div id="div_id_gender" class="form-group required">
                                        <label for="id_gender"  class="control-label col-md-4  requiredField">Sexe <span class="asteriskField">*</span> </label>
                                        <div class="controls col-md-8 "  style="margin-bottom: 10px">
                                            <label class="radio-inline"> <input type="radio" name="gender" id="id_gender_1"   style="margin-bottom: 10px">Masculin</label>
                                            <label class="radio-inline"> <input type="radio" name="gender" id="id_gender_2"   style="margin-bottom: 10px">Feminin </label>
                                        </div>
                                    </div>

                                    <%--Classe d'age--%>

                                    <select class="form-control" id="ca">
                                        <option>Classe d'age</option>
                                        <option>2</option>
                                    </select>

                                    <%--Statut marital--%>

                                    <select class="form-control" id="sm">
                                        <option>Statut marital</option>
                                        <option>2</option>
                                    </select>
                                    <br/>

                                </div>
                            </div>

                            <legend>Sur la localisation</legend>
                            <div class="panel panel-default">
                                <div class="panel-body">

                                    <%--Lieu de residence--%>

                                    <select class="form-control" id="lieu">
                                        <option>Lieu de résidence</option>
                                        <option>2</option>
                                    </select>

                                    <%--Pays de residence--%>

                                    <select class="form-control" id="contry">
                                        <option>Pays de résidence</option>
                                        <option>2</option>
                                    </select>
                                    <br/>
                                </div>
                            </div>

                            <legend>Sur votre omportement</legend>
                            <div class="panel panel-default">
                                <div class="panel-body">
                                    
                                    <select class="form-control" id="smoking">
                                        <option>Smoking</option>
                                        <option>2</option>
                                    </select>
                                    
                                </div>
                            </div>
                            <br/>
                            <input type="submit" name="valider" value="Valider" class="btn btn-primary btn btn-info" id="submit-id-signup" />
                        </fieldset>
                    </form>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
        <%--
        <c:forEach items="${listCancer}" var="list">
            <tr>
                <td>${list.statutSocial}</td>
                <td>${list.contry}</td>
                <td>${list.lieuResidence}</td>
                <td>${list.statutFumeur}</td>
                <td>${list.statutMarital}</td>
                <td>${list.sexe}</td>
                <td>${list.classeDage}</td>
                <td>${list.typeCancer}</td>
            </tr>
        </c:forEach>    
        </table>
        --%>
    </body>
</html>
