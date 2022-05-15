public class Exercicio05 {

    public static class Livro{

        String titulo;

        public String getTitulo(){
            return this.titulo;
        }

        public void setTitulo(String titulo){
            this.titulo = titulo;
        }

    }

    public static class LivroGratuito extends Livro{

    }

    public static class LivroPago extends Livro{

        float valor;

        public float getValor(){
            return this.valor;
        }

        public void setValor(float valor){
            this.valor = valor;
        }

    }

    public class Biblioteca{

        public static void main(String[] args) {
            LivroGratuito livroGratuito = new LivroGratuito();
            livroGratuito.setTitulo("Dom Quixote");
            System.out.printf("O livro %s eh gratuito\n", livroGratuito.getTitulo());

            LivroPago livroPago = new LivroPago();
            livroPago.setTitulo("Harry Potter");
            livroPago.setValor(25);
            System.out.printf("O livro %s custa R$ %.2f\n", livroPago.getTitulo(), livroPago.getValor());
        }
    }
}
