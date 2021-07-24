public class Test implements Comparable<Test> {

    private int age;

    public Test(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Test o) {
        return Integer.compare(this.getAge(), o.getAge());
    }

    @Override
    public String toString() {
        return String.valueOf(this.getAge());
    }
}
