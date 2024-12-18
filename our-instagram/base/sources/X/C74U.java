package X;

import android.content.Context;

/* renamed from: X.74U, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C74U {
    public static final C74V A00(float f, int i, int i2, int i3) {
        int A01;
        if (i > 0) {
            A01 = i;
        } else {
            A01 = C1H4.A01(i2 * f);
        }
        if (i2 <= 0) {
            i2 = C1H4.A01(i / f);
        }
        return new C74V(i3, A01, i2);
    }

    public static final C74V A01(Context context, float f, float f2, int i) {
        return new C74V(i, C1H4.A01(context.getResources().getDisplayMetrics().widthPixels * f), C1H4.A01((context.getResources().getDisplayMetrics().widthPixels * f) / f2));
    }
}
