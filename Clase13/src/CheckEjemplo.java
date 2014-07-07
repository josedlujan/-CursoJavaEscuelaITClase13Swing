import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class CheckEjemplo{
	JFrame ventana;
	JPanel paneltexto,panelR, panel;
	JCheckBox mex,esp,ven;
	JLabel texto,respuesta;
	String salida="";
	
	public void CrearMsg(){
		paneltexto = new JPanel();
		paneltexto.setLayout(new BoxLayout(paneltexto, BoxLayout.X_AXIS));
		texto = new JLabel();
		texto.setText("Que nacionalidad eres");
		paneltexto.add(texto);
	}
	
	
	public void crearVentana(){
		ventana = new JFrame();
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
		ventana.setSize(400,400);
		ventana.setVisible(true);
		ventana.add(paneltexto);
	
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
	
	}
	
	public CheckEjemplo(){
		
		CrearMsg();
	
		crearVentana();
		
	}

	
}
