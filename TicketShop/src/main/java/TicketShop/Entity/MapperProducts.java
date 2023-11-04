package TicketShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProducts implements RowMapper<Products>{

	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		Products products = new Products();
		products.setId(rs.getInt("id"));
		products.setName(rs.getString("name"));
		products.setImg(rs.getString("img"));
		products.setCaption(rs.getString("caption"));
		products.setTime(rs.getString("time"));
		products.setLocation(rs.getString("location"));
		products.setNumOfSeat(rs.getInt("numOfSeat"));
		products.setNumOfSeatLeft(rs.getInt("numOfSeatLeft"));
		products.setPrice(rs.getInt("price"));
		return products;
	}

}
