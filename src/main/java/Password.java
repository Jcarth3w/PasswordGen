public class Password
{
    private String value;
    private int length;

    public Password(String value)
    {
        this.value = value;
        this.length = value.length();
    }

    public String getValue()
    {
        return value;
    }
}
