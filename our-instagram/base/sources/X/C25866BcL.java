package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.BcL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25866BcL extends AbstractC52922bZ {
    public C28176CbO A00;
    public Long A01;
    public final UserSession A02;
    public final String A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGV(this, 37));
    public final InterfaceC19390xP A05;
    public final C05A A06;
    public final C05A A07;
    public final C0UO A08;
    public final C27960CUf A09;

    public static final void A00(C25866BcL c25866BcL, boolean z) {
        C05A c05a = c25866BcL.A07;
        C45124Jxt c45124Jxt = (C45124Jxt) c05a.getValue();
        c05a.F8m(C45124Jxt.A00((C7T) c45124Jxt.A04, (Boolean) c45124Jxt.A03, (C5Hc) c45124Jxt.A05, z, c45124Jxt.A00));
        if (C18U.A06(C06090Tz.A05, c25866BcL.A02, 36328250729577865L)) {
            c25866BcL.A06.F8m(new C26198BiO(z, 2));
        }
        c25866BcL.A09.A00(z);
    }

    public final void A01() {
        C05A c05a = this.A07;
        C45124Jxt c45124Jxt = (C45124Jxt) c05a.getValue();
        boolean z = !((C45124Jxt) c05a.getValue()).A00;
        boolean z2 = c45124Jxt.A01;
        Boolean bool = (Boolean) c45124Jxt.A03;
        C7T c7t = (C7T) c45124Jxt.A04;
        Collection collection = (Collection) c45124Jxt.A05;
        C14360o3.A0B(collection, 3);
        ArrayList A1F = AbstractC166987dD.A1F(collection);
        ArrayList A0q = AbstractC167017dG.A0q(A1F);
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            BJF bjf = (BJF) it.next();
            String str = bjf.A01;
            String str2 = bjf.A02;
            AbstractC167007dF.A1K(str, str2);
            A0q.add(new BJF(str, str2, 2, false));
        }
        c05a.F8m(C45124Jxt.A00(c7t, bool, AbstractC133095zb.A00(A0q), z2, z));
    }

    public C25866BcL(UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A09 = CHW.A00(userSession);
        C008002u A1H = AbstractC25225BEi.A1H(new C45124Jxt(!r3.A01()));
        this.A07 = A1H;
        this.A08 = AbstractC208910l.A02(A1H);
        C008002u A00 = C10E.A00(C29234Cud.A00);
        this.A06 = A00;
        this.A05 = AbstractC208910l.A02(A00);
    }
}
