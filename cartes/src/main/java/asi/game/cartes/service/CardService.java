package asi.game.cartes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asi.game.cartes.repository.CardRepository;

@Service
public class CardService {
	
	@Autowired
	private CardRepository cardRepository;
	private UserService userService;
	
}
