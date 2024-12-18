package X;

/* renamed from: X.2V1, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2V1 {
    public static boolean A00 = true;
    public static boolean A01;
    public static boolean A02;
    public static boolean A03;
    public static boolean A04;

    static {
        boolean z = false;
        if (System.getProperty("IS_TESTING") != null) {
            z = true;
        }
        A02 = z;
    }
}
