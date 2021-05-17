package asi.game.cartes.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
public class Card implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.TABLE)
	private int id;
	private double price;
	private int valueCard;
	
	
	
	
	public Card(int id, double price, int valueCard) {
		super();
		this.id = id;
		this.price = price;
		this.valueCard = valueCard;
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getValueCard() {
		return valueCard;
	}
	
	public void setValueCard(int valueCard) {
		this.valueCard = valueCard;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
