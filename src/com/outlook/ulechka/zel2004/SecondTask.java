package com.outlook.ulechka.zel2004;

import java.util.Scanner;

public class SecondTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("������� ����� ������ ������� ������������:");
double a = sc.nextDouble();


System.out.println("������� ����� ������ ������� ������������:");
double b = sc.nextDouble();


System.out.println("������� ����� ������� ������� ������������:");
double c = sc.nextDouble();

double per = (a + b + c) / 2;
double square = Math.sqrt(per * (per - a) * (per - b) * (per  - c));

System.out.println("������� ����� ������������ " + square + " ������ ����������");

	}

}
