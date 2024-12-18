package X;

/* loaded from: classes8.dex */
public final class LDC {
    public static boolean A00;

    public static synchronized void A00() {
        synchronized (LDC.class) {
            if (!A00) {
                C6ED.A00();
                C09170dP.A0C("chatdutils");
                A00 = true;
            }
        }
    }
}
