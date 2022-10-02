import org.junit.Assert;
import org.junit.Test;

public class AnalyseMoodTest {

	@Test
	public void messageShouldBeInvalidMood() {
		AnalyseMood testmood = new AnalyseMood(null);
		try {
			testmood.moodAnalyzer();
		} catch (Exception e) {
			Assert.assertEquals("Invalid Mood", e.getMessage());
		}
	}

}
