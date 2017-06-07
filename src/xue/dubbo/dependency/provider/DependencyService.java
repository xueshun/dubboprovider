package xue.dubbo.dependency.provider;

/**
 * 依赖服务的抽象
 * @author Administrator
 *
 */
public interface DependencyService {
	public String dependency() throws Exception;
}
