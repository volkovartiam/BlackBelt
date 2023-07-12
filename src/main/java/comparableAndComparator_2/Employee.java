package comparableAndComparator_2;

class Employee implements Comparable<Employee> {
    Integer id;
    String name;
    char sex;
    Integer age;
    int course;
    double avgGrade;

    public Employee(int id, String name, char sex, int age, int course, double avgGrade) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        return this.id - anotherEmp.id;
    }
}
