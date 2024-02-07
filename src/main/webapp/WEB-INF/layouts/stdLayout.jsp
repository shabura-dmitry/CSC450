<!DOCTYPE html>
<%@ include file="/WEB-INF/layouts/include.jsp"%>
<html id="html" lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title><tiles:getAsString name="title" /></title>
    <!-- BOOTSTRAP CSS IMPORT -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <!-- BOOTSTRAP JS IMPORT -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <script src="<c:url value='/resources/script/home.js' />"></script>
</head>
<body>
    <div id="bodyContentTile" class="container">
        <div class="row">
            <div class="col-sm-12">
                <tiles:insertAttribute name="body" />
            </div>
        </div>
    </div>
</body>
</html>
