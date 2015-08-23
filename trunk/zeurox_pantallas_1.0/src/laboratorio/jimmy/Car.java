package laboratorio.jimmy;

public class Car {

	private String randomModel;
	private int randomYear;
	private String randomManufacturer;
	private String randomColor;
	
public Car(String randomModel, int randomYear, String randomManufacturer, String randomColor){
	this.randomColor=randomColor;
	this.randomYear=randomYear;
	this.randomManufacturer=randomManufacturer;
	this.randomColor=randomColor;
}

public String getRandomModel() {
	return randomModel;
}

public void setRandomModel(String randomModel) {
	this.randomModel = randomModel;
}

public int getRandomYear() {
	return randomYear;
}

public void setRandomYear(int randomYear) {
	this.randomYear = randomYear;
}

public String getRandomManufacturer() {
	return randomManufacturer;
}

public void setRandomManufacturer(String randomManufacturer) {
	this.randomManufacturer = randomManufacturer;
}

public String getRandomColor() {
	return randomColor;
}

public void setRandomColor(String randomColor) {
	this.randomColor = randomColor;
}	

}
