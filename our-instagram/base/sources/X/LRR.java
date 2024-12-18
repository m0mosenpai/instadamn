package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LRR implements InterfaceC118965aD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C47599L0j A01;
    public final /* synthetic */ C44463JlV A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public LRR(C47599L0j c47599L0j, C44463JlV c44463JlV, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, int i, boolean z) {
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A02 = c44463JlV;
        this.A05 = str;
        this.A01 = c47599L0j;
        this.A06 = z;
        this.A00 = i;
    }

    @Override // X.InterfaceC118965aD
    public final void dispose() {
        String str;
        UserSession userSession = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C44463JlV c44463JlV = this.A02;
        long j = c44463JlV.A02;
        long currentTimeMillis = System.currentTimeMillis() - c44463JlV.A00;
        String str2 = c44463JlV.A09;
        C38321qM A02 = C1DW.A00(userSession).A02(this.A05);
        if (A02 != null) {
            str = A02.A0C.getLoggingInfoToken();
        } else {
            str = null;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "barcelona_media_viewer_exit");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1D(A0f, interfaceC60442pS.getModuleName());
            AbstractC25225BEi.A1N(A0f, AbstractC31178DnM.A0b());
            AbstractC25230BEn.A1B(A0f, j);
            A0f.A9K("duration_ms", Long.valueOf(currentTimeMillis));
            A0f.AAP("viewer_session_id", str2);
            AbstractC25229BEm.A1B(A0f, str);
        }
        C47599L0j c47599L0j = this.A01;
        boolean z = this.A06;
        C011904h c011904h = c47599L0j.A00;
        if (c011904h != null) {
            AbstractC011704f abstractC011704f = c011904h.A00;
            abstractC011704f.A05(z);
            abstractC011704f.A04(z);
            abstractC011704f.A03(1);
        }
        int i = this.A00;
        if (c011904h != null) {
            c011904h.A00.A02(i);
        }
    }
}
