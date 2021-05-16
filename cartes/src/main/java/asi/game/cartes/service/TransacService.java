package asi.game.cartes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacService {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CardService cardService;

	public void buyCard(String name, int idcard) {
		// TODO Auto-generated method stub
		
	}

}
