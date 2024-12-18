package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class X1K implements MQN {
    public final /* synthetic */ List A00;
    public final /* synthetic */ W4T A01;

    @Override // X.MQN
    public final void DG5(String str, Throwable th) {
        C14360o3.A0B(str, 0);
        C70151W8r.A01(C70151W8r.A00("report_events_failure", str, th, this.A00), "error", this.A01.A04);
    }

    public X1K(List list, W4T w4t) {
        this.A01 = w4t;
        this.A00 = list;
    }

    @Override // X.MQN
    public final void onSuccess() {
        C70151W8r.A01(C70151W8r.A00("report_events_success", null, null, this.A00), "info", this.A01.A04);
    }
}
