package clase;
import java.util.regex.Pattern;
/*@Gustavo Apaza Huanca*/
public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String editorDeCodigo;
    private String sistemaOperativo;

    public Usuario() {
    }
    
    public Usuario(String nombre, String apellido, int edad, String hobbie, String editorDeCodigo, String sistemaOperativo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.editorDeCodigo = editorDeCodigo;
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public void setEditorDeCodigo(String editorDeCodigo) {
        this.editorDeCodigo = editorDeCodigo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public String getEditorDeCodigo() {
        return editorDeCodigo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    
    public boolean validarNombre(String nombre){
        String expReg = "[a-z]{3,15}";
        if(Pattern.matches(expReg, nombre)){
            setNombre(nombre);
            return true;
        }
        return false;
    }
    
    public boolean validarApellido(String apellido){
        String expReg = "[a-z]{3,15}";
        if(Pattern.matches(expReg, apellido)){
            setApellido(apellido);
            return true;
        }
        return false;
    }
    /*
    public boolean validarEdad(int edad){
        //String numCadena = String.valueOf(edad);
        //String expReg = "\\d{1,3}"; Pattern.matches(expReg, numCadena)
        if(edad >= 0 && edad <= 122){
            setEdad(edad);
            return true;
        }
        return false;
    }
    */
}
