package xue.dubbo.dependency.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"dependency-provider.xml"});
		context.start();
		
		System.in.read();//Ϊ�˱�֤����һֱ����������������������ģ��
	}
}	
