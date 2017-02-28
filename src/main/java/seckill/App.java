package seckill;

public class App {
	
	//私有静态构造方法，防止new
	private App(){};
	
	//创建holder来获取App的实例
	private static class AppHolder{
	private static final App instance = new App();	
	}
	
	public static App getInstance(){
		return AppHolder.instance;
	}
	
	public static void main(String[] args) {
//		String mo = "DC4*294776304290100";
//	System.out.println(getCpId(mo));
		App app = new App();
		System.out.println("测试一下");
	}
	
	
	
	private static String getCpId(String mo){
		String cpId = "";
		String[]s = mo.split("\\*");
		if(s.length>0){
			
			System.out.println(s[0]);
			System.out.println(s[1]);
			cpId = s[1].substring(2, 4);
		}
		
		return cpId;
	}
}
