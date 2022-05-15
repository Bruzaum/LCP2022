public class Passaro extends Animal {
	
	String infoExtra;
    String som;

    String getSom() {
        this.som = "Piu";
        return this.som;
    }

	String getInfo(){
        this.infoExtra = "Voar";
		return this.infoExtra;
	}
}
