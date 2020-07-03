package com.pokemon.response;

import java.io.Serializable;

public class Response implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2807695531027983179L;
	private int codigo;
	private String mensaje;
	
	public Response() {
		
	}
	
	public Response(int cod,String msg) {
		this.codigo=cod;
		this.mensaje=msg;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
