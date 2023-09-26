package botonradio;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Botonradio {

	private JFrame frmBotonRadio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Botonradio window = new Botonradio();
					window.frmBotonRadio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Botonradio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBotonRadio = new JFrame();
		frmBotonRadio.setTitle("BOTON RADIO");
		frmBotonRadio.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\examen\\cecy.jpg"));
		frmBotonRadio.setBounds(100, 100, 450, 300);
		frmBotonRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBotonRadio.setLocationRelativeTo(null);
		frmBotonRadio.getContentPane().setLayout(null);
		
		JLabel lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblColor.setBounds(241, 7, 183, 224);
		frmBotonRadio.getContentPane().add(lblColor);
		
		JRadioButton radRojo = new JRadioButton("Rojo");
		radRojo.setIgnoreRepaint(true);
		radRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.red);
			}
		});
		radRojo.setBounds(20, 7, 109, 23);
		frmBotonRadio.getContentPane().add(radRojo);
		
		JRadioButton radGris = new JRadioButton("Gris");
		radGris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.gray);
			}
		});
		radGris.setBounds(20, 26, 109, 23);
		frmBotonRadio.getContentPane().add(radGris);
		
		JRadioButton radVerde = new JRadioButton("Verde");
		radVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.green);
			}
		});
		radVerde.setBounds(20, 52, 109, 23);
		frmBotonRadio.getContentPane().add(radVerde);
		
		JRadioButton radAzul = new JRadioButton("Azul");
		radAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.blue);
			}
		});
		radAzul.setBounds(20, 78, 109, 23);
		frmBotonRadio.getContentPane().add(radAzul);
		
		JRadioButton radNegro = new JRadioButton("Negro");
		radNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.black);
			}
		});
		radNegro.setBounds(20, 104, 109, 23);
		frmBotonRadio.getContentPane().add(radNegro);
		
		JRadioButton radRosa = new JRadioButton("Rosa");
		radRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.pink);
			}
		});
		radRosa.setBounds(20, 125, 109, 23);
		frmBotonRadio.getContentPane().add(radRosa);
		
		JRadioButton radAzulmarino = new JRadioButton("Azul Marino");
		radAzulmarino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(new Color(37,40,80));
			}
		});
		radAzulmarino.setBounds(20, 145, 109, 23);
		frmBotonRadio.getContentPane().add(radAzulmarino);
		
		JRadioButton radAmarillo = new JRadioButton("Amarillo");
		radAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.yellow);
			}
		});
		radAmarillo.setBounds(20, 171, 109, 23);
		frmBotonRadio.getContentPane().add(radAmarillo);
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(radRojo);
		grupo.add(radGris);
		grupo.add(radVerde);
		grupo.add(radAzul);
		grupo.add(radNegro);
		grupo.add(radRosa);
		grupo.add(radAzulmarino);
		grupo.add(radAmarillo);
	}
}
