package com.firt.gui.resources;

import javax.swing.*;  
public class TextArea  
{  
     public TextArea(String text){  
        JFrame f= new JFrame();  
        JTextArea area=new JTextArea(text);  
        area.setBounds(10,30, 200,200);  
        f.add(area);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
}
