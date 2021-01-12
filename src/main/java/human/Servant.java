package human;

public class Servant implements Human{
    private int age;
    private String name;
    private ServantType servantType;

    public Servant(int age, String name, ServantType servType) {
        this.age = age;
        this.name = name;
        servantType = servType;
    }

    public int getAge() {
        return age;
    }
    public String[] getName() {
        String[] tname = name.split(" ");
        return tname;
    }

    public void showHuman() {
        System.out.println(servantType+":");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public int eat(int food) {
        System.out.println("Servant eats");
        return food-1;
    }
}

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (obj.getClass() != this.getClass()) {
//            return false;
//        }
//        final Servant other = (Servant) obj;
//        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
//            return false;
//        }
//        if (this.age != other.age) {
//            return false;
//        }
//        if (servantType != other.servantType)
//            return false;
//        return true;
//    }
