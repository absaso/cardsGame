package asi.game.cartes.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import asi.game.cartes.model.User;
import asi.game.cartes.service.UserService;

@RestController
public class UserRestCtr {

	@Autowired
	UserService userService;
	
	//CrÃ©ation d'un utilisateur
	@RequestMapping(method=RequestMethod.POST, value="/newuser")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	//Affichage d'utilisateur par leurs nom 
	@RequestMapping("/users/{name}") 
	public User getUser(@PathVariable String name) {
		User u = userService.getUser(String.valueOf(name));
		return u;
	}
		
	}
	
	/*
	public List<User> getAllUsers() {
		  return userService.getUsers();
		  }
    */

