public class MoodAnalyserException extends Exception {
    ExceptionType type;
    enum ExceptionType
    {
        ENTERED_NULL, ENTERED_EMPTY
    }

    public MoodAnalyserException(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
