class Person {

    String name; //attribute
    
    Person(String name){
        this.name = name;
    }
    
    public void tellAboutYou() {
        System.out.println("Hello! I  am " + name);
    }
}

public class ClassConstructor {
    public static void main(String[] args){
        Person p = new Person("Einstien");
        p.tellAboutYou();
    }
    
}
