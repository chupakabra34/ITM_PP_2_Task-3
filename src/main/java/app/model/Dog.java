package app.model;

import org.springframework.stereotype.Component;

@Component  //Аннотация указывает, что класс Dog является компонентом
            // Spring и будет управляться контейнером IoC (Inversion of Control)
public class Dog extends Animal { // наследуем функциональность и поведение от Animal
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
