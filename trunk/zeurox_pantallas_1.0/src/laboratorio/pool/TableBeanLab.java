package laboratorio.pool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="tableBeanLab")
public class TableBeanLab implements Serializable{
	
	//private final static LoggerLab logger = LoggerLab.getLogger(TableBeanLab.class.getName());
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final static String[] colors;
	
	private final static String[] manufacturers;
	
	public List<String> telefono;
	
	static {
		colors = new String[10];
		colors[0] = "Black";
		colors[1] = "White";
		colors[2] = "Green";
		colors[3] = "Red";
		colors[4] = "Blue";
		colors[5] = "Orange";
		colors[6] = "Silver";
		colors[7] = "Yellow";
		colors[8] = "Brown";
		colors[9] = "Maroon";
		
		manufacturers = new String[10];
		manufacturers[0] = "Mercedes";
		manufacturers[1] = "BMW";
		manufacturers[2] = "Volvo";
		manufacturers[3] = "Audi";
		manufacturers[4] = "Renault";
		manufacturers[5] = "Opel";
		manufacturers[6] = "Volkswagen";
		manufacturers[7] = "Chrysler";
		manufacturers[8] = "Ferrari";
		manufacturers[9] = "Ford";
	}
	
	private List<CarLab> carsSmall;

	public TableBeanLab() {
		carsSmall = new ArrayList<CarLab>();
		
		populateRandomCars(carsSmall, 5);
		
		
		
	}

	public List<String> getTelefono() {
		return telefono;
	}

	public void setTelefono(List<String> telefono) {
		this.telefono = telefono;
	}

	private void populateRandomCars(List<CarLab> list, int size) {
		for(int i = 0 ; i < size ; i++)
			list.add(new CarLab(getRandomModel(), getRandomYear(), getRandomManufacturer(), getRandomColor()));
	}
	
	public List<CarLab> getCarsSmall() {
		return carsSmall;
	}

	private int getRandomYear() {
		return (int) (Math.random() * 50 + 1960);
	}
	
	private String getRandomColor() {
		return colors[(int) (Math.random() * 10)];
	}
	
	private String getRandomManufacturer() {
		return manufacturers[(int) (Math.random() * 10)];
	}
	
	private String getRandomModel() {
		return UUID.randomUUID().toString().substring(0, 8);
	}

	public static String[] getColors() {
		return colors;
	}

	public static String[] getManufacturers() {
		return manufacturers;
	}
	
	
}

