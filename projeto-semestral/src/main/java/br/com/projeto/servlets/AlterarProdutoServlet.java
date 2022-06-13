package br.com.projeto.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.produto.Produto;
import br.com.projeto.produto.ProdutoDao;

@WebServlet("/alterar")
public class AlterarProdutoServlet extends HttpServlet{

	Produto produto = null;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		Integer codigo = Integer.valueOf(request.getParameter("codigo"));
		
		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = produtoDao.buscarPorCodigo(codigo);
		
		request.setAttribute("produto", produto);
		RequestDispatcher rd = request.getRequestDispatcher("/AlterarProduto.jsp");
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer codigo = Integer.valueOf(request.getParameter("codigo"));
		
		String nome = request.getParameter("nome");
		String fornecedor = request.getParameter("fornecedor");
		String setor = request.getParameter("setor");
		String cor = request.getParameter("cor");
		String tamanho = request.getParameter("tamanho");
		Integer quantidade = converterQuantidade(request.getParameter("quantidade"));
		String descricao = request.getParameter("descricao");
		Double valor = converterValor(request.getParameter("valor"));
		
		Produto produto = new Produto();
		
		produto.setCodigo(codigo);
		produto.setNome(nome);
		produto.setFornecedor(fornecedor);
		produto.setSetor(setor);
		produto.setCor(cor);
		produto.setTamanho(tamanho);
		produto.setQuantidade(quantidade);
		produto.setDescricao(descricao);
		produto.setValor(valor);
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.alterar(produto);
		
		response.sendRedirect("produtos");
	}
	
	
	private Integer converterQuantidade(String quantidadeString) {
		Integer convertidoQntEstoque = Integer.parseInt(quantidadeString);
		
		return convertidoQntEstoque;
	}
	
	private Double converterValor(String valorString) {
		Double convertidoPreco = Double.parseDouble(valorString);
		
		return convertidoPreco;
	}
		
}
