package interfacePolimorfismo;

public class TVSamsung implements ControleRemoto {

	private boolean ligado = false;
	private int canalAtual = 1;

	@Override
	public void ligar() {
		ligado = true;
		System.out.println("TV Samsung está ligada");
	}

	@Override
	public void desligar() {
		ligado = false;
		System.out.println("TV Samsung está desligada");
	}

	@Override
	public void mudarCanal(int canal) {
		if (ligado) {
			canalAtual = canal;
			System.out.println("TV Samsung está no canal " + canal);
		} else {
			System.out.println("TV Samsung está desligada");
		}
	}

}
