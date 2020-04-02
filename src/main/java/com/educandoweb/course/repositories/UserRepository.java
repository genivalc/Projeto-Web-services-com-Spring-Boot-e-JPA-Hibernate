package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;
//instaciar o reposito
public interface UserRepository extends JpaRepository<User, Long> {

	public static void main(String[] args) {
		
	}

}
