package asi.game.cartes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asi.game.cartes.model.Card;
import asi.game.cartes.model.User;

@Service
public class TransacService {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CardService cardService;

	//Le joeur peut achète sa carte
	public void buyCard(User u, Card card) {
		double usrmoney = u.getMoney();
		double cardprice = card.getPrice();
		//on réalise la transaction
		double achat = usrmoney - cardprice;
		
		//on met à jour la somme d'argent restante du joueur
		u.setMoney(achat);
		
		
	}

	public void SellCard(User u, Card card) {
		double usrmoney = u.getMoney();
		double cardprice = card.getPrice();
		//on réalise la transaction
		double vente = usrmoney + cardprice;
		
		//on met à jour la somme d'argent du joueur
		u.setMoney(vente);	
		
	}

}
