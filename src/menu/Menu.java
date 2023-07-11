package menu;

import modelo.Persona;
import vista.Consola;

public class Menu {
    
    public void iniciarMenu() {
        
        Persona gente[] = new Persona[10];
        int contGente = 0;
        gente[0] = new Persona();
        
        Consola c = new Consola();
        boolean salir = false; 
        int opcion,i;
        while(!salir){
            System.out.println("1. Ingresar Persona");
            System.out.println("2. Mostrar Lista de Personas");
            System.out.println("3. Buscar persona por DNI");
            System.out.println("4. Salir");
            
            opcion = c.leerint("Elegir opcion");
            
            switch(opcion){
                case 1:
                    if (contGente < 10){
                    String nombre = c.leerString("Escriba su nombre:");
                    String apellido = c.leerString("Escriba su apellido:");
                    int dni = c.leerint("Escriba su dni:");
                    gente[contGente] = new Persona();
                    gente[contGente].setNombre(nombre);
                    gente[contGente].setApellido(apellido);
                    gente[contGente].setDni(dni);
                    contGente++;
                    }
                    break;
                case 2:
                    System.out.println("Estas es la lista de Personas: ");
                    
                    for(i=0;i<contGente;i++){
                        System.out.println("Persona N-"+(i+1));
                        System.out.println(gente[i].getNombre()+
                                gente[i].getApellido()+
                                gente[i].getDni());
                        System.out.println("------------------");
                    }              
            
                    break;

                case 3:
                    int buscarPersona = c.leerint("Escriba el DNI que desea buscar");
                    for(i=0;i<contGente;i++){
                        if(gente[i].getDni() == buscarPersona){
                            System.out.println(gente[i].getNombre()+
                                    gente[i].getApellido()+
                                    gente[i].getDni());
                        }
                    }
                    break;
                case 4:
                    salir = true;
                    break;
            }
        } 
    }
   
}
