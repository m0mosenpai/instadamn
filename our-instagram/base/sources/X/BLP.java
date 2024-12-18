package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BLP implements InterfaceC31043Dkh {
    public BKS A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC43589JPu A03;

    @Override // X.InterfaceC31043Dkh
    public final void DXE(BLC blc, C120985dq c120985dq, int i) {
        C14360o3.A0B(blc, 1);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        UserSession userSession = this.A02;
        InterfaceC43589JPu interfaceC43589JPu = this.A03;
        long j = blc.A01;
        Long l = (Long) blc.A02;
        Long l2 = (Long) blc.A04;
        AbstractC37670Gi3.A05(EnumC120795dP.A02, BQL.A10, (EnumC37731Gj6) blc.A03, interfaceC11380iw, userSession, interfaceC43589JPu, 2, l, l2, i, j);
    }

    @Override // X.InterfaceC31043Dkh
    public final void DXD(C50559MTq c50559MTq, C120985dq c120985dq, C37644Ghd c37644Ghd, int i, int i2, boolean z) {
        BKS bks;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        C14360o3.A0B(c50559MTq, 2);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            AbstractC37670Gi3.A08(EnumC120795dP.A02, BQL.A10, this.A01, this.A02, this.A03, 2, (Long) c50559MTq.A02, (Long) c50559MTq.A03, c50559MTq.A04, i, c50559MTq.A01);
            if (z && (bks = this.A00) != null) {
                bks.A00.A01(c120985dq, c37644Ghd, c38321qM, i, !c120985dq.CdW());
            }
        }
    }

    public /* synthetic */ BLP(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C37604Ggz A00 = AbstractC37497GfF.A00(userSession);
        C14360o3.A0B(A00, 3);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = A00;
    }

    @Override // X.InterfaceC31043Dkh
    public final void EXj(BKS bks) {
        this.A00 = bks;
    }
}
