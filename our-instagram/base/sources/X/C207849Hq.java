package X;

import java.util.Map;

/* renamed from: X.9Hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207849Hq {
    public static C207849Hq A01;
    public static final C22731A1b A02 = new Object();
    public final Map A00 = AbstractC166987dD.A1G();

    public static final synchronized C207849Hq A00() {
        C207849Hq c207849Hq;
        synchronized (C207849Hq.class) {
            synchronized (A02) {
                c207849Hq = A01;
                if (c207849Hq == null) {
                    c207849Hq = new C207849Hq();
                    A01 = c207849Hq;
                }
            }
        }
        return c207849Hq;
    }
}
