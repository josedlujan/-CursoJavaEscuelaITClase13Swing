import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Ventana implements ChangeListener{
	JFrame ventana;
	JPanel panelTexto,panelArea,panelTextoP,panel,panelR;
	JLabel texto,textpP,respuesta;
	
	JCheckBox mex,esp,ven;
	
	String salida="";

	public void crearPanelTexto(){
		panelTexto = new JPanel();
		panelTexto.setLayout(new BoxLayout(panelTexto, BoxLayout.X_AXIS));
		texto = new JLabel();
		texto.setText("Que nacionalidad eres");
		panelTexto.add(texto);
		
	}
	
	public void crearPanel(){
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		mex = new JCheckBox("Mexicano");
		esp = new JCheckBox("Espanol");
		ven = new JCheckBox("Venezuela");		
		
		mex.addChangeListener(this);
		esp.addChangeListener(this);
		ven.addChangeListener(this);
		
		panel.add(mex);
		panel.add(esp);
		panel.add(ven);
	}
	
	public void crearRespuesta(){
		panelR= new JPanel();
		panelR.setLayout(new BoxLayout(panelR, BoxLayout.X_AXIS));
		respuesta = new JLabel();
		respuesta.setText("Ninguna");
		panelR.add(respuesta);
	}
	
	
	public void crearVentana(){
		ventana  = new JFrame();
		ventana.setLayout( new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
		ventana.setTitle("Clase 13");
		ventana.setSize(600,600);
		ventana.add(panelTexto);
		ventana.add(panel);
		ventana.add(panelR);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		
	}
	
	public Ventana(){
		crearPanelTexto();
		crearPanel();
		crearRespuesta();
		crearVentana();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(mex.isSelected()==true){
			respuesta.setText("mexicano");
		}
		if(esp.isSelected()==true){
			respuesta.setText("espanol");
		}
		if(ven.isSelected()==true){
			respuesta.setText("venezolano");
		}
		
	}
}
