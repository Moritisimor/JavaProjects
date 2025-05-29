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
