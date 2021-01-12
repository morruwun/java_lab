package human;

public class Government implements Human{
    private int age;
    private String name;
    private String surname;
    private String governType;

    public Government(int age, String name, String surname, String governType) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.governType = governType;
    }
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Government other = (Government) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.surname == null) ? (other.surname != null) : !this.surname.equals(other.surname)) {
            return false;
        }
        if ((this.governType == null) ? (other.governType != null) : !this.governType.equals(other.governType)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }

        return true;
    }

    public StringBuffer getName() {
        StringBuffer sb = new StringBuffer();
        sb.append(name);
        sb.append(surname);
        return sb;
    }

    public void showHuman() {
        StringBuffer sb = new StringBuffer();
        sb.append(governType);
        sb.append(": \n");
        sb.append("Name: ");
        sb.append(name);
        sb.append("\nAge: ");
        sb.append(age);
        System.out.println(sb);
    }
    public int eat(int food) {
        System.out.println("Person from government eats");
        return food-1;
    }
}
