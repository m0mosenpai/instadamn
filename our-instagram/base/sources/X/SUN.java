package X;

import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public abstract class SUN {
    public static final Charset A00 = AbstractC58318PtA.A0u();

    public static void A00(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
        } else {
            throw AbstractC58319PtB.A0f("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)});
        }
    }
}
