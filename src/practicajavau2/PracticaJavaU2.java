package practicajavau2;
import clase.Usuario;
import java.util.Scanner;
/*@Gustavo Apaza Huanca*/
public class PracticaJavaU2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        String nombre, apellido, hobbie, editorDeCodigo, sistemaOperativo;
        Usuario validarUsuario = new Usuario();
        
        System.out.println("Ingrese los siguientes datos");
        System.out.print("Nombre: ");
        nombre = entrada.nextLine().toLowerCase();
        
        while(!(validarUsuario.validarNombre(nombre))){
            System.out.println("Ingrese solo letras del alfabeto ingles y un solo nombre");
            System.out.print("Nombre: ");
            nombre = entrada.nextLine().toLowerCase();
        }
        
        System.out.print("Apellido: ");
        apellido = entrada.nextLine();
        
        while(!(validarUsuario.validarApellido(apellido))){
            System.out.println("Ingrese solo letras del alfabeto ingles, un solo apellido y reemplaze ñ por n");
            System.out.print("Apellido: ");
            apellido = entrada.nextLine().toLowerCase();
        }
        /*
        boolean bandera;
        do{
            bandera = false;
            try{
                System.out.print("Edad: ");
                edad = entrada.nextInt();
                entrada.nextLine(); //??????????????????????????????????????
        
                while(!(validarUsuario.validarEdad(edad))){
                    System.out.println("Ingrese solo numeros y una edad coherente");
                    System.out.print("Edad: ");
                    edad = entrada.nextInt();
                }
            }catch(Exception e){
                System.out.println("Ingrese solo numeros");
                bandera = true;
            }
        }while(bandera);
        */
        System.out.print("Edad: ");
        edad = entrada.nextInt();
        entrada.nextLine(); //??????????????????????????????????????
        System.out.print("Hobbie: ");
        hobbie = entrada.nextLine();
        System.out.print("Editor de codigo favorito: ");
        editorDeCodigo = entrada.nextLine();
        System.out.print("Sistema operativo preferido: ");
        sistemaOperativo = entrada.nextLine();
        
        Usuario nuevoUsuario = new Usuario(nombre, apellido, edad, hobbie, editorDeCodigo, sistemaOperativo);
        
        System.out.println("\nLos datos ingresados son:"
                        + "\nNombre: " + nuevoUsuario.getNombre()
                        + "\nApellido: " + nuevoUsuario.getApellido()
                        + "\nEdad: " + nuevoUsuario.getEdad() + " anios"
                        + "\nHobbie: " + nuevoUsuario.getHobbie()
                        + "\nEditor de codigo favorito: " + nuevoUsuario.getEditorDeCodigo()
                        + "\nSistema operativo preferido: " + nuevoUsuario.getSistemaOperativo());  
    }
}
