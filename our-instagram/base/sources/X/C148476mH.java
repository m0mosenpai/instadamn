package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6mH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148476mH {
    public C143556du A00;
    public AbstractC125325le A01;
    public final C60842q8 A02;
    public final UserSession A03;
    public final C149766oT A04;

    public C148476mH(C07X c07x, InterfaceC018407e interfaceC018407e, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C148426mC c148426mC) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = new C149766oT(userSession);
        this.A02 = new C60842q8(new C9E9(interfaceC018407e, 18), new C9FL(8, interfaceC11380iw, c148426mC, this), C149636oG.A00, new C0YZ(C148456mF.class));
        C57312k6 A00 = C07Y.A00(c07x);
        C9DG c9dg = new C9DG(c07x, interfaceC11380iw, this, null, 7);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, c9dg, A00);
        AbstractC23641Du.A03(num, anonymousClass191, new C9D4(c07x, this, (InterfaceC23621Ds) null, 25), C07Y.A00(c07x));
    }

    public final void A00(InterfaceC143576dw interfaceC143576dw, int i) {
        C143556du c143556du;
        InterfaceC56392iX interfaceC56392iX;
        InterfaceC56392iX interfaceC56392iX2;
        InterfaceC56392iX interfaceC56392iX3;
        InterfaceC56392iX interfaceC56392iX4;
        if (interfaceC143576dw instanceof C143556du) {
            c143556du = (C143556du) interfaceC143576dw;
        } else {
            c143556du = null;
        }
        this.A00 = c143556du;
        if (c143556du != null && (interfaceC56392iX4 = c143556du.A1e.A1Z) != null) {
            AbstractC141496aS.A01(interfaceC56392iX4, new C206969Eb(this, 45));
        }
        C143556du c143556du2 = this.A00;
        if (c143556du2 != null && (interfaceC56392iX3 = c143556du2.A0x) != null) {
            AbstractC141496aS.A01(interfaceC56392iX3, new C207079Em(this, i, 3));
        }
        C143556du c143556du3 = this.A00;
        if (c143556du3 != null && (interfaceC56392iX2 = c143556du3.A1e.A1a) != null) {
            AbstractC141496aS.A01(interfaceC56392iX2, new C206969Eb(this, 46));
        }
        C143556du c143556du4 = this.A00;
        if (c143556du4 != null && (interfaceC56392iX = c143556du4.A0z) != null) {
            AbstractC141496aS.A01(interfaceC56392iX, new C207079Em(this, i, 4));
        }
    }
}
