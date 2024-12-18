package X;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public abstract class A06 {
    public static final C23108AGw A00(float f, float f2, float f3, float f4, boolean z) {
        float f5 = f2;
        float f6 = f2 / f3;
        if ((!z || f < 1.0f) && f6 < f) {
            f5 = f3 * f;
        }
        float f7 = f3;
        if ((z && f >= 1.0f) || f6 > f) {
            f7 = f2 / f;
        }
        float f8 = (int) (f2 / 2.0f);
        float f9 = f5 / 2.0f;
        float f10 = (int) (f3 / 2.0f);
        float f11 = f7 / 2.0f;
        Rect A0V = AbstractC166987dD.A0V((int) (f8 - f9), (int) (f10 - f11), (int) (f8 + f9), (int) (f10 + f11));
        C23108AGw A00 = C23108AGw.A00();
        A00.A0R = false;
        A00.A0Q = false;
        A00.A06 = new C221619qQ(A0V);
        A00.A04 = f4;
        return A00;
    }
}
