    package def;
    public class Dad {
    private String name;
    private int age;
    public Dad() {
    }
    public Dad(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println(name);
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
