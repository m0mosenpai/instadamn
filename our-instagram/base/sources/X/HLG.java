package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HLG extends AbstractC42537IsG {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Ck5(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        InterfaceC02590Ai A01;
        Long A0n;
        String str;
        C41181vS c41181vS = (C41181vS) c1ni;
        AbstractC167017dG.A1N(interfaceC60442pS, c41181vS);
        if (!c41181vS.CdW() && this.A03) {
            A01 = AbstractC166987dD.A0f(AbstractC37302Gc3.A0H(interfaceC60442pS, AbstractC31177DnL.A0P(this.A00)), "instagram_organic_impression_second_channel");
            if (A01.isSampled()) {
                AbstractC37300Gc1.A0l(A01, c41181vS.A0j);
                A0n = AbstractC54128NwQ.A00(c41181vS);
                str = "m_t";
            } else {
                return;
            }
        } else {
            if (!c41181vS.CdW() || !this.A01) {
                return;
            }
            UserSession userSession = this.A00;
            A01 = AbstractC42537IsG.A01(interfaceC60442pS, AbstractC31177DnL.A0P(userSession));
            if (!A01.isSampled()) {
                return;
            }
            AbstractC37300Gc1.A0l(A01, c41181vS.A0j);
            A01.A9K("m_t", AbstractC54128NwQ.A00(c41181vS));
            AbstractC37300Gc1.A0o(A01, c41181vS.BzL(userSession));
            A0n = AbstractC25233BEq.A0n(c41181vS.A0V(userSession));
            str = "ad_id";
        }
        A01.A9K(str, A0n);
        A01.Cht();
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Cls(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        InterfaceC02590Ai A02;
        Long A0n;
        String str;
        C41181vS c41181vS = (C41181vS) c1ni;
        AbstractC167017dG.A1N(interfaceC60442pS, c41181vS);
        if (!c41181vS.CdW() && this.A04) {
            A02 = AbstractC166987dD.A0f(AbstractC37302Gc3.A0H(interfaceC60442pS, AbstractC31177DnL.A0P(this.A00)), "instagram_organic_sub_impression_second_channel");
            if (A02.isSampled()) {
                AbstractC37300Gc1.A0l(A02, c41181vS.A0j);
                A0n = AbstractC54128NwQ.A00(c41181vS);
                str = "m_t";
            } else {
                return;
            }
        } else {
            if (!c41181vS.CdW() || !this.A02) {
                return;
            }
            UserSession userSession = this.A00;
            A02 = AbstractC42537IsG.A02(interfaceC60442pS, AbstractC31177DnL.A0P(userSession));
            if (!A02.isSampled()) {
                return;
            }
            AbstractC37300Gc1.A0l(A02, c41181vS.A0j);
            A02.A9K("m_t", AbstractC54128NwQ.A00(c41181vS));
            AbstractC37300Gc1.A0o(A02, c41181vS.BzL(userSession));
            A0n = AbstractC25233BEq.A0n(c41181vS.A0V(userSession));
            str = "ad_id";
        }
        A02.A9K(str, A0n);
        A02.Cht();
    }

    public HLG(UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = userSession;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }
}
