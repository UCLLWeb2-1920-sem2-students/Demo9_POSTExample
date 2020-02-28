package ui.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.model.Course;

@WebServlet("/Course")
public class CourseServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String code = request.getParameter("code");
		String creditsFromParameter = request.getParameter("credits");
		int credits = Integer.parseInt(creditsFromParameter);
		String contactFromParameter = request.getParameter("contact");
		int contactHours = Integer.parseInt(contactFromParameter);

		Course course = new Course(title, code, credits, contactHours);
		request.setAttribute("course", course);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
