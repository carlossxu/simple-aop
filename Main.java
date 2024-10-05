import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
//        Service proxy = (Service) Proxy.newProxyInstance(
//                service.getClass().getClassLoader(),
//                service.getClass().getInterfaces(),
//                new ServiceInvocationHandler(service)
//        );
//        proxy.perform();
        Service proxy = (Service) new ProxyFactory(service).getProxyInstance();
        proxy.perform();
    }
}
