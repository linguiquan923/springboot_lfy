package com.atlgq.atlgq.starter;

public class HelloService {

    HelloProperties helloProperties;

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public String sayHello(String name){
        return helloProperties.getPrefix() + "_" + name + "_" + helloProperties.getSuffix();
    }
}
