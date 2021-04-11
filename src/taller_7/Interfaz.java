
package taller_7;

import java.awt.Event;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfaz extends Taller_7{

 public Interfaz(){
                  this.setTitle("Vehiculos");
                  setBounds(300, 100, 600, 600);
                  setDefaultCloseOperation(EXIT_ON_CLOSE);
                  
                  p1=new JPanel();
                  p1.setLayout(null);
                  
                  l1=new JLabel("Marca:");
                  l1.setBounds(10, 150, 80, 20);
                  
                  l2=new JLabel("Linea:");
                  l2.setBounds(150, 150, 80, 20);
                  
                  l8=new JLabel("Linea:");
                  l8.setBounds(150, 240, 80, 20);
                  
                  l3=new JLabel("Modelo");
                  l3.setBounds(328, 120, 80, 20);
                  
                  l6=new JLabel("Modelo:");
                  l6.setBounds(400, 220, 80, 20);
                  
                  l5=new JLabel("Linea:");
                  l5.setBounds(400, 180, 80, 20);
                  
                  l9=new JLabel("Valor Comercial");
                  l9.setBounds(400, 260, 100, 20);
                  
                  l10=new JLabel("Marca");
                  l10.setBounds(400, 140, 80, 20);
                  
                  l12=new JLabel("Total con descuento");
                  l12.setBounds(400, 300, 120, 20);
                  
                  t1=new JTextField();
                  t1.setBounds(400, 200, 140, 20);
                  
                  t2=new JTextField();
                  t2.setBounds(400, 240, 140, 20);
                  
                  t3=new JTextField();
                  t3.setBounds(400, 280, 140, 20);
                  
                  t4=new JTextField();
                  t4.setBounds(400, 160, 140, 20);
                  
                  t5=new JTextField();
                  t5.setBounds(400, 320, 140, 20);
                  
                  t6=new JTextField();
                  t6.setBounds(90, 320, 140, 20);
                  
                  t7=new JTextField();
                  t7.setBounds(90, 380, 140, 20);
                  
                  t8=new JTextField();
                  t8.setBounds(90, 440, 140, 20);
                  
                  b13=new JButton("Toyota");
                  b13.setBounds(50, 150, 90, 20);
                  b13.addActionListener(this);
                  
                  b14=new JButton("Ford");
                  b14.setBounds(50, 240, 90, 20);
                  b14.addActionListener(this);
                  
                  b2=new JButton("Hylux");
                  b2.setBounds(190, 150, 80, 20);
                  b2.addActionListener(this);
                  
                  b3=new JButton("Corolla");
                  b3.setBounds(190, 180, 80, 20);
                  b3.addActionListener(this);
                  
                  b6=new JButton("Escape");
                  b6.setBounds(190, 240, 87, 20);
                  b6.addActionListener(this);
                  
                  b7=new JButton("Fusion");
                  b7.setBounds(190, 270, 87, 20);
                  b7.addActionListener(this);                 
                  
                  b4=new JButton("2021");
                  b4.setBounds(310, 150, 80, 20);
                  b4.addActionListener(this);
                  
                  b8=new JButton("2020");
                  b8.setBounds(310, 180, 80, 20);
                  b8.addActionListener(this);
                  
                  b12=new JButton("2019");
                  b12.setBounds(310, 210, 80, 20);
                  b12.addActionListener(this);
                  
                  b11=new JButton("2018");
                  b11.setBounds(310, 240, 80, 20);
                  b11.addActionListener(this);
                  
                  b10=new JButton("2017");
                  b10.setBounds(310, 270, 80, 20);
                  b10.addActionListener(this);
                  
                  b9=new JButton("2016");
                  b9.setBounds(310, 300, 80, 20);
                  b9.addActionListener(this);
                  
                  b5=new JButton("2015");
                  b5.setBounds(310, 330, 80, 20);
                  b5.addActionListener(this);
                  
                  b15=new JButton("Nuevo Vehiculo");
                  b15.setBounds(400, 370, 140, 20);
                  b15.addActionListener(this);
                  
                  c1=new JCheckBox("Pronto pago");
                  c1.setBounds(90, 300, 140, 20);
                  c1.addActionListener(this);
                          
                  c2=new JCheckBox("Ser de servicio publico");
                  c2.setBounds(90, 360, 160, 20);
                  c2.addActionListener(this);
                  
                  c3=new JCheckBox("Traslado de cuenta");
                  c3.setBounds(90, 420, 140, 20);
                  c3.addActionListener(this);
                  
                  l11=new JLabel("Descuentos");
                  l11.setBounds(10, 300, 140, 20);
                  
                  add(p1);
                  p1.add(b14);
                  p1.add(b2);
                  p1.add(l1);
                  p1.add(l2);
                  p1.add(t1);
                  p1.add(l3);
                  p1.add(b3);
                  p1.add(l5);
                  p1.add(b4);
                  p1.add(t2);
                  p1.add(l6);
                  p1.add(b5);
                  p1.add(b13);
                  p1.add(b6);
                  p1.add(l8);
                  p1.add(b7);
                  p1.add(b8);
                  p1.add(b9);
                  p1.add(b10);
                  p1.add(b11);
                  p1.add(b12);
                  p1.add(t3);
                  p1.add(l9);
                  p1.add(l10);
                  p1.add(t4);
                  p1.add(b15);
                  p1.add(c1);
                  p1.add(c2);
                  p1.add(c3);
                  p1.add(l11);
                  p1.add(t5);
                  p1.add(l12);
                  p1.add(t6);
                  p1.add(t7);
                  p1.add(t8);
                  
                  setVisible(true);
                  
    }

}
