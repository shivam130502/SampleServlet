
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FirstServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        
        RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
        rd.forward(request, response); // might throw servlet exception
    }
    
}