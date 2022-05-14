public class Exercicio03 {
    
    public static class Funcionario{

        String name;
        int age;
        double sal;

        public Funcionario(String name, int age, double sal){
            setNome(name);
            setIdade(age);
            setSalario(sal);
        }


        public void setNome(String name){
            this.name = name;
        }

        public void setIdade(int age){
            this.age = age;
        }

        public void setSalario(double sal){
            this.sal = sal;
        }

        public String getNome(){
            return this.name;
        }

        public int getIdade(){
            return this.age;
        }

        public double getSalario(){
            return this.sal;
        }


        public double[] retornaContribuição(){
            double[] con = new double[2];
            if(getIdade() <= 30){
                con[0] = 0.2;
                con[1] = 0.18;
            }
            if(getIdade() >30 && getIdade() <=40){
                con[0] = 0.18;
                con[1] = 0.15;
            }
            if(getIdade() >40 && getIdade() <=50){
                con[0] = 0.12;
                con[1] = 0.15;
            }
            if(getIdade() >50 && getIdade() <=60){
                con[0] = 0.07;
                con[1] = 0.1;
            }
            if(getIdade() >60){
                con[0] = 0.03;
                con[1] = 0.04;
            }
            return con;
        }

        public void calculaContribuicao(){
            double[] con = retornaContribuição();
            double conFunc = con[0];
            double conEmp = con[1];
            
            double salCon;
            if(getSalario() <= 5000){
                salCon = getSalario()*(1-(conEmp+conFunc));
                setSalario(salCon);
                return;
            }
            salCon = 5000*(1-(conEmp+conFunc));
            salCon = salCon + (getSalario()-5000);
            setSalario(salCon);
            return;
        }

        public String toString(){
            return getNome() + " com " + getIdade() + " anos, tem salario igual a " + getSalario();
        }

    }

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Bruno", 22, 7500);
        func1.calculaContribuicao();

        Funcionario func2 = new Funcionario("Marcos", 31, 3000);
        func2.calculaContribuicao();

        Funcionario func3 = new Funcionario("Marina", 77, 12000);
        func3.calculaContribuicao();

        Funcionario func4 = new Funcionario("Isabela", 25, 4500);
        func4.calculaContribuicao();

        Funcionario func5 = new Funcionario("Orlando", 45, 5000);
        func5.calculaContribuicao();


        System.out.printf("%s\n", func1.toString());
        System.out.printf("%s\n", func2.toString());
        System.out.printf("%s\n", func3.toString());
        System.out.printf("%s\n", func4.toString());
        System.out.printf("%s\n", func5.toString());

    }

}
