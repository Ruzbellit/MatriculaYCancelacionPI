/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.Vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ruzbellit
 */
public class ClientGUI extends JFrame{
    
    Container contPpal;
    JPanel pArriba, pInfo, pAccion, pCentro;
    JLabel etqSelecMatri, etqSelecCanc, etqInfoEst;
    JTextField jtCodEst;
    JButton jbotEntrar, jbotMatricular, jbotCancelar;
    JComboBox<String> selecMatric, selecCancel;
    JTextArea tAreaInfoEst;
    JScrollPane barrasInfoEst;
    
    ClientGUI(){
        
        etqSelecMatri = new JLabel("*Seleccione la asignatura a Matricular");
        etqSelecCanc = new JLabel("*Seleccione la asignatura a Cancelar");
        etqInfoEst = new JLabel("Informacion Estudiante");
        
        jtCodEst = new JTextField("ej: 1925456   ");
        
        selecMatric = new JComboBox<>();
        // agregar opciones desde la logica
        
        selecCancel  = new JComboBox<>();
        // agregar opciones desde la logica
        
        jbotEntrar = new JButton("Entrar");
        jbotMatricular = new JButton("Matricular");
        jbotCancelar = new JButton("Cancelar");
        
        tAreaInfoEst = new JTextArea("..... ");
        barrasInfoEst = new JScrollPane(tAreaInfoEst);
        
        pArriba = new JPanel();
        pArriba.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 3), "Ingrese su Codigo de Estudiante"));
        pArriba.add(jtCodEst);
        pArriba.add(Box.createRigidArea(new Dimension(10, 10)));
        pArriba.add(jbotEntrar);
        
        pAccion = new JPanel();
        pAccion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 3), "Realice una acción"));
        pAccion.setLayout(new GridLayout(3, 2, 50, 20));
        pAccion.add(etqSelecMatri);
        pAccion.add(etqSelecCanc);
        pAccion.add(selecMatric);
        pAccion.add(selecCancel);
        pAccion.add(jbotMatricular);
        pAccion.add(jbotCancelar);
        
        pInfo = new JPanel();
        pInfo.setLayout(new BorderLayout());
        pInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 3), ""));
        pInfo.add(etqInfoEst, BorderLayout.NORTH);
        pInfo.add(barrasInfoEst, BorderLayout.CENTER);
        
        pCentro = new JPanel();
        pCentro.setLayout(new GridLayout(2, 1, 50, 10));
        pCentro.add(pAccion);
        pCentro.add(pInfo);

        
        contPpal = getContentPane();
        contPpal.setLayout(new BorderLayout());
        contPpal.add(pArriba, BorderLayout.NORTH);
        contPpal.add(pCentro, BorderLayout.CENTER);
        
       

        setTitle("EISC Matricula y Cancelacion (Estudiante)");
        setSize(600, 700);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    /**
     * Asigna escuchas a los botones
     *
     * @param escucha
     */
    public void asignarEscuchasBotones(ActionListener escucha) {
        jbotEntrar.addActionListener(escucha);
        jbotMatricular.addActionListener(escucha);
        jbotCancelar.addActionListener(escucha);
    }
    
    //Retornar botones
    public JButton getBotEntrar() {
        return jbotEntrar;
    }
    
    public JButton getBotMatricular() {
        return jbotMatricular;
    }
    
    public JButton getBotCancelar() {
        return jbotCancelar;
    }
    
    public JComboBox<String> getSelecMatricular() {
        return selecMatric;
    }
    
    public JComboBox<String> getSelecCancelar() {
        return selecCancel;
    }
    
    public JTextArea getAreaInfoEst() {
        return tAreaInfoEst;
    }
    
}
