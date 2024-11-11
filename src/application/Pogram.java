package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Pogram {

	public static void main(String[] args) {

		Department dp = new Department(1, "book");
		
		System.out.println(dp);
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		
	}

}
