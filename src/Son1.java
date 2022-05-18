package def ;
public class Son1 extends def.Dad {
    public () {
        super();
    }
    public Son1(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString() {
        return "Son1 [Name = " + getName() + ", Age = " + getAge()+"]";
    }
}