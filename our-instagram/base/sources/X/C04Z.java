package X;

import android.os.Build;

/* renamed from: X.04Z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04Z {
    public final AbstractC011204a A00;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0uC, X.04a] */
    public C04Z(C011504d c011504d) {
        C17740uB c17740uB;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c17740uB = new C12490ks(c011504d);
        } else if (i >= 29) {
            c17740uB = new C17740uB(c011504d);
        } else {
            ?? abstractC011204a = new AbstractC011204a(c011504d);
            abstractC011204a.A00 = c011504d.A04();
            c17740uB = abstractC011204a;
        }
        this.A00 = c17740uB;
    }

    public C04Z() {
        AbstractC011204a c17750uC;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c17750uC = new C12490ks();
        } else if (i >= 29) {
            c17750uC = new C17740uB();
        } else {
            c17750uC = new C17750uC();
        }
        this.A00 = c17750uC;
    }
}
