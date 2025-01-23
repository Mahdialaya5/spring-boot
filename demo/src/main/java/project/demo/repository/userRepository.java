package project.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import project.demo.model.user;


@Repository
public class userRepository {

     private final List<user> userList = new ArrayList<>();
   
    public List<user> findAll() {
        return userList;
    }
    public Optional<user> findByid(Integer i) {
        return userList.stream().filter(el -> el.id.equals(i)).findFirst();
    }
}