package model;

public class Filme {

    private String titulo;
    private String genero;
    private Double valoraluguel;

    public Filme(String titulo, String genero, Double valoraluguel) {
        this.titulo = titulo;
        this.genero = genero;
        this.valoraluguel = valoraluguel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getValoraluguel() {
        return valoraluguel;
    }

    public void setValoraluguel(Double valoraluguel) {
        this.valoraluguel = valoraluguel;
    }
    public void exibirdetalhes(){
        System.out.println(this.titulo + " " + this.genero + " " + this.valoraluguel);
    }
}
