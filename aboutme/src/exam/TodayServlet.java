package exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setCharacterEncoding("utf8"); 
		response.setCharacterEncoding("utf8"); 
		PrintWriter out = response.getWriter(); 
		out.write("<a href='http://127.0.0.1:5500/WebContent/index.html'>메인화면</a><br>"); 

		String local_time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("현재시간 : yyyy/MM/dd HH:mm", Locale.KOREA));
		out.write("<html>");
		out.write("<body>");
		out.write("<h1>");
		out.write(local_time);
		out.write("</h1>");
		out.write("</body>");
		out.write("</html>");
	}
}
