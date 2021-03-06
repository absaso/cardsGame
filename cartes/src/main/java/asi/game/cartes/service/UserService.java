package asi.game.cartes.service;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asi.game.cartes.model.User;
import asi.game.cartes.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CardService cardService;
	
	@Autowired
	private TransacService transacService;
	
	/*
	//En attendant d'avoir une BDD on met les utilisateurs dans une liste
	private List<User> users = new ArrayList <>(Arrays.asList(
			  new User(01, "player1", 12.50, "mymail@hotmail.fr", "private123")
			  ));
	*/

	
	
	//Ajout d'un nouvel utilisateur dans la BDD
	public void addUser (User user) {
		User createdUser = userRepository.save(user);
		//System.out.println(createdUser);
		System.out.println("User created");
	}

	//Récupération d'un utilisateur spécifique
	public User getUser(Integer iduser) {
		Optional<User> userOpt = userRepository.findById(iduser);
		if (userOpt.isPresent()) {
			return userOpt.get();
		}else {
			return null;
		}

	}
	
	//maj du porte-monnaie du joueur dans la bdd
	public void updateMoney(User u) {
		userRepository.save(u);
		
	}

	public User getConnected(String name, String mdp) {
		Optional<User> userOpt = userRepository.findByNameAndMdp(name,mdp);
		if (userOpt.isPresent()) {
			System.out.println("Connected");
			return userOpt.get();
		}else {
			System.out.println("You've entered wrong informations, try again");
			return null;
		}

	}
	
	/*
	//Afficher tous les utilisateurs 
	public List<User> getUsers() {
		User person = new User(25, "payer",12,"my@gmail.com","private");
		users.add(person);
		return users;
	}
	
	
	//CrÃ©ation d'utilisateur : on l'ajoute Ã  la liste
	public void newUser(User user) {
		users.add(user);
		
	}
	*/

	

}