<%-- 
    Document   : index.jsp
    Created on : Oct 4, 2016, 8:23:30 AM
    Author     : hasna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventory Management System</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <a href="${pageContext.request.contextPath}/product" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span>Product</a>
            <a href="${pageContext.request.contextPath}/displayproduct" class="btn btn-success">Products</a>
            <a href="${pageContext.request.contextPath}/customer" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span>Customer</a>
            <a href="${pageContext.request.contextPath}/supplier" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span>Supplier</a>
             <div class="pull-right">
                <a href="${pageContext.request.contextPath}/logout" class="btn btn-success">Logout</a>
             </div>
             
              <h1 class="text-center" style="font-family:cursive">Inventory Management System</h1>
            
        </div>
    </body>
</html>
