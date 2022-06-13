package br.com.projeto.produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.projeto.banco.Conexao;

public class ProdutoDao {

	public void cadastrar(Produto produto) {
		
		Connection con = Conexao.obterConexao();
		
		String sql = "INSERT INTO Produto(nome,fornecedor,setor,cor,tamanho,quantidade,descricao,valor) VALUES (?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, produto.getNome());
			preparador.setString(2, produto.getFornecedor());
			preparador.setString(3, produto.getSetor());
			preparador.setString(4, produto.getCor());
			preparador.setString(5, produto.getTamanho());
			preparador.setInt(6,  produto.getQuantidade());
			preparador.setString(7, produto.getDescricao());
			preparador.setDouble(8,  produto.getValor());
			
			preparador.execute();
			
			preparador.close();
			System.out.println("PRODUTO CADASTRADO COM SUCESSO!!");
			
		} catch (SQLException e) {
			System.out.println("ERRO AO CADASTRAR O PRODUTO!!");
			e.printStackTrace();
		}
	
		
		
	} 
	
	public ArrayList<Produto> mostrarProdutos() {
	
		Connection con = Conexao.obterConexao();
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		String sql = "SELECT * FROM Produto;";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			ResultSet resposta = preparador.executeQuery();
			
			while(resposta.next()) {
				Produto produto = new Produto();
				
				produto.setCodigo(resposta.getInt("codigo"));
				produto.setNome(resposta.getString("nome"));
				produto.setFornecedor(resposta.getString("fornecedor"));
				produto.setSetor(resposta.getString("setor"));
				produto.setCor(resposta.getString("cor"));
				produto.setTamanho(resposta.getString("tamanho"));
				produto.setQuantidade(resposta.getInt("quantidade"));
				produto.setDescricao(resposta.getString("descricao"));
				produto.setValor(resposta.getDouble("valor"));
				
				produtos.add(produto);
			}
			
			preparador.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produtos;
	
	}
	
	public Produto buscarPorCodigo(Integer codigo) {
		
		Connection con = Conexao.obterConexao();
		
		Produto produto = null;
		
		String sql = "SELECT * FROM Produto WHERE codigo=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1,  codigo);
			
			ResultSet resposta = preparador.executeQuery();
			
			if(resposta.next()) {
				produto = new Produto();
				
				produto.setCodigo(resposta.getInt("codigo"));
				produto.setNome(resposta.getString("nome"));
				produto.setFornecedor(resposta.getString("fornecedor"));
				produto.setSetor(resposta.getString("setor"));
				produto.setCor(resposta.getString("cor"));
				produto.setTamanho(resposta.getString("tamanho"));
				produto.setQuantidade(resposta.getInt("quantidade"));
				produto.setDescricao(resposta.getString("descricao"));
				produto.setValor(resposta.getDouble("valor"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produto;
		
	}
	
	
	public void remover(Integer codigo) {
		
		Connection con = Conexao.obterConexao();
		
		String sql = "DELETE FROM Produto WHERE codigo=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			preparador.setInt(1,  codigo);
			
			preparador.execute();
			preparador.close();
			
			System.out.println("O PRODUTO DELETADO DO SISTEMA COM SUCESSO");
			
		} catch (SQLException e) {
			System.out.println("ERRO AO DELETAR PRODUTO, TENTE NOVAMENTE!");
			e.printStackTrace();
		}
		
	
	}
	
	
	public void alterar(Produto produto) {
		
		Connection con = Conexao.obterConexao();
		
		String sql = "UPDATE Produto SET nome=?,fornecedor=?,setor=?,cor=?,tamanho=?,quantidade=?,descricao=?,valor=? WHERE codigo=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			preparador.setString(1, produto.getNome());
			preparador.setString(2, produto.getFornecedor());
			preparador.setString(3,  produto.getSetor());
			preparador.setString(4, produto.getCor());
			preparador.setString(5,  produto.getTamanho());
			preparador.setInt(6,  produto.getQuantidade());
			preparador.setString(7, produto.getDescricao());
			preparador.setDouble(8,  produto.getValor());
			preparador.setInt(9, produto.getCodigo());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("PRODUTO ALTERADO COM SUCESSO!");
			
			
		} catch (SQLException e) {
			System.out.println("ERRO AO ALTERAR O PRODUTO, TENTE NOVAMENTE!");
			e.printStackTrace();
		}
	}
	
}
