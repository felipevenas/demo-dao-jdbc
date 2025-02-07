package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao(); 
		
		/*
		 * Não precisamos instanciar diretamente no código, 
		 * apenas é preciso chamar o método de criação em DaoFactory.
		 */
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		
	}
}
