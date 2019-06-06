import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TabuadaGraf extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum;
	private JLabel lblValor0;
	private JLabel lblValor9;
	private JLabel lblValor8;
	private JLabel lblValor7;
	private JLabel lblValor6;
	private JLabel lblValor5;
	private JLabel lblValor4;
	private JLabel lblValor3;
	private JLabel lblValor2;
	private JLabel lblValor1;
	private JLabel lblValor10;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabuadaGraf frame = new TabuadaGraf();
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
	public TabuadaGraf() {
		setResizable(false);
		setTitle("Tabuada!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNum = new JTextField();
		txtNum.setHorizontalAlignment(SwingConstants.CENTER);
		txtNum.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 20));
		txtNum.setBounds(182, 55, 52, 36);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		JLabel lblEscolhaUmNmero = new JLabel("Escolha um n\u00FAmero para a tabuada!");
		lblEscolhaUmNmero.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblEscolhaUmNmero.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaUmNmero.setBounds(29, 11, 370, 33);
		contentPane.add(lblEscolhaUmNmero);
		
		lblValor0 = new JLabel("");
		lblValor0.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblValor0.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor0.setBounds(39, 105, 98, 33);
		contentPane.add(lblValor0);
		
		lblValor1 = new JLabel("");
		lblValor1.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor1.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblValor1.setBounds(39, 149, 98, 33);
		contentPane.add(lblValor1);
		
		lblValor2 = new JLabel("");
		lblValor2.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor2.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblValor2.setBounds(39, 193, 98, 33);
		contentPane.add(lblValor2);
		
		lblValor3 = new JLabel("");
		lblValor3.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor3.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblValor3.setBounds(39, 237, 98, 33);
		contentPane.add(lblValor3);
		
		lblValor4 = new JLabel("");
		lblValor4.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor4.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblValor4.setBounds(39, 281, 98, 33);
		contentPane.add(lblValor4);
		
		lblValor5 = new JLabel("");
		lblValor5.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor5.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblValor5.setBounds(284, 105, 98, 33);
		contentPane.add(lblValor5);
		
		lblValor6 = new JLabel("");
		lblValor6.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor6.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblValor6.setBounds(284, 149, 98, 33);
		contentPane.add(lblValor6);
		
		lblValor7 = new JLabel("");
		lblValor7.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor7.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblValor7.setBounds(284, 193, 98, 33);
		contentPane.add(lblValor7);
		
		lblValor8 = new JLabel("");
		lblValor8.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor8.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblValor8.setBounds(284, 237, 98, 33);
		contentPane.add(lblValor8);
		
		lblValor9 = new JLabel("");
		lblValor9.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor9.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblValor9.setBounds(284, 281, 98, 33);
		contentPane.add(lblValor9);
		
		JButton btnCalc = new JButton("Calcular!");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
				//Botao para calcular
			}
		});
		btnCalc.setBounds(168, 102, 89, 80);
		contentPane.add(btnCalc);
		
		lblValor10 = new JLabel("");
		lblValor10.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor10.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblValor10.setBounds(168, 298, 98, 33);
		contentPane.add(lblValor10);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(168, 200, 89, 80);
		contentPane.add(btnLimpar);
	}
	private void calcular() {
		int valor;
		valor = (int) Double.parseDouble(txtNum.getText());
		      for (int i = 0; i<=10 ; i++) {
		    	  
		      }
		      
	
		//for (int i = 0; i <=10; i++) {
			
			//System.out.println(valor + " x " + i + " = " + (valor*i));
			
		//}

	}
	private void limpar() {
		lblValor0.setText(null);
	      lblValor1.setText(null);
	      lblValor2.setText(null);
	      lblValor3.setText(null);
	      lblValor4.setText(null);
	      lblValor5.setText(null);
	      lblValor6.setText(null);
	      lblValor7.setText(null);
	      lblValor8.setText(null);
	      lblValor9.setText(null);
	      lblValor10.setText(null);

	}
	
	
}
