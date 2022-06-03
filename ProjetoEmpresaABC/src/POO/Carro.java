package POO;

public class Carro {
	
	//Construtor
    public Carro() {
    	Carro.totalCarros = totalCarros + 1;
    	
    }
    
    public Carro(String marca, String modelo, String cor, int km, int capacidadeTanque, double preco, double valorComDesconto) {
    	this.marca = marca;
    	this.modelo = modelo;
    	this.cor = cor;
    	this.km = km;
    	this.capacidadeTanque = capacidadeTanque;
    	
    	this.preco = preco;
    	this.valorComDesconto = valorComDesconto;
    	
    	
    }
		

	private String marca;
	private String modelo;
	private String cor;
	private int km;
	private int capacidadeTanque;
	private int kmPorLitro;
	private double preco;
	private double valorComDesconto;
	private static int totalCarros;
	private static double totalpreco;

	//METODOS PARA INSERIR E PEGAR

	

	
	
	// MÉTODOS
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		if(km>=0 && km <=20000) {
			this.km = km;
		}else {
			System.out.println("Km superior a 20.000");
			System.exit(0);
			}
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public int getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(int kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
		Carro.totalpreco = Carro.totalpreco + this.preco;
	}

	public double getValorComDesconto() {
		return valorComDesconto;
	}

	public void setValorComDesconto(double valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}
	
	public static int getTotalCarros() {
		return totalCarros;
	}

	public static double getTotalpreco() {
		return totalpreco;
	}

	public static void setTotalpreco(double totalpreco) {
		Carro.totalpreco = totalpreco;
	}

	int calcularKm() {
		return capacidadeTanque * kmPorLitro;
	}

	double calcularDescontoVendedor(double percentualDescontoVendedor) {

		if (percentualDescontoVendedor >= 0 && percentualDescontoVendedor <= 4) {
			return preco * (percentualDescontoVendedor / 100);
		} else if (percentualDescontoVendedor < 0) {
			return 0.0;
		} else {
			return preco * 0.04;
		}
		
	}

	double calcularDescontoVendedor(double percentualDescontoVendedor, double percentualDescontoGerente) {

		// Alterar o percentual do Vendedor se a venda for menor que 0 ou maior que 4

		if (percentualDescontoVendedor < 0) {
			percentualDescontoVendedor = 0;
		} else if (percentualDescontoVendedor > 4) {
			percentualDescontoVendedor = 4;
		}

		// Alterar o percentual do Gerente se a venda for menor que 0 ou maior que 2
		if (percentualDescontoGerente < 0) {
			percentualDescontoGerente = 0;
		} else if (percentualDescontoGerente > 2) {
			percentualDescontoGerente = 2;
		}
		
		double desconto = this.preco * ((percentualDescontoVendedor / 100) + (percentualDescontoGerente / 100));
		this.valorComDesconto = this.preco - desconto;
		return desconto;

	}

}

