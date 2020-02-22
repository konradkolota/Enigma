package factories;

import ciphers.impl.CesarCipher;
import ciphers.impl.Root13Cipher;
import exceptions.CipherNotFoundException;
import factories.impl.CipherFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CipherFactoryTest {

    private CipherFactory factory = new CipherFactory();


    @Test
    protected void ifCesarInstanceReturnedWithCesarTypeTest(){
        Assertions.assertTrue(factory.create(CipherFactory.CESAR) instanceof CesarCipher);
    }

    @Test
    protected void ifRoot13InstanceReturnedWithRoot13TypeTest(){
        Assertions.assertTrue(factory.create(CipherFactory.ROOT13) instanceof Root13Cipher);
    }

    @Test
    protected void shouldThrowExceptionWithGivenUnknownType(){
        String unknown = "unknown";
        Assertions.assertThrows(CipherNotFoundException.class, () -> factory.create(unknown));
    }
}