package POO;

public class TesteCriarObjeto {

	public static void main(String[] args) {

		System.out.println("PRIMEIRO CARRO");

		System.out.println();

		Carro novoCarro = new Carro("VM", "Gol", "Azul", 15560, 50, 2000, 12);
		 

		System.out.println("Marca: " + novoCarro.getMarca());
		System.out.println("Modelo: " + novoCarro.getModelo());
		System.out.println("Cor: " + novoCarro.getCor());
		System.out.println("Km: " + novoCarro.getKm());
		System.out.println("Rodagem do Veículo: " + novoCarro.calcularKm());
		System.out.println("Preço: " + novoCarro.getPreco());
		System.out.println("Desconto: " + novoCarro.calcularDescontoVendedor(4,2));
		System.out.println("Valor Pago: " + novoCarro.getValorComDesconto());

		System.out.println();

		System.out.println("SEGUNDO CARRO");

		System.out.println();

		Carro novoCarro2 = new Carro("Chevrolet", "Onix", "Preto", 2350, 45, 5500,10);
		

		System.out.println("Marca: " + novoCarro2.getMarca());
		System.out.println("Modelo: " + novoCarro2.getModelo());
		System.out.println("Cor: " + novoCarro2.getCor());
		System.out.println("Km: " + novoCarro2.getKm());
		System.out.println("Rodagem do Veículo: " + novoCarro2.calcularKm());
		System.out.println("Preço: " + novoCarro2.getPreco());
		System.out.println("Desconto: " + novoCarro2.calcularDescontoVendedor(2,2));
		System.out.println("Valor Pago: " + novoCarro2.getValorComDesconto());
		

		System.out.println();

		System.out.println("TERCEIRO CARRO");

		System.out.println();

		Carro novoCarro3 = new Carro("Fiat", "Palio", "Prata", 0, 47, 14, 37000);
		

		System.out.println("Marca: " + novoCarro3.getMarca());
		System.out.println("Modelo: " + novoCarro3.getModelo());
		System.out.println("Cor: " + novoCarro3.getCor());
		System.out.println("Km: " + novoCarro3.getKm());
		System.out.println("Rodagem do Veículo: " + novoCarro3.calcularKm());
		System.out.println("Preço: " + novoCarro3.getPreco());
		System.out.println("Desconto: " + novoCarro3.calcularDescontoVendedor(3,2));
		System.out.println("Valor Pago: " + novoCarro3.getValorComDesconto());
		
		
    System.out.println("====================");
    System.out.println("Quantidade de Carros: " + Carro.getTotalCarros());
    System.out.println("Preço total dos carros: " + Carro.getTotalpreco());
	}

}
