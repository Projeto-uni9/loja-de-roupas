package br.com.projeto.testes;

import br.com.projeto.produto.ProdutoDao;

public class TesteRemoverProduto {

	public static void main(String[] args) {
		
		// TESTE REALIZADO COM SUCESSO - 12/06/2022 - 15:59PM - APROVADO POR JÚLIO CARIA
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.remover(6);
		
		System.out.println("PRODUTO REMOVIDO COM SUCESSO!");
		
		
	}

}
