package ciphers;

import ciphers.impl.CesarCipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CesarCipherTest {
    protected final String textWithNoAlphabeticLetters = "112312";
    protected final String expectedTextForNonAlphabeticLetters = "445645";
    protected final String textWithAlphabeticLetters = "abcdd";
    protected final String expectedTestforAlphabeticalLetters = "defgg";
    protected final String mixedText = "123ac";
    protected final String expectedTextForMixedTest = "456df";
    protected final String textWithOnlySpace = " ";
    protected final String expectedTestForSpaceOnly = "#";



    protected Cipher cesarCipher = new CesarCipher();


//    ENCODEING TESTS

    @DisplayName("Testing correction of encoding text with no alphabetic letters")
    @Test
    public void textIfOnlyAlphabeticLettersAreEncoded(){
        String encode = cesarCipher.encode(textWithNoAlphabeticLetters);
        Assertions.assertEquals(expectedTextForNonAlphabeticLetters, encode);
    }

    @DisplayName("Testing correction of encoding text with only alphabetic letters")
    @Test
    public void textIfAlphabeticLettersAreEncoded(){
        String encode = cesarCipher.encode(textWithAlphabeticLetters);
        Assertions.assertEquals(expectedTestforAlphabeticalLetters, encode);
    }

    @DisplayName("Testing correction of encoding mixed text")
    @Test
    public void textIfMixedTextAreEncoded(){
        String encode = cesarCipher.encode(mixedText);
        Assertions.assertEquals(expectedTextForMixedTest, encode);
    }

    @DisplayName("Testing correction of space only")
    @Test
    public void textIfOnlySpaceIsGiven(){
        String encode = cesarCipher.encode(textWithOnlySpace);
        Assertions.assertEquals(expectedTestForSpaceOnly, encode);
    }

    //DECODING TESTS

    @DisplayName("Testing correction of encoding text with no alphabetic letters")
    @Test
    public void textIfOnlyAlphabeticLettersAreDecoded(){
        String decode = cesarCipher.decode(expectedTextForNonAlphabeticLetters);
        Assertions.assertEquals(textWithNoAlphabeticLetters, decode);
    }

    @DisplayName("Testing correction of encoding text with only alphabetic letters")
    @Test
    public void textIfAlphabeticLettersAreDecoded(){
        String decode = cesarCipher.decode(expectedTestforAlphabeticalLetters);
        Assertions.assertEquals(textWithAlphabeticLetters, decode);
    }

    @DisplayName("Testing correction of encoding mixed text")
    @Test
    public void textIfMixedTextAreDecoded(){
        String decode = cesarCipher.decode(expectedTextForMixedTest);
        Assertions.assertEquals(mixedText, decode);
    }

}
