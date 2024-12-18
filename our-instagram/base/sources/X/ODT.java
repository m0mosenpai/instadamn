package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ODT {
    public final Context A00;
    public final AbstractC59962oe A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC09390do A04;

    public ODT(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = abstractC59962oe;
        this.A03 = userSession;
        C57555PgT c57555PgT = new C57555PgT(this, 14);
        InterfaceC09390do A01 = C57555PgT.A01(new C57555PgT(abstractC59962oe, 11), EnumC09460dv.A02, 12);
        this.A04 = AbstractC25225BEi.A0a(new C57555PgT(A01, 13), c57555PgT, C57530Pg4.A00(null, A01, 19), AbstractC25225BEi.A1D(C50953MfM.class));
        this.A00 = abstractC59962oe.requireContext();
        this.A02 = abstractC59962oe;
        JQ0.A11(abstractC59962oe, C57167PZl.A01(this, null, 20), ((C50953MfM) this.A04.getValue()).A04);
    }
}
