package epi.primitive;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/2/13
 * Time: 8:26 PM
 */
public class BitUtils {

    private final byte[] parityLookup;

    public BitUtils() {
        parityLookup = new byte[256];
        for (int i = 0; i < 256; ++i) {
            parityLookup[i] = computeParity(i);
        }
    }

    public int parity(long x) {
        return parityLookup[(int) ((x >> 56) & 0xff)]
                ^ parityLookup[(int) ((x >> 48) & 0xff)]
                ^ parityLookup[(int) ((x >> 40) & 0xff)]
                ^ parityLookup[(int) ((x >> 32) & 0xff)]
                ^ parityLookup[(int) ((x >> 24) & 0xff)]
                ^ parityLookup[(int) ((x >> 16) & 0xff)]
                ^ parityLookup[(int) ((x >> 8) & 0xff)]
                ^ parityLookup[(int) (x & 0xff)];
    }

    byte computeParity(int x) {
        byte res = 0;
        while (x != 0) {
            res ^= 1;
            x &= x - 1;
        }
        return res;
    }
}
