package reutilizable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="car")
public class Car {

	public String model;
	public String year;
	public String manufacturer;
	public String color;
	
	public Car(String randomModel, int randomYear, String randomManufacturer,
			String randomColor) {
		// TODO Auto-generated constructor stub
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
