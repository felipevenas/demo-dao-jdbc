package application;

import java.util.List;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao(); 
		
		/*
		 * Não precisamos instanciar diretamente no código, 
		 * apenas é preciso chamar o método de criação em DaoFactory.
		 */
		
		System.out.println("=== First Test: Seller findById ======");
		Seller seller = sellerDao.findById(7);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("=== Second Test: Seller findByDepartment ======");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("=== Third Test: Seller findAll ======");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
	}
}
