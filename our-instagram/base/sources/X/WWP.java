package X;

/* loaded from: classes11.dex */
public final class WWP implements XF3 {
    public static WWP A00;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.WWP, java.lang.Object] */
    public static synchronized WWP A00() {
        WWP wwp;
        synchronized (WWP.class) {
            WWP wwp2 = A00;
            wwp = wwp2;
            if (wwp2 == null) {
                ?? obj = new Object();
                A00 = obj;
                wwp = obj;
            }
        }
        return wwp;
    }
}
