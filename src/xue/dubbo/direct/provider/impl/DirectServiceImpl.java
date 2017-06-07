package xue.dubbo.direct.provider.impl;

import xue.dubbo.direct.provider.DirectService;

public class DirectServiceImpl implements DirectService{

	@Override
	public String direct() throws Exception {
		return "Direct Service";
	}

}
