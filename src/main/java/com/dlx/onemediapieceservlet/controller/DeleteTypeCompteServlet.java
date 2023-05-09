package com.dlx.onemediapieceservlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dlx.onemediapieceservlet.model.TypeCompte;
import com.dlx.onemediapieceservlet.service.TypeCompteService;
import com.dlx.onemediapieceservlet.service.impl.TypeCompteServiceImpl;

/**
 * Servlet implementation class DeleteTypeCompteServlet
 */
@WebServlet("/DeleteTypeCompteServlet")
public class DeleteTypeCompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private  final  TypeCompteService service = TypeCompteServiceImpl.getInstance();
	
	private final String URL ="/WEB-INF/AddTypeCompte.jsp";
         
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTypeCompteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher(URL).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		long idTypeCompte = Long.parseLong(id);
		
		
		TypeCompte tc = new TypeCompte();
		
		tc =  service.find(idTypeCompte);
		
		tc= service.delete(tc);
		
		
		doGet(request, response);
	}

}