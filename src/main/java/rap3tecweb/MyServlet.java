package rap3tecweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/names")

public class MyServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		String name = req.getParameter("name");
		String password = req.getParameter("password");

		// PrintWriter is the body type of response

		if ("jack".equals(name) && "jill".equals(password)) {
			req.getRequestDispatcher("success.html").forward(req, resp);
		} else {
			req.getRequestDispatcher("fail.html").forward(req, resp);
		}
	}

}


