public class MoodAnalyser {
    String message;

    public MoodAnalyser() {
    }


    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analysemood() throws  MoodAnalyserException{
        try {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter proper message!");
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e)
            {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter proper message!");

        }
    }

}