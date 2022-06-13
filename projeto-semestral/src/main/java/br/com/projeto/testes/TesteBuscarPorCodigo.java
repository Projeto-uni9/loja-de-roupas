package br.com.projeto.testes;

import br.com.projeto.produto.Produto;
import br.com.projeto.produto.ProdutoDao;

public class TesteBuscarPorCodigo {

	public static void main(String[] args) {
		
		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = produtoDao.buscarPorCodigo(5);
		
		System.out.println("Código: " + produto.getCodigo());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Fornecedor: " + produto.getFornecedor());
		System.out.println("Setor: " + produto.getSetor());
		System.out.println("Cor: " + produto.getCor());
		System.out.println("Tamanho: " + produto.getTamanho());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Descricao: " + produto.getDescricao());
		System.out.println("Valor: " + produto.getValor());

	}

}
