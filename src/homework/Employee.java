package homework;
/*Задача2
Создать класс Employee , содержащий следующие поля и методы:

поле имя,
поле зарплата,
поле количество рабочих часов в день,
конструктор
метод addSalary(), добавляющий 10 евро к зарплате если зарплата сотрудника меньше 500
метод addForWork(), добавляющий 5 евро к зарплате сотрудника если количество рабочих часов в день больше 6.
Создать несколько экземпляров класса с различными параметрами и вывести на экран результат работы методов*/

public class Employee {
    private String name;
    private int salary;
    private int hoursPerDay;

    public Employee(String name, int salary,int hoursPerDay){
        this.salary=salary;
        this.name=name;
        this.hoursPerDay=hoursPerDay;

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public void setSalary(int salary) {
        if (salary<500){
            salary=salary+10;
        }
        this.salary = salary;
    }

    public void setHoursPerDay(int hoursPerDay) {

        this.hoursPerDay = hoursPerDay;
    }
    public int addSalary(int salary){
        if(getSalary()<500);
        return salary+10;
    }


    public int addForWork(int salary, int hoursPerDay){
        if (getHoursPerDay()>6){
            salary=salary+5;
        }return salary;
    }
}
