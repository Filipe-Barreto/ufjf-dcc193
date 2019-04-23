<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>EXM 01: Lista de Pessoas</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>
    <h1>EXM 01: Lista de Pessoas</h1>
    <c:forEach var="pessoa" items="${galera}">
        <li value="$pessoa.id">
            ${pessoa.nome} ${pessoa.idade} anos
            <!-- <Form action="deleta.html" method="POST">
                <input type="submit">
            </Form> -->
        </li>   
    </c:forEach>
</body>
</html>