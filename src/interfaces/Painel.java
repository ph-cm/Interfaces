package interfaces;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel extends JPanel{

	JButton btnEnviar;
	JButton btnSacar;
	JButton btnInvestir;
	JButton btnDepositar;
	
	JLabel lblNome;
	JLabel lblEndereco;
	JLabel lblSaldo;
	JLabel lblNumeroDaConta;
	
	public Painel() {
		super();
		this.setLayout(null);
		this.setBackground(Color.white);
		
		lblNome = new JLabel();
		lblNome.setText("Nome: ");
		lblNome.setBounds(10 , 10 , 50 , 20);
		lblNome.setVisible(true);
		add(lblNome);
		
	}
	
}
