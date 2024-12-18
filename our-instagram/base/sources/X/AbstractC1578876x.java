package X;

import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;

/* renamed from: X.76x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1578876x {
    public static final DirectThreadAnalyticsParams A00(C7TT c7tt, boolean z) {
        long j;
        String C7q;
        Long A0k;
        C14360o3.A0B(c7tt, 0);
        long j2 = 1 + c7tt.A03;
        EnumC1579076z A00 = AbstractC1578976y.A00(z, c7tt.A0r);
        C2EC c2ec = c7tt.A0J;
        if (c2ec != null && (C7q = c2ec.C7q()) != null && (A0k = AbstractC003100w.A0k(10, C7q)) != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        return new DirectThreadAnalyticsParams(A00, j2, j);
    }

    public static final DirectThreadAnalyticsParams A01(C2EC c2ec, boolean z) {
        long j;
        Long A0k;
        long BSB = c2ec.BSB();
        EnumC1579076z A00 = AbstractC1578976y.A00(z, c2ec.CVQ());
        String C7q = c2ec.C7q();
        if (C7q != null && (A0k = AbstractC003100w.A0k(10, C7q)) != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        return new DirectThreadAnalyticsParams(A00, BSB, j);
    }
}
