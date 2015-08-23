package laboratorio.pool;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="tablaGeneral")
public class TablaGeneral {
	
	public String tipo;
	public String numero;
	public String anexo;
	public List<Telefono> listTelefono;
	
	public Telefono telefono;
	
	public TablaGeneral() {
		
		telefono = new Telefono(); 
	}
	
	
	public Telefono getTelefono() {
		
		
		telefono.setTipo("Fijo");
		telefono.setNumero("4302257");
		telefono.setAnexo("123");
		
		telefono.setAnexo("125");
		
		return telefono;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
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
			obj2.setAnexo("123");
			listTelefono.add(obj2);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listTelefono;
	}
	public void setListTelefono(List<Telefono> listTelefono) {
		this.listTelefono = listTelefono;
	}
	
	public static void main(String[] args){
		
		TablaGeneral tab = new TablaGeneral();
		
		
		System.out.println(tab.getTelefono().getAnexo());
		for(Telefono obj: tab.getListTelefono()){
			System.out.println(obj.getTipo());
		}
	}
	
	
	
}
 