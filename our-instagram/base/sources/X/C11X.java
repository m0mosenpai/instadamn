package X;

import android.content.Context;

/* renamed from: X.11X, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C11X {
    public static volatile C11X A00;
    public static volatile boolean A01;

    public abstract C27101Tj A01();

    public abstract C27101Tj A02(Context context);

    public static C11X A00() {
        C11X c11x = A00;
        C18C.A07(c11x, "Must call setInstance() first");
        return c11x;
    }
}
