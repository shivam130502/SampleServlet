
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


public class SecondServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
//        HttpSession session = request.getSession();
//        String number = session.getAttribute("num1").toString(); //session.getAttribute() returns an Object
        
        String number = null;
        
        Cookie[] cookies = request.getCookies();
        
        for(Cookie cookie : cookies){
            if(cookie.getName() .equals("num1"))
                    number = cookie.getValue();
        }
        
        PrintWriter out = response.getWriter();
        out.print("You Entered " + number);
    }
    
}
