package X;

import java.util.Arrays;

/* renamed from: X.VKb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68264VKb {
    public static C68878Vda A00(WFa wFa) {
        wFa.A0P(1);
        int A06 = wFa.A06();
        long j = wFa.A01 + A06;
        int i = A06 / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long A0B = wFa.A0B();
            if (A0B == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = A0B;
            jArr2[i2] = wFa.A0B();
            wFa.A0P(2);
            i2++;
        }
        wFa.A0P((int) (j - wFa.A01));
        return new C68878Vda(jArr, jArr2);
    }
}
