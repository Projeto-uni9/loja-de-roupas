package br.com.projeto.testes;

import br.com.projeto.produto.Produto;
import br.com.projeto.produto.ProdutoDao;

public class TesteCadastrarProduto {

	public static void main(String[] args) {

		// TESTE JÁ REALIZADO 10/06/2022 - 01:36AM - APROVADO BY JÚLIO CÉSAR
		/*
		 * SEGUIR ESTRUTURA
		 * Produto produto = new Produto(nome,fornecedor,setor,cor, tamanho, quantidade, descricao, valor
		 */
		Produto produto = new Produto("Bolsa Sanddler", "Vivara", "Acessórios", "Bege / Preto ", "Único", 450, "Bolsa Sanddler Handbag", 575.27);
		
		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.cadastrar(produto);
		
		System.out.println(produto.getNome());
		System.out.println(produto.getFornecedor());
		System.out.println(produto.getSetor());
		System.out.println(produto.getCor());
		System.out.println(produto.getTamanho());
		System.out.println(produto.getQuantidade());
		System.out.println(produto.getDescricao());
		System.out.println(produto.getValor());
	}

}
