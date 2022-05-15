public class Gato extends Animal {
	
	String infoExtra;
    String som;

    String getSom() {
        this.som = "Miau";
        return this.som;
    }

	String getInfo(){
        this.infoExtra = "Correr e Pular";
		return this.infoExtra;
	}

}
