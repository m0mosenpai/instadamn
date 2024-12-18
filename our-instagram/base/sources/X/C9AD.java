package X;

/* renamed from: X.9AD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9AD {
    public static boolean A00;

    public static synchronized void A00() {
        synchronized (C9AD.class) {
            if (!A00) {
                C09170dP.A0C("advancedcryptotransport_jni");
                A00 = true;
            }
        }
    }
}
