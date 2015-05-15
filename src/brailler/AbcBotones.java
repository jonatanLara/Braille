/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brailler;

import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jonatan
 */
public class AbcBotones {
    private ArrayList<JButton> lista= new ArrayList<JButton>();
    private String nombres[] =
    {"A","B","C","D","E","F","G","H","I","J","K",
     "L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    AbcLetras l = new AbcLetras();
    public AbcBotones(){
      
    }
     public void init(JPanel principa, final JLabel label){
    principa.setLayout(new GridLayout(6, 6 , 10 ,10));
        for (int i = 0; i < nombres.length; i++) {
            lista.add(i, new JButton(" "+nombres[i]));
            lista.get(i).setCursor(new Cursor(Cursor.HAND_CURSOR));
            principa.add(lista.get(i));
            lista.get(i).addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                   label.setText(e.getActionCommand());
                    String a = e.getActionCommand();
                    System.out.println(a);
                  // l.stch(a);
                 }
            });
         
   } 
 }
}
