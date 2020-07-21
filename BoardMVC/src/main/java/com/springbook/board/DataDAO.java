package com.springbook.board;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.zaxxer.hikari.HikariDataSource;

public class DataDAO {		
	private JdbcTemplate jt;

	public void setDataSource(HikariDataSource dataSource) {		
		this.jt = new JdbcTemplate(dataSource);
	}
	
	public void getData() {
		String sql = " SELECT * FROM t_board ";
		RowMapper rmi = new RowMapperImpl(); 
		jt.query(sql, rmi);
	}
}

class RowMapperImpl implements RowMapper {
	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {				
		while(rs.next()) {
			String title = rs.getNString("title");
			System.out.println("title : " + title);
		}				
		return null;
	}
}




