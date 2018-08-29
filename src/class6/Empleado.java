/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

/**
 *
 * @author Estudiante
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private char genero;
    private String foto;
    private Fecha fnaci;
    private Fecha fingr;
    
    
    public Empleado(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    
    public Empleado(String nomnre, String apellido, Fecha fnaci){
        this.nombre=nombre;
        this.apellido=apellido;
        this.fnaci=fnaci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFnaci() {
        return fnaci;
    }

    public void setFnaci(Fecha fnaci) {
        this.fnaci = fnaci;
    }

    public Fecha getFingr() {
        return fingr;
    }

    public void setFingr(Fecha fingr) {
        this.fingr = fingr;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
