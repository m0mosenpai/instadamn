package X;

import com.facebook.common.dextricks.DexOptimization;
import com.instagram.common.session.UserSession;
import com.instagram.trials.repository.ActiveTrialsRepository;
import java.util.List;

/* loaded from: classes9.dex */
public final class N87 extends AbstractC61152qd {
    public final UserSession A00;
    public final C153936w2 A01;
    public final ActiveTrialsRepository A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;

    public N87(UserSession userSession, C153936w2 c153936w2, ActiveTrialsRepository activeTrialsRepository) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = activeTrialsRepository;
        this.A01 = c153936w2;
        C008002u A00 = C10E.A00(NXF.A00);
        this.A04 = A00;
        this.A08 = AbstractC208910l.A02(A00);
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A03 = A0o;
        this.A07 = AbstractC208910l.A02(A0o);
        this.A06 = AbstractC25227BEk.A0z();
        this.A05 = AbstractC25235BEs.A1A(true);
        A01(this, false);
    }

    public static final void A01(N87 n87, boolean z) {
        C153936w2.A04(C153936w2.A03((Boolean) n87.A05.getValue(), null), n87.A01, DexOptimization.OPT_KEY_CLIENT, "trials_page", "page_load_init", null, null);
        PZK.A01(n87, AbstractC141776au.A00(n87), 4, z);
    }

    public final void A02() {
        if (AbstractC31176DnK.A1b(this.A05)) {
            C0UO c0uo = this.A08;
            if (!C14360o3.A0K(c0uo.getValue(), NXF.A00) && !C14360o3.A0K(c0uo.getValue(), NXG.A00)) {
                A01(this, false);
            }
        }
    }

    public static final void A00(N87 n87, List list) {
        Object nxd;
        boolean isEmpty = list.isEmpty();
        C05A c05a = n87.A04;
        if (isEmpty) {
            nxd = NXH.A00;
        } else {
            nxd = new NXD(list);
        }
        c05a.Egh(nxd);
    }
}
