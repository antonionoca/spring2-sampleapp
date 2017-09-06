<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Publications</h2>

	<c:if test="${not empty publications}">

		<ul>
			<c:forEach var="publication" items="${publications}">
				<li>${publication}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>