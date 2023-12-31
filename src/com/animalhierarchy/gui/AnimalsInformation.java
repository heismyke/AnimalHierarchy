/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.animalhierarchy.gui;
import com.animalhierarchy.animals.Animals;
import com.animalhierarchy.animals.Dog;
import com.animalhierarchy.animals.Cat;
import com.animalhierarchy.gui.AnimalHierarchyApp;

/**
 *
 * @author myke
 */
public class AnimalsInformation extends javax.swing.JFrame {
       Animals animal1 = new Dog("Wiskey",3);
    Animals animal2 = new Cat("Wiskey",3);

    /**
     * Creates new form AnimalsInformation
     */
    public AnimalsInformation() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setOutputText(String text){
            if("dog".equalsIgnoreCase(text)){
                Dog dog = (Dog) animal1;
                String name = dog.name;
                String action = dog.getSound();
                
                 jLabel2.setText(name);
                 
                 jLabel2.setText(name + " " + action);
            }else if("cat".equalsIgnoreCase(text)){
                 Cat cat = (Cat) animal2;
                String name = cat.name;
                String action = cat.getSound();
                
                 jLabel2.setText(name);
                 
                 jLabel2.setText(name + " " + action);
            }else{
                System.out.println("Error");
            }
           
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
