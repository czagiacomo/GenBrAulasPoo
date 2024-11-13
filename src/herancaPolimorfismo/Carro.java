package herancaPolimorfismo;

public class Carro extends Transporte{
	
	private int roda;
	private int chassi;
	private String placa;
	
	public Carro(String nome, int capacidade, int velocidade, int roda, int chassi, String placa) {
		super(nome, capacidade, velocidade);
		this.roda = roda;
		this.chassi = chassi;
		this.placa = placa;
	}

	public int getRoda() {
		return roda;
	}
 
 
	public void setRoda(int roda) {
		this.roda = roda;
	}
 
 
	public String getPlaca() {
		return placa;
	}
 
 
	public void setPlaca(String placa) {
		this.placa = placa;
	}
 
 
	public int getChassi() {
		return chassi;
	}
 
 
	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
        System.out.println("Roda: " + this.roda);
        System.out.println("Chassi: " + this.chassi);
        System.out.println("Placa " + this.placa);
	}
}
