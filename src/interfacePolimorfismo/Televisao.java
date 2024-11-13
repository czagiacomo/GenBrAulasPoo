package interfacePolimorfismo;

public class Televisao {

	public static void main(String[] args) {
		
		TVLG tvlg = new TVLG();
		TVSamsung tvSamsung = new TVSamsung();
		
		tvSamsung.ligar();
		tvlg.ligar();
		tvlg.conectarInternet();
		tvlg.mudarCanal(5);
		//tvlg.canalAtual();
		tvlg.desligar();
		//tvlg.mudarCanal(2);
	}

}
