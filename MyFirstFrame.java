/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import javax.swing.JFrame;
import java.awt.Color;
/**
 *
 * @author Onalenna
 */
public class MyFirstFrame extends JFrame{
    public MyFirstFrame(){
        setTitle("My First GUI");
        setSize(200,250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
    
}