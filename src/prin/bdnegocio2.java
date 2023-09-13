

package prin;

import config.Conexion;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class bdnegocio2 extends javax.swing.JFrame {
      int filas;
    String cod;
    Conexion con1=new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    //int idc;
    
    
    
    
    
    public bdnegocio2() {
        initComponents();
        //para que centre al ejecutar
        setLocationRelativeTo(null);
        consultar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        AGREGAR = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        NUEVO = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        LIBRERIa = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cantidad");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Vencimiento");

        AGREGAR.setBackground(new java.awt.Color(153, 255, 153));
        AGREGAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AGREGAR.setText("AGREGAR");
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });

        MODIFICAR.setBackground(new java.awt.Color(153, 255, 153));
        MODIFICAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        NUEVO.setBackground(new java.awt.Color(153, 255, 153));
        NUEVO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NUEVO.setText("NUEVO");
        NUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVOActionPerformed(evt);
            }
        });

        ELIMINAR.setBackground(new java.awt.Color(255, 102, 102));
        ELIMINAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\FELIX\\Desktop\\2.png")); // NOI18N
        jLabel6.setText("jLabel6");

        btnReporte.setText("Generar reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        Buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(AGREGAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MODIFICAR)
                .addGap(18, 18, 18)
                .addComponent(ELIMINAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NUEVO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(txtNombre))
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUEVO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de datos"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigoProducto", "nombreProducto", "precioUnitario", "cantidadProducto", "fechaVencimiento"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );

        LIBRERIa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LIBRERIa.setText("Libreria Central");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(LIBRERIa))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LIBRERIa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
     //CLICK MOUSE PARA SELECCIONAR FILA
      // int fila = Tabla.getSelectedRow();
       //if ( fila == -1){
           
         //  JOptionPane.showMessageDialog(null, "No selecciono fila");
       /*} else {
    // int cod = Integer.parseInt((String) Tabla.getValueAt(fila, 0) .toString());
      String cod=(String) Tabla.getValueAt(fila, 0) ;
       String nombre = (String) Tabla.getValueAt(fila, 1);
       String precio = (String) Tabla.getValueAt(fila, 2);
        String cantidad = (String) Tabla.getValueAt(fila, 3);
        String fecha = (String) Tabla.getValueAt(fila, 4);
       
        txtcodigo.setText("" + cod);
        txtnombre.setText( nombre);
        txtpunitario.setText( precio);
         txtcantidad.setText( cantidad);
         txtfecha.setText("" +fecha);
        
       }*/
        int fila = Tabla.getSelectedRow();
        txtCodigo.setText(Tabla.getValueAt(fila, 0) .toString());
        txtNombre.setText(Tabla.getValueAt(fila, 1) .toString());
        txtPrecio.setText(Tabla.getValueAt(fila, 2) .toString());
        txtCantidad.setText(Tabla.getValueAt(fila, 3) .toString());
        txtFecha.setText(Tabla.getValueAt(fila, 4) .toString());
        filas = fila;
    }//GEN-LAST:event_TablaMouseClicked

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String codigo = txtCodigo.getText(); // Obtener el código ingresado por el usuario

        // Verificar si el campo de código está vacío
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa un código para buscar.");
        } else {
            // Realizar la consulta en la base de datos
            String sql = "SELECT * FROM producto WHERE codigoProducto = ?";
            try {
                conet = con1.getConnection();
                PreparedStatement pstmt = conet.prepareStatement(sql);
                pstmt.setString(1, codigo);
                ResultSet rs = pstmt.executeQuery();

                // Verificar si se encontraron resultados
                if (rs.next()) {
                    // Mostrar los datos en los campos de texto
                    txtNombre.setText(rs.getString("nombreProducto"));
                    txtPrecio.setText(String.valueOf(rs.getFloat("precioUnitario")));
                    txtCantidad.setText(String.valueOf(rs.getInt("cantidadProducto")));
                    txtFecha.setText(rs.getString("fechaVencimiento"));
                } else {
                    // No se encontraron resultados, mostrar un mensaje
                    JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                    // Limpiar los campos de texto
                    txtNombre.setText("");
                    txtPrecio.setText("");
                    txtCantidad.setText("");
                    txtFecha.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al buscar el producto: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        try{
            InputStream archivo=getClass().getResourceAsStream("/reportes/report1.jrxml");
            JasperDesign dise=JRXmlLoader.load(archivo);
            JasperReport jr=JasperCompileManager.compileReport(dise);
            JasperPrint jp= JasperFillManager.fillReport(jr, null, conet);
            JasperViewer.viewReport(jp);
        }catch(Exception e){

        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        // ELIMINAR
        eliminar();
        consultar();
        nuevo();
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void NUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVOActionPerformed
        nuevo();
    }//GEN-LAST:event_NUEVOActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        //MODIFICAR
        modificar();
        consultar();
        nuevo();
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
        // BOTON AGREGAR
        agregar();
        consultar();
        nuevo();

    }//GEN-LAST:event_AGREGARActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    void modificar(){
         String cod = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String precio = txtPrecio.getText();
        String cantidad = txtCantidad.getText();
        String fecha = txtFecha.getText();
        
        try{
            if ( cod.equals("") ||  nombre.equals("")|| precio.equals("") || cantidad.equals("") || fecha.equals("")){
                JOptionPane.showMessageDialog(null , "Faltan ingresar datos");
                limpiarTabla();
            } else{
                String sql= "Update producto set codigoProducto ='"+cod+"', nombreProducto='"+nombre+"' , precioUnitario ='"+precio+"', cantidadProducto ='"+cantidad+"' , fechaVencimiento='"+fecha+"' where codigoProducto=" +cod; 
      
                
            conet= con1.getConnection();
           st= conet.createStatement();
           st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null , "Producto Modificado");
           limpiarTabla();
            }
                
                
        } catch(Exception e){
            
        } 
    }
    
    
    void consultar(){
        String sql= "select * from producto";
         try {
           conet= con1.getConnection();
           st= conet.createStatement();
           rs= st.executeQuery(sql);
           Object [] producto = new Object [5];
           modelo = (DefaultTableModel) Tabla.getModel();
           while (rs.next()) {
               producto [0] = rs.getInt("codigoProducto");
               producto [1] = rs.getString("nombreProducto");
               producto [2] = rs.getFloat("precioUnitario");
               producto [3] = rs.getInt("cantidadProducto");
               producto [4] = rs.getDate("fechaVencimiento");
               
               modelo.addRow(producto);   
           }
           Tabla.setModel(modelo);
         } catch (Exception e){
             
         }
    }
    
    void agregar(){
        
       String cod = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String precio = txtPrecio.getText();
        String cantidad = txtCantidad.getText();
        String fecha = txtFecha.getText();
        
        try{
            if ( cod.equals("") ||  nombre.equals("")|| precio.equals("") || cantidad.equals("") || fecha.equals("")){
                JOptionPane.showMessageDialog(null , "Faltan ingresar datos");
                limpiarTabla();
            } else{
                String sql= "insert into producto (codigoProducto,nombreProducto,precioUnitario,cantidadProducto,fechaVencimiento) values ('"+cod+"','"+nombre+"','"+precio+"','"+cantidad+"','"+fecha+"')";
      
                
            conet= con1.getConnection();
           st= conet.createStatement();
           st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null , "Producto registrado");
           limpiarTabla();
            }
                
                
        } catch(Exception e){
            
        } 
        
    }
    
    
     void limpiarTabla(){
        //para no repetir datos anterirores
        for(int i=0; i<= Tabla.getRowCount(); i++){
            modelo.removeRow(i);
            i= i-1;
        }
    }
     
     
     
     void eliminar(){
        /*int fila = Tabla.getSelectedRow();
        try{
            if (fila<0){
                JOptionPane.showMessageDialog( null, "No se ha seleccionado fila");
                limpiarTabla();
            } else{
                
                String sql= "delete from producto where codigoProducto= "+cod;
                conet = con1.getConnection();
                st= conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"producto eliminado");
                limpiarTabla();
            }
        } catch (Exception e){
            
        }*/
        int fila = Tabla.getSelectedRow();
        String cod = Tabla.getValueAt(fila, 0) .toString();
        try{
            PreparedStatement elimi= conet.prepareStatement("DELETE FROM  producto WHERE codigoProducto ='"+cod+"' ");
        elimi.executeUpdate();
        JOptionPane.showMessageDialog(null, "Producto eliminado");
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, " No Eliminado");
        }
    }
     
     
     void nuevo(){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtFecha.setText("");
        txtCodigo.requestFocus();
        
    }
     
    
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
            java.util.logging.Logger.getLogger(bdnegocio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bdnegocio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bdnegocio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bdnegocio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bdnegocio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGREGAR;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JLabel LIBRERIa;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JButton NUEVO;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
