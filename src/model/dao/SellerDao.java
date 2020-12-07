package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insertSeller(Seller obj);
	void updateSeller(Seller obj);
	void deleteById();
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findById(Department department);
	
}
