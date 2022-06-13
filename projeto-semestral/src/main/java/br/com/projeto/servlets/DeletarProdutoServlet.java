package br.com.projeto.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.produto.ProdutoDao;


@WebServlet("/deletar")
public class DeletarProdutoServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer codigo = Integer.valueOf(request.getParameter("codigo"));
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.remover(codigo);
		
		response.sendRedirect("produtos");
		
	}

}
