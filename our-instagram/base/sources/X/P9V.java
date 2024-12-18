package X;

import com.instagram.common.session.UserSession;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;

/* loaded from: classes9.dex */
public final class P9V implements InterfaceC58177Pqh {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final RtcCallIntentHandlerActivity A03;
    public final C56139Ovz A04;
    public final String A05;

    @Override // X.InterfaceC58177Pqh
    public final /* synthetic */ void AIk() {
        this.A00 = false;
        this.A03.finish();
    }

    @Override // X.InterfaceC58177Pqh
    public final void start() {
        this.A00 = true;
        new OKi(this.A03, this.A01, this.A02).A01(this.A05);
    }

    @Override // X.InterfaceC58177Pqh
    public final RtcCallIntentHandlerActivity Bpn() {
        return this.A03;
    }

    @Override // X.InterfaceC58177Pqh
    public final UserSession CE4() {
        return this.A02;
    }

    @Override // X.InterfaceC58177Pqh
    public final /* synthetic */ void EoJ() {
    }

    @Override // X.InterfaceC58177Pqh
    public final boolean isRunning() {
        return this.A00;
    }

    public /* synthetic */ P9V(InterfaceC11380iw interfaceC11380iw, UserSession userSession, RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity, String str) {
        C56139Ovz A00 = MWJ.A00(AbstractC166987dD.A0O(rtcCallIntentHandlerActivity), userSession);
        C14360o3.A0B(A00, 4);
        this.A03 = rtcCallIntentHandlerActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = A00;
        this.A00 = false;
        this.A05 = str;
    }
}
