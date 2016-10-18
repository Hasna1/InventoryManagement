<%-- 
    Document   : update
    Created on : Oct 5, 2016, 9:23:56 PM
    Author     : hasna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Product</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">

            <a href="${pageContext.request.contextPath}" class="btn btn-success"><span class="glyphicon glyphicon-home"></a>
            <a href="${pageContext.request.contextPath}/displayproduct" class="btn btn-success">Products</a>
            <div class="h1 text-center">Update Product</div>
            <form action=""  method="post">
                <div>
                    <label>Product Name</label>
                    <input type="text" name="productName" required="required" class="form-control" value="${product.productName}"/>
                </div>
                <div>
                    <label>Product Category</label>
                    <input type="text" name="category" required="required" class="form-control" value="${product.category}"/>
                </div>
                <div>
                    <label>Quantity</label>
                    <input type="text" name="quantity" required="required" class="form-control" value="${product.quantity}"/>
                </div>
                <div>
                    <label>Cost Price</label>
                    <input type="text" name="costPrice" required="required" class="form-control" value="${product.costPrice}"/>
                </div>
                <div>
                    <label>Selling Price</label>
                    <input type="text" name="sellingPrice" required="required" class="form-control" value="${product.sellingPrice}"/>
                </div>
                <div>
                    <label>Select Availability Status</label>
                    <select name="status" class="form-control" required="required">
                        <option value="">Select Any Option</option>
                        <option value="0">Unavailable</option>
                        <option value="1">Available</option>
                    </select>
                </div>

                <div>
                    <br>
                    <button type="submit" class="btn btn-success">Submit</button>
                    <button type="reset" class="btn btn-danger">Clear</button>
                </div>
                <input type="hidden"
                       name="${_csrf.parameterName}"
                       value="${_csrf.token}"/>

            </form>
        </div>
    </body>
</html>
