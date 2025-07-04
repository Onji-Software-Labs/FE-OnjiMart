package com.sattva.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
@Configuration
public class SwaggerConfig {



	String schemeName = "bearerAuth";
	String bearerFormat = "JWT";
	String scheme = "bearer";
	@Bean
	public OpenAPI productOpenAPI() {
	        return new OpenAPI()
	                  .addSecurityItem(new SecurityRequirement()
	.addList(schemeName)).components(new Components()
	                                  .addSecuritySchemes(
	                                        schemeName, new SecurityScheme()
	                                        .name(schemeName)
	                                        .type(SecurityScheme.Type.HTTP)
	                                        .bearerFormat(bearerFormat)
	                                        .in(SecurityScheme.In.HEADER)
	                                        .scheme(scheme)
	                                  )
	                  )
	                  .info(new Info()
	                              .title("Snoodify-product-service")
	                              .description("Product Service")
	                              .version("1.0")
	                  );
	        }

}
