package com.laboratorio.tarea02;

public class Matematicas {
	int nro1;
	int nro2;
	
	public Matematicas(int nro1, int nro2) {
		super();
		this.nro1 = nro1;
		this.nro2 = nro2;
	}

	public int getNro1() {
		return nro1;
	}

	public void setNro1(int nro1) {
		this.nro1 = nro1;
	}

	public int getNro2() {
		return nro2;
	}

	public void setNro2(int nro2) {
		this.nro2 = nro2;
	}
	
	public String toString() {
		return "n1 : " + nro1 + " | n2 : " + nro2;
	}
	
	public int Mayor() {
		int m;
		if (nro1 > nro2) {
			m=nro1;
		}else {
			m=nro2;
		}
		return m;		
	}
	public int Menor() {
		int n;
		if (nro1 < nro2) {
			n=nro1;
		}else {
			n=nro2;
		}
		return n;
	}
	public int Espar() {
		int e;
		if (nro1 % nro2==0) {
			e=nro1;
		}else {
			e=nro2;
		}
		return e;
	}
	public int Impar() {
		int i;
		if (nro2 % nro1==0) {
			i=nro1;
		}else {
			i=nro2;
		}
		return i;
	}
	public float Promedio() {
		return (nro1+nro2)/2;
		
	}
	
	
	
}
