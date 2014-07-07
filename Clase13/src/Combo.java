import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Combo  implements ActionListener{

	JFrame ventana;
	JPanel panel;
	JLabel texto;
	JComboBox combo;
	
	public void crearPanel(){
		panel = new JPanel();
		texto = new JLabel("Texto",JLabel.RIGHT);
		Font font = new Font("Serif",Font.BOLD,40);
	
		
		
		texto.setFont(font);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setLayout(new GridLayout(10,4));
		combo = new JComboBox();
		combo.addItem("Lunes");
		combo.addItem("Martes");
		combo.addItem("Miercoles");
		combo.addItem("Jueves");
		combo.addItem("Viernes");
		combo.addItem("Sabado");
		combo.addItem("Domingo");
		combo.addActionListener(this);
		
		
		panel.add(combo);
		panel.add(texto);
		
	}
	
	
	
	public void crearVentana(){
		ventana = new JFrame();
		ventana.setTitle("Ejemplo combo");
		ventana.setSize(400,400);
		ventana.add(panel);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
	
	
	public Combo(){
		crearPanel();
		crearVentana();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String dia = (String)combo.getSelectedItem(); 
		texto.setText(dia);
	}
}
