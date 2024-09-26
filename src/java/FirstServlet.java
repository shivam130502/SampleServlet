
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
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
//        HttpSession session = request.getSession();
//        session.setAttribute("num1", number);

//        Cookie cookie = new Cookie("num1", number);
//        response.addCookie(cookie); // cookies are similar to sessions and hold information passed by user
        
        response.sendRedirect("SecondServlet?num1=" + number);
    }
    
}