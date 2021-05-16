package asi.game.cartes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import asi.game.cartes.service.CardService;

@RestController
public class CardRestCtr {
	
	@Autowired
	private CardService cardService;
}
