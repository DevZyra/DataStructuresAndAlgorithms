package data_structures;

import java.util.*;

public class HashMap_practice {
    public static void main(String[] args) {

    Employee emp1= new Employee("Michał","Escobar",1);
    Employee emp2= new Employee("Pablito","Okrasa",2);
    Employee emp3= new Employee("Pjontas","Sobota",3);
    Employee emp4= new Employee("Pjontas","Sobota",3);
    Employee emp5= new Employee("Marcin","Walcz",4);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        Map<Integer,Employee> hashMap = new HashMap<>();



//        System.out.println("Czy posiada klucz / czy posiada value");
//        System.out.println(hashMap.containsKey("Pablo"));
//        System.out.println(hashMap.containsValue(emp3));
//
//        System.out.println("Iterator hashMap.values().iterator(); print");
//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for(Employee e : empList){
            hashMap.putIfAbsent(e.getId(),e);
        }


        System.out.println("For each lambda print");
        hashMap.forEach((x,k)-> System.out.println("Key : " + x + "Emp : " + k));

        

    }
}
