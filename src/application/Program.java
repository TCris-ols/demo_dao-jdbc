package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		/*
		 * System.out.println("====   TEST 1: seller FindById  ====");
		 * 
		 * System.out.print("Localizar o vendedor Id: "); int vendId = sc.nextInt();
		 * Seller seller = sellerDao.findById(vendId); System.out.println(seller);
		 * 
		 * System.out.println("\n====   TEST 2: seller FindByDepartment  ====");
		 * System.out.print("Localizar vendedores do departamento id: "); int deptId =
		 * sc.nextInt();
		 * 
		 * Department department = new Department(deptId,null); List<Seller> list =
		 * sellerDao.findById(department);
		 * 
		 * for(Seller obj : list) { System.out.println(obj); }
		 * 
		 * System.out.println("\n====   TEST 3: seller FindAll  ====");
		 * System.out.print("Localizar vendedores ");
		 * 
		 * 
		 * List<Seller> list2 = sellerDao.findAll();
		 * 
		 * for(Seller obj2 : list2) { System.out.println(obj2); }
		 */
		System.out.println("\n====   TEST 4: seller insert  ====");
		
		System.out.print("Informe o nome do novo vendedor: ");
		String vendName = sc.nextLine();
		System.out.print("Informe o email do novo vendedor: ");
		String vendEmail = sc.next();
		System.out.print("Informe a data de nascimento do novo vendedor: ");
		Date vendBirthDate = sdf.parse(sc.next());
		System.out.print("Informe o Salário do novo vendedor: ");
		Double vendBSalary = sc.nextDouble();
		System.out.print("Informe o departamento do novo vendedor: ");
		int deptid = sc.nextInt();
		
		Department department = new Department(deptid,null);
		
		Seller newSeller = new Seller(null,vendName,vendEmail,vendBirthDate,vendBSalary,department);
		sellerDao.insertSeller(newSeller);
		System.out.println("Inserted! New id: "+newSeller.getId());
		
		Seller seller = sellerDao.findById(newSeller.getId());
		System.out.println(seller);
	}

}
