package br.pasquet;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;



public class RUN extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputTEXTO;


	public RUN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 535);
		setLocationRelativeTo(null);
		setSize(646,535);
		setResizable(false);
		setTitle("TRABALHO: Orientação a Objeto Avançada");
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setBounds(10, 11, 610, 474);
		contentPane.add(painelPrincipal);
		painelPrincipal.setLayout(null);
		
		JButton btnRUN = new JButton("CONECTAR");
		btnRUN.setBounds(10, 60, 89, 23);
		painelPrincipal.add(btnRUN);
		
		JButton btnSTOP = new JButton("SAIR");
		btnSTOP.setBounds(119, 60, 89, 23);
		painelPrincipal.add(btnSTOP);
		
		JButton btnSEND = new JButton("ENVIAR");
		btnSEND.setBounds(511, 440, 89, 23);
		painelPrincipal.add(btnSEND);
		
		inputTEXTO = new JTextField();
		inputTEXTO.setBounds(10, 441, 491, 20);
		painelPrincipal.add(inputTEXTO);
		inputTEXTO.setColumns(10);
		
		
		JPanel painelTextoCONSOLE = new JPanel();
		painelTextoCONSOLE.setBounds(10, 100, 590, 326);
		painelPrincipal.add(painelTextoCONSOLE);
		painelTextoCONSOLE.setLayout(null);
		
		JTextArea textAreaCONSOLE = new JTextArea();
		textAreaCONSOLE.setBounds(10, 11, 570, 304);
		painelTextoCONSOLE.add(textAreaCONSOLE);
		
		inputTEXTO = new JTextField();
		inputTEXTO.setColumns(10);
		
		//JScrollPane scrollBar = new JScrollPane (textAreaCONSOLE, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//painelTextoCONSOLE.add(scrollBar);
		
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {  
		       UIManager.setLookAndFeel(new HiFiLookAndFeel());  
		       (new RUN()).show();  
		     } catch (Exception erro) {  
		       erro.printStackTrace();  
		     }
	} 
}

