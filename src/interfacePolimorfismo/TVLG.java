package interfacePolimorfismo;

public class TVLG implements ControleRemoto, Conevtividade {

	private boolean ligado = false;
	private int canalAtual = 1;

	@Override
	public void ligar() {
		ligado = true;
		System.out.println("TV LG está ligada");
	}

	@Override
	public void desligar() {
		ligado = false;
		System.out.println("TV LG está desligada");
	}

	@Override
	public void mudarCanal(int canal) {
		if(ligado) {
			canalAtual = canal;
			System.out.println("TV LG está no canal " + canal);
		}else {
			System.out.println("TV LG está desligada");
		}
	}
	
	@Override
	public void conectarInternet() {
		System.out.println("Tv LG Conectada à internet");
	}

}
