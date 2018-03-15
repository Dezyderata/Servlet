package servlets;

import credit.Answer;
import credit.Count;
import credit.MyForm;
import credit.Validation;
import pdf.PdfCreate;

import java.io.DataOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@WebServlet("/PdfServlet")
public class PdfServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	MyForm form = new MyForm();
	private double d;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			form.setAmountOfCredit(Double.parseDouble(request.getParameter("kwota")));
			form.setPercent(Double.parseDouble(request.getParameter("procent")));
			form.setFixedFee(Double.parseDouble(request.getParameter("oplata")));
			form.setNumberOfInstallments(Integer.parseInt(request.getParameter("ileRat")));
			Validation valid = new Validation(form);
			valid.doValidation();
			if(valid.getAns()==0) {
				request.setAttribute("Validation", valid.getProblem());
				request.getRequestDispatcher("/ErrorPage.jsp").forward(request, response);;
			}else {
				Count count = new Count(form);
				switch(Integer.parseInt(request.getParameter("rodzaj"))) {
					case 0:
						count.countEqualAns();
						break;
					case 1:
						count.CountAns();
						break;
				}
				PdfCreate create = new PdfCreate();
				create.createPdf(response, count.returnArray());
			}		          
		} catch(NumberFormatException e) {
			 request.getRequestDispatcher("/ErrorPage.jsp").forward(request, response);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	   
}
