-- 数据库初始化脚本

-- 创建数据库
create database seckill;
--使用数据库
use seckill;

--创建数据表
create table seckill(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT  '商品库存id',
`name` varchar(120) NOT NULL COMMENT  '商品名称',
`number` int NOT NULL COMMENT  '库存数量',
`start_time` timestamp NOT NULL COMMENT  '秒杀开始时间',
`end_time` timestamp NOT NULL COMMENT  '秒杀结束时间',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT  '创建时间',
PRIMARY KEY (seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

-- 初始化数据
insert into seckill(name,number,start_time,end_time)
values('1000元秒杀iphone7',100,'2016-11-24 00:00:00','2016-11-26 00:00:00'),
('1000元秒杀iphone7',100,'2015-11-24 00:00:00','2015-11-26 00:00:00'),
('500元秒杀小米note',100,'2016-12-01 00:00:00','2016-12-07 00:00:00'),
('40元秒杀飞毛腿充电宝',100,'2016-12-24 00:00:00','2016-12-26 00:00:00');

-- 创建秒杀成功明细表
-- 用户登录认证相关的信息
create table success_killed(
`seckill_id` bigint NOT NULL COMMENT  '秒杀商品id',
`user_phone` varchar(20) NOT NULL COMMENT  '用户手机号码',
`state` tinyint NOT NULL DEFAULT -1 COMMENT  '状态标识：-1=无效 0=成功 1=已付款 2=已发货',
create_time timestamp NOT NULL COMMENT '入库时间',
PRIMARY KEY(seckill_id,user_phone),   /*联合主键*/
KEY idx_create_time(create_time)
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT = '秒杀成功明细表';




