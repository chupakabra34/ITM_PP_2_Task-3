package app.model;

import org.springframework.stereotype.Component;

@Component  //Аннотация указывает, что класс Timer является компонентом
            // Spring и будет управляться контейнером IoC (Inversion of Control)
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
