package dominio;
public class Localidad
{
    String nombre;
    int numeroDeHabitantes;
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public int getNumeroDeHabitantes()
    {
        return numeroDeHabitantes;
    }

    public void setNumeroDeHabitantes(int
            numeroDeHabitantes)
    {
        this.numeroDeHabitantes =
            numeroDeHabitantes;
    }
    public String toString()
    {
        return nombre + " " + numeroDeHabitantes
            + " habitantes";
    }
}
