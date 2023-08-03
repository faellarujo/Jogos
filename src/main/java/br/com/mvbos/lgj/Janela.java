package br.com.mvbos.lgj;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {

	private JPanel tela;

	public Janela() {

		tela = new JPanel() {

			/**
			 * Nesse contexto o Jframe seria nossa moldura
			 * Jpainel seria nossa tela
			 * Aqui ciramos uma classe extendendo o Jpanel sobrescrevendo alguns metodos para termos mais flexibilidde
			 * Pense na classe Graphics como sendo o nosso pincel na tela
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {

			}

		};
		
		super.getContentPane().add(tela);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Janela();
	}
}
