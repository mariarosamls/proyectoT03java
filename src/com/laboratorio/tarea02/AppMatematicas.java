package com.laboratorio.tarea02;

public class AppMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matematicas cal1 = new Matematicas (6,18);
		
		System.out.println(cal1.toString());
		System.out.println(cal1.Mayor());
		System.out.println(cal1.Menor());
		System.out.println(cal1.Espar());
		System.out.println(cal1.Impar());
		System.out.println(cal1.Promedio());
	}

}
