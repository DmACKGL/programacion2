package peliculas;

class Pelicula {
    private String titulo;
    private int anno;
    private String genero;
    private String actorActriz;

    Pelicula(String titulo, String genero, int anno, String actorActriz) {
        this.titulo = titulo;
        this.genero = genero;
        this.anno = anno;
        this.actorActriz = actorActriz;
    }

    Pelicula(String titulo, int anno) {
        this.titulo = titulo;
        this.anno = anno;
    }

    /**
     * Getters and Setters
     * ALT + Insertar
     */

    public String getTitulo() {
        return titulo;
    }

    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnno() {
        return anno;
    }

    void setAnno(int anno) {
        if (anno >= 1885)
            this.anno = anno;
    }

    public String getGenero() {
        return genero;
    }

    void setGenero(String genero) {
        this.genero = genero;
    }

    public String getActorActriz() {
        return actorActriz;
    }

    void setActorActriz(String actorActriz) {
        this.actorActriz = actorActriz;
    }

    /**
     * End Getters and Setters
     */

    void mostrarInfoPeicula(){
        System.out.println("=====================================");
        System.out.println("Titulo: "+this.titulo);
        if (this.genero != null)
            System.out.println("Genero: "+this.genero);
        else
            System.out.println("Genero: Desconocido");
        if (this.genero != null)
            System.out.println("Año: "+this.anno);
        else
            System.out.println("Año: Desconocido");
        System.out.println("Actor/Actriz: "+this.actorActriz);
    }
}
