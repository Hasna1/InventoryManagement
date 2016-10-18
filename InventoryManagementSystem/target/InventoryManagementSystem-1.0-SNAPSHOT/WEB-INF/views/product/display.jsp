<%-- 
    Document   : display
    Created on : Oct 5, 2016, 9:31:33 AM
    Author     : hasna
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventory Management System</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <a href="${pageContext.request.contextPath}" class="btn btn-success"><span class="glyphicon glyphicon-home"></span></a>
            <div class="h3 text-center"> List Of Products </div>
            <table class="table table-bordered table-hover table-striped">
                <tr>
                    <th>Id</th>
                    <th>Product Name</th>
                    <th>Category</th>
                    <th>Quantity</th>
                    <th>Cost Price</th>
                    <th>Selling Price</th>
                    <th>Added Date</th>
                    <th>Availability Status</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="pr" items="${product}">
                    <tr>
                        <td>${pr.id}</td>
                        <td>${pr.productName}</td>
                        <td>${pr.category}</td>
                        <td>${pr.quantity}</td>
                        <td>${pr.costPrice}</td>
                        <td>${pr.sellingPrice}</td>

                        <td>${pr.addedDate}</td>
                        <td>
                            <c:choose>
                                <c:when test="${pr.status}">
                                   Available
                                </c:when>
                                <c:otherwise>
                                   Unavailable
                                </c:otherwise>
                            </c:choose>
                        </td>

                        <td>
                            <a href="${pageContext.request.contextPath}/updateproduct/${pr.id}" class="btn btn-success"><span class="glyphicon glyphicon-pencil"></span></a>
                            <a href="${pageContext.request.contextPath}/deleteproduct/${pr.id}" class="btn btn-danger"><span class="glyphicon glyphicon-trash" onclick="return confirm('Are you sure you want to delete?')"></span></a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
