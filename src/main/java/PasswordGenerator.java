public class PasswordGenerator implements Alphabet
{
    public Password generatePassword(int length)
    {
        StringBuilder s = new StringBuilder();

        for(int i = 0; i < length; i++)
        {

            switch ((int) (Math.random() * (5-1) + 1))
            {
                case 1 -> {
                    s.append(ALPHABET.charAt(((int) (Math.random() * (ALPHABET.length() - 1) + 1))));
                }
                case 2 -> {
                    s.append(CAPTIOLS.charAt(((int) (Math.random() * (CAPTIOLS.length() - 1) + 1))));
                }
                case 3 -> {
                    s.append(ODDCHARACTERS.charAt(((int) (Math.random() * ((ODDCHARACTERS.length()-1)-1) + 1))));
                }
                case 4 -> {
                    s.append(NUMBERS.charAt(((int) (Math.random() * ((NUMBERS.length()-1)-1) + 1))));
                }
            }
        }

        return new Password(s.toString());
    }
}
