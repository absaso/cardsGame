package asi.game.cartes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import asi.game.cartes.service.AuthService;


@RestController
public class AuthRestCtr {
	
	@Autowired
	private AuthService authService;
	
		//Connexion d'un utilisateur 
		@RequestMapping("/connect/{name}/{surname}/{mdp}")
		public int logIn(@PathVariable String name, @PathVariable String surname, @PathVariable String mdp) {
			int id = authService.login(name,surname,mdp);
			return id;
		}
}
