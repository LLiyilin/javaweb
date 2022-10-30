package hw1.swu.edu.cn;

public class Student {
    private String id;
    private String name;

    private int mathGrade;

    private int chineseGrade;

    private int englishGrade;

    public Student() {

    }

    public Student(String id, String name) {

    }
    public Student(int mathGrade, int chineseGrade, int englishGrade){

    }
    public void setId(String id) {

        this.id = id;
    }

    public String getId() {

        return this.id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }
    public int getMathGrade() {
        return mathGrade;
    }

    public void setChineseGrade(int chineseGrade) {
        this.chineseGrade = chineseGrade;
    }

    public int getChineseGrade() {
        return chineseGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }


    public int getTotal() {
        return this.getMathGrade() + this.getChineseGrade() + this.getEnglishGrade();
    }

    public double getAverage() {
        return this.getTotal() / 4.0;
    }

    public String toString() {
        return String.format(
                "%s, %s，%s, %s, %s",
                this.getId(), this.getName(), this.getMathGrade(), this.getChineseGrade(), this.getEnglishGrade()
        );
    }
}
    public String toString() {

        return String.format("ID: %s, Name: %s", this.getId(), this.getName());
    }
}