package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.1QH, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1QH {
    public static synchronized void A02(C19280xC c19280xC, C1QH c1qh) {
        synchronized (c1qh) {
            c1qh.A07();
            long currentTimeMillis = System.currentTimeMillis();
            c19280xC.A0C("waterfall_id", c1qh.A05());
            c19280xC.A0B(TraceFieldType.StartTime, Long.valueOf(c1qh.A03()));
            c19280xC.A0B("current_time", Long.valueOf(currentTimeMillis));
            c19280xC.A0B("elapsed_time", Long.valueOf(currentTimeMillis - c1qh.A03()));
        }
    }

    public abstract long A03();

    public abstract String A05();

    public abstract String A06();

    public abstract void A07();

    public final C19280xC A04(String str) {
        C19280xC A01 = C19280xC.A01(str, A06());
        A02(A01, this);
        return A01;
    }
}
