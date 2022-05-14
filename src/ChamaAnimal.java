public class ChamaAnimal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
		cachorro.setNome("Pegasus");
		cachorro.setIdade(5);

        Gato gato = new Gato();
		gato.setNome("Thor");
		gato.setIdade(3);

        Passaro passaro = new Passaro();
		passaro.setNome("Bilbo");
		passaro.setIdade(7);

        System.out.printf("O cachorro %s, com %d anos, emite o som %s, e pode %s\n", cachorro.nome, cachorro.idade, cachorro.getSom(), cachorro.getInfo());
        System.out.printf("O gato %s, com %d anos, emite o som %s, e pode %s\n", gato.nome, gato.idade, gato.getSom(), gato.getInfo());
        System.out.printf("O passaro %s, com %d anos, emite o som %s, e pode %s\n", passaro.nome, passaro.idade, passaro.getSom(), passaro.getInfo());
	}

}
