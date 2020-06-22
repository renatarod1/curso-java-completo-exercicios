package entities;

public class PessoaFisica extends Pessoa {
	public Double gastosComSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}
	
	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public Double taxesToPay() {		
		if (getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - getGastosComSaude() * 0.5;
		} else {
			return getRendaAnual() * 0.25 - getGastosComSaude() * 0.5;
		}		
	}
}
