package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* loaded from: classes9.dex */
public final class PJE implements InterfaceC58089PpE {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C53021Nct A01;

    public PJE(UserSession userSession, C53021Nct c53021Nct) {
        this.A01 = c53021Nct;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC58089PpE
    public final void D0P(C53404Njt c53404Njt, InterfaceC58192Pqy interfaceC58192Pqy) {
        UserSession userSession = this.A00;
        C53021Nct c53021Nct = this.A01;
        OQX.A01(c53021Nct.A0Y, userSession).A00();
        OQW.A00(c53404Njt);
        if (interfaceC58192Pqy.equals(c53021Nct.A0F)) {
            BroadcastFailureType broadcastFailureType = c53404Njt.A00;
            String str = c53404Njt.A01;
            C14360o3.A0B(str, 1);
            AbstractC55102ObF.A0B(broadcastFailureType, c53021Nct, str, null, c53404Njt);
            return;
        }
        C0K8.A0H("IgLiveStreamingController", "Unexpected error from another LiveStreamingSession.", c53404Njt);
    }

    @Override // X.InterfaceC58089PpE
    public final void DCg() {
        C53021Nct c53021Nct = this.A01;
        if (c53021Nct.A0K != C05F.A0N) {
            long j = c53021Nct.A05;
            PJG pjg = c53021Nct.A0I;
            if (pjg != null) {
                j += pjg.C9p();
            }
            PJF pjf = c53021Nct.A0H;
            if (pjf != null) {
                j += pjf.A00;
            }
            c53021Nct.A0a.A02 = j;
            C11T.A02(new RunnableC57020PRl(c53021Nct, j));
            OYB.A00(this.A00).A00(null, null, null, null, null, null, Long.valueOf(j), null);
        }
    }
}
