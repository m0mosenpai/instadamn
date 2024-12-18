package X;

/* renamed from: X.2dS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53882dS {
    public static boolean A00;

    public static synchronized void A00() {
        synchronized (C53882dS.class) {
            if (!A00) {
                C09170dP.A0C("msysjniinfranosqlite");
                A00 = true;
            }
        }
    }
}
