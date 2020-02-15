package ciphers.impl;

import ciphers.Cipher;


public class CesarCipher implements Cipher {
    @Override
    public String encode(String textToEncode) {

        StringBuilder encodedString = new StringBuilder();

        for (int i = 0; i < textToEncode.length() ; i++) {

            int charAt = textToEncode.charAt(i);

            if(charAt==88){
                charAt=65;
            }else if (charAt==89) {
                charAt = 66;
            }else if (charAt==90){
                charAt = 67;
            }else if (charAt==120){
                charAt=97;
            }else if (charAt==121){
                charAt=98;
            }else if (charAt==122){
                charAt=99;
            }else if(charAt==55){
                charAt=48;
            }else if(charAt==56){
                charAt=49;
            }else if(charAt==57){
                charAt=50;
            }
            else charAt+=3;

            encodedString.append((char)charAt);
        }
        return encodedString.toString();
    }

    @Override
    public String decode(String textToDecode) {
        StringBuilder decodedString = new StringBuilder();

        for (int i = 0; i < textToDecode.length() ; i++) {

            int charAt = textToDecode.charAt(i);

            if(charAt==65){
                charAt=88;
            }else if (charAt==66) {
                charAt = 89;
            }else if (charAt==67){
                charAt = 90;
            }else if (charAt==97){
                charAt=120;
            }else if (charAt==98){
                charAt=121;
            }else if (charAt==99){
                charAt=122;
            }else if(charAt==48){
                charAt=55;
            }else if(charAt==49){
                charAt=56;
            }else if(charAt==50){
                charAt=57;
            }
            else charAt-=3;

            decodedString.append((char)charAt);
        }
        return decodedString.toString();
    }
}
