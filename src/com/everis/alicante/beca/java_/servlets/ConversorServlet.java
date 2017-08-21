package com.everis.alicante.beca.java_.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConversorServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nombre = req.getParameter("nombre");
		int temperatura = Integer.parseInt(req.getParameter("temperatura"));
		double parametro = Double.parseDouble(req.getParameter("cantidad"));
		double resultado = 0;
		switch (temperatura) {
		case 0:
			resultado = (parametro - 32) * (5 / 9);
			break;
		case 1:
			resultado = parametro * (5 / 9) + 32;
			break;
		}

		PrintWriter salida = resp.getWriter();
		salida.print("<html>");
		salida.print("<body>");
		salida.print("<h1>El resultado de la conversion es: ");
		salida.print(resultado + "<h1>");
		salida.print("<br/>");
		salida.print("<h3>Gracias por utilizar nuestro pedazo de conversor, ");
		salida.print(nombre + "</h3>");
		salida.print("</body>");
		salida.print("</html>");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}
	

}
