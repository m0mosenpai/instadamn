package X;

import java.util.List;

/* renamed from: X.CdY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28286CdY {
    public static final long A02(C6KW c6kw, boolean z) {
        long j;
        long j2 = 0;
        List list = c6kw.A03;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            BFo A0U = AbstractC25225BEi.A0U(list, i2);
            if (A0U.A0B && A0U.A0C) {
                if (z) {
                    j = A0U.A06;
                } else {
                    j = A0U.A07;
                }
                j2 = C119365at.A07(j2, j);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return C119365at.A04(i, j2);
    }

    public static final float A00(long j) {
        float A01 = C119365at.A01(j);
        if (A01 == 0.0f && C119365at.A02(j) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(A01, C119365at.A02(j)))) * 180.0f) / 3.1415927f;
    }

    public static final float A01(C6KW c6kw, boolean z) {
        long j;
        long A02 = A02(c6kw, z);
        float f = 0.0f;
        if (AbstractC167007dF.A1N((A02 > 9205357640488583168L ? 1 : (A02 == 9205357640488583168L ? 0 : -1)))) {
            return 0.0f;
        }
        List list = c6kw.A03;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            BFo A0U = AbstractC25225BEi.A0U(list, i2);
            if (A0U.A0B && A0U.A0C) {
                if (z) {
                    j = A0U.A06;
                } else {
                    j = A0U.A07;
                }
                f += C119365at.A00(C119365at.A06(j, A02));
                i++;
            }
        }
        return f / i;
    }
}
