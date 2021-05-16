package asi.game.cartes.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import asi.game.cartes.model.User;
import asi.game.cartes.service.UserService;

@RestController
public class UserRestCtr {

	@Autowired
	private UserService userService;
	
	//Création d'un utilisateur
	@RequestMapping(method=RequestMethod.POST, value="/newuser")
	public void createUser(@RequestBody User user) {
		userService.newUser(user);
	}
	
	//Affichage des comptes d'utilisateurs
	@RequestMapping("/users") 
	public List<User> getAllUsers() {
		  return userService.getUsers();
		  }
}
