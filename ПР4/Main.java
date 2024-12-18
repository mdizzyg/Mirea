// Суперкласс Learner
class Learner {
    String name;
    int age;

    public Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Подкласс SchoolStudent
class SchoolStudent extends Learner {
    String grade;

    public SchoolStudent(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        System.out.println("School Student - Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

// Подкласс UniversityStudent
class UniversityStudent extends Learner {
    String major;

    public UniversityStudent(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void displayInfo() {
        System.out.println("University Student - Name: " + name + ", Age: " + age + ", Major: " + major);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание массива объектов типа Learner
        Learner[] learners = new Learner[4];
        learners[0] = new SchoolStudent("Anna", 15, "10-A");
        learners[1] = new UniversityStudent("Ivan", 20, "Computer Science");
        learners[2] = new SchoolStudent("Peter", 12, "7-B");
        learners[3] = new UniversityStudent("Maria", 22, "Economics");

        // Показать отдельно студентов и школьников
        System.out.println("School Students:");
        for (Learner learner : learners) {
            if (learner instanceof SchoolStudent) {
                learner.displayInfo();
            }
        }

        System.out.println("\nUniversity Students:");
        for (Learner learner : learners) {
            if (learner instanceof UniversityStudent) {
                learner.displayInfo();
            }
        }
    }
}