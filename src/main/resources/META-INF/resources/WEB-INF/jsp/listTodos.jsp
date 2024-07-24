<html>
<head>
    <title>Spring Boot Hello World - JSP</title>
</head>
<body>
    <h1>Todo List</h1>
    <div>${list}</div>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is it Done?</th>
        </tr>
    
        <!-- <c:forEach items="${list}" var="todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.desc}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
            </tr>
        </c:forEach> -->
    </table>
</html>