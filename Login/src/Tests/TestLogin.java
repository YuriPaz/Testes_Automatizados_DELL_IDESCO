package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Models.Login;

public class TestLogin {
	
	Login acesso = new Login();
	
	@Test	
	public void deveriaRealizarLogin () throws Exception{
		String login = "DaPAZ";
		String senha = "DellCursos2021";
		
		String acessar = acesso.acessarSistema(login, senha);
		
		assertEquals("Sucesso", acessar);
	}
	
	@Test	
	public void deveriaInformarFalha_EmBranco () throws Exception{
		String login = "";
		String senha = "";
		
		String acessar = acesso.acessarSistema(login, senha);
		
		assertEquals("Valores não podem ficar em branco", acessar);
	}
	
	
	@Test	
	public void deveriaInformarFalha_Incorreto() throws Exception{
		String login = "dapaz";
		String senha = "DellCursos2021";
		
		String acessar = acesso.acessarSistema(login, senha);
		
		assertEquals("Login ou senha inválidos! Tente novamente", acessar);
	}
	
	

}
