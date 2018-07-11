package com.seda.springboot.service.user;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.seda.springboot.po.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

	@Autowired
	private UserDao userDao;
	
    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }
 
    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }
	
	@Test
	public void testInsert() {
		User user = new User();
		user.setId(1);
		user.setUsername("zhangsan");
		user.setPassword("123456");
		user.setBirthday(new Date());
		int insert = this.userDao.insert(user);
		System.out.println(insert);
	}

	@Test
	public void testDeleteById() {
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testGetById() {
	}

}
