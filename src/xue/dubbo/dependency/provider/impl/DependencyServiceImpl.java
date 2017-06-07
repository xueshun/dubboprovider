package xue.dubbo.dependency.provider.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xue.dubbo.dependency.provider.DependencyService;
import xue.dubbo.sample.provider.SampleService;

/**
 * DependencyService 的实现
 * @author Administrator
 *	
 *	如果服务依赖其他服务，需要先将所依赖的服务先启动，不然会报错
 */
@Service("dependencyServiceImpl")
@com.alibaba.dubbo.config.annotation.Service(interfaceClass=
	xue.dubbo.dependency.provider.DependencyService.class, protocol={"dubbo"}, retries=0)
public class DependencyServiceImpl implements DependencyService {

	/**
	 * 所依赖的服务
	 */
	@Autowired
	private SampleService sampleServe;
	
	@Override
	public String dependency() throws Exception {
		//这里 我们可能需要调用SampleService，也可能不需要
		System.out.println(sampleServe.sayHello("jack"));
		return "dependency exec";
	}

}
