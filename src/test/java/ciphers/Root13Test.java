package ciphers;
import ciphers.impl.Root13Cipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Root13Test {

    protected final String textWithNoAlphabeticLetters = "112312";
    protected final String expectedTextForNonAlphabeticLetters = "112312";
    protected final String textWithAlphabeticLetters = "abcdd";
    protected final String expectedTestforAlphabeticalLetters = "nopqq";
    protected final String mixedText = "123ac";
    protected final String expectedTextForMixedTest = "123np";
    protected final String textWithOnlySpace = " ";
    protected final String expectedTestForSpaceOnly = " ";

    protected Cipher rootCipher = new Root13Cipher();

//    ENCODEING TESTS

    @DisplayName("Testing correction of encoding text with no alphabetic letters")
    @Test
    public void textIfOnlyAlphabeticLettersAreEncoded(){
        String encode = rootCipher.encode(textWithNoAlphabeticLetters);
        Assertions.assertEquals(expectedTextForNonAlphabeticLetters, encode);
    }

    @DisplayName("Testing correction of encoding text with only alphabetic letters")
    @Test
    public void textIfAlphabeticLettersAreEncoded(){
        String encode = rootCipher.encode(textWithAlphabeticLetters);
        Assertions.assertEquals(expectedTestforAlphabeticalLetters, encode);
    }

    @DisplayName("Testing correction of encoding mixed text")
    @Test
    public void textIfMixedTextAreEncoded(){
        String encode = rootCipher.encode(mixedText);
        Assertions.assertEquals(expectedTextForMixedTest, encode);
    }

    @DisplayName("Testing correction of space only")
    @Test
    public void textIfOnlySpaceIsGiven(){
        String encode = rootCipher.encode(textWithOnlySpace);
        Assertions.assertEquals(expectedTestForSpaceOnly, encode);
    }

    //DECODING TESTS

    @DisplayName("Testing correction of decoding text with no alphabetic letters")
    @Test
    public void textIfOnlyAlphabeticLettersAreDecoded(){
        String decode = rootCipher.decode(expectedTextForNonAlphabeticLetters);
        Assertions.assertEquals(textWithNoAlphabeticLetters, decode);
    }

    @DisplayName("Testing correction of decoding text with only alphabetic letters")
    @Test
    public void textIfAlphabeticLettersAreDecoded(){
        String decode = rootCipher.decode(expectedTestforAlphabeticalLetters);
        Assertions.assertEquals(textWithAlphabeticLetters, decode);
    }

    @DisplayName("Testing correction of decoding mixed text")
    @Test
    public void textIfMixedTextAreDecoded(){
        String decode = rootCipher.decode(expectedTextForMixedTest);
        Assertions.assertEquals(mixedText, decode);
    }
}