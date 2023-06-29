package interfaces;

import javax.swing.JFrame;

public class Janela extends JFrame{

	Painel painel;
	
	public Janela() {
		super("Heritage");
		this.setSize(800, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		this.criarJanela();
	}
	
	void criarJanela() {
		painel = new Painel();
		painel.setBounds(0, 0, 800, 600);
		painel.setVisible(true);
		add(painel);
		
		repaint();
		revalidate();
	}
}
