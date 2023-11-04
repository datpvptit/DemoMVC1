package TicketShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import TicketShop.Entity.MapperProducts;
import TicketShop.Entity.Products;

@Repository
public class ProductsDAO {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<Products> GetDataHotProducts(){
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM products WHERE TYPE = 'hot' ";
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}
	public List<Products> GetDataProducts(){
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM products WHERE TYPE = 'normal' ";
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}
}
