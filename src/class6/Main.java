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
public class Main {
    public static void main(String[] args) {
        Fecha fnaci= new Fecha (10,10,1980);
        Fecha fingr= new Fecha (29,8,2018);
        Empleado empleado= new Empleado ("V", "G", fnaci);
        empleado.setFingr(fingr);
        System.out.println(empleado.getNombre());
    }
}
