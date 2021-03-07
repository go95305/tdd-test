public class Score {
    private int middleScore = 0;
    private int finalScore = 0;
    private int homeworkScore = 0;

    public Score(int middleScore, int finalScore, int homeworkScore) {
        this.middleScore = middleScore;
        this.finalScore = finalScore;
        this.homeworkScore = homeworkScore;
    }

    public int getMiddleScore(){
        return middleScore;
    }

    public int getFinalScore(){
        return finalScore;
    }

    public int getHomeworkScore(){
        return homeworkScore;
    }
}
