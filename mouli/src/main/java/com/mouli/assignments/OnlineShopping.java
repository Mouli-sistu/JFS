package com.mouli.assignments;

public class OnlineShopping {
	int productId;
	String productName;
	String Brand;
	double price;
	int warranty;
	String region;
	
	OnlineShopping(int productId,String productName,String Brand,double price,int warranty,String region){
		this.productId=productId;
		this.productName=productName;
		this.Brand=Brand;
		this.price=price;
		this.warranty=warranty;
		this.region=region;
	}
	OnlineShopping(OnlineShopping o,String region){
		this.productId=o.productId;
		this.productName=o.productName;
		this.Brand=o.Brand;
		this.price=o.price;
		this.warranty=o.warranty;
		this.region=region;
	}
	void display() {
		System.out.println("SmartPhone Id:"+productId);
		System.out.println("SmartPhone Name:"+productName);
		System.out.println("SmartPhone Brand:"+Brand);
		System.out.println("SmartPhone Price:"+price);
		System.out.println("SmartPhone Warranty:"+warranty+"yrs");
		System.out.println("Region:"+region);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("***************Online Shopping Platform***************");
		OnlineShopping in=new OnlineShopping(102,"VivoT1Pro","VIVO",24999.00,2,"India");
		in.display();
		System.out.println("---------------------------------------------------------");
		OnlineShopping us=new OnlineShopping(in,"USA");
		us.display();
		System.out.println("---------------------------------------------------------");

	}

}
