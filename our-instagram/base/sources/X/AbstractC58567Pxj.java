package X;

import java.util.Random;

/* renamed from: X.Pxj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58567Pxj {
    public static final ThreadLocal A00 = new TYR();

    public static byte[] A00(int size) {
        byte[] bArr = new byte[size];
        ((Random) A00.get()).nextBytes(bArr);
        return bArr;
    }
}
