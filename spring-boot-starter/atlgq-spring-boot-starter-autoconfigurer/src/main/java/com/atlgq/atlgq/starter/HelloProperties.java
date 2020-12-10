package com.atlgq.atlgq.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

//声明这是一个properties类，而且要配置它的话得以atlgq.hello开头
@ConfigurationProperties(prefix = "atlgq.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSuffix() {
        return suffix;
    }
}
