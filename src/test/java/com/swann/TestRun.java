package com.swann;

import com.swann.repository.UserRepository;
import com.swann.userentity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRun {
    @Autowired
    UserRepository repository;

    @Test
    public void contextLoads(){
//        Iterable<User> obj = repository.findAll();
//        for ( User user : obj){
//            System.out.println(user);
//        }
        User obj = repository.findByName("swann");
        System.out.println(obj);
        obj.setName("Apurba");
        System.out.println(obj);
        repository.save(obj);
    }
}
