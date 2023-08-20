package main.java.br.com.mvbos.lgj;

import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnicacaoTelaDesenho extends JFrame {
	
	private JPanel tela;
	private int fps = 1000/20; // 50
	private int ct; // Contador
	private Boolean anime = true;
	
	
	public iniciaAnimacao() {
		Long prxAtualizacao = (long) 0;
		
		while (anime) {
			if (System.currentTimeMillis() >= prxAtualizacao) {
				ct++;
				tela.repaint();
				
				prxAtualizacao = System.currentTimeMillis() + fps;
				
				if (ct == 100) {
					anime = false;
					
				}
			}
		}
	}

}
