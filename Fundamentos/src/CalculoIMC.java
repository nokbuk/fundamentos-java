import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CalculoIMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private JLabel lblStatus;
	private JLabel lblIMC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoIMC frame = new CalculoIMC();
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
	public CalculoIMC() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculoIMC.class.getResource("/icones/imc.png")));
		setTitle("Calculadora IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigi = new JLabel("Altura: ");
		lblDigi.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblDigi.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigi.setBounds(10, 11, 79, 28);
		contentPane.add(lblDigi);
		
		JButton btnCalcular = new JButton("");
		btnCalcular.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/calculator.png")));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setBounds(34, 100, 146, 125);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/clean.png")));
		btnLimpar.setBounds(250, 100, 137, 125);
		contentPane.add(btnLimpar);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblPeso.setBounds(10, 43, 72, 46);
		contentPane.add(lblPeso);
		
		txtAltura = new JTextField();
		txtAltura.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		txtAltura.setBounds(84, 18, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		txtPeso.setBounds(84, 58, 96, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setHorizontalAlignment(SwingConstants.CENTER);
		lblImc.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblImc.setBounds(190, 18, 77, 46);
		contentPane.add(lblImc);
		
		lblStatus = new JLabel("New label");
		lblStatus.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/tabela_imc.jpg")));
		lblStatus.setBounds(10, 255, 402, 202);
		contentPane.add(lblStatus);
		
		lblIMC = new JLabel("");
		lblIMC.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblIMC.setHorizontalAlignment(SwingConstants.CENTER);
		lblIMC.setBounds(267, 10, 137, 68);
		contentPane.add(lblIMC);
	}
	private void atualizaLabel() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage(getClass).getResource())
	}
	
	private void calcular() {
		double altura, peso, imc;
		DecimalFormat formatador = new DecimalFormat("0.0"); 
		altura = Double.parseDouble(txtAltura.getText().replace(",","."));
		peso = Double.parseDouble(txtPeso.getText().replace(",","."));
		imc = peso / (altura * altura);
		lblIMC.setText(formatador.format(imc));
		// abaixo do peso = 18,5
		// normal = 18,5 a 25
		// acima do peso = 25 a 30
		// obeso = 30+
		if (imc < 18.5){
			lblStatus.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/tabela_imc_abaixo.jpg")));
		} else if(imc >=18.5 && imc < 25){
			lblStatus.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/tabela_imc_normal.jpg")));
		}
		else if(imc >=25 && imc < 30) {
			lblStatus.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/tabela_imc_acima.jpg")));
		}
		else {
			lblStatus.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/tabela_imc_obeso.jpg")));
		}
		
	}
	private void limpar() {
	txtAltura.setText(null);
	txtPeso.setText(null);
	lblIMC.setText(null);
	lblStatus.setIcon(new ImageIcon(CalculoIMC.class.getResource("/icones/tabela_imc.jpg")));
	}
	}

