package com.onlinetechvision.item;

import java.util.List;

import com.onlinetechvision.model.CityDo;
import com.onlinetechvision.user.service.IUserService;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("customWriter")
@Scope(value = "step")
public class CustomWriter implements ItemWriter<CityDo> {

	@Autowired
	private IUserService userService;
	
	@Value("#{jobParameters['param1']}")
	private String param1;
	
	public void write(List<? extends CityDo> items) throws Exception {

		//System.out.println("writer..." + items.size());
		
		
		for (CityDo city : items) {
			userService.addCity(city);
			
		}
		
		//System.out.println(param1);
		

		
	}


	

}