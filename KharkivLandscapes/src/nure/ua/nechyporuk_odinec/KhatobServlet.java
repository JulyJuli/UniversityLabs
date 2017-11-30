package nure.ua.nechyporuk_odinec;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/khatob")
public class KhatobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public KhatobServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/view/khatob.jsp");
		rd.forward(request, response);
	}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
