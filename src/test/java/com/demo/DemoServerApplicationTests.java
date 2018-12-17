package com.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ClassUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServerApplicationTests {

    @Test
    public void contextLoads() {

        String path =  ClassUtils.getDefaultClassLoader().getResource("").getPath();

        System.out.println(path);
    }

}
