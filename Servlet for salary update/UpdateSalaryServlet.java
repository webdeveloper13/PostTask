import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.Statement;



@WebServlet(urlPatterns = {"/UpdateSalaryServlet"})
public class UpdateSalaryServlet extends HttpServlet {

       protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Registered..!");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","suryansh", "computers");
            PreparedStatement ps=con.prepareStatement("update employee set.salary=? where EmployeeId=? ");
            String sEmployeeId=request.getParameter("EmployeeId");
            if(sEmployeeId==null){
                pw.println("<h2>Emloyee Id not Given</h2>");
                return;
                
            }
            int EmployeeId=Integer.parseInt(sEmployeeId);
            int salary=Integer.parseInt(request.getParameter("salary"));
            ps.setInt(1,salary);
            ps.setInt(2,EmployeeId);
            int count=ps.executeUpdate();
            if(count==1)
                pw.println("<h2>Successfuly updated salary!</h2>");
        else
                pw.println("<h2>Employee Id not found</h2>");
        }
        catch(Exception ex)
        {
            pw.println("<h2>Error...."+ex.getMessage()+"</h2>");
        }
       }
}