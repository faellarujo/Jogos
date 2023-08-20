package main.java.br.com.mvbos.lgj;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimaTelaDesenho extends JFrame {
	
	private JPanel tela;
	
	
	
	public AnimaTelaDesenho() {
		tela = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				
				g.setColor(Color.white);
				g.fillRect(0, 0, tela.getWidth(), tela.getHeight());
				
				
				g.setColor(Color.BLUE);				
				g.drawLine(0, 240, ct, 640, 240 + ct);
				g.drawRect(10, 25, ct, 20, 20);
				g.drawOval(30, ct, 20, 40, 30);
				
				
				g.setColor(Color.YELLOW);				
				g.drawLine(0, 240, ct, 640, 240 + ct);
				g.drawRect(10, 25, ct, 20, 20);
				g.drawOval(30, ct, 20, 40, 30);
												
				g.setColor(Color.RED);
				g.drawString("Eu seria um otimo Score!", ct, 5, 10);
				
				
				
				
			}
		};
		
		getContentPane().add(tela);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);		 
	}
	
	
	public static void main(String[] args) {
		new AnimaTelaDesenho();
	}

}
