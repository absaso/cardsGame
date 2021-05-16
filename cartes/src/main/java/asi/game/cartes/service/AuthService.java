package asi.game.cartes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asi.game.cartes.model.User;


@Service
public class AuthService {
	
	@Autowired
	private UserService userService;
	
	public void login (String name) {
		User user = userService.getUser(name);
		int id = user.getId();
	}
}

