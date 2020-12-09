package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Programa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		//=================================================================
		
		  System.out.println("=====  Teste 1 - FindAll =====" );
		  
		  List<Department> depart = departmentDao.findAll();
		  
		  for(Department dep : depart) { System.out.println(dep); }
		  
		  //==================================================================
		  System.out.println(); System.out.println("=====  Teste 2 - FindById =====" );
		  System.out.print("Informe o Id do Departamento a ser localizado:"); int id =
		  sc.nextInt();
		  
		  Department dep = departmentDao.findById(id); System.out.println(dep);
		  
		  //===================================================================
		  
		  System.out.println("=====  Teste 3 - insert implementation =====" );
		  sc.nextLine(); System.out.print("Informe o novo departamento: "); String
		  newDep = sc.nextLine();
		  
		  Department department = new Department(null, newDep);
		  
		  departmentDao.insertDepartment(department);
		  
		  
		  //======================================================================
		  
		  System.out.println("=====  Teste 4 - update implementation =====" );
		  sc.nextLine();
		  System.out.print("Informe o id do departamento a ser alterado: "); id =
		  sc.nextInt(); sc.nextLine();
		  System.out.print("Informe o novo nome do departamento: "); String newName =
		  sc.nextLine();
		  
		  department = new Department(id, newName);
		  
		  departmentDao.updateDepartment(department);
		 
		
		//======================================================================
		
		System.out.println("=====  Teste 5 - delete implementation =====" );
		sc.nextLine();
		System.out.print("Informe o id do departamento a ser deletado: ");
		
		int id = sc.nextInt();
		
		departmentDao.deleteById(id);
		
		//=======================================================================
		sc.close();
	}

}
