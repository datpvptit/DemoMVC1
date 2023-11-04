package TicketShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TicketShop.Dao.ProductsDAO;
import TicketShop.Entity.Products;


@Service
public class HomeServiceImpl implements IHomeService {
	
	@Autowired
	private ProductsDAO productsDAO;

	public List<Products> GetDataHotProducts() {
		return productsDAO.GetDataHotProducts();
	}

	public List<Products> GetDataProducts() {
		// TODO Auto-generated method stub
		return productsDAO.GetDataProducts();
	}

	

}
