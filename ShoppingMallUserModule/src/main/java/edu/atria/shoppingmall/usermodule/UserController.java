package edu.atria.shoppingmall.usermodule;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	
	
	//RESTful API methods for retrieval operation
	@GetMapping("user")
	public List<Users> list(){
		return service.listAll();
	}
	@GetMapping("/user/{Id}")
	public ResponseEntity<Users> get(@PathVariable Long Id){
		try {
			Users user = service.get(Id);
			 return new ResponseEntity<Users>(user,HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
		}
	}
	//restful api method for create operation
	@PostMapping("/user")
	public void add(@RequestBody Users user) {
		service.save(user);
	}
	//restful api method for delete operation
	@DeleteMapping("/user/{Id}")
	public void delete(@PathVariable Long Id) {
		service.delete(Id);
	}
	
	//restful api method for update operation
	@PutMapping("/user/{Id}")
	public ResponseEntity<?> update(@RequestBody Users user, @PathVariable Long Id){
		try {
			
			service.save(user);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
