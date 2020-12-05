package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insertSeller();
	void updateSeller();
	void deleteById();
	Seller findById(Integer id);
	List<Seller> findAll();
	
}
