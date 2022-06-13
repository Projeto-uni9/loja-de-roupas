package br.com.projeto.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection obterConexao() {

		Connection con = null;

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/dbprodutos?useTimezone=true&serverTimezone=UTC", "root", "rootUni9BCC2022");
			System.out.println("CONEXAO COM O BANCO DE DADOS ESTABELECIDA!");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("NÃO FOI POSSÍVEL ESTABELECER A CONEXAO COM O BANCO DE DADOS, TENTE NOVAMENTE");
			e.printStackTrace();
		}
		
		return con;
	}

}
