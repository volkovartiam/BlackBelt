package lambda_6;

public class CheckOverGrade implements StudentsCheck{

    @Override
    public boolean check(Student student) {
        return (student.avgGrade > 8);
    }
}
