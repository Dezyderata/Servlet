<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action ="/hello" method="get">
			<h1>Kalkulator rat kredytu</h1>
			<h3>Podaj kwotę ktedytu:</h3>
			<input type="text" name="kwota" required>
			<h3>ilość rat:</h3>
			<input type="text" name="ileRat" required>
			<h3>oprocentowanie:</h3>
			<input type="text" name="procent" required>
			<h3>opłatę stałą:</h3>
			<input type="text" name="oplata" required>
			<h3>Wybierz rodzaj rat:</h3>
			<select name="rodzaj">
				<option value=1>malejąca</option>
				<option value=0>stała</option>
			</select>	
			<br>
			<br>
			<input type="submit" value="wyślij">
		</form>			
	</body>
</html>