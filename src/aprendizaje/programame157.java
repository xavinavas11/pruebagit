package aprendizaje;

import java.util.Scanner;

public class programame157 {

	public static void main(String[] args) {
		int casos;
		int dia;
		int mes;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce numero de casos");
		casos= sc.nextInt();
		
		
		for (int i = 0; i < casos; i++) {
			dia=sc.nextInt();
			mes=sc.nextInt();
			int total = 365 -dia;
			if (mes==1) {
				if (dia >0 && dia<31) 
					System.out.println(total);
				}
				
			if (mes == 2) {
				if (dia  > 0 && dia < 28) 
					System.out.println(total-31);
					
				}
			if (mes==3) {
				if (dia > 0 && dia< 31) 
					System.out.println(total-59);
					
				}
				
			
			if (mes==4) {
				if (dia >0 && dia<30) 
					System.out.println(total-90);
				}
				
			if (mes == 5) {
				if (dia  > 0 && dia < 31) 
					System.out.println(total-120);
					
				}
			if (mes==6) {
				if (dia > 0 && dia< 30) 
					System.out.println(total-151);
					
				}
			
			if (mes==7) {
				if (dia >0 && dia<31) 
					System.out.println(total-181);
				}
				
			if (mes == 8) {
				if (dia  > 0 && dia < 31) 
					System.out.println(total-212);
					
				}
			if (mes==9) {
				if (dia > 0 && dia< 30) 
					System.out.println(total-243);
					
				}
			if (mes==10) {
				if (dia >0 && dia<31) 
					System.out.println(total-273);
				}
				
			if (mes == 11) {
				if (dia  > 0 && dia < 30) 
					System.out.println(total-304);
					
				}
			if (mes==12) {
				if (dia > 0 && dia< 31) 
					System.out.println(total-334);
					
				}
			}	
			}
				
			}
		
		

	


