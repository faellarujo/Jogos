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
				
				g.setColor(Color.BLUE);
				g.drawLine(50, 240, 100, 240);
				g.drawLine(100, 240, 100, 260);
				g.drawLine(100, 260, 50, 260);
				g.drawLine(50, 260, 50, 240);
				
				
				g.setColor(Color.RED);
				g.drawRect(10, 25, 100, 100);
				
				g.setColor(Color.yellow);
				g.fillOval(110, 125, 110, 110);
				
				
//				g.drawRect(10, 25, 20, 20);
//				g.fillOval(110, 125, 120, 120);
//				
//				
//				g.setColor(Color.yellow);
//				g.drawLine(320, 0, 320, 480);
//				g.drawRect(110, 125, 120, 120);
//				g.fillOval(110, 125, 120, 120);
//				g.drawOval(230, 220, 240, 230);
//				g.fillOval(230, 220, 240, 230);
//				
//				g.setColor(Color.RED);
//				g.drawString("Eu seria um otimo Score!", 5, 10);			
				
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
