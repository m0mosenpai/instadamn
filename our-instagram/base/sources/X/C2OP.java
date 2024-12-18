package X;

import com.google.common.collect.ImmutableSet;

/* renamed from: X.2OP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2OP extends C12250kT {
    public static final java.util.Set A00;

    @Override // X.C12250kT, com.facebook.xanalytics.XAnalyticsAdapter
    public final void logEvent(String str, String str2, String str3, boolean z, double d) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        if (A00.contains(str)) {
            super.logEvent(str, str2, str3, z, d);
        }
    }

    static {
        ImmutableSet A002 = ImmutableSet.A00("wellbeing_timeinapp_perf", "wellbeing_timeinapp_intervals");
        C14360o3.A07(A002);
        A00 = A002;
    }
}
