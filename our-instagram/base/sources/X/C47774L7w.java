package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.L7w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47774L7w {
    public final /* synthetic */ C47952LGm A00;
    public final /* synthetic */ L2C A01;
    public final /* synthetic */ LG0 A02;
    public final /* synthetic */ C47503KyW A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;

    public C47774L7w(C47952LGm c47952LGm, L2C l2c, LG0 lg0, C47503KyW c47503KyW, String str, String str2, byte[] bArr) {
        this.A01 = l2c;
        this.A00 = c47952LGm;
        this.A05 = str;
        this.A03 = c47503KyW;
        this.A06 = bArr;
        this.A02 = lg0;
        this.A04 = str2;
    }

    public final void A00(Throwable th) {
        Integer num;
        C47952LGm c47952LGm = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c47952LGm.A01;
        int i = c47952LGm.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021649468, i, "begin_login_network_end");
        JQ0.A1E(lightweightQuickPerformanceLogger, "begin_login_network_call_error", message, 1021649468, i);
        if ((th instanceof C46339KfN) && (num = ((C46339KfN) th).A00) != null) {
            c47952LGm.A00(num.intValue());
            LG0.A00(this.A01, this.A02, new C46342KfQ(C05F.A04, th));
        }
        LG0.A00(this.A01, this.A02, new C46342KfQ(C05F.A1F, th));
    }
}
