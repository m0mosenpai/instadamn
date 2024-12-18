package X;

/* renamed from: X.0Qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05310Qd {
    public static final C05310Qd A00 = new C05310Qd();

    public final void A00(C0Pe c0Pe) {
        C003801d c003801d = c0Pe.A03;
        C02R.A03(c003801d, "Did you call SessionManager.init()?");
        int i = 48;
        if (C0DL.A01) {
            i = 49;
        }
        synchronized (c003801d.A02) {
            c003801d.A01.A00.put(1777, (byte) i);
            C003801d.A02(c003801d);
        }
    }
}
