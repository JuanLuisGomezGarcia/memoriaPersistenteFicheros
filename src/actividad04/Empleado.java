
package actividad04;

import	java.io.Serializable;
// implementamos la clase con serializable para poder codificar los archivo con datos de estos objetos
public class Empleado implements Serializable {
    // Generamos los atributos de la clase
    String nombre;
    String edad;
    String sexo;
    String hobby;
    
    // Generamos el constrructor de la clase
    public Empleado(String nombre,String edad,String sexo, String hobby){
    this.nombre= nombre;
    this.edad=edad;
    this.sexo=sexo;
    this.hobby=hobby;
    }
    
    
    // Generamos los get de la clase
    public String getNombre(){
        return nombre;
    }
    public String getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
    public String getHobby(){
        return hobby;
    }

    
    // Generamos los set de la clase
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(String edad){
        this.edad=edad;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    public void setHobby(String hobby){
        this.hobby=hobby;
    }

    
    // Generamos el toString
    public String toString (){
        return "Empleado: Nombre: "+nombre+" Edad: "+edad+" Sexo: "+sexo+" Aficiones: " + hobby;
    }
}


