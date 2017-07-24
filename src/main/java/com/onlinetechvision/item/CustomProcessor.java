package com.onlinetechvision.item;

import com.onlinetechvision.model.CityDo;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component("customProcessor")
public class CustomProcessor implements ItemProcessor<CityDo, CityDo> {
	
	

	public CityDo process(CityDo city) throws Exception {
		
		

		if (city.getDistrict().equals("Kerala")) {
			city.setCountryCode("III");
			city.setDate(new Date());

		}

		// TODO Auto-generated method stub
		return city;
	}

}
