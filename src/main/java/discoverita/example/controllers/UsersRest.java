package discoverita.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import discoverita.example.repository.UserRepositoryInterface;
import discoverita.example.user.User;

@RestController
@RequestMapping("/users")
public class UsersRest {

	private UserRepositoryInterface usersRepository;

	@Autowired
	public UsersRest(UserRepositoryInterface spittleRepository) {
		this.usersRepository = spittleRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<User> users() {
		return usersRepository.allUsers();
	}
}