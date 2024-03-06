package com.learning.springboot.learningspringboot.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.learning.springboot.learningspringboot.client.PaymentGatewayClient;

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {

    @Override
    @Nullable
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
       client.setEndpoint("https://example.com");
       client.setPublicKey("public");
       client.setPrivateKey("private");
       return client;
    }

    @Override
    @Nullable
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
    
}
