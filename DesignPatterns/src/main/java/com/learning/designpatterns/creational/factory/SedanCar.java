package com.learning.designpatterns.creational.factory;

public class SedanCar extends Car {

	public SedanCar() {
		super(CarType.SEDAN);
		// TODO Auto-generated constructor stub
		construct();
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		System.out.println("Sedan Car constructed ...");
	}

}
