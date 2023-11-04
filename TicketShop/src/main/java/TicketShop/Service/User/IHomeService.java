package TicketShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TicketShop.Entity.Products;

@Service
public interface IHomeService {
	@Autowired
	public List<Products> GetDataProducts();
	@Autowired
	public List<Products> GetDataHotProducts();
}
