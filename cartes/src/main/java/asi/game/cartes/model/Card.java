package asi.game.cartes.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
public class Card {
	
	private int price;
	private int valueCard;
	private int id;
	
	
	
	public Card(int price, int valueCard, int id) {
		super();
		this.price = price;
		this.valueCard = valueCard;
		this.id = id;
	}
	
	public int getPrice() {
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