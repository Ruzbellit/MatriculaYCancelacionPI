/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.Vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ruzbellit
 */
public class ServerGUI extends JFrame{
    
    Container contPpal;
    JPanel pBoton, pRegistro;
    JButton jbotCargArchivo;
    JTextArea tAreaRegistro;
    JScrollPane barrasRegistro;
    
    ServerGUI(){
        
        jbotCargArchivo = new JButton("Cargar Archivo Descriptivo");
        
        tAreaRegistro = new JTextArea("..... ");
        barrasRegistro = new JScrollPane(tAreaRegistro);
        
        pBoton = new JPanel();
        pBoton.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 3), ""));
        pBoton.add(jbotCargArchivo);
        
        pRegistro = new JPanel();
        pRegistro.setLayout(new BorderLayout());
        pRegistro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 3), "Registro "));
        pRegistro.add(barrasRegistro, BorderLayout.CENTER);
        
        contPpal = getContentPane();
        contPpal.setLayout(new BorderLayout());
        contPpal.add(pBoton, BorderLayout.NORTH);
        contPpal.add(pRegistro, BorderLayout.CENTER);
       
        
        setTitle("EISC Matricula y Cancelacion (Servidor)");
        setSize(600, 700);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
    
    
     /**
     * asigna las escuchas a los botones
     * @param escucha 
     */
    public void asignarEscuchasBotones(ActionListener escucha) {
        jbotCargArchivo.addActionListener(escucha);
    }
    
    //Retornar botones
    public JButton getBotCargarArchivo() {
        return jbotCargArchivo;
    }
    
    public JTextArea getAreaRegistro() {
        return tAreaRegistro;
    }
    
    
    
}
