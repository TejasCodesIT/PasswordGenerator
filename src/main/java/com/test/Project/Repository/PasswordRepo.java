package com.test.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.test.Project.model.User;

@Repository
public interface PasswordRepo  extends  JpaRepository<User, String>{

}
