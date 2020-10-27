/**
 * Clase pública Doctor
 */
public class Doctor {
    //Propiedades
    static int id = 0; //Autoincremental
    String name;
    String speciality;

    //Método constructor
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }
    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }
    //Métodos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
