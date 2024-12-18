package X;

/* renamed from: X.5xU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC131945xU {
    public static void A00(C19280xC c19280xC, C82383m1 c82383m1) {
        c19280xC.A0B("max_duration_ms", Long.valueOf(c82383m1.A04));
        c19280xC.A0B("sum_duration_ms", Long.valueOf(c82383m1.A05));
        long j = c82383m1.A02;
        if (j > 500) {
            c19280xC.A0B("legacy_duration_ms", Long.valueOf(j));
        }
    }
}
