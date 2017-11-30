package nure.ua.nechyporuk_odinec;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/home")


public class HomeServlet extends HttpServlet {

	
	private static final long serialVersionUID = -3828094788498285117L;
	private static final WebsiteTitle myapp = new WebsiteTitle();
	


    public HomeServlet() {
 
    	
   
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("myapp", myapp);
		
		RequestDispatcher view = this.getServletContext().getRequestDispatcher("/WEB-INF/view/home.jsp");
        view.forward(request, response); 		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
