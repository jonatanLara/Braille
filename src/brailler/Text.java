/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brailler;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author jonatan
 */
public class Text extends javax.swing.JFrame {

    /**
     * Creates new form Text
     */
    
    ArrayList<JPanel>panel = new ArrayList<JPanel>();
    ArrayList<JRadioButton>Radio = new ArrayList<JRadioButton>();
    boolean ent=false;
    boolean letrasLabel = false;
    public Text() {
        initComponents();
        setLocationRelativeTo(null);
        campoTexto.selectAll();
        ent = false;
        tableta();
        jCheckBoxMenuItem1.setSelected(letrasLabel);
        Fondo();
        
    }
    public void Fondo(){
        AbecedarioFrom fm = new  AbecedarioFrom();
        Fondo.setBackground(fm.getColorActual());
    }
    //ejemplo//de activacion
    public void seleccionLabel(){
        String campo = campoTexto.getText();
        if (jCheckBoxMenuItem1.isSelected()==true) {
       /*
        
        for (int i = 0; i < campo.length(); i++) {
            //System.out.println("Caracter "+ i + ": " +campo.charAt(i));
            swtch(campo.charAt(i));
            
        }  */
            arrayListLabel();
            for (int i = 0; i < labels.size(); i++) {
                 for (int l = 0; l < campo.length(); l++)
                labelAc(labels.get(l),campo.charAt(l));
                alineacion(labels.get(i));
            }
           
            
        }
        else
        {
            arrayListLabel();
            for (int i = 0; i < labels.size(); i++) {
               LabNull(labels.get(i));
                
            }
             
        }
    
    }
    
    public void alineacion(JLabel lb){
     lb.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    }
    public void LabNull(JLabel lbl){
        lbl.setText(" ");
        
    }
    public void labelAc(JLabel lbl, char a){
        lbl.setText(" "+a);
        
    }
    public void swtch(char tcl){
        
           switch(tcl){
            case 'a':
                A();
                
                break;
            case 'b':
                B();
                
                break;
            case 'c':
                C();
                break;
            case 'd':
                D();
                break;
            case 'e':
                E();
                break;
            case 'f':
                F();
                break;
            case 'g':
                G();
                break;
            case 'h':
                H();
                break;
            case 'i':
                I();
                break;
            case 'j':
                J();
                break;
            case 'k':
                K();
                break;
            case 'l':
                L();
                break;
            case 'm':
                M();
                break;
            case 'n':
                N();
                break;
            case 'ñ':
               Ñ(); 
                break;
            case 'o':
                O();
                break;
            case 'p':
                P();
                break;
            case 'q':
                Q();
                break;
            case 'r':
                R();
                break;
            case 's':
                S();
                break;
            case 't':
                T();
                break;
            case 'u':
                U();
                break;
            case 'v':
                V();
                break;
            case 'w':
                W();
                break;
            case 'x':
                X();
                break;
            case 'y':
                Y();
                break;
            case 'z':
                Z();
                break;
            
        }
    }
   
