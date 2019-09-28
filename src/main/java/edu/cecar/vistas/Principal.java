package edu.cecar.vistas;

import edu.cecar.controlador.ConectarAPIGoRest;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JTable.AUTO_RESIZE_OFF;
import javax.swing.table.DefaultTableModel;

/**
*
* Clase: Principal
*
* versión:0.1
*
* fecha Creación: 19/09/2019
*
* fecha Modificación: 19/09/2019
*
* Autor: Carmen Salgado...
*
* @author Casalg
* 
* @class Expression class is undefined on line 14, column 12 in Templates/Classes/Class.java.
*
* Copyright: CECAR
*
*
* //ESTA CLASE CONTIENE LA VISTA PRINCIPAL PARA EL CLIENTE...
* 
*
**/




public class Principal extends javax.swing.JFrame {

    ConectarAPIGoRest registros;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        jPanel1.setBackground(Color.cyan);
        String labels[] = {"Escojer Opcion: ", "Identificador","Users","Posts","Comments","Photos","Albums","Todo"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(labels);

        jComboBox1.setModel(model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
        javax.swing.JTextField jTextField2 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 204)));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(320, 320));
        jPanel1.setName("Cliente"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 320));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 130, 30));

        jTextField2.setBackground(new java.awt.Color(204, 204, 255));
        jTextField2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextField2.setText("Ordenar por");
        jTextField2.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextField2.setDragEnabled(true);
        jTextField2.setMinimumSize(new java.awt.Dimension(10, 22));
        jTextField2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 120, 30));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 110, 40));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("LISTAR");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 255), new java.awt.Color(255, 102, 255), new java.awt.Color(255, 102, 255), new java.awt.Color(255, 102, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 120, 30));

        jComboBox3.setBackground(new java.awt.Color(102, 204, 255));
        jComboBox3.setEditable(true);
        jComboBox3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));
        jComboBox3.setMinimumSize(new java.awt.Dimension(60, 60));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 120, 30));

        jComboBox1.setBackground(new java.awt.Color(102, 204, 255));
        jComboBox1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identificación", "Users", "Posts", "Comments", "Photos", "Albums" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 255), new java.awt.Color(255, 51, 255), new java.awt.Color(255, 102, 255), new java.awt.Color(255, 102, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 320));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 610, 340));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        jComboBox2.setBackground(new java.awt.Color(0, 153, 255));
        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Name", "Last Name", "Gender", "Dob", "Email", "Phone", "Website", "Address", "Status", "Todo" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
     String seleccion = jComboBox1.getSelectedItem().toString().split("-")[0];

        if (seleccion.equals("Identificacion") || seleccion.equals("Users") || seleccion.equals("Posts")|| seleccion.equals("dob")|| seleccion.equals("Photos")|| seleccion.equals("Albums")) {
            if (seleccion.equals("Identificacion")) {
                
            } else if (seleccion.equals("Users")) {

            if (jTable1.getSelectedRow() != -1) {
                String users = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                String idusers = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
                jLabel1.setText(users);
                Principal panel2 = new Principal();
                JFrame frame = new JFrame();

                //llenamos ttabla de panel2 emergente
                registros = new ConectarAPIGoRest();
                Map<String, ArrayList<String[]>> mapVerTodo = new HashMap<>();
                try {
                    //mapVerTodo = (Map<String, ArrayList<String[]>>) registros.getJSOnResourceCharacters(panel2, seleccion.toLowerCase(), Integer.parseInt(idusers));
                    DefaultTableModel modelo = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    
                    DefaultTableModel modelo2 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    
                    DefaultTableModel modelo3 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo4 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo5 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo6 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo7 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo8 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo9 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    

                    modelo.addColumn("Users");
                    modelo.addColumn("Identificador");
                    
                    modelo2.addColumn("Users");
                    modelo2.addColumn("Identificador");
                    modelo3.addColumn("Users");
                    modelo3.addColumn("Identificador");
                    
                    for (String[] item : mapVerTodo.get("first_name")) {
                       
                        modelo.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("last_name")) {

                       modelo2.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("gender")) {

                        modelo3.addRow(item);
                    } 
                    for (String[] item : mapVerTodo.get("dob")) {
                       
                        modelo4.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("email")) {

                       modelo5.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("phone")) {

                        modelo6.addRow(item);
                    }
                    for (String[] item : mapVerTodo.get("website")) {
                       
                        modelo7.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("address")) {

                       modelo8.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("status")) {

                        modelo9.addRow(item);
                    }

//                    
                } catch (Exception ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

                
                frame.add(panel2);
                frame.pack();

                frame.setVisible(true);

                repaint();
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un personaje");
            }

        }
        }
    }                                        

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
     String seleccion = jComboBox2.getSelectedItem().toString().split("-")[0].toLowerCase();

        ArrayList<String[]> arrayList = new ArrayList<>();
        Map<String, ArrayList<String[]>> mapVerTodo = new HashMap<>();

        registros = new ConectarAPIGoRest();
        
       if (!seleccion.equals("Escojer Opcion")) {
            try {

                //arrayList = (ArrayList<String[]>) registros.getJSOnResourceCharacters(250, "users", 0);

                DefaultTableModel modelo = new DefaultTableModel() {
                    public boolean isCellEditable(int rowIndex, int mColIndex) {
                        return false;
                    }
                };
                modelo.addColumn("first_name");
                modelo.addColumn("last_name");
                modelo.addColumn("gender");
                modelo.addColumn("dob"); //Identificador,Users,Posts,Comments,Photos,Albums //("127.0.0.1", "personajes", 0)
                modelo.addColumn("email");
                modelo.addColumn("phone");
                modelo.addColumn("website");
                modelo.addColumn("address");
                modelo.addColumn("status");

                for (String[] arrayList1 : arrayList) {
                    modelo.addRow(arrayList1);
                }

                jTable1.setModel(modelo);
                

            } catch (Exception ex) {
              Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
          }

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
      String seleccion = jComboBox1.getSelectedItem().toString().split("-")[0].toLowerCase();

        ArrayList<String[]> arrayList = new ArrayList<>();
        Map<String, ArrayList<String[]>> mapVerTodo = new HashMap<>();

        registros = new ConectarAPIGoRest();
        
       if (!seleccion.equals("Escojer Opcion: ")) {
            try {

               // arrayList = (ArrayList<String[]>) registros.getJSOnResourceCharacters(PROPERTIES);

                DefaultTableModel modelo = new DefaultTableModel() {
                    public boolean isCellEditable(int rowIndex, int mColIndex) {
                        return false;
                    }
                };
                modelo.addColumn("Identificador");
                modelo.addColumn("Users");
                modelo.addColumn("Posts");
                modelo.addColumn("Comments"); //Identificador,Users,Posts,Comments,Photos,Albums //("127.0.0.1", "personajes", 0)
                modelo.addColumn("Photos");
                modelo.addColumn("Albums");
                modelo.addColumn("Todo");
//                modelo.addColumn("");
//                modelo.addColumn("");

                for (String[] arrayList1 : arrayList) {
                    modelo.addRow(arrayList1);
                }

                jTable1.setModel(modelo);
                

            } catch (Exception ex) {
              Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
          }

        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
     String seleccion = jComboBox2.getSelectedItem().toString().split("-")[0];

        if (seleccion.equals("first_name") || seleccion.equals("last_name") || seleccion.equals("gender")|| seleccion.equals("dob")|| seleccion.equals("email")|| seleccion.equals("phone")|| seleccion.equals("website")|| seleccion.equals("address")|| seleccion.equals("status")|| seleccion.equals("Todo")) {
            if (jTable1.getSelectedRow() != -1) {
                String users= jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                String idusers = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
                jLabel1.setText(users);
                VerIndividual ventana = new VerIndividual();
                JFrame frame = new JFrame();

                //llenamos ttabla de panel2 emergente
                registros = new ConectarAPIGoRest();
                ArrayList<String[]> arrayList = null;
                try {
                    arrayList = (ArrayList<String[]>)arrayList ;//registros.getJSOnResourceCharacters(arrayList, seleccion.toLowerCase(), Integer.parseInt(idusers));
                    DefaultTableModel modelo = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };

                    modelo.addColumn("Users");
                    modelo.addColumn("Identificador");
                    

                    for (String[] arrayList1 : arrayList) {
                        modelo.addRow(arrayList1);
                    }

                    ventana.getjTable1().setModel(modelo);
                    ventana.getjLabelTitulo().setText(seleccion);

                } catch (Exception ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

                // pasamos el nombre y el identificador a la panel2 emergente
                ventana.getjLabelUsuario().setText(users);
                ventana.getjLabelIdentificador().setText(idusers);
                frame.add(ventana);
                frame.pack();

                frame.setVisible(true);

                repaint();
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un Empleado Potencial: ");
            }

        } else if (seleccion.equals("Todo")) {

            if (jTable1.getSelectedRow() != -1) {
                String users = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
                String idusers = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
                jLabel1.setText(users);
                ListarTodo ventana2 = new ListarTodo();
                JFrame frame = new JFrame();

                //llenamos ttabla de panel2 emergente
                registros = new ConectarAPIGoRest();
                Map<String, ArrayList<String[]>> mapVerTodo = new HashMap<>();
                try {
                   // mapVerTodo = (Map<String, ArrayList<String[]>>) registros.getJSOnResourceCharacters("127.0.0.1", seleccion.toLowerCase(), Integer.parseInt(idusers));
                    DefaultTableModel modelo = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    
                    DefaultTableModel modelo2 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    
                    DefaultTableModel modelo3 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo4 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo5 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo6 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo7 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo8 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    DefaultTableModel modelo9 = new DefaultTableModel() {
                        public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                        }
                    };
                    

                    modelo.addColumn("Users");
                    modelo.addColumn("Identificador");
                    
                    modelo2.addColumn("Users");
                    modelo2.addColumn("Identificador");
                    modelo3.addColumn("Users");
                    modelo3.addColumn("Identificador");
                    
                    for (String[] item : mapVerTodo.get("first_name")) {
                       
                        modelo.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("last_name")) {

                       modelo2.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("gender")) {

                        modelo3.addRow(item);
                    } 
                    for (String[] item : mapVerTodo.get("dob")) {
                       
                        modelo4.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("email")) {

                       modelo5.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("phone")) {

                        modelo6.addRow(item);
                    }
                    for (String[] item : mapVerTodo.get("website")) {
                       
                        modelo7.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("address")) {

                       modelo8.addRow(item);
                    }

                    
                    for (String[] item : mapVerTodo.get("status")) {

                        modelo9.addRow(item);
                    }
                    

                    ventana2.getjTablefirst_name().setModel(modelo);
                    ventana2.getjTablefirst_name().setAutoResizeMode(AUTO_RESIZE_OFF);
                    ventana2.getjTablefirst_name().getColumnModel().getColumn(0).setMinWidth(140);
                    
                    ventana2.getjTablelast_name().setModel(modelo2);
                    ventana2.getjTablelast_name().setAutoResizeMode(AUTO_RESIZE_OFF);
                    ventana2.getjTablelast_name().getColumnModel().getColumn(0).setMinWidth(140);
                    
                    ventana2.getjTablegender().setModel(modelo3);
                    ventana2.getjTablegender().setAutoResizeMode(AUTO_RESIZE_OFF);
                    ventana2.getjTablegender().getColumnModel().getColumn(0).setMinWidth(140);
                    
                    ventana2.getjTabledob().setModel(modelo4);
                    ventana2.getjTabledob().setAutoResizeMode(AUTO_RESIZE_OFF);
                    ventana2.getjTabledob().getColumnModel().getColumn(0).setMinWidth(140);
                    
                    ventana2.getjTableemail().setModel(modelo5);
                    ventana2.getjTableemail().setAutoResizeMode(AUTO_RESIZE_OFF);
                    ventana2.getjTableemail().getColumnModel().getColumn(0).setMinWidth(140);
                    
                    ventana2.getjTablephone().setModel(modelo6);
                    ventana2.getjTablephone().setAutoResizeMode(AUTO_RESIZE_OFF);
                    ventana2.getjTablephone().getColumnModel().getColumn(0).setMinWidth(140);
                    
                    ventana2.getjTablewebsite().setModel(modelo7);
                    ventana2.getjTablewebsite().setAutoResizeMode(AUTO_RESIZE_OFF);
                    ventana2.getjTablewebsite().getColumnModel().getColumn(0).setMinWidth(140);
                    
                    ventana2.getjTableaddress().setModel(modelo8);
                    ventana2.getjTableaddress().setAutoResizeMode(AUTO_RESIZE_OFF);
                    ventana2.getjTableaddress().getColumnModel().getColumn(0).setMinWidth(140);
                    
                    ventana2.getjTablestatus().setModel(modelo9);
                    ventana2.getjTablestatus().setAutoResizeMode(AUTO_RESIZE_OFF);
                    ventana2.getjTablestatus().getColumnModel().getColumn(0).setMinWidth(140);
                    
                    //panel2.getjLabelTitulo().setText(seleccion);

                } catch (Exception ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

                // pasamos el nombre y el identificador a la panel2 emergente
                ventana2.getjLabelUsuario().setText(users);
                ventana2.getjLabelIdentificador().setText(idusers);
                frame.add(ventana2);
                frame.pack();

                frame.setVisible(true);

                repaint();
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un personaje");
            }

        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Principal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final javax.swing.JButton jButton1 = new javax.swing.JButton();
    public final javax.swing.JButton jButton2 = new javax.swing.JButton();
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}