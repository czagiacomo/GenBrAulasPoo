package objeto;

public class Gato {
	
	String nome;
	int idade;
	String cor;
	String raca;
	
	public void Miar(){
		System.out.println("Miau");
	}
	
	public void Comer() {
		System.out.println("Nhom Nhom Nhom");
	}
	
	public void Dormir() {
		System.out.println("ZzZzZzZz");
	}
	
	public void Imprimir() {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(cor);
		System.out.println(raca);
	}
	
}
