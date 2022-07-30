/*
 * package br.com.alurarest.forum.config.swagger;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.web.servlet.config.annotation.EnableWebMvc;
 * 
 * import br.com.alurarest.forum.modelo.Usuario; import
 * springfox.documentation.builders.PathSelectors; import
 * springfox.documentation.builders.RequestHandlerSelectors; import
 * springfox.documentation.spi.DocumentationType; import
 * springfox.documentation.spring.web.plugins.Docket; import
 * springfox.documentation.swagger2.annotations.EnableSwagger2;
 * 
 * @EnableWebMvc
 * 
 * @Configuration public class SwaggerConfigurations {
 * 
 * @Bean public Docket forumApi() { return new
 * Docket(DocumentationType.SWAGGER_2) .select()
 * .apis(RequestHandlerSelectors.basePackage("br.com.alurarest.forum"))
 * .paths(PathSelectors.ant("/**")) .build()
 * .ignoredParameterTypes(Usuario.class); } }
 */