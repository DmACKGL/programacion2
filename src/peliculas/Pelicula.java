package peliculas;

class Pelicula {
    private String titulo;
    private int anno;
    private String genero;
    private String actorActriz;

    Pelicula(String titulo, String genero, int anno, String actorActriz){
        this.titulo = titulo;
        this.genero = genero;
        this.anno = anno;
        this. actorActriz = actorActriz;
    }

    void mostrarInfoPeicula(){
        System.out.println("=====================================");
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Genero: "+this.genero);
        System.out.println("Año: "+this.anno);
        System.out.println("Actor/Actriz: "+this.actorActriz);
    }
}
