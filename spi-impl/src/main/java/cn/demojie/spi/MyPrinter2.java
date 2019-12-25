package cn.demojie.spi;

public class MyPrinter2 implements IPrinter {
  public MyPrinter2() {
    System.out.println("MyPrinter2 initialized!");
  }

  @Override
  public void invoke(String param) {
    System.out.println("invoke IP2: " + param);
  }
}
