package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BKg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25363BKg extends AbstractC52922bZ {
    public final UserSession A00;
    public final C25482BOw A01;
    public final C68R A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final C0UO A05;
    public final C0UO A06;
    public final C0UO A07;
    public final boolean A08;

    public C25363BKg(UserSession userSession, C25482BOw c25482BOw, C68R c68r, boolean z) {
        Integer num;
        C0UO A01;
        AbstractC167007dF.A1E(c25482BOw, 2, c68r);
        this.A00 = userSession;
        this.A01 = c25482BOw;
        this.A02 = c68r;
        this.A08 = z;
        this.A03 = AbstractC09440dt.A01(new C29889DGd(this, 22));
        this.A04 = AbstractC09440dt.A01(new C29889DGd(this, 23));
        C50540MSt c50540MSt = new C50540MSt(c68r.A02, 17);
        C141796aw A00 = AbstractC141776au.A00(this);
        C10H c10h = C10I.A01;
        this.A06 = AbstractC208910l.A01(C25484BOy.A00, A00, c50540MSt, c10h);
        this.A05 = c68r.A03;
        UserSession userSession2 = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36323096770194409L)) {
            num = C05F.A00;
        } else if (C18U.A06(c06090Tz, userSession2, 36323096770063335L)) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        int intValue = num.intValue();
        if (intValue != 0 && intValue != 2) {
            A01 = AbstractC25225BEi.A1H(new MVM(C05F.A01));
        } else {
            A01 = AbstractC208910l.A01(new NH9(num), AbstractC141776au.A00(this), new D39(0, this, num, c25482BOw.A02), c10h);
        }
        this.A07 = A01;
        if ((AbstractC167007dF.A1Z(this.A03) || AbstractC167007dF.A1Z(this.A04)) && !(!c25482BOw.A02.getValue().equals(C25483BOx.A00))) {
            AbstractC166987dD.A1Z(new MBT(c25482BOw, null, 39), ((C4A7) c25482BOw).A01);
        }
    }
}
