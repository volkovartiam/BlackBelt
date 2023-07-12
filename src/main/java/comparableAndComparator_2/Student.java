package comparableAndComparator_2;

class Student implements Comparable<Student>{
    Integer id;
    String name;
    char sex;
    Integer age;
    int course;
    double avgGrade;

    public Student(int id, String name, char sex, int age, int course, double avgGrade) {
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
    public int compareTo(Student otherStudent) {
        //return this.age - otherStudent.age;
        //return this.age.compareTo(otherStudent.age);

        int res = this.age - otherStudent.age;
        if(res == 0){
            res = this.id - otherStudent.id;
        }
        return res;
    }
}
