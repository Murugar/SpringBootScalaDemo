package com.iqmsoft.repositories

import org.springframework.stereotype.Repository
import com.iqmsoft.entity.Users
import org.springframework.data.repository.CrudRepository
import java.lang.Long

@Repository
trait UserRepository extends CrudRepository[Users, Long] {

  def findUserByUsername(username: String): Users

}

