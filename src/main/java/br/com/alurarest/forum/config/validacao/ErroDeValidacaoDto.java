package br.com.alurarest.forum.config.validacao;

public class ErroDeValidacaoDto {

	private String campo;
	private String mensagem;

	public ErroDeValidacaoDto(String campo, String mensagem) {
		this.campo = campo;
		this.mensagem = mensagem;
	}

	
	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
