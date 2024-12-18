package X;

import java.nio.charset.Charset;
import java.security.SecureRandom;

/* renamed from: X.Px6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58538Px6 {
    public static final Charset A00 = AbstractC58318PtA.A0u();

    public static boolean A02(byte[] prefix, byte[] complete) {
        int length = complete.length;
        int length2 = prefix.length;
        if (length < length2) {
            return false;
        }
        for (int i = 0; i < length2; i++) {
            if (complete[i] != prefix[i]) {
                return false;
            }
        }
        return true;
    }

    public static int A00() {
        int i;
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        do {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        } while (i == 0);
        return i;
    }

    public static final C58526Pwu A01(String s) {
        int length = s.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char charAt = s.charAt(i);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i] = (byte) charAt;
            } else {
                throw new RuntimeException(AnonymousClass001.A0C("Not a printable ASCII character: ", charAt));
            }
        }
        return new C58526Pwu(bArr, length);
    }
}
