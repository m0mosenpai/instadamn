package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9Fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207379Fq extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207379Fq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A09 = obj;
        this.A08 = obj2;
        this.A0A = z;
        this.A06 = obj3;
        this.A05 = obj4;
        this.A03 = obj5;
        this.A04 = obj6;
        this.A01 = obj7;
        this.A07 = obj8;
        this.A02 = obj9;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            C38321qM c38321qM = (C38321qM) this.A05;
            C38321qM c38321qM2 = (C38321qM) this.A03;
            C75113Zb c75113Zb = (C75113Zb) this.A06;
            InterfaceC86303t2 interfaceC86303t2 = (InterfaceC86303t2) this.A01;
            InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) this.A04;
            UserSession userSession = (UserSession) this.A09;
            InterfaceC86363t8 interfaceC86363t8 = (InterfaceC86363t8) this.A07;
            AbstractC86333t5.A01(userSession, c38321qM, c38321qM2, interfaceC60442pS, c75113Zb, interfaceC86303t2, (C3YE) this.A08, (C3YD) this.A02, interfaceC86363t8);
        } else {
            C6Nu c6Nu = (C6Nu) obj;
            C14360o3.A0B(c6Nu, 0);
            UserSession userSession2 = (UserSession) this.A09;
            float A00 = (float) C18U.A00(C06090Tz.A05, userSession2, 37170691384672784L);
            C132335yC c132335yC = (C132335yC) this.A08;
            if (!c132335yC.A08) {
                C5Hc c5Hc = c132335yC.A06;
                C136466Ga c136466Ga = C136466Ga.A00;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A06;
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A05;
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A03;
                InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) this.A04;
                C5yI c5yI = (C5yI) this.A01;
                InterfaceC132365yF interfaceC132365yF = (InterfaceC132365yF) this.A07;
                c6Nu.CgN(new C207179Ew(12, c5Hc, c136466Ga), new C206849Dp(c5Hc, 29), C5UA.A03(new C30738Dfa(c5yI, interfaceC132365yF, userSession2, c5Hc, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16620sF, A00), -1091073711), c5Hc.size());
            } else {
                c6Nu.CgH("loading_shimmer", C5UA.A03(new C30514Dbx(c132335yC, A00), -2077470058));
            }
            if (this.A0A) {
                c6Nu.CgH("see_more_card", C5UA.A03(new C30525Dc8(c132335yC, (InterfaceC16820sZ) this.A02, A00), 658710280));
            }
        }
        return C0eB.A00;
    }
}
