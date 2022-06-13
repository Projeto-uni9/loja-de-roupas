package br.com.projeto.testes;

import java.util.ArrayList;

import br.com.projeto.produto.Produto;
import br.com.projeto.produto.ProdutoDao;

public class TesteMostrarProdutos {

	public static void main(String[] args) {
		
		ProdutoDao produtoDao = new ProdutoDao();
		ArrayList<Produto> listaDeProdutos = produtoDao.mostrarProdutos();
		
		for(Produto produto:listaDeProdutos) {
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Fornecedor: " + produto.getFornecedor());
			System.out.println("Setor: " + produto.getSetor());
			System.out.println("Cor: " + produto.getCor());
			System.out.println("Tamanho: " + produto.getTamanho());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("Descricao: " + produto.getDescricao());
			System.out.println("Valor: " + produto.getValor());
			System.out.println("-----------------------------------------");
		}

	}

}
