package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AGP {
    public InterfaceC178837wv A00;
    public InterfaceC179117xN A01;
    public C23327AVm A02;
    public final UserSession A05;
    public final String A06;
    public final C219919nd A08;
    public final C208719Lf A09;
    public final InterfaceC25204BDc A03 = new C23505AbL(this);
    public final InterfaceC178837wv A07 = new C23329AVo(this, 7);
    public final InterfaceC25205BDd A04 = new C23514AbU(this);

    public static C23327AVm A00(AGP agp) {
        C23327AVm c23327AVm = agp.A02;
        if (c23327AVm == null) {
            C178577wV c178577wV = agp.A09.A09.A07;
            c178577wV.getClass();
            AbstractC179687yI abstractC179687yI = (AbstractC179687yI) ((C9PF) c178577wV.A01(C9PF.A00));
            InterfaceC178067vf Aq0 = abstractC179687yI.A00.Aq0(InterfaceC178817wt.A01);
            C14360o3.A07(Aq0);
            C23327AVm c23327AVm2 = new C23327AVm((InterfaceC178817wt) Aq0, agp.A08);
            agp.A02 = c23327AVm2;
            return c23327AVm2;
        }
        return c23327AVm;
    }

    public AGP(UserSession userSession, C219919nd c219919nd, C208719Lf c208719Lf, String str) {
        this.A05 = userSession;
        this.A09 = c208719Lf;
        this.A08 = c219919nd;
        this.A06 = str;
    }
}
