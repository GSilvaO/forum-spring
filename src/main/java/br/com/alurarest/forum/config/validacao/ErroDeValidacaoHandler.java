package br.com.alurarest.forum.config.validacao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// Anotação que irá "capturar" a requisição para fazer o tratamento
// o spring irá chamar automaticamente esta classe nos controllers
@RestControllerAdvice
public class ErroDeValidacaoHandler {
	
	
	@Autowired
	private MessageSource messageSource; // Classe que auxilia na internacionalização de mensagens

	// Retorna um erro de bad request para o usuário pois, apesar da exceção ter sido tratada
	// ainda é um erro de validação das informações do formulário
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	// Informa ao interceptor que uma exception do tipo MethodArgumentNotValidException(erro na validação)
	// será tratada
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ErroDeValidacaoDto> handle(MethodArgumentNotValidException exception) {
		List<ErroDeValidacaoDto> dto = new ArrayList<>();
		
		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		fieldErrors.forEach(e -> {
			String mensagem = messageSource.getMessage(e, LocaleContextHolder.getLocale());
			ErroDeValidacaoDto erro = new ErroDeValidacaoDto(e.getField(), mensagem);
			dto.add(erro);
		});
		
		return dto;
	}
}
