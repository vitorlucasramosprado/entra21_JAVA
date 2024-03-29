package model.entity;

public class PessoaFisica extends Pessoa {

	//Atributos
	private String cpf;
	private String dataNascimento;
	private double alturaEmMetros;
	private char sexo;

	
	//Construtores
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nomeDaPessoa, String cpf) {
		super(nomeDaPessoa);
		this.cpf = cpf;
	}
	
	public PessoaFisica(String cpf, String nome, String dataNascimento, double alturaEmMetros, char sexo) {
		super(nome);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.alturaEmMetros = alturaEmMetros;
		this.sexo = sexo;
	}
	
	
	@Override
	public boolean verificaAdimplencia() {
		double saldoTotal = 0;
		
		for (int i = 0; i < getContas().size(); i++) {
			saldoTotal += getContas().get(i).getSaldo();	
		}
		if (saldoTotal > -500) {
			 super.setAdimplente(true);
		}
		return super.isAdimplente();
		
	}

	public int calcularIdade(int anoAtual) {
		int idade = 0;
		
		//Assumir dd/MM/yyyy
		String anoNascimento = this.dataNascimento.substring(6);
		idade = anoAtual - Integer.valueOf(anoNascimento);
		
		return idade;
	}
	
	@Override
	public String getApelido() {
		return this.getNome() + "zinho(a)";
	}
	
	//Métodos getters e setters
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAlturaEmMetros() {
		return alturaEmMetros;
	}

	public void setAlturaEmMetros(double alturaEmMetros) {
		this.alturaEmMetros = alturaEmMetros;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}