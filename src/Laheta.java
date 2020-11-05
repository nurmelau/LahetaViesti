

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Laheta
 */
@WebServlet("/Laheta")
public class Laheta extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String viesti = "Tervehdys!";
		
		request.setAttribute("viesti", viesti);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}
