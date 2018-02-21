package com.iqmsoft

import javax.annotation.PostConstruct

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication
import com.iqmsoft.entity.Users
import com.iqmsoft.repositories.UserRepository

@SpringBootApplication
class Application(@Autowired private val userRepository: UserRepository){

//  @PostConstruct
//  def preInsertUsers(): Unit ={
//    val user = new Users
//    user.setUsername("user01")
//    user.setPassword("user01")
//    user.setEnabled(true)
//    userRepository.save(user);
//  }

}
object Application extends App {
  SpringApplication.run(classOf[Application])
}
