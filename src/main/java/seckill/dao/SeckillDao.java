package seckill.dao;

import java.util.Date;
import java.util.List;

import seckill.entity.Seckill;

public interface SeckillDao {
	
	/**
	 * 减库存
	 * @param seckillId
	 * @param killTime 秒杀时间
	 * @return 如果影响行数>1,表示更新的记录行数
	 */
	int reduceNumber(long seckillId,Date killTime);
	
	Seckill queryById(long seckillId);
	
	List<Seckill>queryAll(int offset,int limit);
}
