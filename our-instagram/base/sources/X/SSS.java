package X;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class SSS {
    public static byte[] A00(BigInteger n) {
        if (n.signum() != -1) {
            return n.toByteArray();
        }
        throw AbstractC166987dD.A12("n must not be negative");
    }

    public static byte[] A01(BigInteger n, int length) {
        if (n.signum() != -1) {
            byte[] byteArray = n.toByteArray();
            int length2 = byteArray.length;
            if (length2 == length) {
                return byteArray;
            }
            int i = length + 1;
            if (length2 <= i) {
                if (length2 == i) {
                    if (byteArray[0] == 0) {
                        return Arrays.copyOfRange(byteArray, 1, length2);
                    }
                    throw AbstractC58318PtA.A0x("integer too large");
                }
                byte[] bArr = new byte[length];
                System.arraycopy(byteArray, 0, bArr, length - length2, length2);
                return bArr;
            }
            throw AbstractC58318PtA.A0x("integer too large");
        }
        throw AbstractC166987dD.A12("integer must be nonnegative");
    }
}
