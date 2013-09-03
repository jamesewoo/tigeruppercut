package epi.primitive;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/2/13
 * Time: 8:42 PM
 */
public class BitUtilsTest {

    @Test
    public void test() {
        BitUtils utils = new BitUtils();
        assertEquals(0, utils.parity(0));
        assertEquals(1, utils.parity(1));
        BigInteger x = new BigInteger("ffff ffff ffff ffff".replace(" ", ""), 16);
        assertEquals(0, utils.parity(x.longValue()));

        x = new BigInteger("ffff ffff ffff fffe".replace(" ", ""), 16);
        assertEquals(1, utils.parity(x.longValue()));

        x = new BigInteger("ffff ffff ffef fffe".replace(" ", ""), 16);
        assertEquals(0, utils.parity(x.longValue()));

        x = new BigInteger("ffff feff ffef fffe".replace(" ", ""), 16);
        assertEquals(1, utils.parity(x.longValue()));

        x = new BigInteger("efff feff ffef fffe".replace(" ", ""), 16);
        assertEquals(0, utils.parity(x.longValue()));

        x = new BigInteger("effe feff ffef fffe".replace(" ", ""), 16);
        assertEquals(1, utils.parity(x.longValue()));

        for (int i = 0; i < 512; ++i) {
            x = new BigInteger(64, new Random());
            assertEquals(x.bitCount() % 2, utils.parity(x.longValue()));
        }
    }
}
