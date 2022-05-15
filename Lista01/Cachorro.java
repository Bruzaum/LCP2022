public class Cachorro extends Animal {
	
	String infoExtra;
    String som;
	
    String getSom() {
        this.som = "Au Au";
        return this.som;
    }

	String getInfo(){
        this.infoExtra = "Correr";
		return this.infoExtra;
	}

}
