import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class Maquina extends JFrame {

	private JPanel contentPane;
	JButton CocaButton,cielButton,fantaButton,frescaButton,waterButton,zeroButton,limonButton,naranjaButton,powerButton,sidralButton,spriteButton;
	JTextArea txtingresos;
	private JTextField txttotal;
	int dinero = 0,contador=1;
	int fanta=1,coca=2,agua=3,up7=4,pepsi=5,red=6;
	String cantidades_ingresadas="";
		 		String mensaje="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maquina frame = new Maquina();
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
	public Maquina() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton diezPesos = new JButton("$10");
		diezPesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dinero=dinero+10;
				cantidades_ingresadas=cantidades_ingresadas + "10" ;		
				//Imprimir en el text Area las cantidades ingresadas
				txtingresos.append(""+contador+".- 10");
				txtingresos.append(System.getProperty("line.separator"));  
				txttotal.setText(""+dinero+" �");
				contador++;	
				
			
				
			}
			
			
		});
		diezPesos.setBackground(SystemColor.menu);
		diezPesos.setFont(new Font("OCR-A BT", Font.PLAIN, 16));
		diezPesos.setBounds(468, 350, 214, 30);
		panel.add(diezPesos);
		
		JButton unPeso = new JButton("$1");
		unPeso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dinero=dinero+1;
				cantidades_ingresadas=cantidades_ingresadas + "1 \n" ;	
				//Imprimir en el text Area las cantidades ingresadas
				txtingresos.append(""+contador+".- 1");
				txtingresos.append(System.getProperty("line.separator"));  
				txttotal.setText(""+dinero+" �");
				contador++;	
			
			}
		});
		unPeso.setBackground(SystemColor.menu);
		unPeso.setFont(new Font("OCR-A BT", Font.PLAIN, 16));
		unPeso.setBounds(468, 227, 214, 30);
		panel.add(unPeso);
		
		JButton dosPesos = new JButton("$2");
		dosPesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				  
				
				
				dinero=dinero+2;
				cantidades_ingresadas=cantidades_ingresadas + "2" ;		
				//Imprimir en el text Area las cantidades ingresadas
				txtingresos.append(""+contador+".- 2");
				txtingresos.append(System.getProperty("line.separator"));  
				txttotal.setText(""+dinero+" �");
				contador++;	
				
			
				
			
			}
		});
		dosPesos.setBackground(SystemColor.menu);
		dosPesos.setFont(new Font("OCR-A BT", Font.PLAIN, 16));
		dosPesos.setBounds(468, 268, 214, 30);
		panel.add(dosPesos);
		
		JButton cincoPesos = new JButton("$5");
		cincoPesos.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
				
				  
				
				
				dinero=dinero+5;
				cantidades_ingresadas=cantidades_ingresadas + "5" ;		
				//Imprimir en el text Area las cantidades ingresadas
				txtingresos.append(""+contador+".-5");
				txtingresos.append(System.getProperty("line.separator"));  
				txttotal.setText(""+dinero+" �");
				contador++;	
				
			
				
			
			}
		});
		cincoPesos.setBackground(SystemColor.menu);
		cincoPesos.setFont(new Font("OCR-A BT", Font.PLAIN, 16));
		cincoPesos.setBounds(468, 309, 214, 30);
		panel.add(cincoPesos);
		
		JLabel lblMaquinaLosPedorros = new JLabel("MAQUINA LOS PEDORROS");
		lblMaquinaLosPedorros.setForeground(Color.DARK_GRAY);
		lblMaquinaLosPedorros.setFont(new Font("OCR-A BT", Font.PLAIN, 16));
		lblMaquinaLosPedorros.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaquinaLosPedorros.setBounds(468, 391, 214, 41);
		panel.add(lblMaquinaLosPedorros);
		///*********************************************************************************************************/////

		 CocaButton = new JButton("");
		 CocaButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showConfirmDialog(null, "El precio de este producto es: 15$");
		 		
		 	}
		 });
		 ImageIcon iconoOriginal = new ImageIcon("D:\\\\Carpetas\\\\INGENIERIA EN SOFTWARE\\\\TEORIAMATEMATICADELACOMPUTACION\\\\Maquina de refresco\\\\MaquinaAutomata\\\\Imagenes\\\\latacola.jpg");
		
		 int ancho = 82; // ancho en pixeles que tendra el icono escalado
		 int alto =82; // alto (para que conserve la proporcion pasamos -1)

		 // Obtiene un icono en escala con las dimensiones especificadas
		 ImageIcon iconoEscala = new ImageIcon(iconoOriginal.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

		 CocaButton.setIcon(iconoEscala);

		CocaButton.setBounds(38, 42, 77, 69);
		panel.add(CocaButton);
		///*********************************************************************************************************/////
		 cielButton = new JButton("");
		cielButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showConfirmDialog(null, "El precio de este producto es: 8$");

			}
		});
		 ImageIcon iconoOriginal2 = new ImageIcon("D:\\\\Carpetas\\\\INGENIERIA EN SOFTWARE\\\\TEORIAMATEMATICADELACOMPUTACION\\\\Maquina de refresco\\\\MaquinaAutomata\\\\Imagenes\\\\Ciel-Purificada.jpg");
			
		 int ancho2 = 82; // ancho en pixeles que tendra el icono escalado
		 int alto2 =82; // alto (para que conserve la proporcion pasamos -1)

		 // Obtiene un icono en escala con las dimensiones especificadas
		 ImageIcon iconoEscala2 = new ImageIcon(iconoOriginal2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

		cielButton.setIcon(iconoEscala2);
		cielButton.setBounds(131, 42, 77, 69);
		panel.add(cielButton);
		///*********************************************************************************************************/////

		fantaButton = new JButton("");
		ImageIcon iconoOriginal3 = new ImageIcon("D:\\Carpetas\\INGENIERIA EN SOFTWARE\\TEORIAMATEMATICADELACOMPUTACION\\Maquina de refresco\\MaquinaAutomata\\Imagenes\\Fanta.jpg");
		
		 int ancho3 = 82; // ancho en pixeles que tendra el icono escalado
		 int alto3 =82; // alto (para que conserve la proporcion pasamos -1)

		 // Obtiene un icono en escala con las dimensiones especificadas
		 ImageIcon iconoEscala3 = new ImageIcon(iconoOriginal3.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

		fantaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showConfirmDialog(null, "El precio de este producto es: 12$");

			}
		});
		fantaButton.setIcon(iconoEscala3);
		fantaButton.setBounds(222, 42, 77, 69);
		panel.add(fantaButton);
		///*********************************************************************************************************/////

		frescaButton = new JButton("");
		frescaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showConfirmDialog(null, "El precio de este producto es: 16$");

			}
		});
		ImageIcon iconoOriginal4 = new ImageIcon("D:\\Carpetas\\INGENIERIA EN SOFTWARE\\TEORIAMATEMATICADELACOMPUTACION\\Maquina de refresco\\MaquinaAutomata\\Imagenes\\Fresca.jpg");
		
		 int ancho4 = 82; // ancho en pixeles que tendra el icono escalado
		 int alto4 =82; // alto (para que conserve la proporcion pasamos -1)

		 // Obtiene un icono en escala con las dimensiones especificadas
		 ImageIcon iconoEscala4 = new ImageIcon(iconoOriginal4.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

		frescaButton.setIcon(iconoEscala4);
		frescaButton.setBounds(317, 42, 77, 69);
		panel.add(frescaButton);
		///*********************************************************************************************************/////

		 waterButton = new JButton("");
		waterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showConfirmDialog(null, "El precio de este producto es: 20$");

			}
		});
		ImageIcon iconoOriginal5 = new ImageIcon("D:\\Carpetas\\INGENIERIA EN SOFTWARE\\TEORIAMATEMATICADELACOMPUTACION\\Maquina de refresco\\MaquinaAutomata\\Imagenes\\Glaceau-vitaminwater.jpg");
		
		 int ancho5 = 82; // ancho en pixeles que tendra el icono escalado
		 int alto5 =82; // alto (para que conserve la proporcion pasamos -1)

		 // Obtiene un icono en escala con las dimensiones especificadas
		 ImageIcon iconoEscala5 = new ImageIcon(iconoOriginal5.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

		waterButton.setIcon(iconoEscala5);
		waterButton.setBounds(38, 132, 77, 69);
		panel.add(waterButton);
		///*********************************************************************************************************/////

		 zeroButton = new JButton("");
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showConfirmDialog(null, "El precio de este producto es: 20$");

			}
		});
		ImageIcon iconoOriginal6 = new ImageIcon("D:\\Carpetas\\INGENIERIA EN SOFTWARE\\TEORIAMATEMATICADELACOMPUTACION\\Maquina de refresco\\MaquinaAutomata\\Imagenes\\Powerade-Zero-ION-4-Uva.jpg");
		
		 int ancho6 = 82; // ancho en pixeles que tendra el icono escalado
		 int alto6 =82; // alto (para que conserve la proporcion pasamos -1)

		 // Obtiene un icono en escala con las dimensiones especificadas
		 ImageIcon iconoEscala6 = new ImageIcon(iconoOriginal6.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

		zeroButton.setIcon(iconoEscala6);
		zeroButton.setBounds(38, 227, 77, 69);
		panel.add(zeroButton);
		///*********************************************************************************************************/////
		
		 limonButton = new JButton("");
		limonButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showConfirmDialog(null, "El precio de este producto es: 13$");

			}
		});
		ImageIcon iconoOrigina7 = new ImageIcon("D:\\Carpetas\\INGENIERIA EN SOFTWARE\\TEORIAMATEMATICADELACOMPUTACION\\Maquina de refresco\\MaquinaAutomata\\Imagenes\\Limon&Nada.jpg");
		
		 int ancho7 = 82; // ancho en pixeles que tendra el icono escalado
		 int alto7 =82; // alto (para que conserve la proporcion pasamos -1)

		 // Obtiene un icono en escala con las dimensiones especificadas
		 ImageIcon iconoEscala7 = new ImageIcon(iconoOrigina7.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

		limonButton.setIcon(iconoEscala7);
		limonButton.setBounds(131, 132, 77, 69);
		panel.add(limonButton);
		///*********************************************************************************************************/////
		
		 naranjaButton = new JButton("");
		naranjaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showConfirmDialog(null, "El precio de este producto es: 13$");

			}
		});
		ImageIcon iconoOriginal8 = new ImageIcon("D:\\Carpetas\\INGENIERIA EN SOFTWARE\\TEORIAMATEMATICADELACOMPUTACION\\Maquina de refresco\\MaquinaAutomata\\Imagenes\\Naranja&Nada.jpg");
		
		 int ancho8 = 82; // ancho en pixeles que tendra el icono escalado
		 int alto8 =82; // alto (para que conserve la proporcion pasamos -1)

		 // Obtiene un icono en escala con las dimensiones especificadas
		 ImageIcon iconoEscala8 = new ImageIcon(iconoOriginal8.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

		naranjaButton.setIcon(iconoEscala8);
		naranjaButton.setBounds(222, 132, 77, 69);
		panel.add(naranjaButton);
		///*********************************************************************************************************/////

		powerButton = new JButton("");
		powerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showConfirmDialog(null, "El precio de este producto es: 20$");

			}
		});
		ImageIcon iconoOriginal9 = new ImageIcon("D:\\Carpetas\\INGENIERIA EN SOFTWARE\\TEORIAMATEMATICADELACOMPUTACION\\Maquina de refresco\\MaquinaAutomata\\Imagenes\\Powerade-ION-4-Moras.jpg");
		
		 int ancho9 = 82; // ancho en pixeles que tendra el icono escalado
		 int alto9 =82; // alto (para que conserve la proporcion pasamos -1)

		 // Obtiene un icono en escala con las dimensiones especificadas
		 ImageIcon iconoEscala9 = new ImageIcon(iconoOriginal9.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

		powerButton.setIcon(iconoEscala9);
		powerButton.setBounds(317, 132, 77, 69);
		panel.add(powerButton);
		///*********************************************************************************************************/////

		 sidralButton = new JButton("");
		sidralButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showConfirmDialog(null, "El precio de este producto es: 12$");

			}
		});
		ImageIcon iconoOriginal10 = new ImageIcon("D:\\Carpetas\\INGENIERIA EN SOFTWARE\\TEORIAMATEMATICADELACOMPUTACION\\Maquina de refresco\\MaquinaAutomata\\Imagenes\\Sidral-Mundet.jpg");
		
		 int ancho10 = 82; // ancho en pixeles que tendra el icono escalado
		 int alto10 =82; // alto (para que conserve la proporcion pasamos -1)

		 // Obtiene un icono en escala con las dimensiones especificadas
		 ImageIcon iconoEscala10 = new ImageIcon(iconoOriginal10.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

		sidralButton.setIcon(iconoEscala10);
		sidralButton.setBounds(131, 227, 77, 69);
		panel.add(sidralButton);
		///*********************************************************************************************************/////
		
		 spriteButton = new JButton("");
		spriteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 		JOptionPane.showConfirmDialog(null, "El precio de este producto es: 12$");

			}
		});
		ImageIcon iconoOriginal11 = new ImageIcon("D:\\Carpetas\\INGENIERIA EN SOFTWARE\\TEORIAMATEMATICADELACOMPUTACION\\Maquina de refresco\\MaquinaAutomata\\Imagenes\\Sprite.jpg");
		
		 int ancho11 = 82; // ancho en pixeles que tendra el icono escalado
		 int alto11 =82; // alto (para que conserve la proporcion pasamos -1)

		 // Obtiene un icono en escala con las dimensiones especificadas
		 ImageIcon iconoEscala11 = new ImageIcon(iconoOriginal3.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

		spriteButton.setIcon(iconoEscala11);
		spriteButton.setBounds(222, 229, 77, 69);
		panel.add(spriteButton);
		///*********************************************************************************************************/////

		JButton button_20 = new JButton("");
		
		button_20.setBounds(317, 227, 77, 69);
		panel.add(button_20);
		///*********************************************************************************************************/////
		
		JLabel label = new JLabel("A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(56, 19, 37, 14);
		panel.add(label);
		
		JLabel lblB = new JLabel("B");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBounds(146, 19, 37, 14);
		panel.add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBounds(241, 19, 37, 14);
		panel.add(lblC);
		
		JLabel lblD = new JLabel("D");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setBounds(335, 19, 37, 14);
		panel.add(lblD);
		
		JLabel label_4 = new JLabel("1");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(0, 71, 37, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("2");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(0, 159, 37, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("3");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(0, 254, 37, 14);
		panel.add(label_6);
		
		txtingresos = new JTextArea();
		txtingresos.setBounds(453, 32, 229, 117);
		panel.add(txtingresos);
		
		txttotal = new JTextField();
		txttotal.setBounds(501, 173, 164, 20);
		panel.add(txttotal);
		txttotal.setColumns(10);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprar();
			}
		});
		btnComprar.setBounds(67, 403, 89, 23);
		panel.add(btnComprar);
	}
	
	
	
	/************************************************************************************************/
	public void comprar()	{
	
	
		
	
			 	if(contador>=2)
			 	{	
			 		/////Cola Fanta
					if(CocaButton.isEnabled())
					{ 		 	
					if(fanta>0)
				 	{	
							if(dinero>=11)
					 		{
					 			int aux=dinero-11;
					 			
					 				if(aux > 0)
					 				{
					 					mensaje="Su cambio "+aux+" �";	
					 				}	
					 			
					 				
				 				JOptionPane.showMessageDialog(null,"Usted compro\nBebida Coca Cola\n"+mensaje+" Gracias\nVuelta pronto");
				 				fanta=fanta-1;
				 				////reinicar maquina
								cantidades_ingresadas="";
						 		dinero=0;
						 		txttotal.setText("");
						 		contador=1;
						 		txtingresos.setText("");
						 		
						 		
						 		
					 		}
				 			
				 			else
				 			{
				 				JOptionPane.showMessageDialog(null,"Revis� su bolsillo por favor");
				 			}				 			
				 		}
				 		else
				 		{
				 			JOptionPane.showMessageDialog(null,"Lo sentimos no disponible en stock");								
				 		}
														
					}	
			 		
					
					if(cielButton.isEnabled())
					{ 		 	
					if(fanta>0)
				 	{	
							if(dinero>=8)
					 		{
					 			int aux=dinero-8;
					 			
					 				if(aux > 0)
					 				{
					 					mensaje="Su cambio "+aux+" �";	
					 				}	
					 			
					 				
				 				JOptionPane.showMessageDialog(null,"Usted compro\nBebida Coca Cola\n"+mensaje+" Gracias\nVuelta pronto");
				 				fanta=fanta-1;
				 				////reinicar maquina
								cantidades_ingresadas="";
						 		dinero=0;
						 		txttotal.setText("");
						 		contador=1;
						 		txtingresos.setText("");
						 		
						 		
						 		
					 		}
				 			
				 			else
				 			{
				 				JOptionPane.showMessageDialog(null,"Revis� su bolsillo por favor");
				 			}				 			
				 		}
				 		else
				 		{
				 			JOptionPane.showMessageDialog(null,"Lo sentimos no disponible en stock");								
				 		}
														
					}	
						
					//cierro el if del contador
			 	}
			 	
			 	
			 		
			 		
			 		
			 	
			 
		
		
	}
}
