
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;


public class FirstServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        
//        RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//        rd.forward(request, response); // might throw servlet exception
        
        String number = request.getParameter("num1");
        HttpSession session = request.getSession();
        session.setAttribute("num1", number);
        
        response.sendRedirect("SecondServlet");
    }
    
}