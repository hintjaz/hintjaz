package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class ThirdTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� �������� ������� � ������� Enter:");
		double radius = sc.nextDouble();
		double c = 2 * Math.PI * radius;
		System.out.println("����� ����������: " + c );
		sc.close();

	}

}
