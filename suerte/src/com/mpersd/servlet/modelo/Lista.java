package com.mpersd.servlet.modelo;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	private List<String> listaDeNombres;
	
	public Lista() {
		listaDeNombres = new ArrayList<>();
		listaDeNombres.add("Juan");
		listaDeNombres.add("Maria");
		listaDeNombres.add("Alberto");
		listaDeNombres.add("Lucia");
	}

	public List<String> getListaDeNombres() {
		return listaDeNombres;
	}

	public void setListaDeNombres(List<String> listaDeNombres) {
		this.listaDeNombres = listaDeNombres;
	}

}
