package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jmj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44539Jmj extends AbstractC52922bZ {
    public Integer A00;
    public final UserSession A01;
    public final C34507FIt A02;
    public final KZ7 A03;
    public final KNH A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final C05A A0B;

    public C44539Jmj(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A0B = A0o;
        C008002u A1H = AbstractC25225BEi.A1H(AbstractC31171DnF.A0l());
        this.A05 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(AbstractC31171DnF.A0l());
        this.A06 = A1H2;
        C008002u A1H3 = AbstractC25225BEi.A1H(AbstractC31171DnF.A0l());
        this.A08 = A1H3;
        this.A09 = AbstractC208910l.A02(A1H3);
        C008002u A1H4 = AbstractC25225BEi.A1H(AbstractC31171DnF.A0l());
        this.A07 = A1H4;
        C15200pa A01 = C10Q.A01(new GSY(this, 1), A1H4, A1H, A1H2, A0o);
        this.A0A = AbstractC208910l.A01(C49267LqN.A00, AbstractC141776au.A00(this), A01, C10I.A01);
        this.A04 = new KNH(userSession);
        this.A03 = (KZ7) userSession.A01(KZ7.class, new C37056GUm(userSession, 33));
        this.A00 = C05F.A00;
        this.A02 = new C34507FIt(userSession);
    }

    public final void A01(java.util.Set set, int i) {
        List<L0O> A1J;
        C14360o3.A0B(set, 1);
        UserSession userSession = this.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36326738900367423L)) {
            A1J = C148336m3.A04.A06(userSession);
        } else {
            A1J = AbstractC166987dD.A1J(new L0O(EnumC61184Rgk.A05, AbstractC009903n.A0J(C148336m3.A04.A07(userSession))));
        }
        boolean A1P = AbstractC167007dF.A1P(i, 29);
        C05A c05a = this.A05;
        if (!A1P) {
            c05a.Egh(set);
            this.A0B.Egh(A1J);
            return;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : set) {
            AbstractC25228BEl.A1Q(obj, A1E, ((java.util.Set) this.A06.getValue()).contains(obj) ? 1 : 0);
        }
        c05a.Egh(AbstractC001800i.A0j(A1E));
        C05A c05a2 = this.A0B;
        ArrayList A0q = AbstractC167017dG.A0q(A1J);
        for (L0O l0o : A1J) {
            EnumC61184Rgk enumC61184Rgk = l0o.A00;
            List list = l0o.A01;
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj2 : list) {
                AbstractC25228BEl.A1Q(obj2, A1E2, ((java.util.Set) this.A06.getValue()).contains(obj2) ? 1 : 0);
            }
            A0q.add(new L0O(enumC61184Rgk, A1E2));
        }
        c05a2.Egh(A0q);
    }

    public static final ArrayList A00(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C148336m3 c148336m3 = (C148336m3) obj;
            if (i == 0 || (i <= AbstractC25226BEj.A05(list) && !AbstractC170297ii.A01(c148336m3, (C148336m3) list.get(i - 1)))) {
                A1E.add(c148336m3);
            }
            i = i2;
        }
        return A1E;
    }
}
