/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gsium
 */
public class Ventanas extends JFrame {
 JPanel panel;
 JLabel ET,ER;
 JButton Bs,Br,Bm,Bd;
 JTextField CJ1,CJ2;
 
 double nu1,nu2,Rs=0;
 
    
    
    public Ventanas(){
      this.setSize(400, 250);
      this.setTitle("Calculadora");
        //Image icono = Toolkit.getDefaultToolkit().getImage("logo_blanco.png");
      
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      colocarPanel();
     InicarComponentes();
     
  }
  private void colocarPanel(){
    panel=new JPanel();
     this.getContentPane().add(panel);
     panel.setLayout(null);
   
  }  
  
  public void InicarComponentes(){
    //_____________________________________________________________//
      ET=new JLabel("Ingrese Dos Numeros");
      ER=new JLabel("");
      ET.setBounds(10, 10, 150, 100);
      ER.setBounds(10, 150, 0310, 30);//Viñetas
      ER.setBackground(Color.MAGENTA);
     
      panel.add(ET);
      panel.add(ER);
   //________________________________________________________________//
   
   CJ1=new JTextField();
   CJ2=new JTextField();//cajas de texto
   CJ1.setBackground(Color.yellow);
   CJ2.setBackground(Color.yellow);
   CJ1.setBounds(20, 75, 100, 30);
   CJ2.setBounds(20, 110, 100, 30);
   panel.add(CJ1);
   panel.add(CJ2);
   //__________________________________________________________________//
   Bs=new JButton("Suma");
   Br=new JButton("Resta");
   Bm=new JButton("Multiplicacion");
   Bd=new JButton("Division");
   
   Bs.setBackground(Color.cyan);
   Br.setBackground(Color.cyan);
   Bm.setBackground(Color.cyan);
   Bd.setBackground(Color.cyan);
   
   Bs.setBounds(150, 70, 80, 30);
   Br.setBounds(150, 110, 80, 30);
   Bm.setBounds(250, 70, 80, 30);
   Bd.setBounds(250, 110, 80, 30);
   panel.add(Bs);
   panel.add(Br);
   panel.add(Bm);
   panel.add(Bd);
   
   Bs.addActionListener(Oyente1); //se enlaza la accion de los botones 
   Br.addActionListener(oyente2);
   Bm.addActionListener(oyente3);
   Bd.addActionListener(oyente4);
  }
  
  //Se crea los eventos para los botones
 ActionListener Oyente1=new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
        nu1=Double.parseDouble(CJ1.getText());
        nu2=Double.parseDouble(CJ2.getText());
        Rs=nu1+nu2;
        ER.setText("El Resultado es:"+Rs);
        // System.out.println("el Resultado es"+Rs);
     }
      
  };
  
   ActionListener oyente2=new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
         nu1=Double.parseDouble(CJ1.getText());
        nu2=Double.parseDouble(CJ2.getText());
        Rs=nu1-nu2;
        ER.setText("El Resultado es:"+Rs);
     }
       
   };
  ActionListener oyente3=new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
           nu1=Double.parseDouble(CJ1.getText());
        nu2=Double.parseDouble(CJ2.getText());
        Rs=(nu1*nu2);
        ER.setText("El Resultado es:"+Rs);
     }
      
  };
  
  ActionListener oyente4=new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
           nu1=Double.parseDouble(CJ1.getText());
        nu2=Double.parseDouble(CJ2.getText());
         
        // if(nu2=!0){
            // ER.setText("No se Puede realizar operacion");
             
             
        // }
        // else
             
         Rs=(nu1/nu2);
        ER.setText("El Resultado es:"+Rs);
     }
             };
      
  };
}
