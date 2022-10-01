<%@ page isELIgnored = "false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <title>Customer-Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <style>
    .data {
      font-size: large;
      color: white;
      font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    }
  </style>
</head>

<body>
  <div class="container p-5 my-3 bg-dark text-white">
    <h2 style="text-align:center;">CUSTOMER RELATIONSHIP MANAGEMENT</h2>
    <hr style="background-color:white; height: 2px;">

    <p>
      <a class="btn btn-primary bg-dark" href="showCustomerForm">Add Customer</a>
    </p>
    <hr style="background-color:white; height: 2px;">
    <div class="container">
      <h4 style="text-align:center;">Save Customer</h4>
      <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
          <form action="saveCustomer" method="post">
            <div class="form-group">
              <input type="hidden" class="form-control" placeholder="Enter Id" name="id" value="${customer.id}">
            </div>
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Enter First Name" name="firstName" value="${customer.firstName}">
            </div>
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Enter Last Name" name="lastName"
                value="${customer.lastName}">
            </div>
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Enter Email" name="email"
                value="${customer.email}">
            </div>

            <button class="btn btn-primary bg-dark" submit" class="btn btn-primary">Save</button>
          </form>
        </div>
        <div class="col-md-4"></div>
      </div>

    </div>
  </div>
</body>

</html>