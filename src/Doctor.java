/**
 * Clase pública Doctor
 */
public class Doctor {
    //Propiedades
    int id;
    String name;
    String speciality;

    //Método constructor
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }
    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }
    //Métodos
    public void showName(){
        System.out.println(name);
    }
}
