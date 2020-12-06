package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("====   TEST 1: seller FindById  ====");
		
		System.out.print("Localizar o vendedor Id: ");
		int vendId = sc.nextInt();
		Seller seller = sellerDao.findById(vendId);
		System.out.println(seller);

	}

}
