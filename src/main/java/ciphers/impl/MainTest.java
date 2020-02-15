package ciphers.impl;


public class MainTest {
    public static void main(String[] args) {
        CesarCipher test = new CesarCipher();

        System.out.println(test.encode("Ala ma kota a kot ma Wszystko ABCXYZ abcxyz"));
        System.out.println(test.decode("Dod#pd#nrwd#d#nrw#pd#Zvcbvwnr#DEFABC#defabc"));
    }
}
