package com.iqmsoft.services

import java.lang.Iterable

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.iqmsoft.entity.Users
import com.iqmsoft.repositories.UserRepository

@Service
class UserService(@Autowired private val userRepository: UserRepository) {

  def listUsers(): Iterable[Users] = {
    userRepository.findAll
  }

  def getUser(id: Long): Users = {
    userRepository.findOne(id)
  }

  def createUser(users: Users): Long = {
    userRepository.save(users)
    users.id
  }

}