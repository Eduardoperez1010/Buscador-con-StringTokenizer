//Pérez Flores Eduardo Vicente
//Ingenieria en Sistemas Computacionales
//Compiladores
//Tematica:Tokenizer
/*Muestra lo que tiene el archivo de texto al presionar el boton examinar
 **Tenemos 4 radio button y al seleccionar y poner en el buscador mustra
 **la informacion deacuerdo a lo buscado
 */
package prueba1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    public static BufferedReader archivolectura;
    String boton = "";

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void getbotones(String btnradio) {
        boton = btnradio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botones = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        Areadetexto = new javax.swing.JTextArea();
        BtnExaminar = new javax.swing.JButton();
        EtqBuscar = new javax.swing.JLabel();
        Buscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        OpcNombre = new javax.swing.JRadioButton();
        OpcEdad = new javax.swing.JRadioButton();
        OpcSexo = new javax.swing.JRadioButton();
        OpcCuidad = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTextArea();
        Salir = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compiladores");
        setResizable(false);

        Areadetexto.setEditable(false);
        Areadetexto.setColumns(20);
        Areadetexto.setRows(5);
        Areadetexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AreadetextoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AreadetextoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AreadetextoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Areadetexto);

        BtnExaminar.setText("Examinar");
        BtnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExaminarActionPerformed(evt);
            }
        });

        EtqBuscar.setText("Buscar");

        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        Botones.add(OpcNombre);
        OpcNombre.setText("Nombre");
        OpcNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcNombreMouseClicked(evt);
            }
        });
        OpcNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcNombreActionPerformed(evt);
            }
        });

        Botones.add(OpcEdad);
        OpcEdad.setText("Edad");
        OpcEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcEdadMouseClicked(evt);
            }
        });

        Botones.add(OpcSexo);
        OpcSexo.setText("Sexo");
        OpcSexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcSexoMouseClicked(evt);
            }
        });
        OpcSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcSexoActionPerformed(evt);
            }
        });

        Botones.add(OpcCuidad);
        OpcCuidad.setText("Ciudad");
        OpcCuidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcCuidadMouseClicked(evt);
            }
        });
        OpcCuidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcCuidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OpcNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpcEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpcSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpcCuidad, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(OpcNombre)
                .addGap(18, 18, 18)
                .addComponent(OpcEdad)
                .addGap(18, 18, 18)
                .addComponent(OpcSexo)
                .addGap(18, 18, 18)
                .addComponent(OpcCuidad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Mostrar.setEditable(false);
        Mostrar.setColumns(20);
        Mostrar.setRows(5);
        jScrollPane2.setViewportView(Mostrar);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(BtnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EtqBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                        .addGap(33, 33, 33))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EtqBuscar)
                                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExaminarActionPerformed
        try {
            String direccion = "Texto.txt";
            String cadena;
            FileReader f = new FileReader(direccion);
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                for (int i = 0; i < 1; i++) {
                    Areadetexto.append(cadena + "\n");
                }
            }
            System.out.println("Imprimiendo");
            b.close();
        } catch (IOException errorIO) {
            System.out.println(":(" + errorIO);
        }
    }//GEN-LAST:event_BtnExaminarActionPerformed

    private void AreadetextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AreadetextoKeyPressed

    }//GEN-LAST:event_AreadetextoKeyPressed

    private void AreadetextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AreadetextoKeyReleased

    }//GEN-LAST:event_AreadetextoKeyReleased

    private void AreadetextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AreadetextoKeyTyped

    }//GEN-LAST:event_AreadetextoKeyTyped

    private void OpcNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcNombreActionPerformed

    private void OpcCuidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcCuidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcCuidadActionPerformed

    private void OpcSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcSexoActionPerformed

    private void OpcNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcNombreMouseClicked
        getbotones(OpcNombre.getLabel());
        System.out.println(boton);
        Buscar.setText("");
    }//GEN-LAST:event_OpcNombreMouseClicked

    private void OpcEdadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcEdadMouseClicked
        getbotones(OpcEdad.getLabel());
        System.out.println(boton);
        Buscar.setText("");
    }//GEN-LAST:event_OpcEdadMouseClicked

    private void OpcSexoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcSexoMouseClicked
        getbotones(OpcSexo.getLabel());
        System.out.println(boton);
        Buscar.setText("");
    }//GEN-LAST:event_OpcSexoMouseClicked

    private void OpcCuidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcCuidadMouseClicked
        getbotones(OpcCuidad.getLabel());
        System.out.println(boton);
        Buscar.setText("");
    }//GEN-LAST:event_OpcCuidadMouseClicked

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        //JOptionPane.showMessageDialog(null,boton);        
        String direccion = "Texto.txt";

        try {
            String Nombre;
            String Edad;
            String Sexo;
            String Ciudad;
            String lineadelarchivo;            
            String encontrado = "";
            archivolectura = new BufferedReader(new FileReader(direccion));
            StringTokenizer token;
            while (archivolectura.ready()) {
                lineadelarchivo = archivolectura.readLine();
                token = new StringTokenizer(lineadelarchivo, "_");
                Nombre = token.nextToken();
                Edad = token.nextToken();
                Sexo = token.nextToken();
                Ciudad = token.nextToken();               
                if (OpcNombre.isSelected()&& Nombre.equals(Buscar.getText())) {
                    encontrado = encontrado + " " + Nombre + " " + Edad + " " + Sexo + " " + Ciudad + "\n";
                }
                if (OpcEdad.isSelected() && Edad.equals(Buscar.getText())) {
                    encontrado = encontrado + " " + Nombre + " " + Edad + " " + Sexo + " " + Ciudad + "\n";
                }
                if (OpcSexo.isSelected() && Sexo.equals(Buscar.getText())) {
                    encontrado = encontrado + " " + Nombre + " " + Edad + " " + Sexo + " " + Ciudad + "\n";
                }
                if (OpcCuidad.isSelected() && Ciudad.equals(Buscar.getText())) {
                    encontrado = encontrado + " " + Nombre + " " + Edad + " " + Sexo + " " + Ciudad + "\n";
                }                
            }
            System.out.println(encontrado);
            for (int i = 0; i < 1; i++) {
                Mostrar.append(encontrado + "\n");
            }
        } catch (IOException errorIO) {
            System.out.println(":(" + errorIO);
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

    }//GEN-LAST:event_BuscarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Mostrar.setText(" ");
    }//GEN-LAST:event_LimpiarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Areadetexto;
    public static javax.swing.ButtonGroup Botones;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnExaminar;
    private javax.swing.JTextField Buscar;
    private javax.swing.JLabel EtqBuscar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextArea Mostrar;
    private javax.swing.JRadioButton OpcCuidad;
    private javax.swing.JRadioButton OpcEdad;
    private javax.swing.JRadioButton OpcNombre;
    private javax.swing.JRadioButton OpcSexo;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
