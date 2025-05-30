public abstract class Tier {
	private String name;
	private String habitat;
	private String farbe;
	private String nahrung;
	private Integer anzahlBeine;
	private Boolean dichtesFell;
	public abstract void geraeusch();

	// GETTER SETTER REGION
	
	public String getName() {
		return name;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getFarbe() {
		return farbe;
	}
	public String getNahrung() {
	       return nahrung;	
	}
	public Integer getAnzahlBeine() {
		return anzahlBeine;
	}
	public Boolean getDichtesFell() {
		return dichtesFell;
	}
	public void getAllData() {
		System.out.println("Name: " + getName());
		System.out.println("Habitat: " + getHabitat());
		System.out.println("Farbe: " + getFarbe());
		System.out.println("Nahrung: " + getNahrung());
		System.out.println("Anzahl von Beinen: " + getAnzahlBeine());
		if (dichtesFell) {
			System.out.println("Dieses Tier hat dichtes Fell.");
		} else {
			System.out.println("Dieses Tier hat kein dichtes Fell.");
		}
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public void setNahrung(String nahrung) {
		this.nahrung = nahrung;
	}
	public void setAnzahlBeine(int anzahlBeine) {
		this.anzahlBeine = anzahlBeine;
	}
	public void setDichtesFell(boolean dichtesFell) {
		this.dichtesFell = dichtesFell;
	}
}
