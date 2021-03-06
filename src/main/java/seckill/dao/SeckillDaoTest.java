package seckill.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import seckill.entity.Seckill;

import javax.annotation.Resource;
/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * spring-test,junit
 * @author ming
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest  {
	
	//注入DAO实现类依赖
	@Resource
	private SeckillDao seckillDao;
	
	
	
	@Test
	public void testQueryById()throws Exception{
		long id = 1;
		Seckill seckill = seckillDao.queryById(id);
		System.out.println(seckill.getName());
		System.out.println(seckill);
	}
	@Test
	public void testQueryAll()throws Exception{
		
	}
	
	@Test
	public void testReduceNumber()throws Exception{
		
	}
}
