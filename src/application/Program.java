package application;

import java.util.Date;
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
		
		System.out.println();
		
		System.out.println("=== Quarter Test: Seller insert ======");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println();
		
		System.out.println("=== Five Test: Seller update ======");
		seller = sellerDao.findById(1);
		seller.setName("Marta Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed!");
	}
}
