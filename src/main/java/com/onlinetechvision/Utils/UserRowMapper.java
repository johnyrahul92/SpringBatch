package com.onlinetechvision.Utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.onlinetechvision.model.CityDo;
import org.springframework.jdbc.core.RowMapper;



public class UserRowMapper implements RowMapper<CityDo> {

	public CityDo mapRow(ResultSet rs, int rowNum) throws SQLException {

		CityDo city = new CityDo();

		city.setId(rs.getInt("ID"));
		city.setName(rs.getString("Name"));
		city.setCountryCode(rs.getString("CountryCode"));
		city.setDistrict(rs.getString("District"));
		city.setPopulation(rs.getString("Population"));		

		return city;
	}

}
