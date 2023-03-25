package com.klinnovations;

public class Car {
	IEngine eng;

	public Car(IEngine eng) {
		this.eng = eng;

	}

	public void drive() {
     int status = eng.start();
     if(status>=1) {
    	 System.out.println("Jurney Stared....");
     }
     else {
    	 System.out.println("Engine Troubled");
     }
	}
}
