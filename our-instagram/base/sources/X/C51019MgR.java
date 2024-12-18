package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MgR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51019MgR extends AbstractC52922bZ {
    public final C2GT A00;
    public final O2D A01;
    public final EnumC53098NeB A02;
    public final C54681ODh A03;
    public final O2E A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C0UO A07;
    public final UserSession A08;
    public final String A09;
    public final C0UO A0A;

    public C51019MgR(C12N c12n, UserSession userSession, O2D o2d, EnumC53098NeB enumC53098NeB, C54681ODh c54681ODh, O2E o2e, String str) {
        AbstractC167017dG.A1T(userSession, str);
        C14360o3.A0B(c12n, 7);
        this.A03 = c54681ODh;
        this.A01 = o2d;
        this.A04 = o2e;
        this.A02 = enumC53098NeB;
        this.A08 = userSession;
        this.A09 = str;
        C05A c05a = c54681ODh.A05;
        AnonymousClass059 A02 = AbstractC208910l.A02(c05a);
        this.A0A = A02;
        C05A c05a2 = c54681ODh.A04;
        AnonymousClass059 A022 = AbstractC208910l.A02(c05a2);
        this.A07 = A022;
        InterfaceC19390xP A00 = C0ST.A00(new C57228PbC(this, 7), AbstractC011604e.A01(c12n.AOT(1369994819, 3), C10Q.A03(C57196Pag.A00, A02, A022)));
        C16400rl c16400rl = new C16400rl(new PYX(this, null, 30), AbstractC208910l.A01(new C51658Mrp((Integer) c05a.getValue(), (String) c05a2.getValue()), AbstractC141776au.A00(this), A00, C10I.A00));
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A00 = AbstractC58232lf.A00(anonymousClass191, c16400rl);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A05 = A12;
        this.A06 = AbstractC07080Za.A03(A12);
        AbstractC23641Du.A05(anonymousClass191, new PYv(this, null, 13), AbstractC141776au.A00(this));
    }

    public static final void A00(C51019MgR c51019MgR) {
        if (C14360o3.A0K(c51019MgR.A09, "clips_share_sheet")) {
            AnonymousClass229.A01(c51019MgR.A08).A1C(EnumC53380NjV.A04, C81X.A04);
            return;
        }
        MX1.A00(c51019MgR.A08).A04("ADD_MESSAGE_BUTTON_TAPPED");
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C54681ODh c54681ODh = this.A03;
        C25671My A00 = AbstractC25651Mw.A00(c54681ODh.A02);
        A00.A02(c54681ODh.A01, C55982OtF.class);
        A00.A02(c54681ODh.A00, C56009Otg.class);
    }
}
