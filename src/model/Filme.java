package model;

public class Filme {

    private String titulo;
    private String genero;
    private Double valoraluguel;

    public Filme(String titulo, Double valoraluguel, String genero) {
        this.titulo = titulo;
        this.valoraluguel = valoraluguel;
        this.genero = genero;
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
    public String exibirdetalhes() {
        return "Titulo: " + this.titulo + "\nGênero: " + this.genero + "\nValor do Aluguel: " + this.valoraluguel;
    }
    public void aplicardesconto(double percentual){
        valoraluguel = valoraluguel - (valoraluguel * percentual / 100);
    }
}
