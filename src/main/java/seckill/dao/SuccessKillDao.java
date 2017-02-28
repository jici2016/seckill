package seckill.dao;

import seckill.entity.SuccessKilled;

public interface SuccessKillDao {
	/**
	 * ���빺����ϸ���ɹ����ظ�
	 * @param seckillId
	 * @param userPhone
	 * @return ���������
	 */
	int insertSuccessKilled(long seckillId,String userPhone);
	
	/**
	 * ��ѯsuccesskilled ��Я����ɱ��Ʒ����ʵ��
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId); 
}
