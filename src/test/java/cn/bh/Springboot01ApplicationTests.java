package cn.bh;

import cn.bh.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;
import java.util.concurrent.TimeUnit;

@SpringBootTest
@RunWith(SpringRunner.class)
class Springboot01ApplicationTests {
    @Autowired
    private BookService bookService;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        bookService.save();
        System.out.println("hello springboot");
    }
    @Test
    public void testString(){
        redisTemplate.opsForValue().set("city123","beijing");
        String city123 = (String) redisTemplate.opsForValue().get("city123");
        System.out.println(city123);
        redisTemplate.opsForValue().set("key1","value1",10l, TimeUnit.SECONDS);
    }
    @Test
    public void testHash(){
        redisTemplate.opsForHash().put("002","name","xiaoming");
        redisTemplate.opsForHash().put("002","age","20");
        String age = (String) redisTemplate.opsForHash().get("002", "age");
        System.out.println(age);
        Set keys = redisTemplate.opsForHash().keys("002");
        for (Object key : keys) {
            System.out.println(key);
        }
    }
}
