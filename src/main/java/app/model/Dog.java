package app.model;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog extends Animal{
    public Dog(){
        System.out.println("Создан бин собаки");
    }
    @Override
    public String toString() {
        return "I'm a Dog";
    }
}
