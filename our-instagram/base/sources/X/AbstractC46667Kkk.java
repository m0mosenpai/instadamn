package X;

import android.content.Context;

/* renamed from: X.Kkk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46667Kkk {
    public static final C74V A00(Context context, C169277h1 c169277h1, int i) {
        float A04 = AbstractC13880nE.A04(context, i);
        float f = c169277h1.A01 / c169277h1.A00;
        C74V A01 = C74U.A01(context, 0.4f, f, -1);
        C74V A00 = C74U.A00(f, (int) (f * A04), (int) A04, -1);
        if (A01.A00 > A04 || A00.A02 > A01.A02) {
            return A00;
        }
        return A01;
    }
}
