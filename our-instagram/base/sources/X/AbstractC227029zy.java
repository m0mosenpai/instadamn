package X;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC227029zy {
    public static final C6RD A00(C6RD c6rd, float f, float f2, float f3, float f4) {
        C9ZQ c9zq = null;
        if (c6rd == null) {
            return null;
        }
        float f5 = c6rd.A00 * f4;
        C9ZQ c9zq2 = c6rd.A08;
        if (c9zq2 != null) {
            List list = c9zq2.A00;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                float A09 = AbstractC166987dD.A09(obj);
                int i3 = i % 3;
                if (i3 == 0) {
                    A09 = (A09 + f) * f2;
                } else if (i3 == 1) {
                    A09 = (A09 + 1.0f) * f3;
                }
                A0q.add(Float.valueOf(A09));
                i = i2;
            }
            c9zq = new C9ZQ(A0q);
        }
        C6RC c6rc = c6rd.A07;
        float f6 = c6rd.A02;
        float f7 = c6rd.A04;
        float f8 = c6rd.A03;
        float f9 = c6rd.A01;
        int i4 = c6rd.A05;
        boolean z = c6rd.A0A;
        List list2 = c6rd.A09;
        Typeface typeface = c6rd.A06;
        C14360o3.A0B(c6rc, 0);
        return new C6RD(typeface, c6rc, c9zq, list2, f6, f7, f8, f5, f9, i4, z);
    }
}
