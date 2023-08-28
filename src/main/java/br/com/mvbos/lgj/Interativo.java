package main.java.br.com.mvbos.lgj;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interativo extends JFrame {
	
	private JPanel tela;
	private int px;
	private int py;
	private Boolean jogando = true;
	private int fps = 1000 / 20; // 50
	
	
	public void inicia() {
		Long prxAtulizacao = (long) 0;
		
		
		while (jogando) {
			if (System.currentTimeMillis() >= prxAtulizacao) {
				tela.repaint();
				prxAtulizacao = System.currentTimeMillis() + fps;
			}
		}
	}

	

}
