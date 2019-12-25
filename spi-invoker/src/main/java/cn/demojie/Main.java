package cn.demojie;

import cn.demojie.spi.IPrinter;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.ServiceLoader;

public class Main {
  public static void main(String[] args) throws IOException {
    spiInvoke();
  }

  static void test2() throws IOException {
    String fullName = "META-INF/services/cn.demojie.spi.IPrinter";
    ClassLoader loader = Thread.currentThread().getContextClassLoader();
    Enumeration<URL> resources = loader.getResources(fullName);
    System.out.println();
  }

  static void spiInvoke() {
    int i = 0;

    // Load Services
    ServiceLoader<IPrinter> serviceLoader = ServiceLoader.load(IPrinter.class);
    System.out.println("====================");

    // Iterate Implements
    for (IPrinter iPrinter : serviceLoader) {
      iPrinter.invoke(Integer.toBinaryString(i++));
    }
  }
}
