package X;

import com.instagram.model.rtc.RtcCallFunnelSessionId;

/* renamed from: X.GNv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36900GNv implements Runnable {
    public final /* synthetic */ C7YJ A00;
    public final /* synthetic */ RtcCallFunnelSessionId A01;

    public RunnableC36900GNv(C7YJ c7yj, RtcCallFunnelSessionId rtcCallFunnelSessionId) {
        this.A00 = c7yj;
        this.A01 = rtcCallFunnelSessionId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC55155OdJ.A03(this.A00.A03, this.A01, C05F.A0Y);
    }
}
