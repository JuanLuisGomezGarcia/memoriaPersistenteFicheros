
package actividad04;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Atenea
 */
public class NewJFrame_2 extends javax.swing.JFrame {

    //Esta variable sera usada en distintas funciones es de hay que este creada aqui para no estar creandola continuamente
    ArrayList<Empleado> grupoTrabajo = new ArrayList<>();

    public NewJFrame_2() {
        initComponents();
        setLocationRelativeTo(null);
        
        //Esta condicion genera que cuando se seleccione un radioButton del genero el otro se active
        if(rb_hombre.isSelected()){rb_mujer.setSelected(false);}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_crearEmpleado = new javax.swing.JButton();
        btn_mostrarEmpleados = new javax.swing.JButton();
        tf_nombreEmpleado = new javax.swing.JTextField();
        cb_edad = new javax.swing.JComboBox<>();
        cb_programar = new javax.swing.JCheckBox();
        cb_cine = new javax.swing.JCheckBox();
        cb_deporte = new javax.swing.JCheckBox();
        rb_mujer = new javax.swing.JRadioButton();
        rb_hombre = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        jScrollPane1.setViewportView(jTextPane1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre");

        jLabel3.setText("Aficiones");

        jLabel4.setText("Edad");

        jLabel5.setText("Sexo");

        btn_crearEmpleado.setText("Nuevo Empleado");
        btn_crearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearEmpleadoActionPerformed(evt);
            }
        });

        btn_mostrarEmpleados.setText("Mostrar empleados");
        btn_mostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarEmpleadosActionPerformed(evt);
            }
        });

        tf_nombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreEmpleadoActionPerformed(evt);
            }
        });

        cb_edad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10-15", "15-20", "20-25", "25-30", "35-40", "40-45", "45-50", "50-55", "55-60", "60-65", "65-70" }));
        cb_edad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cb_programar.setText("Programar");
        cb_programar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_programarActionPerformed(evt);
            }
        });

        cb_cine.setText("Cine");

        cb_deporte.setText("Deporte");

        rb_mujer.setText("Mujer");
        rb_mujer.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_mujerStateChanged(evt);
            }
        });

        rb_hombre.setText("Hombre");
        rb_hombre.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_hombreStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_mujer)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb_hombre))
                                    .addComponent(cb_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cb_programar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_cine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_deporte)))
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btn_crearEmpleado)
                        .addGap(58, 58, 58)
                        .addComponent(btn_mostrarEmpleados)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_programar)
                    .addComponent(cb_cine)
                    .addComponent(cb_deporte))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_mujer)
                    .addComponent(rb_hombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crearEmpleado)
                    .addComponent(btn_mostrarEmpleados))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public File listaTrabajadores(){
    
        String rutaProyecto = System.getProperty("user.dir");
        String separador = File.separator;
        String ruta_Archivos = rutaProyecto+separador+"carpeta";
        File carpeta = new File (ruta_Archivos);
        String crearArchivo = carpeta +separador+ "lista_trabajadores.txt";  // igual que en el JFrame1 este metodo genera un archivo dentro de la carpeta
        File datos_empleados= new File(crearArchivo);                        // creada dentro los archivos de la clase
        
                if(!datos_empleados.exists())
                {
                    try {
            datos_empleados.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame_1.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
                return datos_empleados;
}
    
    public String hobbytEmpleado(){
        
        String hobby = "";
        boolean programar = cb_programar.isSelected();  // Generamos una variable booleana por cada aficcion
        boolean cine =cb_cine.isSelected();
        boolean deporte=cb_deporte.isSelected();
        
        if(programar && cine && deporte){hobby="Programar, cine y deporte.";}   // y pasamosestos estas variables por un conjunto de if anidados para obtener el String
        if(programar && cine && !deporte){hobby="Programar y cine.";}           // mas concreto y personalizado
        if(programar && !cine && deporte){hobby="Programar y deporte.";}
        if(!programar && cine && deporte){hobby="Cine y deporte.";}
        if(!programar && !cine && deporte){hobby="Deporte.";}
        if(!programar && cine && !deporte){hobby="Cine.";}
        if(programar && !cine && !deporte){hobby="Programar.";}
        return hobby;
    }
    
    
    public String generoEmpleado(){
    
    String sexo="";
        if(rb_hombre.isSelected()){sexo="hombre";}
        if(rb_mujer.isSelected()){sexo="mujer";}
        return sexo;
    }
    
    public ArrayList recuperarDatosTrabajadores(File datos_empleados) throws IOException, ClassNotFoundException{
               ObjectInputStream ois = new ObjectInputStream(new FileInputStream(datos_empleados));   // Creamos un objectInputStram para recuperar los datos del archivo
               ArrayList grupoTrabajo =(ArrayList<Empleado>)ois.readObject();                         // y sumarlos al nuevo empleado 
               ois.close();
               
               return grupoTrabajo;
    }
    
    public void rellenarArchivoEmpleados(ArrayList grupoTrabajo, File datos_empleados) throws FileNotFoundException, IOException{
            ObjectOutputStream oos = new ObjectOutputStream(new	FileOutputStream(datos_empleados));
            oos.writeObject(grupoTrabajo);                                                            // ahora usamos un ObjectOutputStream para escribir sobre el archivo codificado
            oos.close();
    }
    
    private void btn_crearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearEmpleadoActionPerformed
        
        //Aqui pasamos el archivo a una variable File que usaremos para almacenar los empleados creados
        File datos_empleados = listaTrabajadores();
        
        // usamos la funcion de hobby para obtener el string necesario
        String hobby =hobbytEmpleado(); 
        
        // obtenemos el nombre del usuario introducido por el usuario 
        String nombreEmpleado = tf_nombreEmpleado.getText();
        
        //obtenemos el rango de edad seleccionado por el usuario en el jComboBox
        String edadEmpleado = cb_edad.getSelectedItem().toString();
        
        // Usamos el metodo del genero para seleccionar el genero del empleado
        String sexo =generoEmpleado();
       
        // Condiciones para crear el empleado
        if(rb_hombre.isSelected()||rb_mujer.isSelected()){  
        if(!(nombreEmpleado.isEmpty())){
            
       //Generamos el empleado con los datos recividos
       Empleado nuevoEmpleado = new Empleado(nombreEmpleado,edadEmpleado,sexo, hobby);
       
       try{
           
           // Generamos un String que pasaremos por un condicional para detectar si el archivo esta vacio
       String filtro = datos_empleados.toString();
       if(filtro.isEmpty()==false){
               //  Si el archivo contien empleados  los pasaremos al mismo arrayList que añadiremos el empleado nuevo introducido
               grupoTrabajo =recuperarDatosTrabajadores(datos_empleados);
               } 
       }catch (Exception e){}
       
       // Introducimos el nuevo empleado al final del arrayList
       grupoTrabajo.add(nuevoEmpleado);
       
       
       
            try {
                //funcion que escribe el nuevo empleado en el archivo
                rellenarArchivoEmpleados(grupoTrabajo,datos_empleados);
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame_2.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            

       // jDialog que salta cuando se introduce correctamente el usuario
               jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setSize(300, 200);
        jLabel1.setText("      GRACIAS POR USAR LA APLICACON");
        jLabel1.setForeground(Color.black);
        Font auxFont=jLabel1.getFont();
        jLabel3.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 15));
        jDialog1.setContentPane(jLabel1);
       
       
       
       
        
        // jDialog que salta cuando no hay nombre introducido
        }else{        jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setSize(250, 200);
        jLabel1.setText("      INTRODUSCA El NOMBRE");
        jLabel1.setForeground(Color.red);
        Font auxFont=jLabel1.getFont();
        jLabel1.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 15));
        jDialog1.setContentPane(jLabel1);}
        
        // jDialog que salta cuando no se ha seleccionado el genero
        }else {        jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setSize(370, 200);
        jLabel1.setText("      INTRODUSCA EL SEXO DEL TRABAJADOR");
        jLabel1.setForeground(Color.red);
        Font auxFont=jLabel1.getFont();
        jLabel1.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 15));
        jDialog1.setContentPane(jLabel1);}
        
        
    }//GEN-LAST:event_btn_crearEmpleadoActionPerformed

    private void tf_nombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreEmpleadoActionPerformed

    private void cb_programarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_programarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_programarActionPerformed

    private void rb_hombreStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_hombreStateChanged
        if(rb_hombre.isSelected()){rb_mujer.setSelected(false);}
    }//GEN-LAST:event_rb_hombreStateChanged

    private void rb_mujerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_mujerStateChanged
        if(rb_mujer.isSelected()){rb_hombre.setSelected(false);}
    }//GEN-LAST:event_rb_mujerStateChanged

    private void btn_mostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarEmpleadosActionPerformed

          File datos_empleados = listaTrabajadores();
              // Generamos una variable donde almacenaremos el archivo de empleados
              String a ="";
            try {
                
                grupoTrabajo =recuperarDatosTrabajadores(datos_empleados);
               // recorremos el arrayList mientras rellenamos la el String ante mencionado
               for (int i=0;i<grupoTrabajo.size();i++ ){
                   a+= grupoTrabajo.get(i)+"\n";    
               }
        // metemos la string en un jTextArea1
        jTextArea1.setText(a);
        jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setSize(600, 400);
        // que luego metemos en el jDialog1
        jDialog1.setContentPane(jTextArea1);

                                          } catch (IOException ex) {
                Logger.getLogger(NewJFrame_1.class.getName()).log(Level.SEVERE, null, ex);} catch (ClassNotFoundException ex) {          
            Logger.getLogger(NewJFrame_2.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_btn_mostrarEmpleadosActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crearEmpleado;
    private javax.swing.JButton btn_mostrarEmpleados;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_cine;
    private javax.swing.JCheckBox cb_deporte;
    private javax.swing.JComboBox<String> cb_edad;
    private javax.swing.JCheckBox cb_programar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JRadioButton rb_hombre;
    private javax.swing.JRadioButton rb_mujer;
    private javax.swing.JTextField tf_nombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
