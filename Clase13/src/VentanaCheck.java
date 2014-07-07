import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class VentanaCheck implements  ChangeListener{
	JFrame ventana;
	JPanel paneltexto,panelR, panel;
	//JCheckBox mex,esp,ven;
	JLabel texto,respuesta;
	String salida="";
	
	public void CrearMsg(){
		paneltexto = new JPanel();
		paneltexto.setLayout(new BoxLayout(paneltexto, BoxLayout.X_AXIS));
		texto = new JLabel();
		texto.setText("¿Que nacionalidad eres?");
		paneltexto.add(texto);
	}
	
	/*public void CrearPanel(){
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		mex = new JCheckBox("Mexicano");
		esp = new JCheckBox("Español");
		ven = new JCheckBox("Venezuela");
		mex.addChangeListener(this);
		esp.addChangeListener(this);
		ven.addChangeListener(this);
		
		
		panel.add(mex);
		panel.add(esp);
		panel.add(ven);
	}
	
	public void CrearRespuesta(){
		panelR = new JPanel();
		panelR.setLayout(new BoxLayout(panelR, BoxLayout.X_AXIS));
		respuesta = new JLabel();
		respuesta.setText("Ninguna");
		panelR.add(respuesta);
	}
	*/
	public void crearVentana(){
		ventana = new JFrame();
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
		ventana.setSize(400,400);
		ventana.setVisible(true);
		ventana.add(paneltexto);
		ventana.add(panel);
		ventana.add(panelR);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
	
	}
	
	public VentanaCheck(){
		
		CrearMsg();
		//CrearPanel();
		//CrearRespuesta();
		crearVentana();
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		/*if (mex.isSelected()==true){
			respuesta.setText("Mexicano");
		}
		if (esp.isSelected()==true){
			respuesta.setText("Español");
		}
		if (ven.isSelected()==true){
			respuesta.setText("Venezolano");
		}*/
	}
}
