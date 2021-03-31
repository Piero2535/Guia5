package com.senati.eti.model;

public class Calculadora2 {
	
	// Atributos
	private float numero1;
	private float numero2;
	
	// Getters and Setters
	public float getNumero1() {
		return numero1;
	}
	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}
	public float getNumero2() {
		return numero2;
	}
	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}
	
	
	
     //Metodos Conductores
	public Calculadora2() {
		
	}
	public Calculadora2(float numero1, float numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	 public float Operar(int tipo) {
		  float rpta = 0;
		  
		  // 9 -> Mayor, 10 -> Menor
		  switch (tipo) {
		  case 1:
			  rpta = this.numero1 + this.numero2;
			  break;
		  case 2:
			  rpta = this.numero1 - this.numero2;
			  break;
		  
	      case 3:
	    	  rpta = this.numero1 * this.numero2;
		  break;
		  
	      case 4:
	    	  float r = 0;
	 		 
	 		 if (this.numero2 != 0)
	 			 rpta = this.numero1 / this.numero2;
		  break;
		  
	      case 5:
	    	  float r = 0;
	 		 
	 		 if (this.numero2 != 0)
	 			 rpta = this.numero1 % this.numero2;
		  break;
		  
	      case 6:
	    	  rpta = this.numero1 * this.numero2;
		  break;
		  
	      case 7:
	    	  rpta = this.numero1 * this.numero2;
		  break;
	 
		  }
		 return rpta; 
	 }


	 
}















