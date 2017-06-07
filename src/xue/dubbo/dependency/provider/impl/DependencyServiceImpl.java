package xue.dubbo.dependency.provider.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xue.dubbo.dependency.provider.DependencyService;
import xue.dubbo.sample.provider.SampleService;

/**
 * DependencyService ��ʵ��
 * @author Administrator
 *	
 *	���������������������Ҫ�Ƚ��������ķ�������������Ȼ�ᱨ��
 */
@Service("dependencyServiceImpl")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass=
	xue.dubbo.dependency.provider.DependencyService.class, protocol={"dubbo"}, retries=0)
public class DependencyServiceImpl implements DependencyService {

	/**
	 * �������ķ���
	 */
	@Autowired
	private SampleService sampleServe;
	
	@Override
	public String dependency() throws Exception {
		//���� ���ǿ�����Ҫ����SampleService��Ҳ���ܲ���Ҫ
		System.out.println(sampleServe.sayHello("jack"));
		return "dependency exec";
	}

}
