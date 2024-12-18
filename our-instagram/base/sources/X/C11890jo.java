package X;

import com.facebook.mobileconfig.MobileConfigCrashReportUtils;

/* renamed from: X.0jo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11890jo implements C0X0 {
    @Override // X.C0X0
    public final String AOP() {
        return "mcc_stats";
    }

    @Override // X.C0X0
    public final boolean CTn(AbstractC208210e abstractC208210e) {
        C14360o3.A0B(abstractC208210e, 0);
        return true;
    }

    @Override // X.C0X0
    public final long Cpb() {
        return 4194304L;
    }

    @Override // X.C0X0
    public final void DaR(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        if (c0xx.CYl(23)) {
            c0xx.BTP().A03("canary_ids", MobileConfigCrashReportUtils.getInstance().getSerializedCanaryData());
        }
    }
}
