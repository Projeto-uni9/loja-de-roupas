package br.com.projeto.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.produto.Produto;
import br.com.projeto.produto.ProdutoDao;


@WebServlet("/cadastrarproduto")
public class CadastroProdutoServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String fornecedor = request.getParameter("fornecedor");
		String setor = request.getParameter("setor");
		String cor = request.getParameter("cor");
		String tamanho = request.getParameter("tamanho");
		Integer quantidade = converterQuantidade(request.getParameter("quantidade"));
		String descricao = request.getParameter("descricao");
		Double valor = converterValor(request.getParameter("valor"));
		
		Produto produto = new Produto(nome, fornecedor, setor, cor, tamanho, quantidade, descricao, valor);
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.cadastrar(produto);
		
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
