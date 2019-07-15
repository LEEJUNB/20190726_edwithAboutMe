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

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");
		PrintWriter out = response.getWriter();
		out.write("<a href='index.html'>메인화면</a><br>");

		String localTime = LocalDateTime.now()
				.format(DateTimeFormatter.ofPattern("현재시간 : yyyy/MM/dd HH:mm", Locale.KOREA));
		out.write("<html>");
		out.write("<body>");
		out.write("<h1>");
		out.write(localTime);
		out.write("</h1>");
		out.write("</body>");
		out.write("</html>");
	}
}
