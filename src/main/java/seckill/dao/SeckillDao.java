package seckill.dao;

import java.util.Date;
import java.util.List;

import seckill.entity.Seckill;

public interface SeckillDao {
	
	/**
	 * �����
	 * @param seckillId
	 * @param killTime ��ɱʱ��
	 * @return ���Ӱ������>1,��ʾ���µļ�¼����
	 */
	int reduceNumber(long seckillId,Date killTime);
	
	Seckill queryById(long seckillId);
	
	List<Seckill>queryAll(int offset,int limit);
}
