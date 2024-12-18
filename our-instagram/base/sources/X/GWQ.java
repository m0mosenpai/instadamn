package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GWQ extends GWS implements InterfaceC13050lr {
    public static final C19270xB A03 = AbstractC31171DnF.A0D("fx_unified_launcher");
    public final C006802i A00;
    public final UserSession A01;
    public final G04 A02;

    public GWQ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = (G04) userSession.A01(G04.class, new C50152MDf(userSession, 18));
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A00 = c006802i;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A01.A03(GWQ.class);
    }

    @Override // X.AbstractC33631Eth
    public final void A03() {
        super.A03();
        this.A00.markerPoint(444800256, "initial_async_controller_request_success");
    }

    @Override // X.AbstractC33631Eth
    public final void A04(String str) {
        super.A04(str);
        C006802i c006802i = this.A00;
        c006802i.markerPoint(444800256, "initial_async_controller_request_failure");
        c006802i.markerEnd(444800256, (short) 87);
    }
}
