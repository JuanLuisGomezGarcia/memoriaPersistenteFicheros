
package actividad04;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewJFrame_1 extends javax.swing.JFrame {

    
    
    public File crearCarpetaYArchivo(){
        
            String linea = "";
        String rutaProyecto = System.getProperty("user.dir");   // Busca la ruta donde esta el archivo java y la transformamos en string
        String separador = File.separator;                      // Generamos un separados para gnerar la ruta donde esta la carpeta
        String ruta_Archivos = rutaProyecto+separador+"carpeta";// sumamos las String anteriores junto con el nombre de la carpeta
        File carpeta = new File (ruta_Archivos);                // Creamos la variable file
        if(!carpeta.exists()){carpeta.mkdir();}                 // y con este condicional si no existe la carpeta la creamos con el metodo mkdir
        return carpeta;
    }
    
    public File crearArchivoEntrada(File carpeta){
        
        
                String separador = File.separator;                    // seguimos los pasos que hemos seguido con la carpeta pero ahora introducimos un 
        String crearArchivo = carpeta +separador+ "datos_login.txt";  // El nuevo file dentro de la carpeta y utilizamos el metodo createNewFile
        File archivo = new File (crearArchivo);                       // para crear el nuevo archivo
        
        if(!archivo.exists()){try {
            archivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame_1.class.getName()).log(Level.SEVERE, null, ex);
            }}return archivo;
    }
    
    public void escribirFile(String contenido, File archivo){
                try {                                                    
            FileWriter fw = new FileWriter(archivo);                // generamos un FileWriter y le introducimos el archivo que reciva la funcion
            BufferedWriter bw = new BufferedWriter(fw);             //  generamos un bufferWriter para poder escrivir en el 
            bw.write(contenido);                                    //  y lo introducimos el String que recive la funcion
            bw.close();                                             //  cerramos el bufferWriter para evitar errores
                    } catch (IOException ex) {
                Logger.getLogger(NewJFrame_1.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public String leerArchivo(File archivo){
                String linea = "";
                try {
                linea = "";
        	FileReader fr	= new FileReader(archivo);	  //En este caso usamos un filer y buffer reader para leer el archivo el proceso es igual							
		BufferedReader br = new BufferedReader(fr);           
		linea = br.readLine();
		br.close();
                            } catch (IOException ex) {
                Logger.getLogger(NewJFrame_1.class.getName()).log(Level.SEVERE, null, ex);}
                return linea;
    }
    

    public NewJFrame_1() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(425, 350);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        btn_registro = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        jLabel1.setText("                                    ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_registro.setText("Aceptar");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuario");

        jLabel4.setText("password ");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jPasswordField1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn_registro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btn_registro)
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
       
        
                // Esta funcion genera una carpeta dentro de la clase e java si no esta creada y retorna este archivo file
        File carpeta = crearCarpetaYArchivo();
        // Esta funcion genera un archivo dentro de la clase e java si no esta creada y retorna este archivo file
        File archivo =crearArchivoEntrada(carpeta);

        //  Aqui selecciono el user y contraseña y que tenia la libertad de hacerlo tambien podria haber creado un objeto login
        // con dos apartados user y contraseña para generar la posibilidad de modificarlo
        String userYcontraseña ="user,12345";
        // Esta funcion escribimos en el archivo que decidamos
         escribirFile(userYcontraseña, archivo);

        // Esta funcion leemos el archivo que decidamos
        String datosArchivo = leerArchivo(archivo);
        
        

       String contenidoArchivo = datosArchivo;
       
       // Recogemos los datos introducidos por el usuario
       String usuarioIntroducido = jTextField1.getText();
       String contraseñaIntroducida = jPasswordField1.getText();
       // Desfrangmentamos el String del archivo para pasarlo a string individuales
       String usuario = contenidoArchivo .substring(0, 4);
       String contraseña = contenidoArchivo .substring(5, 10);
        jLabel1.setText(usuario);
        //  y pasamos estos String por un if para verificarlos
        if(usuarioIntroducido.isEmpty()&&contraseñaIntroducida.isEmpty()){
            
        // En caso de que el usuario no introdusca datos lanzamos un jDialo que le avise 
        jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setSize(300, 200);
        jLabel3.setText("      DEBES INTRODUCIR LOS DATOS");
        jLabel3.setForeground(Color.red);
        Font auxFont=jLabel3.getFont();
        jLabel3.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 15));
        jDialog1.setContentPane(jLabel3);
        }
        
        // y en el else metemos un if que nos lleva al segundo jFrame  y si el if falla salta otro jDialog que avisa del error
        else {if(usuario.equals(usuarioIntroducido)&&contraseña.equals(contraseñaIntroducida)){
            
            new NewJFrame_2().setVisible(true);
            new NewJFrame_1().dispose();
            
        }else{
        jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setSize(300, 200);
        jLabel3.setText("      CREDENCIALES INCORRECTAS");
        jLabel3.setForeground(Color.red);
        Font auxFont=jLabel3.getFont();
        jLabel3.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 15));
        jDialog1.setContentPane(jLabel3);
            
            
        }}
        
        
        
      
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_registroActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registro;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
