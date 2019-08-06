package peliculas;

public class programa {
    public static void main(String[] args){
        Pelicula pelicula01 = new Pelicula("Titanic", "Romance", 1997, "Kate Winstel");
        Pelicula pelicula02 = new Pelicula("Toy Story", "Animacion", 1995, "Buzz");
        pelicula01.mostrarInfoPeicula();
        pelicula02.mostrarInfoPeicula();
    }
}
