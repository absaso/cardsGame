package asi.game.cartes.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
public class User  {
	
	private int id;
	private double money;
	private String name;
	private String mail;
	private String mdp;
	
	
	public User(int id, String name, double money, String mail, String mdp) {
		this.id = id;
		this.name = name;
		this.money = money;
		this.mail = mail;
		this.mdp = mdp;
		
	}
	
	public User() {
		super();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	
	
	
}
