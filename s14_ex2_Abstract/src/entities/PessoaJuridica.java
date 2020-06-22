package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public Double taxesToPay() {
		Double taxes;
		if (numFuncionarios > 10) {
			taxes = getRendaAnual() * 0.14;
		} else {
			taxes = getRendaAnual() * 0.16;
		}
		return taxes;
	}
}
