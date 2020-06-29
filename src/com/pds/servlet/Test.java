package com.pds.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entities.Frequentation;
import getFromAPI.FrequentationAPI;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stu
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/frequentation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub$
		Integer an= Integer.parseInt(request.getParameter("annee"));
		int annee=an.intValue()	;
		Integer mo = Integer.parseInt(request.getParameter("mois"));
		int mois = mo.intValue();
		FrequentationAPI api=new FrequentationAPI();
		Frequentation[] freq=api.get(mois, annee);
		request.setAttribute("freq", freq);
		doGet(request, response);
	}

}
