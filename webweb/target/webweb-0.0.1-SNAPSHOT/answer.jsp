<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="credit.Answer" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<h1>Tak będą wyglądać Twoje raty:</h1>
		<table border=1>
		<tr>
		<td>Numer raty</td>
		<td>Kapital</td>
		<td>Kwota odsetek</td>
		<td>Opłata stała</td>
		<td>Całkowita kwota raty</td>
		</tr>
		<c:forEach items="${installment}" var="ans">
			<tr>
				<td>${ans.getNumberOfInstallment()}</td>
				<td>${ans.getCapital()}</td>
				<td>${ans.getInterest()}</td>
				<td>${ans.getFixedFee()}</td>
				<td>${ans.getTotalSumOfInstallment()}</td>
			</tr>
		</c:forEach>
		</table>
				<a href="/PdfServlet?${query}">Pobierz PDF</a>
		</body>
</html>