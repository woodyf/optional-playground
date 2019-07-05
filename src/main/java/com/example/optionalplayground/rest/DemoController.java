package com.example.optionalplayground.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/demo")
@Api(tags = "Demo")
public class DemoController {
	@Autowired
	private DemoService service;

	@GetMapping("/load")
	@ApiOperation("Jackson範例")
	public ResponseEntity<DemoDto> load() {
		final DemoDto loaded = service.load();
		return ResponseEntity.ok().body(loaded);
	}
}
