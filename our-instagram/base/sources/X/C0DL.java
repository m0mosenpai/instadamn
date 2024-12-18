package X;

import java.util.List;

/* renamed from: X.0DL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0DL {
    public static C05310Qd A00;
    public static volatile boolean A01;

    public static final void A00() {
        C05310Qd c05310Qd = C05310Qd.A00;
        A00 = c05310Qd;
        List list = C0Pe.A0D;
        synchronized (list) {
            C0Pe c0Pe = C0Pe.A0A;
            if (c0Pe == null) {
                list.add(c05310Qd);
            } else {
                c05310Qd.A00(c0Pe);
            }
        }
    }
}
