package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans contact = new JavaBeans();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/main")) {
			contatcs(request, response);
		} else {
			if (action.equals("/insert")) {
				newContact(request, response);
			}
		}

	}

	// listar contatod
	protected void contatcs(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<JavaBeans> contacts = dao.listAllContacts();
		request.setAttribute("contacts", contacts);
		RequestDispatcher rd = request.getRequestDispatcher("agenda.jsp");
		rd.forward(request, response);
	}

	// novo contato
	protected void newContact(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		contact.setName(request.getParameter("name"));
		contact.setEmail(request.getParameter("email"));
		contact.setPhone(request.getParameter("phone"));

		// invocando metodo de insercao
		dao.insertContact(contact);
		// redirecionando
		response.sendRedirect("main");
	}

}