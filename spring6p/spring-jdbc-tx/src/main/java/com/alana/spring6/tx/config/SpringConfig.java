package com.alana.spring6.tx.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.alana.spring6.tx")
@EnableTransactionManagement
public class SpringConfig {
}
