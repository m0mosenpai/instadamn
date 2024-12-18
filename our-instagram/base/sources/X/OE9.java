package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OE9 {
    public AnonymousClass195 A00;
    public final Context A01;
    public final AbstractC59962oe A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC09390do A05;

    public OE9(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A02 = abstractC59962oe;
        this.A04 = userSession;
        C57555PgT c57555PgT = new C57555PgT(this, 25);
        InterfaceC09390do A01 = C57555PgT.A01(new C57555PgT(abstractC59962oe, 22), EnumC09460dv.A02, 23);
        this.A05 = AbstractC25225BEi.A0a(new C57555PgT(A01, 24), c57555PgT, C57530Pg4.A00(null, A01, 21), AbstractC25225BEi.A1D(C50954MfN.class));
        this.A01 = abstractC59962oe.requireContext();
        this.A03 = abstractC59962oe;
    }
}
