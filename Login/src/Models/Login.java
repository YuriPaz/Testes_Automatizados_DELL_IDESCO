package Models;

public class Login {
	
	public String acessarSistema(String login, String senha) {
		if(login == "DaPAZ" && senha == "DellCursos2021") {
			return "Sucesso";
		}if (login == "" && senha == "") {
			return "Valores não podem ficar em branco";
		}if (login != "DaPAZ" || senha != "DellCursos2021") {
			return "Login ou senha inválidos! Tente novamente";
		}else {
			return "Erro no Login";
		}
	}

}
