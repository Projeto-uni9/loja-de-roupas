package br.com.projeto.testes;

import br.com.projeto.produto.Produto;
import br.com.projeto.produto.ProdutoDao;

public class TesteAlterarProduto {

	public static void main(String[] args) {
		
		// TESTE JÁ REALIZADO 11/06/2022 - 11:57AM - APROVADO BY JÚLIO CÉSAR
		Produto produto = new Produto();
		
		produto.setCodigo(8);
		produto.setNome("teste09");
		produto.setFornecedor("C&A");
		produto.setSetor("Acessórios");
		produto.setCor("teste09");
		produto.setTamanho("teste09");
		produto.setQuantidade(350);
		produto.setDescricao("teste09");
		produto.setValor(427.75);
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.alterar(produto);
		
	}

}
