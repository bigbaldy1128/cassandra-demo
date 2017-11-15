package com.wjz;

import com.wjz.domain.User;
import com.wjz.domain.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.cassandra.repository.MapId;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CassandraDemoApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test1() {
        long start= System.currentTimeMillis();
        List<User> users=new ArrayList<>();
        for (long i = 1; i <= 5000; i++) {
            User user = new User();
            user.setId(i);
            user.setName("王五" + i);
            users.add(user);
        }
        userRepository.save(users);
        long end= System.currentTimeMillis();
        System.out.println(end-start);
    }

}
