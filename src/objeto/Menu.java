package objeto;

public class Menu {

	public static void main(String[] args) {
		
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
		
		System.out.println("\nCadastre um gato: ");
		gato1.nome = "Litha";
		gato1.idade = 2;
		gato1.cor = "Tigrada e Branca";
		gato1.raca = "Familiar de Bruxa";
		
		gato1.Imprimir();
		
		System.out.println("\nO que " + gato1.nome + " está fazendo?");
		
		gato1.Dormir();
		
		//===========================
		
		System.out.println("\nCadastre um gato: ");
		gato2.nome = "Khepri";
		gato2.idade = 1;
		gato2.cor = "Tigrado";
		gato2.raca = "Ladrão de Familiar";
		
		gato2.Imprimir();
		
		System.out.println("\nO que " + gato2.nome + " está fazendo?");
		
		gato2.Comer();
		gato2.Dormir();

	}

}
