package autentificacao;

public class Login {
	String nome;
	//Um construtor nulo significa que a execução do objeto não depende de um argumento;
	public Login() {
		
	}
	public Login(String nome){
		this.nome = nome;
	}
	//Métodos
	public void loginNull() {
		if(this.nome == null) {
			System.out.println("Campo nulo");
		}
		if(this.nome == "") {
			System.out.println("Nulo");
		}
	}
}
