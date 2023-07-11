package menu;

public class Persona {
  protected  String nombre;
  protected  String apellido;
  protected  int dni;
  
  public Persona(){
      
  }
  
  public String getNombre(){
      return this.nombre;
 }

  public String getApellido(){
      return this.apellido;
 }
  public int getDni(){
    return this.dni;
}
   
  public void setNombre(String nombre){
    this.nombre = nombre;  
  }
  public void setApellido(String apellido){
      this.apellido = apellido;
  }
  public void setDni(int dni){
      this.dni = dni;
  }
  
}










