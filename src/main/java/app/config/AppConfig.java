package app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //Аннотация указывает, что класс AppConfig является конфигурационным классом
@ComponentScan(basePackages = "app")    //Аннотация указывает на необходимость автоматического сканирования
                                        // и регистрации компонентов в указанных пакетах
public class AppConfig {
}
