<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Report Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        body {
            background-color: #f8f9fa; /* Light gray background */
        }
        .container {
            background-color: #ffffff; /* White background for the container */
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 30px;
        }
        h3 {
            color: #25beae;
            border-bottom: 2px solid #25beae;
            padding-bottom: 10px;
        }
        .form-label {
            font-weight: bold;
            color: #555;
        }
        .table-dark {
            margin-top: 20px;
            border-radius: 5px;
            overflow: hidden;
        }
        .btn-secondary, .btn-primary {
            width: 100%;
        }
        .export-links a {
            margin-right: 15px;
            text-decoration: none;
            color: #25beae;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <h3 class="pb-3 pt-3 text-center">Report Application</h3>

        <form:form action="search" modelAttribute="search" method="POST">
            <div class="row mb-3">
                <div class="col-md-4">
                    <label class="form-label">Plan Name:</label>
                    <form:select path="planName" class="form-select">
                        <form:option value="">-select-</form:option>
                        <form:options items="${names}"/>
                    </form:select>
                </div>
                <div class="col-md-4">
                    <label class="form-label">Plan Status:</label>
                    <form:select path="PlaneStatus" class="form-select">
                        <form:option value="">-select-</form:option>
                        <form:options items="${status}"/>
                    </form:select>
                </div>
                <div class="col-md-4">
                    <label class="form-label">Gender:</label>
                    <form:select path="gender" class="form-select">
                        <form:option value="">-select-</form:option>
                        <form:option value="Male">Male</form:option>
                        <form:option value="Fe_Male">Female</form:option>
                    </form:select>
                </div>
            </div>

            <div class="row mb-3">
                <div class="col-md-4">
                    <label class="form-label">Start Date:</label>
                    <form:input type="date" path="startDate" class="form-control"/>
                </div>
                <div class="col-md-4">
                    <label class="form-label">End Date:</label>
                    <form:input type="date" path="endDate" class="form-control"/>
                </div>
                <div class="col-md-4 d-flex align-items-end">
                    <a href="/" class="btn btn-secondary me-2">Reset</a>
                    <input type="submit" value="Search" class="btn btn-primary"/>
                </div>
            </div>
        </form:form>

        <hr/>

        <table class="table table-striped table-dark">
            <thead class="table-light">
                <tr>
                    <th>S.NO</th>
                    <th>Holder Name</th>
                    <th>Gender</th>
                    <th>Plan Name</th>
                    <th>Plan Status</th>
                    <th>Start Date</th>
                    <th>End Date</th>
                    <th>Benefit Amt</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${plans}" var="plan" varStatus="index">
                    <tr>
                        <td>${index.count}</td>
                        <td>${plan.citizenName}</td>
                        <td>${plan.gender}</td>
                        <td>${plan.planName}</td>
                        <td>${plan.planStatus}</td>
                        <td>${plan.planStartDate}</td>
                        <td>${plan.planEndDate}</td>
                        <td>${plan.benefitAmt}</td>
                    </tr>
                </c:forEach>
                <c:if test="${empty plans}">
                    <tr>
                        <td colspan="8" style="text-align:center">No Record Found</td>
                    </tr>
                </c:if>
            </tbody>
        </table>

        <hr/>

        <div class="export-links text-center">
            Export: 
            <a href="#">Excel</a>
            <a href="#">PDF</a>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
