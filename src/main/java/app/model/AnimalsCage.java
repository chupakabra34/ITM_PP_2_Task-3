package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Класс AnimalsCage является компонентом Spring и будет управляться контейнером IoC
public class AnimalsCage {

    /*
    Аннотация @Autowired используется для автоматической инъекции зависимостей в поля класса
     */
    @Autowired // зависимость типа Animal будет автоматически разрешена и внедрена в поле animal.
    @Qualifier("dog") //указываем конкретную реализацию Animal, помеченную аннотацией @Qualifier("dog").
    private Animal animal;

    @Autowired //Автоматическая инъекцию зависимости типа Timer
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println(timer.getTime() + "const");
        System.out.println("________________________");
    }
}
