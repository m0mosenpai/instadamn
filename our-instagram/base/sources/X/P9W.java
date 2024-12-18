package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;
import com.instagram.rtc.activity.RtcIncomingParams;

/* loaded from: classes9.dex */
public final class P9W implements InterfaceC58177Pqh {
    public boolean A00;
    public final InterfaceC58275PsT A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final RtcCallKey A04;
    public final OKi A05;
    public final RtcCallIntentHandlerActivity A06;
    public final RtcIncomingParams A07;
    public final C56139Ovz A08;
    public final InterfaceC09390do A09;
    public final C19L A0A;

    @Override // X.InterfaceC58177Pqh
    public final /* synthetic */ void AIk() {
        this.A00 = false;
        this.A06.finish();
    }

    @Override // X.InterfaceC58177Pqh
    public final void start() {
        this.A00 = true;
        if (AbstractC31178DnM.A1a(this.A09)) {
            PZC.A02(this, this.A0A, 1);
        } else {
            this.A06.A02(this.A07.A01, true);
        }
    }

    @Override // X.InterfaceC58177Pqh
    public final RtcCallIntentHandlerActivity Bpn() {
        return this.A06;
    }

    @Override // X.InterfaceC58177Pqh
    public final UserSession CE4() {
        return this.A03;
    }

    @Override // X.InterfaceC58177Pqh
    public final void EoJ() {
        RtcCallIntentHandlerActivity Bpn = Bpn();
        Bpn.A02.postDelayed(new PRI(this, Bpn), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        if (!AbstractC31178DnM.A1a(this.A09)) {
            PZC.A02(this, this.A0A, 1);
        }
    }

    @Override // X.InterfaceC58177Pqh
    public final boolean isRunning() {
        return this.A00;
    }

    public /* synthetic */ P9W(InterfaceC58275PsT interfaceC58275PsT, InterfaceC11380iw interfaceC11380iw, UserSession userSession, RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity, RtcIncomingParams rtcIncomingParams) {
        C56139Ovz A00 = MWJ.A00(AbstractC166987dD.A0O(rtcCallIntentHandlerActivity), userSession);
        OKi oKi = new OKi(rtcCallIntentHandlerActivity, interfaceC11380iw, userSession);
        C57312k6 A0a = AbstractC25229BEm.A0a(rtcCallIntentHandlerActivity);
        RtcCallKey rtcCallKey = new RtcCallKey(rtcIncomingParams.A00);
        C14360o3.A0B(A00, 4);
        this.A06 = rtcCallIntentHandlerActivity;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A08 = A00;
        this.A00 = false;
        this.A05 = oKi;
        this.A0A = A0a;
        this.A07 = rtcIncomingParams;
        this.A04 = rtcCallKey;
        this.A01 = interfaceC58275PsT;
        this.A09 = AbstractC09440dt.A00(EnumC09460dv.A02, C57548PgM.A01(this, 3));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IncomingCallOperation: callKey=");
        return AbstractC166997dE.A0v(this.A04, A1C);
    }
}
