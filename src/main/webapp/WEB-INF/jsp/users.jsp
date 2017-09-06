<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Users</h2>

	<c:if test="${not empty users}">

		<ul>
			<c:forEach var="user" items="${users}">
				<li>${user.getName()}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>