package seckill.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import seckill.entity.Seckill;

import javax.annotation.Resource;
/**
 * ����spring��junit���ϣ�junit����ʱ����springIOC����
 * spring-test,junit
 * @author ming
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//����junit spring�����ļ�
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest  {
	
	//ע��DAOʵ��������
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
