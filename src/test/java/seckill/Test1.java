package seckill;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test1 {
	private static Logger log = LoggerFactory.getLogger(Test1.class);
	public static void main(String[] args) {
		log.info("hello {}", "world");
		App app = App.getInstance();
	}
}
