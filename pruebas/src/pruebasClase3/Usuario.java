package pruebasClase3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {
		
	private String login;
	private String password;
	private Date creationDate;
	
	private static final SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	public Usuario() {
	
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public String getCreationDateISO() {
		return df.format(creationDate);
	}
	
	public void setCreationDateISO(String creationDate) throws ParseException {
		this.creationDate = df.parse(creationDate);
	}
}
