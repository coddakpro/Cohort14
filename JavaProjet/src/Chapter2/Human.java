package Chapter2;

public class Human {
    private int age;
    private String name = "Malam";

    public void setName(String name) {
        this.name = name;
    }
        public String getName(){
            return name;
        }

    public void setAge(int age) {
        if (age >= 1);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Human human = new Human();

        human.setName("malam");
        System.out.println(human.getName());
        human.setAge(12);
        System.out.println(human.getAge());
    }
    }

