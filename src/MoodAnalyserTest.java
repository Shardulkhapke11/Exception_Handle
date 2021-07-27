import org.junit.Assert;
import org.junit.Test;


    public class MoodAnalyserTest {

        @Test
        public void givenIAMInSadMood_shouldReturnSad() throws MoodAnalyserException
        {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
            String mood = moodAnalyser.analysemood();
            Assert.assertEquals(mood, "SAD");
        }

        @Test
        public void givenIAmInAnyMood_shouldReturnHappy() throws MoodAnalyserException
        {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
            String mood = moodAnalyser.analysemood();
            Assert.assertEquals(mood, "HAPPY");
        }

        @Test
        public void givenIAmInSadMood_shouldReturnHappy() throws MoodAnalyserException
        {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
            String mood = moodAnalyser.analysemood();
            Assert.assertEquals(mood, "SAD");
        }

        @Test
        public void givenIAmInHappyMood_shouldReturnHappy() throws MoodAnalyserException {
            MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
            String mood = moodAnalyser.analysemood();
            Assert.assertEquals(mood, "HAPPY");
        }

        @Test
        public void givenNullException_shouldInformUserToEnterValidMood()
        {
            MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
            try
            {
                moodAnalyzer.analysemood();
            } catch (MoodAnalyserException e)
            {
                Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
            }
        }

        @Test
        public void givenEmpty_shouldInformUserToEnterValidMood()
        {
            MoodAnalyser moodAnalyzer = new MoodAnalyser("");
            try
            {
                moodAnalyzer.analysemood();
            } catch (MoodAnalyserException e)
            {
                Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
            }

        }
    }
