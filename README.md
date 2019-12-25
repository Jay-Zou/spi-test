# 测试Java的SPI——Service Provider Interface


### spi-api：接口
- cn.demojie.spi.IPrinter


### spi-impl：实现
- cn.demojie.spi.MyPrinter
- cn.demojie.spi.MyPrinter2
- resources/META-INF/services/cn.demojie.spi.IPrinter


### spi-invoker：调用者
```
// Load Services
ServiceLoader<IPrinter> serviceLoader = ServiceLoader.load(IPrinter.class);
System.out.println("====================");

// Iterate Implements
for (IPrinter iPrinter : serviceLoader) {
  iPrinter.invoke(Integer.toBinaryString(i++));
}
```