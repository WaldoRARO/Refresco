import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class Refresco extends JFrame {

	private JPanel contentPane;
	private JTextField txttotal;
	private JTextArea txtingresos;
	private JRadioButton rbAgua,rbCoca,rbSprite,rbfanta;
	private JButton btComprar, dinero10, dinero5,dinero2, dinero1;
	int agua=3, coca=5, sprite=2, fanta=10, goma=6, paleta=5, chocolate=10, pastilla=6, galleta=11, papas=15,jugo=7, barras=8;
	JLabel Lbresultado;
	private FileWriter fw;
	private PrintWriter pw;

	int dinero,contador=1;
	String cantidades_ingresadas="",direccion="q0.png";
	//Radio

	ButtonGroup bebidas = new ButtonGroup();
	ButtonGroup dulces = new ButtonGroup();
	private JButton btCancelar;
	private JRadioButton rbGomas;
	private JRadioButton rbPaleta;
	private JRadioButton rbChocolate;
	private JRadioButton rbPastillas;
	private JRadioButton rbgalleta;
	private JRadioButton rbPapas;
	private JRadioButton rbJugo;
	private JRadioButton rbBarraNu;
	private JButton btTicket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Refresco frame = new Refresco();
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
	public Refresco() {
		setResizable(false);
		maquina();
		ingreso_dinero();
		mostrarExpendio();
		comprar();
		cancelar();
		ingresardinero();
		ticket();

	}


	public void maquina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 456);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(UIManager.getColor("Button.background"));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		txtingresos = new JTextArea();
		txtingresos.setBackground(SystemColor.activeCaptionBorder);
		txtingresos.setEditable(false);
		txtingresos.setBounds(476, 33, 245, 77);
		panel.add(txtingresos);

		txttotal = new JTextField();
		txttotal.setFont(new Font("LCDMono2", Font.BOLD, 16));
		txttotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txttotal.setForeground(new Color(255, 255, 255));
		txttotal.setBackground(SystemColor.activeCaptionBorder);
		txttotal.setEditable(false);
		txttotal.setBounds(476, 121, 245, 26);
		panel.add(txttotal);
		txttotal.setColumns(10);

		rbAgua = new JRadioButton("$ 11");
		rbAgua.setFont(new Font("Arial", Font.PLAIN, 13));
		rbAgua.setBounds(21, 81, 71, 23);
		panel.add(rbAgua);
		bebidas.add(rbAgua);

		rbCoca = new JRadioButton("$ 15");
		rbCoca.setFont(new Font("Arial", Font.PLAIN, 13));
		rbCoca.setBounds(129, 81, 71, 23);
		panel.add(rbCoca);
		bebidas.add(rbCoca);

		rbSprite = new JRadioButton("$ 20");
		rbSprite.setFont(new Font("Arial", Font.PLAIN, 13));
		rbSprite.setBounds(238, 81, 71, 23);
		panel.add(rbSprite);
		bebidas.add(rbSprite);

		rbfanta = new JRadioButton("$ 8");
		rbfanta.setBounds(339, 81, 71, 23);
		rbfanta.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(rbfanta);
		bebidas.add(rbfanta);

		btComprar = new JButton("");
		btComprar.setForeground(SystemColor.desktop);
		btComprar.setBackground(SystemColor.inactiveCaptionBorder);
		btComprar.setIcon(new ImageIcon(Refresco.class.getResource("/img/comprobado.png")));
		btComprar.setBounds(533, 355, 89, 41);
		panel.add(btComprar);

		dinero10 = new JButton("10");
		dinero10.setForeground(new Color(0, 0, 0));
		dinero10.setBackground(new Color(95, 158, 160));
		dinero10.setFont(new Font("OCR-B 10 BT", Font.BOLD, 20));
		dinero10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dinero10.setBounds(488, 186, 71, 49);
		panel.add(dinero10);

		dinero5 = new JButton("5");
		dinero5.setBackground(new Color(95, 158, 160));
		dinero5.setFont(new Font("OCR-B 10 BT", Font.BOLD, 20));
		dinero5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dinero5.setBounds(569, 186, 71, 49);
		panel.add(dinero5);

		dinero2 = new JButton("2");
		dinero2.setBackground(new Color(95, 158, 160));
		dinero2.setFont(new Font("OCR-B 10 BT", Font.BOLD, 20));
		dinero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dinero2.setBounds(650, 186, 71, 49);
		panel.add(dinero2);

		dinero1 = new JButton("1");
		dinero1.setBackground(new Color(95, 158, 160));
		dinero1.setFont(new Font("OCR-B 10 BT", Font.BOLD, 20));
		dinero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dinero1.setBounds(569, 246, 71, 49);
		panel.add(dinero1);

		btCancelar = new JButton("");
		btCancelar.setBackground(SystemColor.inactiveCaptionBorder);
		btCancelar.setIcon(new ImageIcon(Refresco.class.getResource("/img/borrar.png")));
		btCancelar.setBounds(632, 355, 89, 41);
		panel.add(btCancelar);

		Lbresultado = new JLabel("");
		Lbresultado.setFont(new Font("DokChampa", Font.BOLD, 14));
		Lbresultado.setForeground(Color.DARK_GRAY);
		Lbresultado.setHorizontalAlignment(SwingConstants.CENTER);
		Lbresultado.setBounds(21, 370, 389, 26);
		panel.add(Lbresultado);

		rbGomas = new JRadioButton("$ 10");
		rbGomas.setFont(new Font("Arial", Font.PLAIN, 13));
		rbGomas.setBounds(21, 185, 71, 23);
		panel.add(rbGomas);
		bebidas.add(rbGomas);

		rbPaleta = new JRadioButton("$ 7");
		rbPaleta.setBounds(129, 185, 71, 23);
		rbPaleta.setFont(new Font("Arial", Font.PLAIN, 13));

		panel.add(rbPaleta);
		bebidas.add(rbPaleta);

		rbChocolate = new JRadioButton("$ 18");
		rbChocolate.setBounds(238, 185, 71, 23);
		rbChocolate.setFont(new Font("Arial", Font.PLAIN, 13));

		panel.add(rbChocolate);
		bebidas.add(rbChocolate);

		rbPastillas = new JRadioButton("$ 14");
		rbPastillas.setBounds(339, 185, 71, 23);
		rbPastillas.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(rbPastillas);
		bebidas.add(rbPastillas);

		rbgalleta = new JRadioButton("$ 12");
		rbgalleta.setFont(new Font("Arial", Font.PLAIN, 13));
		//	rbgalleta.setSelected(false);
		rbgalleta.setBounds(21, 288, 71, 23);
		rbPastillas.setFont(new Font("Arial", Font.PLAIN, 13));

		panel.add(rbgalleta);
		bebidas.add(rbgalleta);

		rbPapas = new JRadioButton("$ 11");
		rbPapas.setSelected(false);
		rbPapas.setBounds(129, 288, 71, 23);
		rbPapas.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.add(rbPapas);
		bebidas.add(rbPapas);

		rbJugo = new JRadioButton("$ 13");
		rbJugo.setFont(new Font("Arial", Font.PLAIN, 13));
		rbJugo.setSelected(false);
		rbJugo.setBounds(238, 288, 71, 23);
		panel.add(rbJugo);
		bebidas.add(rbJugo);

		rbBarraNu = new JRadioButton("$ 15");
		rbBarraNu.setFont(new Font("Arial", Font.PLAIN, 13));
		rbBarraNu.setSelected(false);
		rbBarraNu.setBounds(339, 288, 71, 23);
		panel.add(rbBarraNu);
		bebidas.add(rbBarraNu);

		btTicket = new JButton("");
		btTicket.setIcon(new ImageIcon(Refresco.class.getResource("/img/recepcion.png")));
		btTicket.setFont(new Font("OCR-B 10 BT", Font.BOLD, 20));
		btTicket.setBackground(new Color(95, 158, 160));
		btTicket.setBounds(650, 246, 71, 49);
		panel.add(btTicket);


	}

	public void ingreso_dinero()
	{

		dinero5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{  


				dinero=dinero+5;
				cantidades_ingresadas=cantidades_ingresadas + "5  \n" ;		

				txtingresos.append(""+contador+".-  5 ");
				txtingresos.append(System.getProperty("line.separator"));  
				txttotal.setText(""+dinero+"" );
				contador++;	


			

			}
		});
		
		

		dinero10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dinero=dinero+10;
				cantidades_ingresadas=cantidades_ingresadas + "10  \n" ;	
				//Imprimir en el text Area las cantidades ingresadas
				txtingresos.append(""+contador+".- 10 ");
				txtingresos.append(System.getProperty("line.separator"));  
				txttotal.setText(""+dinero+" ");
				contador++;	

				//estado q1
				direccion="q1.png";

				//desaparecer msj


			}
		});

		dinero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dinero=dinero+2;
				cantidades_ingresadas=cantidades_ingresadas + "2  \n" ;	
				//Imprimir en el text Area las cantidades ingresadas
				txtingresos.append(""+contador+".- 2 ");
				txtingresos.append(System.getProperty("line.separator"));  
				txttotal.setText(""+dinero+" ");
				contador++;	

				//estado q1
				direccion="q1.png";



			}
		});

		dinero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dinero=dinero+1;
				cantidades_ingresadas=cantidades_ingresadas + "1  \n";
				//Imprimir en el text Area las cantidades ingresadas
				txtingresos.append(""+contador+".- 1 ");
				txtingresos.append(System.getProperty("line.separator"));  
				txttotal.setText(""+dinero+" ");
				contador++;	

				//estado q1
				direccion="q1.png";



			}
		});

	}

	public void cancelar()
	{
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(contador >=2 )
				{	

					JOptionPane.showMessageDialog(null, "SU DINERO ES . . . . "   +txttotal.getText(), "Cancelar", JOptionPane.INFORMATION_MESSAGE);

					cantidades_ingresadas="";
					dinero=0;
					txttotal.setText("");
					contador=1;
					txtingresos.setText("");


					limpiar();


				}
			}
		});

	}


	public void limpiar()
	{


		bebidas.remove(rbfanta);
		rbfanta.setSelected(false);
		bebidas.add(rbfanta);

		bebidas.remove(rbCoca);
		rbCoca.setSelected(false);
		bebidas.add(rbCoca);

		bebidas.remove(rbAgua);
		rbAgua.setSelected(false);
		bebidas.add(rbAgua);

		bebidas.remove(rbSprite);
		rbSprite.setSelected(false);
		bebidas.add(rbSprite);

		bebidas.remove(rbGomas);
		rbGomas.setSelected(false);
		bebidas.add(rbGomas);

		bebidas.remove(rbPaleta);
		rbPaleta.setSelected(false);
		bebidas.add(rbPaleta);

		bebidas.remove(rbChocolate);
		rbChocolate.setSelected(false);
		bebidas.add(rbChocolate);

		bebidas.remove(rbPastillas);
		rbPastillas.setSelected(false);
		bebidas.add(rbPastillas);

		bebidas.remove(rbgalleta);
		rbgalleta.setSelected(false);
		bebidas.add(rbgalleta);

		bebidas.remove(rbPapas);
		rbPapas.setSelected(false);
		bebidas.add(rbPapas);

		bebidas.remove(rbJugo);
		rbJugo.setSelected(false);
		bebidas.add(rbJugo);

		bebidas.remove(rbBarraNu);
		rbBarraNu.setSelected(false);
		bebidas.add(rbBarraNu);



	}

	public void mostrarExpendio()
	{

		rbfanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Fanta 500 ml : Disponible "+fanta+" unidades");
			}
		});

		rbAgua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Agua 600 ml : Disponible "+agua+" unidades");
			}
		});

		rbCoca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Coca-Cola : Disponible "+coca+" unidades");
			}
		});


		rbSprite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Sprite 500 ml : Disponible "+sprite+" unidades");
			}
		});

		rbGomas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Gomitas Pandas 75 grs : Disponible "+goma+" unidades");
			}
		});

		rbPaleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Paleta : Disponible "+paleta+" unidades");
			}
		});


		rbChocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Chocolate HERSHEYS 50 gr: Disponible "+chocolate+" unidades");
			}
		});

		rbPastillas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Pastillas de Menta: Disponible "+pastilla+" unidades");
			}
		});
		rbgalleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Galletas 220 grs: Disponible "+galleta+" unidades");
			}
		});
		rbPapas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Papas Naturales: Disponible "+papas+" unidades");
			}
		});
		rbJugo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Jugo de Manzana 500 ml: Disponible "+jugo+" unidades");
			}
		});
		rbBarraNu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Lbresultado.setText("Barra Integral : Disponible "+barras+" unidades");
			}
		});



	}




	public void comprar()
	{

		btComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				String mensaje="";

				if(contador>=2)
				{	
					/////Cola Fanta
					if(rbAgua.isSelected()==true)
					{ 		 	
						if(agua>0)
						{	
							if(dinero>=11)
							{
								int aux=dinero-11;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\nBebida Agua 600 ml\n "+mensaje+" Gracias por su Compra");
								agua=agua-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");

								direccion="q0.png";
								limpiar();




							}

							else
							{
								JOptionPane.showMessageDialog(null,"Ingrese la cantidad correcta de dinero . . .");
							}				 			
						}
						else
						{
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");								
						}

					}	

					////prueba


					if(rbCoca.isSelected()==true)
					{ 		 	
						if(coca>0)
						{	
							if(dinero>=15)
							{
								int aux=dinero-15;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\nBebida Coca-Cola \n"+mensaje+" Gracias por su Compra");
								coca=coca-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");

								direccion="q0.png";

								limpiar();



							}

							else
							{
								JOptionPane.showMessageDialog(null,"Ingrese la cantidad correcta de dinero . . .");
							}				 			
						}
						else
						{
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");										
						}

					}	

					//sprite
					if(rbSprite.isSelected()==true)
					{ 		 	
						if(sprite>0)
						{	
							if(dinero>=20)
							{
								int aux=dinero-20;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\nBebida Sprite 600 ml\n"+mensaje+" Gracias por su Compra");
								sprite=sprite-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");
								direccion="q0.png";

								limpiar();



							}

							else
							{
								JOptionPane.showMessageDialog(null,"Ingrese la cantidad correcta de dinero . . .");
							}				 			
						}
						else
						{
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");		
						}

					}	
					//fanta
					if(rbfanta.isSelected()==true)
					{ 		 	
						if(fanta>0)
						{	
							if(dinero>=8)
							{
								int aux=dinero-8;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\nBebida Fanta\n"+mensaje+" Gracias por su Compra");
								fanta=fanta-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");

								direccion="q0.png";

								limpiar();



							}

							else
							{
								JOptionPane.showMessageDialog(null,"Ingrese la cantidad correcta de dinero . . .");
							}				 			
						}
						else
						{
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");									
						}

					}	

					//gomas
					if(rbGomas.isSelected()==true)
					{ 		 	
						if(goma>0)
						{	
							if(dinero>=10)
							{
								int aux=dinero-10;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\nBebida Gomitas Pandas\n"+mensaje+" Gracias por su Compra");
								goma=goma-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");

								direccion="q0.png";

								limpiar();



							}

							else
							{
								JOptionPane.showMessageDialog(null,"Ingrese la cantidad correcta de dinero . . .");
							}				 			
						}
						else
						{
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");								
						}

					}	

					//paleta
					if(rbPaleta.isSelected()==true)
					{ 		 	
						if(paleta>0)
						{	
							if(dinero>=7)
							{
								int aux=dinero-7;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\nBebida Paleat\n"+mensaje+" Gracias por su Compra");
								paleta=paleta-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");

								direccion="q0.png";

								limpiar();



							}

							else
							{
								JOptionPane.showMessageDialog(null,"INGRESE EL DINERO CORRECTO");
							}				 			
						}
						else
						{
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");										
						}

					}	

					//chocolate

					if(rbChocolate.isSelected()==true)
					{ 		 	
						if(chocolate>0)
						{	
							if(dinero>=18)
							{
								int aux=dinero-18;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\nBebida Chocolate HERSHEYS\n"+mensaje+" Gracias por su Compra");
								chocolate=chocolate-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");
								direccion="q0.png";

								limpiar();



							}

							else
							{
								JOptionPane.showMessageDialog(null,"Ingrese la cantidad correcta de dinero . . .");
							}				 			
						}
						else
						{
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");									
						}

					}	

					//pastillas
					if(rbPastillas.isSelected()==true)
					{ 		 	
						if(pastilla>0)
						{	
							if(dinero>=14)
							{
								int aux=dinero-14;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\nBebida Pastillas de Menta\n"+mensaje+" Gracias por su Compra");
								pastilla=pastilla-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");

								direccion="q0.png";

								limpiar();



							}

							else
							{
								JOptionPane.showMessageDialog(null,"Ingrese la cantidad correcta de dinero . . .");
								ingresardinero();

							}	

						}
						else
						{
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");										
						}

					}	
					
					
					
					
					//galletas
					if(rbgalleta.isSelected()==true)
					{ 		 	
						if(galleta>0)
						{	
							if(dinero>=12)
							{
								int aux=dinero-12;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\nBebida Galletas de Menta\n"+mensaje+" Gracias por su Compra");
								galleta=galleta-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");
								direccion="q0.png";

								limpiar();



							}

							else
							{
								JOptionPane.showMessageDialog(null,"Ingrese la cantidad correcta de dinero . . .");
								ingresardinero();

							}	

						}
						else
						{
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");							
						}

					}	

					//papas
					if(rbPapas.isSelected()==true)
					{ 		 	
						if(papas>0)
						{	
							if(dinero>=11)
							{
								int aux=dinero-11;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\n Papas Naturales\n"+mensaje+" Gracias por su Compra");
								papas=papas-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");
								direccion="q0.png";

								limpiar();



							}

							else
							{
								JOptionPane.showMessageDialog(null,"Ingrese la cantidad correcta de dinero . . .");
								ingresardinero();

							}	

						}
						else
						{
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");							
						}

					}	
					//jugo
					if(rbJugo.isSelected()==true)
					{ 		 	
						if(jugo>0)
						{	
							if(dinero>=13)
							{
								int aux=dinero-13;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\nBebida Jugo de Manzana\n"+mensaje+" Gracias por su Compra");
								jugo=jugo-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");
								direccion="q0.png";

								limpiar();



							}

							else
							{
								JOptionPane.showMessageDialog(null,"Ingrese la cantidad correcta de dinero . . .");
								ingresardinero();

							}	

						}
						else
						{
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");										
						}

					}	
					//BarrasNu
					if(rbBarraNu.isSelected()==true)
					{ 		 	
						if(barras>0)
						{	
							if(dinero>=15)
							{
								int aux=dinero-15;

								if(aux > 0)
								{
									mensaje="Su cambio "+aux+" ";	
								}	
								////estado q2
								direccion="q2.png";


								JOptionPane.showMessageDialog(null,"\n Barra Nutritiva \n"+mensaje+" Gracias por su Compra");
								barras=barras-1;
								////reinicar maquina
								cantidades_ingresadas="";
								dinero=0;
								txttotal.setText("");
								contador=1;
								txtingresos.setText("");
								Lbresultado.setText("");

								direccion="q0.png";

								limpiar();



							}

							else
							{
								JOptionPane.showMessageDialog(null,"Ingrese la cantidad correcta de dinero . . .");
								ingresardinero();

							}	

						}
						else
							JOptionPane.showMessageDialog(null,"No esta disponible en producto . . .");										
					}

				}	





				//cierro el if del contador
			}





			//}
		});	


	}
	public void ingresardinero() {
		txttotal.setText("");
		txtingresos.setText("");
		limpiar();

	}
	public void ticket() {




	}
}
