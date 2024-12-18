package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.L7p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47768L7p {
    public final /* synthetic */ C47952LGm A00;
    public final /* synthetic */ L2C A01;
    public final /* synthetic */ LG0 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C47768L7p(C47952LGm c47952LGm, L2C l2c, LG0 lg0, String str, String str2, String str3) {
        this.A01 = l2c;
        this.A00 = c47952LGm;
        this.A02 = lg0;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
    }

    public final void A00(Throwable th) {
        Integer num;
        C47952LGm c47952LGm = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c47952LGm.A01;
        int i = c47952LGm.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021649468, i, "init_login_network_end");
        JQ0.A1E(lightweightQuickPerformanceLogger, "init_login_network_call_error", message, 1021649468, i);
        if ((th instanceof C46339KfN) && (num = ((C46339KfN) th).A00) != null) {
            c47952LGm.A00(num.intValue());
            LG0.A00(this.A01, this.A02, new C46342KfQ(C05F.A04, th));
        }
        LG0.A00(this.A01, this.A02, new C46342KfQ(C05F.A1F, th));
    }
}
