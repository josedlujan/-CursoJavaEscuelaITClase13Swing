import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class VentanaA extends JFrame{
	JTextField textField;
	JTextArea textArea;
	JLabel texto;
	JScrollPane scroll;
	
	public VentanaA(){
		setLayout(null);
		setSize(600,600);
		texto = new JLabel("Escribe tu comentario");
		//texto.setBounds(10, 5, 400, 50);
		add(texto);
		textArea = new JTextArea(2,10);
		
		scroll = new JScrollPane(textArea);
		scroll.setBounds(10,50,400,400);
		add(scroll);
		
	}
	
}
