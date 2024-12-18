package X;

/* renamed from: X.1LV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LV {
    public static volatile C1LU A00;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1LU, java.lang.Object] */
    public static C1LU A00() {
        if (A00 == null) {
            synchronized (C1LV.class) {
                if (A00 == null) {
                    A00 = new Object();
                }
            }
        }
        return A00;
    }

    public static void A01() {
        A00().ASb();
    }

    public static void A02(String str) {
        A00().ADO(str);
    }
}
