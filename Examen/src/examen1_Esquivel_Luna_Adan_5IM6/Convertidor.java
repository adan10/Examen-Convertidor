/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_Esquivel_Luna_Adan_5IM6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Alumno
 */

public class Convertidor extends JFrame implements ActionListener{
    JTextField texto;
    JPanel panel,panel2;
    JButton boton,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,operacion,borrar,convertidor;
    public Convertidor(){
       configurarVentana();
       iniciarComponentes();
    }
    private void configurarVentana() {
        setTitle("Convertidor prron ");
        setSize(500,500);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color(220,216,255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void iniciarComponentes() {
        texto= new JTextField();
        texto.setBounds(0, 0, 315, 35);
	texto.setEditable(false);
        add(texto);
        texto.setVisible(true);
        
       panel = new JPanel();
       panel.setLayout(new GridLayout(4, 3));
       panel.setBorder(new EmptyBorder(4, 4, 4, 4));
       
       boton = new JButton("0");
       boton.setBounds(10, 40, 50, 50);
	boton.addActionListener(this);
        add(boton);
        boton.setVisible(true);
        
        boton1 = new JButton("1");
       boton1.setBounds(60, 40, 50, 50);
	boton1.addActionListener(this);
        add(boton1);
        boton1.setVisible(true);
        
        boton2 = new JButton("2");
       boton2.setBounds(110, 40, 50, 50);
	boton2.addActionListener(this);
        add(boton2);
        boton2.setVisible(true);
        
        boton3 = new JButton("3");
       boton3.setBounds(10, 90, 50, 50);
	boton3.addActionListener(this);
        add(boton3);
        boton3.setVisible(true);
        
        boton4 = new JButton("4");
       boton4.setBounds(60, 90, 50, 50);
	boton4.addActionListener(this);
        add(boton4);
        boton4.setVisible(true);
        
        boton5 = new JButton("5");
        boton5.setBounds(110, 90, 50, 50);
        boton5.addActionListener(this);
        add(boton5);
        boton5.setVisible(true);
         
        boton6= new JButton("6");
        boton6.setBounds(10, 140 , 50, 50);
        boton6.addActionListener(this);
        add(boton6);
        boton6.setVisible(true);
        
        boton7 = new JButton("7");
       boton7.setBounds(60, 140, 50, 50);
	  boton7.addActionListener(this);
        add(boton7);
        boton7.setVisible(true);
        
        boton8 = new JButton("8");
       boton8.setBounds(110, 140, 50, 50);
	 boton8.addActionListener(this);
        add(boton8);
        boton8.setVisible(true);
        
        boton9 = new JButton("9");
       boton9.setBounds(10, 190, 50, 50);
	boton9.addActionListener(this);
        add(boton9);
        boton9.setVisible(true);
        
        operacion = new JButton(".");
       operacion.setBounds(60, 190, 50, 50);
	 operacion.addActionListener(this);
        add(operacion);
        operacion.setVisible(true);
        
        panel2 = new JPanel();
       panel2.setLayout(new GridLayout(4, 3));
       panel2.setBorder(new EmptyBorder(4, 4, 4, 4));
       
       borrar = new JButton("CE");
       borrar.setBounds(225, 40, 75, 100);
	borrar.addActionListener(this);
        add(borrar);
        borrar.setVisible(true);
        
        convertidor = new JButton("=");
       convertidor.setBounds(225, 140, 75, 100);
	convertidor.addActionListener(this);
        add(convertidor);
        convertidor.setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent e){
        String dinero=texto.getText();
        
        if(e.getSource()==boton){
            String valor="0";
            dinero = dinero + valor;
            texto.setText(dinero);
            
        }
        else if(e.getSource()==boton1)
        {
             String valor="1";
            dinero = dinero + valor;
            texto.setText(dinero);
            
        }
        else if(e.getSource()==boton2)
        {
            String valor="2";
            dinero = dinero + valor;
            texto.setText(dinero);
        }
        else if(e.getSource()==boton3)
        {
            String valor="3";
            dinero = dinero + valor;
            texto.setText(dinero);
        }
        else if(e.getSource()==boton4)
        {
            String valor="4";
            dinero = dinero + valor;
            texto.setText(dinero);
        }
        else if(e.getSource()==boton5)
        {
            String valor="5";
            dinero = dinero + valor;
            texto.setText(dinero);
        }
        else if(e.getSource()==boton6)
        {
            String valor="6";
            dinero = dinero + valor;
            texto.setText(dinero);
        }
        else if(e.getSource()==boton7)
        {
            String valor="7";
            dinero = dinero + valor;
            texto.setText(dinero);
        }
        else if(e.getSource()==boton8)
        {
            String valor="8";
            dinero = dinero + valor;
            texto.setText(dinero);
        }
        else if(e.getSource()==boton9)
        {
            String valor="9";
            dinero = dinero + valor;
            texto.setText(dinero);
        }
        else if(e.getSource()==operacion)
        {
            String valor=".";
            dinero = dinero + valor;
            texto.setText(dinero);
        }
        else if(e.getSource()==borrar)
        {
            JOptionPane.showMessageDialog(this, "Se ha dorrado el numero");
            texto.setText("");
        }
        else if(e.getSource()==convertidor)
        {
            String pp = texto.getText();
            if(pp.isEmpty()){
                JOptionPane.showMessageDialog(this, "No puso ningun numero");
            }else{
                double resulset = Double.parseDouble(pp);
                double resulf = resulset/20;
                JOptionPane.showMessageDialog(this, "el numero que ustes puso es: "+resulset+" pesos y el equivalente en dolares es \n"+resulf+"" );
                texto.setText(Double.toString(resulf));
            }
        }
    }
}
