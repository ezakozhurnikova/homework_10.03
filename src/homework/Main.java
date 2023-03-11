package homework;

public class Main {

    public static void main(String[] args) {
        int[] ints={1,3,4,5,6};
        MaxElementInArray elementInArray=new MaxElementInArray(ints);
        System.out.println("Max element in array is "+elementInArray.maxValue(ints));

        Employee Markus=new Employee("Markus",300,5);
        System.out.println("Employee name is: "+Markus.getName());
        System.out.println("Employee's salary is: "+Markus.addSalary(Markus.getSalary()));
        Markus.setSalary(200);
        Markus.setHoursPerDay(7);
        System.out.println("Employee's salary : "+Markus.addForWork(Markus.getSalary(),Markus.getHoursPerDay()));




    }
}
