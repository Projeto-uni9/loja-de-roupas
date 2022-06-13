package br.com.projeto.produto;

public class Produto {

	public Produto(String nome, String fornecedor, String setor, String cor, String tamanho, Integer quantidade,
			String descricao, Double valor) {
		super();
		this.nome = nome;
		this.fornecedor = fornecedor;
		this.setor = setor;
		this.cor = cor;
		this.tamanho = tamanho;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.valor = valor;
		
	}

	public Produto() {
		
	}
	
	
	private int codigo;
	private String nome;
	private String fornecedor;
	private String setor;
	private String cor;
	private String tamanho;
	private int quantidade;
	private String descricao;
	private double valor;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() { 
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
