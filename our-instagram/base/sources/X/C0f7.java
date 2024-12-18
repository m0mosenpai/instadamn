package X;

/* renamed from: X.0f7, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0f7 {
    public static volatile int A00;

    public static void A00() {
        if (A00 == 0) {
            synchronized (C0f7.class) {
                if (A00 == 0) {
                    A00 = -1;
                }
            }
        }
    }

    public C0f7() {
        throw C00O.createAndThrow();
    }
}
