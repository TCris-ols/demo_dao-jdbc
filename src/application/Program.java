package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
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
		 */
		  
		/*
		 * System.out.println("\n====   TEST 3: seller FindAll  ====");
		 * System.out.print("Localizar vendedores ");
		 * 
		 * 
		 * List<Seller> list2 = sellerDao.findAll();
		 * 
		 * 
		 * for(Seller obj2 : list2) { System.out.println(obj2); }
		 */
		 
			
			  System.out.println("=====  Teste 1 - FindAll =====" );
			  
			  List<Department> depart = departmentDao.findAll();
			  
			  for(Department dep : depart) {System.out.println(dep);}
			 
		  
			/*
			 * System.out.println("\n====   TEST 4: seller insert  ====");
			 * 
			 * System.out.print("Informe o nome do novo vendedor: "); String vendName =
			 * sc.nextLine(); System.out.print("Informe o email do novo vendedor: "); String
			 * vendEmail = sc.next();
			 * System.out.print("Informe a data de nascimento do novo vendedor: "); Date
			 * vendBirthDate = sdf.parse(sc.next());
			 * System.out.print("Informe o Salário do novo vendedor: "); Double vendBSalary
			 * = sc.nextDouble();
			 * System.out.print("Informe o departamento do novo vendedor: "); int deptid =
			 * sc.nextInt();
			 * 
			 * Department department = new Department(deptid,null);
			 * 
			 * Seller newSeller = new
			 * Seller(null,vendName,vendEmail,vendBirthDate,vendBSalary,department);
			 * sellerDao.insertSeller(newSeller);
			 * System.out.println("Inserted! New id: "+newSeller.getId());
			 * 
			 * Seller seller = sellerDao.findById(newSeller.getId());
			 * System.out.println(seller);
			 */
		
		/*
		 * // System.out.println("\n====   TEST 5: seller update  ===="); // //
		 * System.out.print("Informe o Id do vendedor a ser atualizado: "); // int
		 * vendId = sc.nextInt(); // Seller seller = sellerDao.findById(vendId); //
		 * System.out.println(seller); // // System.out.println(); //
		 * System.out.println("Qual campo deseja alterar? \n" // + "Name \n" // +
		 * "Email \n" // + "BirthDate \n" // + "BaseSalary \n" // + "DepartmentId \n" //
		 * ); // // String campo = sc.next(); // // // Department department = new
		 * Department(); // // switch (campo){ // case "Name": //
		 * System.out.print("Altere o nome do vendedor: "); // sc.nextLine(); //
		 * seller.setName(sc.nextLine()); // break; // case "Email": //
		 * System.out.print("Altere o email do vendedor: "); //
		 * seller.setEmail(sc.next()); // break; // case "BirthDate": //
		 * System.out.print("Altere a data de nascimento do vendedor: "); //
		 * seller.setBirthDate(sdf.parse(sc.next())); // break; // case "BaseSalary": //
		 * System.out.print("Altere o Salário do vendedor: "); //
		 * seller.setBaseSalary(sc.nextDouble()); // break; // case "DepartmentId": //
		 * System.out.print("Altere o departamento do vendedor: "); // new
		 * Department(sc.nextInt(), null); // seller.setDepartment(department); //
		 * break; // default: // System.out.println("Valor inválido!"); // break; // }
		 */
		/*
		 * System.out.println("\n====   TEST 6: seller delete  ====");
		 * 
		 * System.out.print("Informe o Id do vendedor a ser atualizado: "); int vendId =
		 * sc.nextInt();
		 * 
		 * sellerDao.deleteById(vendId);
		 */
	}
	
}