    public void tableta(){
    tableta.setBackground(new Color(255,204,0));
    arrayListPanel();
        for (int i = 0; i <panel.size(); i++) {
         
            pintarPanel(panel.get(i));
        }
     arrayListRadio();
        for (int i = 0; i < Radio.size(); i++) {
            pintarPanelRadio(Radio.get(i));
            
        }
       
    }
    public void pintarPanel(JPanel panel){
           panel.setBackground(new Color(255,204,0));
           //focus
           panel.setFocusable(false);
       }
    public void pintarPanelRadio(JRadioButton rad){
           rad.setBackground(new Color(255,204,0));
           rad.setFocusable(false);
       }
    public void Deseleccion(JRadioButton rad){
        rad.setSelected(false);
        arrayListLabel();
            for (int i = 0; i < labels.size(); i++) {
               LabNull(labels.get(i));
                
            }
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        Fondo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        Brailler = new javax.swing.JButton();
        campoTexto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tableta = new javax.swing.JPanel();
        panel8 = new javax.swing.JPanel();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        panel12 = new javax.swing.JPanel();
        jRadioButton73 = new javax.swing.JRadioButton();
        jRadioButton74 = new javax.swing.JRadioButton();
        jRadioButton75 = new javax.swing.JRadioButton();
        jRadioButton76 = new javax.swing.JRadioButton();
        jRadioButton77 = new javax.swing.JRadioButton();
        jRadioButton78 = new javax.swing.JRadioButton();
        panel6 = new javax.swing.JPanel();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        panel11 = new javax.swing.JPanel();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jRadioButton69 = new javax.swing.JRadioButton();
        jRadioButton70 = new javax.swing.JRadioButton();
        jRadioButton71 = new javax.swing.JRadioButton();
        jRadioButton72 = new javax.swing.JRadioButton();
        panel9 = new javax.swing.JPanel();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jRadioButton57 = new javax.swing.JRadioButton();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        panel14 = new javax.swing.JPanel();
        jRadioButton85 = new javax.swing.JRadioButton();
        jRadioButton86 = new javax.swing.JRadioButton();
        jRadioButton87 = new javax.swing.JRadioButton();
        jRadioButton88 = new javax.swing.JRadioButton();
        jRadioButton89 = new javax.swing.JRadioButton();
        jRadioButton90 = new javax.swing.JRadioButton();
        panel15 = new javax.swing.JPanel();
        jRadioButton91 = new javax.swing.JRadioButton();
        jRadioButton92 = new javax.swing.JRadioButton();
        jRadioButton93 = new javax.swing.JRadioButton();
        jRadioButton94 = new javax.swing.JRadioButton();
        jRadioButton95 = new javax.swing.JRadioButton();
        jRadioButton96 = new javax.swing.JRadioButton();
        panel13 = new javax.swing.JPanel();
        jRadioButton79 = new javax.swing.JRadioButton();
        jRadioButton80 = new javax.swing.JRadioButton();
        jRadioButton81 = new javax.swing.JRadioButton();
        jRadioButton82 = new javax.swing.JRadioButton();
        jRadioButton83 = new javax.swing.JRadioButton();
        jRadioButton84 = new javax.swing.JRadioButton();
        panel4 = new javax.swing.JPanel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        panel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        panel2 = new javax.swing.JPanel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        panel7 = new javax.swing.JPanel();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        panel10 = new javax.swing.JPanel();
        jRadioButton61 = new javax.swing.JRadioButton();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jRadioButton65 = new javax.swing.JRadioButton();
        jRadioButton66 = new javax.swing.JRadioButton();
        panel3 = new javax.swing.JPanel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        panel5 = new javax.swing.JPanel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        letra = new javax.swing.JLabel();
        letra2 = new javax.swing.JLabel();
        letra3 = new javax.swing.JLabel();
        letra4 = new javax.swing.JLabel();
        letra5 = new javax.swing.JLabel();
        letra6 = new javax.swing.JLabel();
        letra7 = new javax.swing.JLabel();
        letra8 = new javax.swing.JLabel();
        letra9 = new javax.swing.JLabel();
        letra10 = new javax.swing.JLabel();
        letra11 = new javax.swing.JLabel();
        letra12 = new javax.swing.JLabel();
        letra13 = new javax.swing.JLabel();
        letra14 = new javax.swing.JLabel();
        letra15 = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        EditarTexto = new javax.swing.JMenuItem();

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton43.setText("jRadioButton1");

        jRadioButton44.setText("jRadioButton2");

        jRadioButton45.setText("jRadioButton3");

        jRadioButton46.setText("jRadioButton4");

        jRadioButton47.setText("jRadioButton5");

        jRadioButton48.setText("jRadioButton6");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jRadioButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton43)
                    .addComponent(jRadioButton46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton44)
                    .addComponent(jRadioButton47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton45)
                    .addComponent(jRadioButton48))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Abecedario");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.setFocusable(false);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        Brailler.setText("Brailler");
        Brailler.setFocusable(false);
        Brailler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BraillerActionPerformed(evt);
            }
        });

        campoTexto.setText("Escribe.....");
        campoTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTextoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");
        jLabel1.setFocusable(false);

        tableta.setFocusable(false);

        panel8.setBackground(new java.awt.Color(204, 204, 204));
        panel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton49.setText("jRadioButton1");

        jRadioButton50.setText("jRadioButton2");

        jRadioButton51.setText("jRadioButton3");

        jRadioButton52.setText("jRadioButton4");

        jRadioButton53.setText("jRadioButton5");

        jRadioButton54.setText("jRadioButton6");

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel8Layout.createSequentialGroup()
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel8Layout.createSequentialGroup()
                        .addComponent(jRadioButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton49)
                    .addComponent(jRadioButton52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton50)
                    .addComponent(jRadioButton53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton51)
                    .addComponent(jRadioButton54))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel12.setBackground(new java.awt.Color(204, 204, 204));
        panel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton73.setText("jRadioButton1");

        jRadioButton74.setText("jRadioButton2");

        jRadioButton75.setText("jRadioButton3");

        jRadioButton76.setText("jRadioButton4");

        jRadioButton77.setText("jRadioButton5");

        jRadioButton78.setText("jRadioButton6");

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel12Layout.createSequentialGroup()
                        .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel12Layout.createSequentialGroup()
                        .addComponent(jRadioButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton73)
                    .addComponent(jRadioButton76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton74)
                    .addComponent(jRadioButton77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton75)
                    .addComponent(jRadioButton78))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel6.setBackground(new java.awt.Color(204, 204, 204));
        panel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton31.setText("jRadioButton1");

        jRadioButton32.setText("jRadioButton2");

        jRadioButton33.setText("jRadioButton3");

        jRadioButton34.setText("jRadioButton4");

        jRadioButton35.setText("jRadioButton5");

        jRadioButton36.setText("jRadioButton6");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton31)
                    .addComponent(jRadioButton34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton32)
                    .addComponent(jRadioButton35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton33)
                    .addComponent(jRadioButton36))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel11.setBackground(new java.awt.Color(204, 204, 204));
        panel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton67.setText("jRadioButton1");

        jRadioButton68.setText("jRadioButton2");

        jRadioButton69.setText("jRadioButton3");

        jRadioButton70.setText("jRadioButton4");

        jRadioButton71.setText("jRadioButton5");

        jRadioButton72.setText("jRadioButton6");

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel11Layout.createSequentialGroup()
                        .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel11Layout.createSequentialGroup()
                        .addComponent(jRadioButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton67)
                    .addComponent(jRadioButton70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton68)
                    .addComponent(jRadioButton71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton69)
                    .addComponent(jRadioButton72))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel9.setBackground(new java.awt.Color(204, 204, 204));
        panel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton55.setText("jRadioButton1");

        jRadioButton56.setText("jRadioButton2");

        jRadioButton57.setText("jRadioButton3");

        jRadioButton58.setText("jRadioButton4");

        jRadioButton59.setText("jRadioButton5");

        jRadioButton60.setText("jRadioButton6");

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addComponent(jRadioButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton55)
                    .addComponent(jRadioButton58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton56)
                    .addComponent(jRadioButton59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton57)
                    .addComponent(jRadioButton60))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel14.setBackground(new java.awt.Color(204, 204, 204));
        panel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton85.setText("jRadioButton1");

        jRadioButton86.setText("jRadioButton2");

        jRadioButton87.setText("jRadioButton3");

        jRadioButton88.setText("jRadioButton4");

        jRadioButton89.setText("jRadioButton5");

        jRadioButton90.setText("jRadioButton6");

        javax.swing.GroupLayout panel14Layout = new javax.swing.GroupLayout(panel14);
        panel14.setLayout(panel14Layout);
        panel14Layout.setHorizontalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel14Layout.createSequentialGroup()
                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel14Layout.createSequentialGroup()
                        .addComponent(jRadioButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel14Layout.setVerticalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton85)
                    .addComponent(jRadioButton88))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton86)
                    .addComponent(jRadioButton89))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton87)
                    .addComponent(jRadioButton90))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel15.setBackground(new java.awt.Color(204, 204, 204));
        panel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton91.setText("jRadioButton1");

        jRadioButton92.setText("jRadioButton2");

        jRadioButton93.setText("jRadioButton3");

        jRadioButton94.setText("jRadioButton4");

        jRadioButton95.setText("jRadioButton5");

        jRadioButton96.setText("jRadioButton6");

        javax.swing.GroupLayout panel15Layout = new javax.swing.GroupLayout(panel15);
        panel15.setLayout(panel15Layout);
        panel15Layout.setHorizontalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel15Layout.createSequentialGroup()
                        .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel15Layout.createSequentialGroup()
                        .addComponent(jRadioButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel15Layout.setVerticalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton91)
                    .addComponent(jRadioButton94))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton92)
                    .addComponent(jRadioButton95))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton93)
                    .addComponent(jRadioButton96))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel13.setBackground(new java.awt.Color(204, 204, 204));
        panel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton79.setText("jRadioButton1");

        jRadioButton80.setText("jRadioButton2");

        jRadioButton81.setText("jRadioButton3");

        jRadioButton82.setText("jRadioButton4");

        jRadioButton83.setText("jRadioButton5");

        jRadioButton84.setText("jRadioButton6");

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panel13);
        panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addComponent(jRadioButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel13Layout.setVerticalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton79)
                    .addComponent(jRadioButton82))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton80)
                    .addComponent(jRadioButton83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton81)
                    .addComponent(jRadioButton84))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel4.setBackground(new java.awt.Color(204, 204, 204));
        panel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton19.setText("jRadioButton1");

        jRadioButton20.setText("jRadioButton2");

        jRadioButton21.setText("jRadioButton3");

        jRadioButton22.setText("jRadioButton4");

        jRadioButton23.setText("jRadioButton5");

        jRadioButton24.setText("jRadioButton6");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton20)
                    .addComponent(jRadioButton23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        jRadioButton3.setText("jRadioButton3");

        jRadioButton4.setText("jRadioButton4");

        jRadioButton5.setText("jRadioButton5");

        jRadioButton6.setText("jRadioButton6");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(204, 204, 204));
        panel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton7.setText("jRadioButton7");

        jRadioButton8.setText("jRadioButton8");

        jRadioButton9.setText("jRadioButton9");

        jRadioButton10.setText("jRadioButton10");

        jRadioButton11.setText("jRadioButton11");

        jRadioButton12.setText("jRadioButton12");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel7.setBackground(new java.awt.Color(204, 204, 204));
        panel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton37.setText("jRadioButton1");

        jRadioButton38.setText("jRadioButton2");

        jRadioButton39.setText("jRadioButton3");

        jRadioButton40.setText("jRadioButton4");

        jRadioButton41.setText("jRadioButton5");

        jRadioButton42.setText("jRadioButton6");

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addComponent(jRadioButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton37)
                    .addComponent(jRadioButton40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton38)
                    .addComponent(jRadioButton41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton39)
                    .addComponent(jRadioButton42))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel10.setBackground(new java.awt.Color(204, 204, 204));
        panel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton61.setText("jRadioButton1");

        jRadioButton62.setText("jRadioButton2");

        jRadioButton63.setText("jRadioButton3");

        jRadioButton64.setText("jRadioButton4");

        jRadioButton65.setText("jRadioButton5");

        jRadioButton66.setText("jRadioButton6");

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addComponent(jRadioButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton61)
                    .addComponent(jRadioButton64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton62)
                    .addComponent(jRadioButton65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton63)
                    .addComponent(jRadioButton66))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel3.setBackground(new java.awt.Color(204, 204, 204));
        panel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton13.setText("jRadioButton1");

        jRadioButton14.setText("jRadioButton2");

        jRadioButton15.setText("jRadioButton3");

        jRadioButton16.setText("jRadioButton4");

        jRadioButton17.setText("jRadioButton5");

        jRadioButton18.setText("jRadioButton6");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel5.setBackground(new java.awt.Color(204, 204, 204));
        panel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton25.setText("jRadioButton1");

        jRadioButton26.setText("jRadioButton2");

        jRadioButton27.setText("jRadioButton3");

        jRadioButton28.setText("jRadioButton4");

        jRadioButton29.setText("jRadioButton5");

        jRadioButton30.setText("jRadioButton6");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton25)
                    .addComponent(jRadioButton28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton26)
                    .addComponent(jRadioButton29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton27)
                    .addComponent(jRadioButton30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        letra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letra2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letra15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout tabletaLayout = new javax.swing.GroupLayout(tableta);
        tableta.setLayout(tabletaLayout);
        tabletaLayout.setHorizontalGroup(
            tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabletaLayout.createSequentialGroup()
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(letra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(letra15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))))
        );
        tabletaLayout.setVerticalGroup(
            tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabletaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(letra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabletaLayout.createSequentialGroup()
                        .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(letra3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(letra7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(letra8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(letra9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(letra10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(letra11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(letra12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(letra13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(letra14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(letra15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        Menu.setText("Menu");
        Menu.setFocusable(false);
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Brailler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Menu)))
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(Brailler)
                    .addComponent(limpiar)
                    .addComponent(campoTexto)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Menu)
                .addContainerGap())
        );

        jMenu1.setText("Vista");

        jMenu3.setText("Vista Letras");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("activar");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Activar Borde");
        jMenu3.add(jCheckBoxMenuItem2);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        EditarTexto.setText("Editar Texto");
        EditarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarTextoActionPerformed(evt);
            }
        });
        jMenu2.add(EditarTexto);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        dispose();
        Menu mn= new Menu();
        mn.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed
    public void botonBrailler(){
        
    String campo = campoTexto.getText();
        
        for (int i = 0; i < campo.length(); i++) {
            //System.out.println("Caracter "+ i + ": " +campo.charAt(i));
            swtch(campo.charAt(i));
            seleccionLabel();
            
        }  
        
}
    public void clear(){
    for (int i = 0; i <Radio.size(); i++) {
            Deseleccion(Radio.get(i));
         }
     }
    private void BraillerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BraillerActionPerformed
        clear();
        botonBrailler();
     
    }//GEN-LAST:event_BraillerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AbecedarioFrom ab = new AbecedarioFrom();
         ab.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
         clear();
         campoTexto.setText(null);
    }//GEN-LAST:event_limpiarActionPerformed

    private void campoTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoKeyTyped
        int limite =15;
        if (campoTexto.getText().length()==limite) {
            evt.consume();
        }
//validacion para que sean solo numeros
        /**char c= evt.getKeyChar();
        if (!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE) {
            evt.consume();
        }**/
    }//GEN-LAST:event_campoTextoKeyTyped

    private void EditarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarTextoActionPerformed
        // Dialogo para cambiar texto
        clear();
        CambiarText ctext= new CambiarText(this, true);
        int resul = ctext.showDialog(this);
        if (resul == CambiarText.OPCION_ACEPTAR) {
            campoTexto.setText(ctext.getTexto());
            botonBrailler();
        }
    }//GEN-LAST:event_EditarTextoActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        seleccionLabel();
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed
    public void arrayListPanel(){
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel.add(panel5);
        panel.add(panel6);
        panel.add(panel7);
        panel.add(panel8);
        panel.add(panel9);
        panel.add(panel10);
        panel.add(panel11);
        panel.add(panel12);
        panel.add(panel13);
        panel.add(panel14);
        panel.add(panel15);
        
    
    }
    public void arrayListRadio(){
        Radio.add(jRadioButton1);
        Radio.add(jRadioButton2);
        Radio.add(jRadioButton3);
        Radio.add(jRadioButton4);
        Radio.add(jRadioButton5);
        Radio.add(jRadioButton6);
        Radio.add(jRadioButton7);
        Radio.add(jRadioButton8);
        Radio.add(jRadioButton9);
        Radio.add(jRadioButton10);
        Radio.add(jRadioButton11);
        Radio.add(jRadioButton12);
        Radio.add(jRadioButton13);
        Radio.add(jRadioButton14);
        Radio.add(jRadioButton15);
        Radio.add(jRadioButton16);
        Radio.add(jRadioButton17);
        Radio.add(jRadioButton18);
        Radio.add(jRadioButton19);
        Radio.add(jRadioButton20);
        Radio.add(jRadioButton21);
        Radio.add(jRadioButton22);
        Radio.add(jRadioButton23);
        Radio.add(jRadioButton24);
        Radio.add(jRadioButton25);
        Radio.add(jRadioButton26);
        Radio.add(jRadioButton27);
        Radio.add(jRadioButton28);
        Radio.add(jRadioButton29);
        Radio.add(jRadioButton30);
        Radio.add(jRadioButton31);
        Radio.add(jRadioButton32);
        Radio.add(jRadioButton33);
        Radio.add(jRadioButton34);
        Radio.add(jRadioButton35);
        Radio.add(jRadioButton36);
        Radio.add(jRadioButton37);
        Radio.add(jRadioButton38);
        Radio.add(jRadioButton39);
        Radio.add(jRadioButton40);
        Radio.add(jRadioButton41);
        Radio.add(jRadioButton42);
        Radio.add(jRadioButton43);
        Radio.add(jRadioButton44);
        Radio.add(jRadioButton45);
        Radio.add(jRadioButton46);
        Radio.add(jRadioButton47);
        Radio.add(jRadioButton48);
        Radio.add(jRadioButton49);
        Radio.add(jRadioButton50);
        Radio.add(jRadioButton51);
        Radio.add(jRadioButton52);
        Radio.add(jRadioButton53);
        Radio.add(jRadioButton54);
        Radio.add(jRadioButton55);
        Radio.add(jRadioButton56);
        Radio.add(jRadioButton57);
        Radio.add(jRadioButton58);
        Radio.add(jRadioButton59);
        Radio.add(jRadioButton60);
        Radio.add(jRadioButton61);
        Radio.add(jRadioButton62);
        Radio.add(jRadioButton63);
        Radio.add(jRadioButton64);
        Radio.add(jRadioButton65);
        Radio.add(jRadioButton66);
        Radio.add(jRadioButton67);
        Radio.add(jRadioButton68);
        Radio.add(jRadioButton69);
        Radio.add(jRadioButton70);
        Radio.add(jRadioButton71);
        Radio.add(jRadioButton72);
        Radio.add(jRadioButton73);
        Radio.add(jRadioButton74);
        Radio.add(jRadioButton75);
        Radio.add(jRadioButton76);
        Radio.add(jRadioButton77);
        Radio.add(jRadioButton78);
        Radio.add(jRadioButton79);
        Radio.add(jRadioButton80);
        Radio.add(jRadioButton81);
        Radio.add(jRadioButton82);
        Radio.add(jRadioButton83);
        Radio.add(jRadioButton84);
        Radio.add(jRadioButton85);
        Radio.add(jRadioButton86);
        Radio.add(jRadioButton87);
        Radio.add(jRadioButton88);
        Radio.add(jRadioButton89);
        Radio.add(jRadioButton90);
        Radio.add(jRadioButton91);
        Radio.add(jRadioButton92);
        Radio.add(jRadioButton93);
        Radio.add(jRadioButton94);
        Radio.add(jRadioButton95);
        Radio.add(jRadioButton96);
        
    }
    ArrayList<JLabel>labels = new ArrayList<JLabel>();
    public void arrayListLabel() {
    labels.add(letra);
    labels.add(letra2);
    labels.add(letra3);
    labels.add(letra4);
    labels.add(letra5);
    labels.add(letra6);
    labels.add(letra7);
    labels.add(letra8);
    labels.add(letra9);
    labels.add(letra10);
    labels.add(letra11);
    labels.add(letra12);
    labels.add(letra13);
    labels.add(letra14);
    labels.add(letra15);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Text().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Brailler;
    private javax.swing.JMenuItem EditarTexto;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton Menu;
    private javax.swing.JTextField campoTexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton71;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JRadioButton jRadioButton74;
    private javax.swing.JRadioButton jRadioButton75;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton77;
    private javax.swing.JRadioButton jRadioButton78;
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton80;
    private javax.swing.JRadioButton jRadioButton81;
    private javax.swing.JRadioButton jRadioButton82;
    private javax.swing.JRadioButton jRadioButton83;
    private javax.swing.JRadioButton jRadioButton84;
    private javax.swing.JRadioButton jRadioButton85;
    private javax.swing.JRadioButton jRadioButton86;
    private javax.swing.JRadioButton jRadioButton87;
    private javax.swing.JRadioButton jRadioButton88;
    private javax.swing.JRadioButton jRadioButton89;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadioButton90;
    private javax.swing.JRadioButton jRadioButton91;
    private javax.swing.JRadioButton jRadioButton92;
    private javax.swing.JRadioButton jRadioButton93;
    private javax.swing.JRadioButton jRadioButton94;
    private javax.swing.JRadioButton jRadioButton95;
    private javax.swing.JRadioButton jRadioButton96;
    private javax.swing.JLabel letra;
    private javax.swing.JLabel letra10;
    private javax.swing.JLabel letra11;
    private javax.swing.JLabel letra12;
    private javax.swing.JLabel letra13;
    private javax.swing.JLabel letra14;
    private javax.swing.JLabel letra15;
    private javax.swing.JLabel letra2;
    private javax.swing.JLabel letra3;
    private javax.swing.JLabel letra4;
    private javax.swing.JLabel letra5;
    private javax.swing.JLabel letra6;
    private javax.swing.JLabel letra7;
    private javax.swing.JLabel letra8;
    private javax.swing.JLabel letra9;
    private javax.swing.JButton limpiar;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel10;
    private javax.swing.JPanel panel11;
    private javax.swing.JPanel panel12;
    private javax.swing.JPanel panel13;
    private javax.swing.JPanel panel14;
    private javax.swing.JPanel panel15;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel9;
    private javax.swing.JPanel tableta;
    // End of variables declaration//GEN-END:variables

    
    public void A(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(false);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(false);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(false);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(false);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(false);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(false);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(false);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(false);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(false);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(false);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(false);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(false);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(false);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(false);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(false);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(false);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(false);
          }
    }
    public void B(){
       if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(false);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(false);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(false);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(false);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(false);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(false);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(false);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(false);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(false);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(false);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(false);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(false);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(false);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(false);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(false);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(false);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(false);
          }
           
    }
    public void C(){
    if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(false);
          }
    }
    public void D(){
    if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(false);
          }
    }
    public void E(){
    if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(false);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(false);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(false);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(false);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(false);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(false);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(false);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(false);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(false);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(false);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(false);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(false);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(false);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(false);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(false);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(false);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(false);
          }
    }
    public void F(){
    if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(false);
          }
    }
    public void G(){
    if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(false);
          }
    }
    public void H(){
    if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(false);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(false);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(false);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(false);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(false);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(false);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(false);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(false);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(false);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(false);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(false);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(false);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(false);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(false);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(false);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(false);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(false);
          }
    }
    public void I(){
    if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(false);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(false);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(false);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(false);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(false);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(false);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(false);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(false);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(false);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(false);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(false);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(false);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(false);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(false);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(false);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(false);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(false);
          }
    }
    public void J(){
    if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(false);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(false);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(false);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(false);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(false);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(false);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(false);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(false);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(false);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(false);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(false);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(false);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(false);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(false);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(false);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(false);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(false);
          }
    }
    public void K(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(false);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(false);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(false);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(false);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(false);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(false);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(false);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(false);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(false);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(false);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(false);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(false);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(false);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(false);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(false);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(false);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(false);
          }
    }
    public void L(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(false);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(false);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(false);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(false);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(false);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(false);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(false);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(false);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(false);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(false);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(false);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(false);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(false);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(false);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(false);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(false);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(false);
          }
    }
    public void M(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(false);
          }
    }
    public void N(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(false);
          }
    }  
    public void Ñ(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(true);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(true);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(true);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(true);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(true);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(true);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(true);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(true);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(true);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(true);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(true);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(true);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(true);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(true);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(true);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(true);
          }
    } 
    public void O(){
    if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(false);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(false);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(false);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(false);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(false);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(false);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(false);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(false);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(false);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(false);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(false);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(false);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(false);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(false);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(false);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(false);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(false);
          }
    }
    public void P(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(false);
          }
    }
    public void Q(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(false);
          }
    }
    public void R(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(false);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(false);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(false);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(false);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(false);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(false);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(false);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(false);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(false);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(false);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(false);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(false);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(false);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(false);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(false);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(false);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(false);
          }
    }
    public void S(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(false);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(false);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(false);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(false);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(false);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(false);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(false);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(false);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(false);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(false);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(false);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(false);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(false);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(false);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(false);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(false);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(false);
          }
    }
    public void T(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(false);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(false);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(false);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(false);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(false);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(false);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(false);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(false);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(false);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(false);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(false);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(false);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(false);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(false);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(false);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(false);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(false);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(false);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(false);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(false);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(false);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(false);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(false);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(false);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(false);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(false);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(false);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(false);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(false);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(false);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(false);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(false);
          }
    }
    public void U(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(false);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(true);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(false);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(true);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(false);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(true);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(false);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(true);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(false);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(true);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(false);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(true);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(false);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(true);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(false);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(true);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(false);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(true);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(false);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(true);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(false);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(true);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(false);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(true);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(false);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(true);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(false);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(true);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(false);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(true);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(false);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(true);
          }
    }
    public void V(){
         if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(false);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(true);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(false);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(true);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(false);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(true);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(false);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(true);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(false);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(true);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(false);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(true);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(false);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(true);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(false);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(true);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(false);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(true);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(false);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(true);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(false);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(true);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(false);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(true);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(false);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(true);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(false);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(true);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(false);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(true);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(false);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(true);
          }
    }
    public void W(){
    if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(false);
           jRadioButton2.setSelected(true);
           jRadioButton3.setSelected(false);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(true);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(false);
           jRadioButton8.setSelected(true);
           jRadioButton9.setSelected(false);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(true);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(false);
           jRadioButton14.setSelected(true);
           jRadioButton15.setSelected(false);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(true);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(false);
           jRadioButton20.setSelected(true);
           jRadioButton21.setSelected(false);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(true);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(false);
           jRadioButton26.setSelected(true);
           jRadioButton27.setSelected(false);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(true);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(false);
           jRadioButton32.setSelected(true);
           jRadioButton33.setSelected(false);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(true);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(false);
           jRadioButton38.setSelected(true);
           jRadioButton39.setSelected(false);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(true);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(false);
           jRadioButton44.setSelected(true);
           jRadioButton45.setSelected(false);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(true);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(false);
           jRadioButton50.setSelected(true);
           jRadioButton51.setSelected(false);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(true);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(false);
           jRadioButton56.setSelected(true);
           jRadioButton57.setSelected(false);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(true);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(false);
           jRadioButton62.setSelected(true);
           jRadioButton63.setSelected(false);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(true);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(false);
           jRadioButton68.setSelected(true);
           jRadioButton69.setSelected(false);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(true);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(false);
           jRadioButton74.setSelected(true);
           jRadioButton75.setSelected(false);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(true);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(false);
           jRadioButton80.setSelected(true);
           jRadioButton81.setSelected(false);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(true);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(false);
           jRadioButton86.setSelected(true);
           jRadioButton87.setSelected(false);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(true);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(false);
           jRadioButton92.setSelected(true);
           jRadioButton93.setSelected(false);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(true);
          }
    }
    public void X(){
       if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(false);
           jRadioButton6.setSelected(true);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(false);
           jRadioButton12.setSelected(true);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(false);
           jRadioButton18.setSelected(true);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(false);
           jRadioButton24.setSelected(true);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(false);
           jRadioButton30.setSelected(true);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(false);
           jRadioButton36.setSelected(true);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(false);
           jRadioButton42.setSelected(true);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(false);
           jRadioButton48.setSelected(true);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(false);
           jRadioButton54.setSelected(true);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(false);
           jRadioButton60.setSelected(true);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(false);
           jRadioButton66.setSelected(true);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(false);
           jRadioButton72.setSelected(true);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(false);
           jRadioButton78.setSelected(true);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(false);
           jRadioButton84.setSelected(true);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(false);
           jRadioButton90.setSelected(true);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(false);
           jRadioButton96.setSelected(true);
          }
           
    }
    public void Y(){
       if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(true);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(true);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(true);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(true);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(true);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(true);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(true);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(true);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(true);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(true);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(true);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(true);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(true);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(true);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(true);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(true);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(true);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(true);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(true);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(true);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(true);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(true);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(true);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(true);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(true);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(true);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(true);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(true);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(true);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(true);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(true);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(true);
          }
           
    }
    public void Z(){
       if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false&&jRadioButton3.isSelected()==false
            &&jRadioButton4.isSelected()==false&&jRadioButton5.isSelected()==false&&jRadioButton6.isSelected()==false){
           jRadioButton1.setSelected(true);
           jRadioButton2.setSelected(false);
           jRadioButton3.setSelected(true);
           jRadioButton4.setSelected(false);
           jRadioButton5.setSelected(true);
           jRadioButton6.setSelected(true);
          }else
         if(jRadioButton7.isSelected()==false&&jRadioButton8.isSelected()==false&&jRadioButton9.isSelected()==false
           &&jRadioButton10.isSelected()==false&&jRadioButton11.isSelected()==false&&jRadioButton12.isSelected()==false){
           jRadioButton7.setSelected(true);
           jRadioButton8.setSelected(false);
           jRadioButton9.setSelected(true);
           jRadioButton10.setSelected(false);
           jRadioButton11.setSelected(true);
           jRadioButton12.setSelected(true);
          }
          else
         if(jRadioButton13.isSelected()==false&&jRadioButton14.isSelected()==false&&jRadioButton15.isSelected()==false
           &&jRadioButton16.isSelected()==false&&jRadioButton17.isSelected()==false&&jRadioButton18.isSelected()==false){
           jRadioButton13.setSelected(true);
           jRadioButton14.setSelected(false);
           jRadioButton15.setSelected(true);
           jRadioButton16.setSelected(false);
           jRadioButton17.setSelected(true);
           jRadioButton18.setSelected(true);
          }
          else
         if(jRadioButton19.isSelected()==false&&jRadioButton20.isSelected()==false&&jRadioButton21.isSelected()==false
           &&jRadioButton22.isSelected()==false&&jRadioButton23.isSelected()==false&&jRadioButton24.isSelected()==false){
           jRadioButton19.setSelected(true);
           jRadioButton20.setSelected(false);
           jRadioButton21.setSelected(true);
           jRadioButton22.setSelected(false);
           jRadioButton23.setSelected(true);
           jRadioButton24.setSelected(true);
          
          }else
         if(jRadioButton25.isSelected()==false&&jRadioButton26.isSelected()==false&&jRadioButton27.isSelected()==false
           &&jRadioButton28.isSelected()==false&&jRadioButton29.isSelected()==false&&jRadioButton30.isSelected()==false){
           jRadioButton25.setSelected(true);
           jRadioButton26.setSelected(false);
           jRadioButton27.setSelected(true);
           jRadioButton28.setSelected(false);
           jRadioButton29.setSelected(true);
           jRadioButton30.setSelected(true);
          }else 
            if(jRadioButton31.isSelected()==false&&jRadioButton32.isSelected()==false&&jRadioButton33.isSelected()==false
               &&jRadioButton43.isSelected()==false&&jRadioButton35.isSelected()==false&&jRadioButton36.isSelected()==false){
           jRadioButton31.setSelected(true);
           jRadioButton32.setSelected(false);
           jRadioButton33.setSelected(true);
           jRadioButton34.setSelected(false);
           jRadioButton35.setSelected(true);
           jRadioButton36.setSelected(true);
          }else
         if(jRadioButton37.isSelected()==false&&jRadioButton38.isSelected()==false&&jRadioButton39.isSelected()==false
           &&jRadioButton40.isSelected()==false&&jRadioButton41.isSelected()==false&&jRadioButton42.isSelected()==false){
           jRadioButton37.setSelected(true);
           jRadioButton38.setSelected(false);
           jRadioButton39.setSelected(true);
           jRadioButton40.setSelected(false);
           jRadioButton41.setSelected(true);
           jRadioButton42.setSelected(true);
          }
          else
         if(jRadioButton43.isSelected()==false&&jRadioButton44.isSelected()==false&&jRadioButton45.isSelected()==false
           &&jRadioButton46.isSelected()==false&&jRadioButton47.isSelected()==false&&jRadioButton48.isSelected()==false){
           jRadioButton43.setSelected(true);
           jRadioButton44.setSelected(false);
           jRadioButton45.setSelected(true);
           jRadioButton46.setSelected(false);
           jRadioButton47.setSelected(true);
           jRadioButton48.setSelected(true);
          }
          else
         if(jRadioButton49.isSelected()==false&&jRadioButton50.isSelected()==false&&jRadioButton51.isSelected()==false
           &&jRadioButton52.isSelected()==false&&jRadioButton53.isSelected()==false&&jRadioButton54.isSelected()==false){
           jRadioButton49.setSelected(true);
           jRadioButton50.setSelected(false);
           jRadioButton51.setSelected(true);
           jRadioButton52.setSelected(false);
           jRadioButton53.setSelected(true);
           jRadioButton54.setSelected(true);
          
          }else
         if(jRadioButton55.isSelected()==false&&jRadioButton56.isSelected()==false&&jRadioButton57.isSelected()==false
           &&jRadioButton58.isSelected()==false&&jRadioButton59.isSelected()==false&&jRadioButton60.isSelected()==false){
           jRadioButton55.setSelected(true);
           jRadioButton56.setSelected(false);
           jRadioButton57.setSelected(true);
           jRadioButton58.setSelected(false);
           jRadioButton59.setSelected(true);
           jRadioButton60.setSelected(true);
          }else
           if(jRadioButton61.isSelected()==false&&jRadioButton62.isSelected()==false&&jRadioButton63.isSelected()==false
            &&jRadioButton64.isSelected()==false&&jRadioButton65.isSelected()==false&&jRadioButton66.isSelected()==false){
           jRadioButton61.setSelected(true);
           jRadioButton62.setSelected(false);
           jRadioButton63.setSelected(true);
           jRadioButton64.setSelected(false);
           jRadioButton65.setSelected(true);
           jRadioButton66.setSelected(true);
          }else
         if(jRadioButton67.isSelected()==false&&jRadioButton68.isSelected()==false&&jRadioButton69.isSelected()==false
           &&jRadioButton70.isSelected()==false&&jRadioButton71.isSelected()==false&&jRadioButton72.isSelected()==false){
           jRadioButton67.setSelected(true);
           jRadioButton68.setSelected(false);
           jRadioButton69.setSelected(true);
           jRadioButton70.setSelected(false);
           jRadioButton71.setSelected(true);
           jRadioButton72.setSelected(true);
          }
          else
         if(jRadioButton73.isSelected()==false&&jRadioButton74.isSelected()==false&&jRadioButton75.isSelected()==false
           &&jRadioButton76.isSelected()==false&&jRadioButton77.isSelected()==false&&jRadioButton78.isSelected()==false){
           jRadioButton73.setSelected(true);
           jRadioButton74.setSelected(false);
           jRadioButton75.setSelected(true);
           jRadioButton76.setSelected(false);
           jRadioButton77.setSelected(true);
           jRadioButton78.setSelected(true);
          }
          else
         if(jRadioButton79.isSelected()==false&&jRadioButton80.isSelected()==false&&jRadioButton81.isSelected()==false
           &&jRadioButton82.isSelected()==false&&jRadioButton83.isSelected()==false&&jRadioButton84.isSelected()==false){
           jRadioButton79.setSelected(true);
           jRadioButton80.setSelected(false);
           jRadioButton81.setSelected(true);
           jRadioButton82.setSelected(false);
           jRadioButton83.setSelected(true);
           jRadioButton84.setSelected(true);
          
          }else
         if(jRadioButton85.isSelected()==false&&jRadioButton86.isSelected()==false&&jRadioButton87.isSelected()==false
           &&jRadioButton88.isSelected()==false&&jRadioButton89.isSelected()==false&&jRadioButton90.isSelected()==false){
           jRadioButton85.setSelected(true);
           jRadioButton86.setSelected(false);
           jRadioButton87.setSelected(true);
           jRadioButton88.setSelected(false);
           jRadioButton89.setSelected(true);
           jRadioButton90.setSelected(true);
          }else 
            if(jRadioButton91.isSelected()==false&&jRadioButton92.isSelected()==false&&jRadioButton93.isSelected()==false
               &&jRadioButton93.isSelected()==false&&jRadioButton95.isSelected()==false&&jRadioButton96.isSelected()==false){
           jRadioButton91.setSelected(true);
           jRadioButton92.setSelected(false);
           jRadioButton93.setSelected(true);
           jRadioButton94.setSelected(false);
           jRadioButton95.setSelected(true);
           jRadioButton96.setSelected(true);
          }
           
    }
}
