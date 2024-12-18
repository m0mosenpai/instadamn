package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes8.dex */
public final class L7Q {
    public final /* synthetic */ C47952LGm A00;
    public final /* synthetic */ L2C A01;
    public final /* synthetic */ LG0 A02;
    public final /* synthetic */ C47598L0i A03;

    public L7Q(C47952LGm c47952LGm, L2C l2c, LG0 lg0, C47598L0i c47598L0i) {
        this.A01 = l2c;
        this.A00 = c47952LGm;
        this.A02 = lg0;
        this.A03 = c47598L0i;
    }

    public final void A00(Throwable th) {
        Integer num;
        C47952LGm c47952LGm = this.A00;
        String message = th.getMessage();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c47952LGm.A01;
        int i = c47952LGm.A00;
        lightweightQuickPerformanceLogger.markerPoint(1021649468, i, "finish_login_network_end");
        JQ0.A1E(lightweightQuickPerformanceLogger, "finish_login_network_call_error", message, 1021649468, i);
        if ((th instanceof C46339KfN) && (num = ((C46339KfN) th).A00) != null) {
            c47952LGm.A00(num.intValue());
            LG0.A00(this.A01, this.A02, new C46342KfQ(C05F.A04, th));
        }
        LG0.A00(this.A01, this.A02, new C46342KfQ(C05F.A1F, th));
    }
}
