package xue.dubbo.sample.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"sample-provider.xml"});
		context.start();
		System.in.read();//Ϊ��֤����һֱ���ţ�������������������
	}
}
