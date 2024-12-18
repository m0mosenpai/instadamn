package X;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public abstract class AHM {
    public static final int A00(int i) {
        int i2 = 0;
        if (i != 0) {
            i2 = 1;
            if (1 != i) {
                throw AbstractC166987dD.A18(AnonymousClass001.A0O("Could not convert camera facing from optic: ", i));
            }
        }
        return i2;
    }

    public static final A6X A01(C196748n4 c196748n4) {
        Rect rect = (Rect) c196748n4.A03(C196748n4.A0M);
        Rect rect2 = (Rect) c196748n4.A03(C196748n4.A0N);
        Object A03 = c196748n4.A03(C196748n4.A0L);
        C14360o3.A07(A03);
        ((Number) A03).intValue();
        Object A032 = c196748n4.A03(C196748n4.A0K);
        C14360o3.A07(A032);
        A00(AbstractC166987dD.A0H(A032));
        c196748n4.A04(C196748n4.A0T);
        c196748n4.A04(C196748n4.A0Z);
        c196748n4.A04(C196748n4.A0O);
        c196748n4.A04(C196748n4.A0V);
        c196748n4.A04(C196748n4.A0P);
        A6X a6x = new A6X(rect, rect2);
        c196748n4.A04(C196748n4.A0R);
        return a6x;
    }

    public static final ACI A02(Y1s y1s) {
        if (y1s == null) {
            return null;
        }
        int intValue = y1s.A00(Y1s.A0L).intValue();
        int intValue2 = y1s.A00(Y1s.A0K).intValue();
        String str = (String) y1s.A01(Y1s.A0S);
        String str2 = (String) y1s.A01(Y1s.A0U);
        int intValue3 = y1s.A00(Y1s.A0M).intValue();
        int A00 = A00(y1s.A00(Y1s.A0J).intValue());
        Object A01 = y1s.A01(Y1s.A0T);
        if (A01 != null) {
            if (AbstractC166987dD.A1a(A01)) {
                Object A012 = y1s.A01(Y1s.A0N);
                if (A012 != null) {
                    ((Number) A012).intValue();
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            Object A013 = y1s.A01(Y1s.A0Z);
            if (A013 != null) {
                ((Number) A013).intValue();
                return new ACI(str, str2, intValue, intValue2, intValue3, A00);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
