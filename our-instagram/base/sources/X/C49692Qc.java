package X;

import android.content.Context;

/* renamed from: X.2Qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49692Qc {
    public final synchronized C49682Qb A00() {
        if (!A03() && C49682Qb.A04 == null) {
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            C49682Qb c49682Qb = new C49682Qb(context);
            C49682Qb.A04 = c49682Qb;
            boolean z = C218914p.A05;
            C218914p.A03(EnumC220415e.A03, c49682Qb);
        }
        return C49682Qb.A04;
    }

    public final synchronized void A01() {
        C49682Qb c49682Qb = C49682Qb.A04;
        if (c49682Qb != null) {
            C218914p.A06(c49682Qb);
            c49682Qb.close();
            synchronized (c49682Qb) {
                c49682Qb.A02.deleteDatabase("direct.db");
            }
        }
    }

    public final synchronized void A02(Throwable th) {
        C49682Qb.A05 = true;
        C0w9.A07("SQLite error", th);
    }

    public final synchronized boolean A03() {
        return C49682Qb.A05;
    }
}
