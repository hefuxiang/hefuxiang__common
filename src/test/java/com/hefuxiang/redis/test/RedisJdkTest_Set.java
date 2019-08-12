package com.hefuxiang.redis.test;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hefuxiang.common.utils.RandomUtil;
import com.hefuxiang.common.utils.Stringutils;
import com.hefuxiang.redis.domain.User;

/**
 * 
 * @ClassName: RedisJdkTest_Set 
 * @Description: TODO
 * @author:HeFuXiang
 * @date: 2019年8月12日 上午9:02:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans2.xml")
public class RedisJdkTest_Set {
     
	@Resource
	private RedisTemplate<String, Serializable> redisTemplate;
	@Test
	public void test_jdkSet() {
		ArrayList<User> list = new ArrayList<>();
		for (int i = 1; i <=100000; i++) {
			list.add(new User(i, Stringutils.generateChineseName()+Stringutils.randomChineseString(2), "男","13"+RandomUtil.randomString(9), RandomUtil.randomCharacterks()+Stringutils.eimal(), RandomUtil.random(18, 70)));
		}
		//开始存储时间
		long startime = System.currentTimeMillis();
		//开始存储
		 for (User user : list) {
			 redisTemplate.opsForSet().add("u"+user.getId(), user);
		}
		 long endtime = System.currentTimeMillis();
		
		 System.out.println("Jdk序列化保存的时间为"+(endtime-startime)+"数量为:"+list.size());
	}
}
