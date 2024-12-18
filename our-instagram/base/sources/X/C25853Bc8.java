package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bc8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25853Bc8 extends AbstractC52922bZ {
    public final CRH A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final boolean A08;
    public final boolean A09;

    public final void A00(String str) {
        AbstractC166997dE.A1Y(this.A04, true);
        C141796aw A00 = AbstractC141776au.A00(this);
        C50120MBu c50120MBu = new C50120MBu(this, str, null, 3);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, new MCD(this, null, 20), AbstractC25235BEs.A0W(this, anonymousClass191, c50120MBu, A00));
    }

    public C25853Bc8(CRH crh, UserSession userSession) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A00 = crh;
        this.A01 = userSession;
        C008002u A00 = C10E.A00(null);
        this.A05 = A00;
        C008002u A002 = C10E.A00(AbstractC06930Yk.A0E());
        this.A03 = A002;
        this.A06 = C10E.A00(null);
        C008002u A1A = AbstractC25235BEs.A1A(A1V);
        this.A04 = A1A;
        this.A02 = C1XM.A00(new C50157MDk(this, 10));
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A08 = C18U.A06(c06090Tz, userSession, 36325081045086925L);
        this.A09 = C18U.A06(c06090Tz, userSession, 36330376737997650L);
        C15230pd A003 = C10Q.A00(new C57183PaJ(this, null, 0), A00, A1A, A002);
        this.A07 = AbstractC208910l.A01(new C26063Bfr(), AbstractC141776au.A00(this), A003, new C15020pI(0L));
    }
}
