package asi.game.cartes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import asi.game.cartes.service.AuthService;


@RestController
public class AuthRestCtr {
	
	@Autowired
	private AuthService authService;
}
