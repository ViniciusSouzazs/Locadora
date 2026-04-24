package model;

public class Aluguel {

        private Cliente cliente;
        private Filme filme;
        private Integer dias;

        public Aluguel(Cliente cliente, Filme filme, Integer dias) {
                this.cliente = cliente;
                this.filme = filme;
                this.dias = dias;
        }

        public Cliente getCliente() {
                return cliente;
        }

        public void setCliente(Cliente cliente) {
                this.cliente = cliente;
        }

        public Filme getFilme() {
                return filme;
        }

        public void setFilme(Filme filme) {
                this.filme = filme;
        }

        public Integer getDias() {
                return dias;
        }

        public void setDias(Integer dias) {
                this.dias = dias;
        }
}
