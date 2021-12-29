package com.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class CustDao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
//	public void createTable()
//	{
//		String sql = "create table cust12(id int, name varchar(50), city varchar(50))";
//		
//		jdbcTemplate.update(sql);
//	}
	
	public int save(Customer obj)
	{
		String sql = "insert into cust11 values("+obj.getId()+", '"+obj.getName()+"', '"+obj.getEmail()+"')";
		
		return jdbcTemplate.update(sql);
	}
	
//	public int update(Customer obj)
//	{
//		String sql = "update cust11 set name = '"+obj.getName()+"', email = '"+obj.getEmail()+"' where id = "+obj.getId()+"";
//		
//		return jdbcTemplate.update(sql);
//	}
	
//	public int delete(Customer obj)
//	{
//		String sql = "delete from cust11 where id = "+obj.getId()+" ";
//		
//		return jdbcTemplate.update(sql);
//	}
	
//	public List<Customer> listCustomers()
//	{
//		return jdbcTemplate.query("select * from cust11", new ResultSetExtractor<List<Customer>>() {
//			
//			public List<Customer> extractData(ResultSet rs) throws SQLException, DataAccessException 
//			{
//				List<Customer> list = new ArrayList<Customer>();
//				
//				while(rs.next())
//				{
//					Customer cst = new Customer();
//					
//					cst.setId(rs.getInt(1));
//					cst.setName(rs.getString(2));
//					cst.setEmail(rs.getString(3));
//					
//					list.add(cst);
//				}
//				
//				return list;
//			}
//		});
//	}

}
