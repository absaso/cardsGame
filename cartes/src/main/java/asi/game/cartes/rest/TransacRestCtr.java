package asi.game.cartes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import asi.game.cartes.service.TransacService;

@RestController
public class TransacRestCtr {
	
	@Autowired
	private TransacService transacService;
}
