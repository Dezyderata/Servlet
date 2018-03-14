package servlets;

import credit.Answer;
import credit.Count;
import credit.MyForm;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	MyForm form = new MyForm();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			form.setAmountOfCredit(Double.parseDouble(request.getParameter("kwota")));
			form.setPercent(Double.parseDouble(request.getParameter("procent")));
			form.setFixedFee(Double.parseDouble(request.getParameter("oplata")));
			form.setNumberOfInstallments(Integer.parseInt(request.getParameter("ileRat")));
			Count count = new Count(form);
			switch(Integer.parseInt(request.getParameter("rodzaj"))) {
				case 0:
					count.countEqualAns();
					break;
				case 1:
					count.CountAns();
					break;
			}
			request.setAttribute("installment", count.returnArray());
			request.getRequestDispatcher("/answer.jsp").forward(request, response);;
		} catch(NumberFormatException e) {
			 request.getRequestDispatcher("/ErrorPage.jsp").forward(request, response);
		}
	}
}
