abstract class Person {
    String name;
    int age;
    int contact;
    public Person(String name, int age, int contact){
        this.name = name;
        this.age = age;
        this.contact = contact;
    }
    abstract String getRole();
}

class Passanger extends Person{
    public Passanger(String name, int age, int contact){
        super(name,age,contact);
    }

    public String getRole(){
        return "Passanger";
    }

    public void checkIn(){
        System.out.println(name+" checked as Passanger");
    }
}

class Staff extends Person{
    public Staff(String name, int age, int contact){
        super(name,age,contact);
    }

    public String getRole(){
        return "Staff";
    }

    public void checkIn(){
        System.out.println(name+" checked as Staff");
    }
}

class Pilot extends Staff{
    public Pilot(String name, int age, int contact){
        super(name,age,contact);
    }

    public String getRole(){
        return "Pilot";
    }

}

class CabinCrew extends Staff{
    public CabinCrew(String name, int age, int contact){
        super(name, age, contact);
    }

    public String getRole(){
        return "CabinCrew";
    }
}
