<%-- 
    Document   : resutats
    Created on : 30 janv. 2019, 16:13:10
    Author     : user
--%>

<%@page import="beans.Risk"%>
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
        <title>Resultats</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>


            <!--content infos et proba-->
            <div class="container">
                <div class="row">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-4">
                                <div class="card border-secondary mb-4" style="max-width: 18rem;">
                                    <div class="card-header">Informations saisies</div>
                                    <div class="card-body text-secondary">
                                        <table class="table">
                                            <tbody>
                                                <tr>
                                                    <th scope="row">Classe d'age</th>
                                                    <td>

                                                    <c:set var="ca" value="${cla}"></c:set>
                                                    <c:out value="${ca}"></c:out>

                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">Sexe</th>
                                                    <td>Mark</td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">Statut Fumeur</th>
                                                    <td>   
                                                    <c:set var="fum" value="${fum}"></c:set>
                                                    <c:out value="${fum}"></c:out>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">Country</th>
                                                    <td>
                                                    <c:set var="count" value="${count}"></c:set>
                                                    <c:out value="${count}"></c:out>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">Lieu de naissance</th>
                                                    <td>
                                                    <c:set var="count" value="${li}"></c:set>
                                                    <c:out value="${li}"></c:out>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">Statut social</th>
                                                    <td>
                                                    <c:set var="sit" value="${sit}"></c:set>
                                                    <c:out value="${sit}"></c:out>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <th scope="row">Situataion</th>
                                                    <td>
                                                    <c:set var="sit" value="${sit}"></c:set>
                                                    <c:out value="${sit}"></c:out>
                                                    </td>
                                                </tr>


                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div><%--Contenu des informations saisies--%>

                        <div class="col-lg-8">
                            <div class="container">
                                <div class="row">

                                    <div class="container">
                                        <div class="row">
                                            <div class="col-lg-6">
                                                <table class="table">
                                                    <thead>
                                                        <tr>
                                                            <th scope="col">Type cancer</th>
                                                            <th scope="col">Probabilités</th>
                                                        </tr>
                                                    </thead>
                                                </table><%-- tab1--%>
                                            </div>
                                            <div class="col-lg-6">
                                                <table class="table">
                                                    <thead>
                                                        <tr>
                                                            <th scope="col">Type cancer</th>
                                                            <th scope="col">Probabilités</th>
                                                        </tr>
                                                    </thead>
                                                </table><%-- tab2--%>
                                            </div>
                                        </div>
                                    </div><%-- content tab --%> 

                                </div>
                            </div>
                        </div><%--Contenu --%>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
