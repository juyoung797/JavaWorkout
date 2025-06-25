package EXAM_250623;

class Student {
    String name;
    double KoreanScore;
    double EnglishScore;
    double MathScore;
    double averageScore;
    double totalScore;

    public Student(String name, double KoreanScore, double EnglishScore, double MathScore) {
        this.name = name;
        this.KoreanScore = KoreanScore;
        this.EnglishScore = EnglishScore;
        this.MathScore = MathScore;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setKoreanScore(double KoreanScore) {
        this.KoreanScore = KoreanScore;
    }
    public void setEnglishScore(double EnglishScore) {
        this.EnglishScore = EnglishScore;
    }
    public void setMathScore(double MathScore) {
        this.MathScore = MathScore;
    }

    public String getName(){
        return name;
    }
    public double getKoreanScore(){
        return KoreanScore;
    }
    public double getEnglishScore(){
        return EnglishScore;
    }
    public double getMathScore(){
        return MathScore;
    }

    double average() {
        averageScore = (KoreanScore + EnglishScore + MathScore) / 3;
        return averageScore;
    }

    double total() {
        totalScore = KoreanScore + EnglishScore + MathScore;
        return totalScore;
    }
}
