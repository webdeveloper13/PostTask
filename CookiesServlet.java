import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"CookiesServlet"})
public class EvenServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
           
            out.println("<title>Servlet CookiesServlet</title>");            
            out.println("</head>");
            out.println("<body>");
           String name,value,chk;
           name=request.getParameter("uid");
           value=request.getParameter("pwd");
           chk=request.getParameter("chk");
           Cookie ck=new Cookie(name,value);
           if(chk!=null){
           ck.setMaxAge(60);
           }
           response.addCookie(ck);
           out.println("<h1>Cookie Added Successfully</h1>");
           out.println("<a href-"listcookies">Verify Cookies List</a>");
           
          
            out.println("</body>");
            out.println("</html>");
        }
    }
}