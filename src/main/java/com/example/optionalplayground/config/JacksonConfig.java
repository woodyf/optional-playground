package com.example.optionalplayground.config;

import java.util.Optional;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Configuration
public class JacksonConfig {

//	@Bean
//	public IgnoreOptionalCustomizer ignoreOptionalCustomizer() {
//		return new IgnoreOptionalCustomizer();
//	}

	static final class IgnoreOptionalCustomizer implements Jackson2ObjectMapperBuilderCustomizer, Ordered {

		@Override
		public int getOrder() {
			return 1;
		}

		@Override
		public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
			jacksonObjectMapperBuilder.mixIn(Optional.class, OptionalMixin.class);
		}

	}

	@JsonIgnoreType
	interface OptionalMixin {
	}
}
