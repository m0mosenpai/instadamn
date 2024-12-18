package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OBG {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public OBG(AbstractC59962oe abstractC59962oe, UserSession userSession, NYQ nyq, C53021Nct c53021Nct) {
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        C43210J8h c43210J8h = new C43210J8h(36, this, abstractC59962oe, c53021Nct);
        InterfaceC09390do A00 = C57541PgF.A00(C57541PgF.A01(abstractC59962oe, 48), EnumC09460dv.A02, 49);
        this.A02 = AbstractC25225BEi.A0a(new C57547PgL(A00, 0), c43210J8h, C57532Pg6.A00(null, A00, 25), AbstractC25225BEi.A1D(C51037Mgm.class));
        this.A00 = abstractC59962oe.requireContext();
        JQ0.A11(abstractC59962oe, new PZN(nyq, this, null, 7), ((C51037Mgm) this.A02.getValue()).A0F);
    }
}
