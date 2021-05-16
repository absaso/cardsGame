package asi.game.cartes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asi.game.cartes.model.User;


@Service
public class AuthService {
	
	@Autowired
	private UserService userService;
	
	public void login (String name,String mdp) {
		User user = userService.getUser(name,mdp);
		int id = user.getId();
	}
}

