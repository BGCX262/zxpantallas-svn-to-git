package laboratorio.pool;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="telefono")
public class Telefono {
	
	public String tipo;
	public String numero;
	public String anexo;

	public List<Telefono> listTelefono;
	public List<String> listString;
	
	public Telefono() {
		
	}
	
	public List<String> getListString() {
		listString = new ArrayList<String>();
		listString.add("hola");
		listString.add("hola");
		listString.add("hola");
		listString.add("hola");
		
		return listString;
	}
	public void setListString(List<String> listString) {
		this.listString = listString;
	}
	public List<Telefono> getListTelefono() {
		listTelefono = new ArrayList<Telefono>();
		try {
			
			Telefono obj = new Telefono();
			obj.setTipo("Fijo");
			obj.setNumero("4302257");
			obj.setAnexo("123");
			listTelefono.add(obj);
			
			Telefono obj2 = new Telefono();
			obj2.setTipo("cel");
			obj2.setNumero("4302257");
			obj2.setAnexo("125");
			listTelefono.add(obj2);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listTelefono;
	}
	public void setListTelefono(List<Telefono> listTelefono) {
		this.listTelefono = listTelefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAnexo() {
		return anexo;
	}
	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}
	
	public static void main(String[] args){
		Telefono obj = new Telefono();
		System.out.println(obj.getListString());
			
		
		for(Telefono o: obj.getListTelefono()){
			System.out.println(o.getAnexo());	
		}
		
	}
	
}
