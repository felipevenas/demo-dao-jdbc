package application;

import java.util.Date;

import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {

		Seller seller = new Seller(23, "Felipe", "felipe@gmail.com", new Date(), 3000.00, new Department(1, "Books"));
		System.out.println(seller);
	}

}
