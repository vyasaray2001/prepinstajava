package Strings;
class checkacharacterisaVowel{
    public static void main(String[] args) {
        char c = 'a';

        // show error message if c is not an alphabet
        // if (!isalpha (c))
        //   System.out.println  ("Non alphabet");

        if (isVowel(c))
            System.out.println (c + " is a vowel ");

        else
            System.out.println (c + " is a consonant ");

    }

    // single function for both uppercase and lowercase
    static boolean isVowel(char c)
    {
        // converts to uppercase if it wasn't already
        c = Character.toUpperCase(c);
    
        // returns true if char matches any of below
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    
}