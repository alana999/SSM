package com.alana.spring6.aop;

public class TestPro {
    public static void main(String[] args) {
        ProxyFactory proxyFactory =  new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1,2);
    }

}
