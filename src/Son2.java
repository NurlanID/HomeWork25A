package def;
public class Son2 extends def.Dad {
    public Son2() {
        super();
    }
    public Son2(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString() {
        return "Son2 [Name = " + getName() + ", Age = " + getAge() + "]";
    }
}

