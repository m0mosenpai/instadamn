package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bpb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26640Bpb extends AbstractC77583di {
    public static final C2XI A07;
    public static final C2XI A08;
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C75113Zb A04;
    public final InterfaceC31137Dmc A05;
    public final AbstractC25398BLp A06;

    public C26640Bpb(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC31137Dmc interfaceC31137Dmc, AbstractC25398BLp abstractC25398BLp) {
        AbstractC167007dF.A1F(interfaceC60442pS, 2, c75113Zb);
        AbstractC167017dG.A1U(c37644Ghd, interfaceC31137Dmc);
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
        this.A06 = abstractC25398BLp;
        this.A04 = c75113Zb;
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A05 = interfaceC31137Dmc;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        UserSession userSession = this.A02;
        float A00 = AbstractC25225BEi.A00(AbstractC25225BEi.A0j(userSession, 0), userSession, 37168466591744475L);
        C2YW c2yw = new C2YW(Integer.MAX_VALUE, Integer.MAX_VALUE);
        C2YP A0c = AbstractC25229BEm.A0c(c77993eR, AbstractC25230BEn.A0j(C29013Cr2.A00, false), DFD.A00, new DHY(c77993eR, this, A00, 11));
        C75933ay c75933ay = C51722Yv.A02;
        return AbstractC25225BEi.A0g(AbstractC25396BLn.A01(EnumC71343Hv.A0H, AbstractC25234BEr.A0L(null, C05F.A00, 0, Double.doubleToRawLongBits(44.0d)), this.A00, userSession, this.A03), c2yw, A0c);
    }

    static {
        Float A0l = AbstractC25227BEk.A0l();
        A07 = new C2XI(A0l);
        A08 = new C2XI(A0l);
    }
}
