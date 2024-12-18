package X;

/* loaded from: classes8.dex */
public final class LDB {
    public static boolean A00;

    public static final synchronized void A00() {
        synchronized (LDB.class) {
            if (!A00) {
                C09170dP.A0C("msgnotificationenginejni");
                A00 = true;
            }
        }
    }
}
