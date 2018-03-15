package pdf;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import credit.Answer;

public class PdfCreate {

	public PdfCreate() {
		// TODO Auto-generated constructor stub
	}
	 public void createPdf(HttpServletResponse response, ArrayList<Answer> array) throws IOException, DocumentException {
         Document document = new Document();
         DataOutputStream os = new DataOutputStream(response.getOutputStream());
         PdfWriter.getInstance(document, os);
         document.open();
         document.add(createFirstTable(array));
         document.close();
		}
	 
	public static PdfPTable createFirstTable(ArrayList<Answer> array) {
        PdfPTable table = new PdfPTable(5);
        table.addCell("Numer raty");
        table.addCell("Kapital");
        table.addCell("Kwota odsetek");
        table.addCell("Oplata stala");
        table.addCell("Calkowita kwota raty");
        for(Answer ans:array) {
        	table.addCell(Integer.toString(ans.getNumberOfInstallment()));
        	table.addCell(ans.getCapital());
        	table.addCell(ans.getInterest());
        	table.addCell(ans.getFixedFee());
        	table.addCell(ans.getTotalSumOfInstallment());
        }
        return table;
    }
}
