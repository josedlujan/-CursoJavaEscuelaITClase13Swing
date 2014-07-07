import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class VentanaMenu implements ActionListener{

	
	JFrame ventana;
	JMenu opcion1,opcion2,opcion3,subopcion1,subopcion2,subopcion3,subopcion4;
	JMenuItem subsubopcion1,subsubopcion2;
	JMenuBar menuBar;
	
	public void crearMenu(){
		menuBar = new JMenuBar();
		menuBar.setLayout(new BoxLayout(menuBar,BoxLayout.X_AXIS));
		
		opcion1 = new JMenu("Opcion 1");
		opcion2 = new JMenu("Opcion 2");
		
		
		subopcion1 = new JMenu("SubOpcion 1");
		subopcion2 = new JMenu("SubOpcion 2");
		subopcion3 = new JMenu("SubOpcion 3");
		subopcion4 = new JMenu("SubOpcion 4");
		
		subsubopcion1 = new JMenuItem("SubsubOpcion1");
		subsubopcion2 = new JMenuItem("SubsubOpcion2");
		
		
		menuBar.add(opcion1);
		menuBar.add(opcion2);
		
		opcion1.add(subopcion1);
		opcion1.add(subopcion2);
		
		opcion2.add(subopcion3);
		opcion2.add(subopcion4);
		
		subopcion2.add(subsubopcion1);
		subopcion2.add(subsubopcion2);
		
		
		subopcion1.addActionListener(this);
		subopcion2.addActionListener(this);
		subopcion3.addActionListener(this);
		subopcion4.addActionListener(this);
		subsubopcion1.addActionListener(this);
		subsubopcion2.addActionListener(this);

		
		
	}
	
	public void crearVentana(){
		ventana = new JFrame();
		ventana.setTitle("Ejemplo de Menus");
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
		ventana.setSize(400,400);
		ventana.setVisible(true);
		ventana.setJMenuBar(menuBar);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		

		
		
	}
	
	public VentanaMenu(){
		crearMenu();
		crearVentana();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==subsubopcion1){
			System.out.println("HOLA!!!");
		}
	}
}
