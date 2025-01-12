package Task3;

// Задача 3.1: Дописать конструктор в класс Study и вызватиь метод printCourse
class Study {
    private String course;

    // Конструктор с одним параметром
    public Study(String course) {
        this.course = course;
    }

    // Геттеры и сеттеры
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}