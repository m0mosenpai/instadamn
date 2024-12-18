package X;

/* renamed from: X.6ED, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ED {
    public static boolean A00;

    public static synchronized void A00() {
        synchronized (C6ED.class) {
            if (!A00) {
                C09170dP.A0C("msysjniinfra");
                A00 = true;
            }
        }
    }
}
