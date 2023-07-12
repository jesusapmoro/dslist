package com.jesusapmoro.dslist.projections;

public interface GameMinProjection {

	//colocar metodos GET referente a minha consulta
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
