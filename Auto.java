public class Auto {
    private String nombre;
    private String marca;
    public Auto(String name, String marca){
        this.nombre = name;
        this.marca = marca;
    }
    public String getName(){
        return this.nombre;
    }
    public String getMarca(){
        return this.marca;
    }
}
