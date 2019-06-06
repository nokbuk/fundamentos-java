package icones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JogoDaVelha extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoDaVelha frame = new JogoDaVelha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JogoDaVelha() {
		setTitle("Jogo da Velha!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bora jogar um jogo da velha? ");
		lblNewLabel.setFont(new Font("Century", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 56);
		contentPane.add(lblNewLabel);
		
		JButton btnTeste = new JButton("New button");
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				criarBotao();
			}
		});
		btnTeste.setBounds(41, 109, 107, 102);
		contentPane.add(btnTeste);
		
		
		
	}
	
	public void criarBotao() {
		
		JButton btnTeste2 = new JButton("New button");
		btnTeste2.setBounds(264, 109, 107, 102);
		contentPane.add(btnTeste2);
	}
	}
	

