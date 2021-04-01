/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment;

/**
 *
 * @author SharfaaAnthony
 */
public class Consumers {
    private String name;
    private String lastName;
    private String food;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Consumers(String name, String lastName, String food, int age) {
        this.name = name;
        this.lastName = lastName;
        this.food = food;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Consumers{" + "name=" + name + ", lastName=" + lastName + ", food=" + food + ", age=" + age + '}';
    }
    
    
}
