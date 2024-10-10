package edu.atria.shoppingmall.usermodule;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional

public class UserService {
	@Autowired
	private UserRepository repo;
	//to retireve
	public List<Users> listAll(){
		return repo.findAll();
		}
	//to retrive by id
	public Users get(Long Id) {
		return repo.findById(Id).get();
	}
	//to post /create/update
	public void save(Users user) {
		repo.save(user);
	}
	//to delete
	public void delete(Long Id) {
		repo.deleteById(Id);
		}
}
