package cn.demojie.spi;

public class MyPrinter implements IPrinter {
  public MyPrinter() {
    System.out.println("MyPrinter initialized!");
  }

  @Override
  public void invoke(String param) {
    System.out.println("invoke IP: " + param);
  }
}
