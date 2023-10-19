public class Perro {

    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }




    //metodos
    public void comer(String tipoComida, Double cantidadGramos){
        System.out.print("La comida que comera sera: " + tipoComida );
        System.out.println(" Y la cantidad en gramos es la siguiente: " + cantidadGramos);
    }

    public String Ladrar(){
        return "guau guau";
    }




}
