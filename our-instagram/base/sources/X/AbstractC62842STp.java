package X;

import java.security.SecureRandom;

/* renamed from: X.STp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62842STp {
    public static final SecureRandom A00 = new SecureRandom();

    public static String A00() {
        byte[] bArr = new byte[16];
        A00.nextBytes(bArr);
        return AbstractC58319PtB.A0x(bArr);
    }
}
