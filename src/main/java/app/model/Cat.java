package app.model;

import org.springframework.stereotype.Component;

@Component  //Аннотация указывает, что класс Cat является компонентом
            // Spring и будет управляться контейнером IoC (Inversion of Control)
public class Cat extends Animal { // наследуем функциональность и поведение от Animal
    @Override
    public String toString() {
        return "Im a Cat";
    }
}
