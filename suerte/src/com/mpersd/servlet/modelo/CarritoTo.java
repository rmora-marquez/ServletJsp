package com.mpersd.servlet.modelo;

import java.util.ArrayList;
import java.util.List;

public class CarritoTo {
	private double total;
	private List<ArticuloTo> listaDeArticulos = new ArrayList<>();
	
	public CarritoTo() {	
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<ArticuloTo> getListaDeArticulos() {
		return listaDeArticulos;
	}

	public void setListaDeArticulos(List<ArticuloTo> listaDeArticulos) {
		this.listaDeArticulos = listaDeArticulos;
	}
}
