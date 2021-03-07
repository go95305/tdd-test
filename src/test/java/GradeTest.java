import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeTest {

    @Test
    public void scoreResult(){
        Score score = new Score(35, 25, 25);
        SimpleScoreStrategy scores = new SimpleScoreStrategy();

        String resultGrade = scores.computeGrade(score);

        assertEquals("B", resultGrade);
    }
}
