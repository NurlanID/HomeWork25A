    package def;
    public class Son3 extends def.Dad {
        public Son3() {
            super();
        }
        public Son3(String name, int age) {
            super(name, age);
        }
        @Override
        public String toString() {
            return "Son3 [Name = " + getName() + ", Age = " + getAge() + "]";
        }
    }
