package com.artyomka.pw_telegrambot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestPwTelegramBotProjectApplication {

    public static void main(String[] args) {
        SpringApplication.from(PwTelegramBotProjectApplication::main).with(TestPwTelegramBotProjectApplication.class).run(args);
    }

}
