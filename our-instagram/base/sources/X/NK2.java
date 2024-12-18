package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NK2 extends OX6 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final AbstractC55082Oac A02;
    public final InterfaceC09390do A03;
    public final C05A A04;
    public final C0UO A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NK2(InterfaceC11380iw interfaceC11380iw, UserSession userSession, AbstractC55082Oac abstractC55082Oac, boolean z, boolean z2, boolean z3) {
        super(abstractC55082Oac);
        int A07 = AbstractC25230BEn.A07(2, userSession, interfaceC11380iw);
        this.A02 = abstractC55082Oac;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        C008002u A1H = AbstractC25225BEi.A1H(new C50526MSf(A07, 9, false));
        this.A04 = A1H;
        this.A05 = A1H;
        this.A03 = C1XM.A00(new C50161MDo(this, 0));
    }
}
