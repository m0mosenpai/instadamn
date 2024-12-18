package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mfh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50974Mfh extends AbstractC52922bZ {
    public C51739MtM A00;
    public final C2GT A01;
    public final O2F A02;
    public final OEM A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC19390xP A05;
    public final UserSession A06;
    public final InterfaceC19390xP A07;
    public final C05A A08;

    public C50974Mfh(C12N c12n, UserSession userSession, O2F o2f, OEM oem) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c12n, 4);
        this.A06 = userSession;
        this.A03 = oem;
        this.A02 = o2f;
        C008002u A00 = C10E.A00(null);
        this.A08 = A00;
        C05A c05a = oem.A06;
        AnonymousClass059 A02 = AbstractC208910l.A02(c05a);
        C05A c05a2 = oem.A05;
        C15150pV A03 = C10Q.A03(C57197Pah.A00, A02, AbstractC208910l.A02(c05a2));
        this.A07 = A03;
        InterfaceC19390xP A01 = AbstractC011604e.A01(c12n.AOT(1369994819, 3), new C16400rl(new PYv(this, null, 16), C10Q.A03(C57198Pai.A00, A03, A00)));
        C141796aw A002 = AbstractC141776au.A00(this);
        C10H c10h = C10I.A00;
        C51739MtM c51739MtM = (C51739MtM) c05a.getValue();
        List list = (List) c05a2.getValue();
        AbstractC167017dG.A1N(c51739MtM, list);
        AnonymousClass059 A012 = AbstractC208910l.A01(new C51657Mro(new C51659Mrq(c51739MtM, list)), A002, A01, c10h);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, A012);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A04 = A12;
        this.A05 = AbstractC07080Za.A03(A12);
        AbstractC23641Du.A05(anonymousClass191, new PYv(this, null, 15), AbstractC141776au.A00(this));
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        OEM oem = this.A03;
        AbstractC25651Mw.A00(oem.A03).A02(oem.A02, C56008Otf.class);
    }
}
