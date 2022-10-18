import java.util.Scanner;
import java.util.*;

import java.lang.Math;

public class NewtonRaphson {
	
	public static void main(String[] args){
		int contador_exitos = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce el número de iteraciones: ");
		int n = s.nextInt();
		System.out.print("Introduce x0: ");
		double x0 = s.nextDouble();
		System.out.println();
		
		double xN = x0;
		double xN1 = 0;
		
		for(int i = p0; i < n; ++i){
			xN1 = xN - f(xN) / g(xN);
		
			System.out.println("Iteracion: " + i + " Aproximacion: " + xN1);
			
			xN = xN1;
		}
		System.out.println("Resultado: " + xN);
		
		s.close();
	}
	
	public static double f(double x){
		return Math.cos(x) - Math.pow(x, 3);
	}
	
	public static double g(double x){
		return -Math.sin(x) - 3*Math.pow(x, 2);
	}
}
