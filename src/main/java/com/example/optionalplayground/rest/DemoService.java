package com.example.optionalplayground.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.glasnost.orika.MapperFactory;

@Service
public class DemoService {
	@Autowired
	private MapperFactory mapperFactory;

	public DemoDto load() {
		final DemoEntity demoEntity = new DemoEntity("myId", "myBalue");
		return mapperFactory.getMapperFacade().map(demoEntity, DemoDto.class);
	}

}
