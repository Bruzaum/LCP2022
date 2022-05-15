public class Exercicio06 {

    public interface Geometria {
        public double defineArea();
        public double definePerimetro();
    }

    public static class Quadrado implements Geometria{
        int lado;

        @Override
        public double defineArea(){
            return (getLado()*getLado());
        }

        @Override
        public double definePerimetro(){
            return (getLado()*4);
        }

        public int getLado(){
            return this.lado;
        }

        public void setLado(int lado){
            this.lado = lado;
        }

        public Quadrado(int lado){
            setLado(lado);
        }

    }

    public static class Retangulo implements Geometria{
        int lado1;
        int lado2;

        @Override
        public double defineArea(){
            return (getLado1()*getLado2());
        }

        @Override
        public double definePerimetro(){
            return (getLado1()*2) + (getLado2()*2);
        }

        public int getLado1(){
            return this.lado1;
        }

        public void setLado1(int lado){
            this.lado1 = lado;
        }

        public int getLado2(){
            return this.lado2;
        }

        public void setLado2(int lado){
            this.lado2 = lado;
        }

        public Retangulo(int lado1, int lado2){
            setLado1(lado1);
            setLado2(lado2);
        }

    }

    public static class Triangulo implements Geometria{
        int lado1;
        int lado2;
        int lado3;

        @Override
        public double defineArea(){
            //procurei como fazer area do triangulo sem ter as informacoes de base e altura
            float s = (this.lado1+this.lado2+this.lado3)/2;
            return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        }

        @Override
        public double definePerimetro(){
            return (this.lado1 + this.lado2 + this.lado3);
        }

        public Triangulo(int lado1,int lado2, int lado3){
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }

    }

    public static class Circulo implements Geometria{
        int raio;

        @Override
        public double defineArea(){
            return (Math.PI * Math.sqrt(getRaio()));
        }

        @Override
        public double definePerimetro(){
            return (2 * Math.PI * getRaio());
        }

        public int getRaio(){
            return this.raio;
        }

        public void setRaio(int raio){
            this.raio = raio;
        }

        public Circulo(int raio){
            setRaio(raio);
        }

    }

    public static class TestaGeometria{

        public static void main(String[] args) {
            Quadrado quad1 = new Quadrado(6);
            System.out.printf("Quadrado de area %.2f e perimetro %.2f\n", quad1.defineArea(), quad1.definePerimetro());

            Quadrado quad2 = new Quadrado(7);
            System.out.printf("Quadrado de area %.2f e perimetro %.2f\n", quad2.defineArea(), quad2.definePerimetro());
    
            Retangulo ret1 = new Retangulo(10, 5);
            System.out.printf("Retangulo de area %.2f e perimetro %.2f\n", ret1.defineArea(), ret1.definePerimetro());
            Retangulo ret2 = new Retangulo(4, 12);
            System.out.printf("Retangulo de area %.2f e perimetro %.2f\n", ret2.defineArea(), ret2.definePerimetro());
    
            Triangulo tri1 = new Triangulo(6,6,6);
            System.out.printf("Triangulo de area %.2f e perimetro %.2f\n", tri1.defineArea(), tri1.definePerimetro());
            Triangulo tri2 = new Triangulo(1, 3, 5);
            System.out.printf("Triangulo de area %.2f e perimetro %.2f\n", tri2.defineArea(), tri2.definePerimetro());
    
            Circulo cir1 = new Circulo(1);
            System.out.printf("Circulo de area %.2f e perimetro %.2f\n", cir1.defineArea(), cir1.definePerimetro());
            Circulo cir2 = new Circulo(5);
            System.out.printf("Circulo de area %.2f e perimetro %.2f\n", cir2.defineArea(), cir2.definePerimetro());
        }


    }


}
