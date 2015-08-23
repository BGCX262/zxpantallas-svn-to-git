package reutilizable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;


@ManagedBean(name="table")
public class Table {

	public String tipo;
	public String numero;
	public String anexo;
	public List<Bean> listBean;
	
	public Table() {
		
	}
	
	public List<Bean> getListBean() {
		listBean = new ArrayList<Bean>();
		try {
			
			Bean obj = new Bean();
			obj.setTipo("Fijo");
			obj.setNumero("5236047");
			obj.setAnexo("123");			
			listBean.add(obj);
			
			Bean obj2 = new Bean();
			obj2.setTipo("Claro");
			obj2.setNumero("980474236");
			obj2.setAnexo("--");
			listBean.add(obj2);
			
			Bean obj3 = new Bean();
			obj3.setTipo("Movistar");
			obj3.setNumero("9804245485");
			obj3.setAnexo("--");
			listBean.add(obj3);
			
			Bean obj4 = new Bean();
			obj4.setTipo("Nextel");
			obj4.setNumero("9804557855");
			obj4.setAnexo("--");
			listBean.add(obj4);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listBean;
	}
	public void setListBean(List<Bean> listBean) {
		this.listBean = listBean;
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
		
}
