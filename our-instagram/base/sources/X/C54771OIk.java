package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.OIk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54771OIk {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public C54771OIk(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        C57550PgO A01 = C57550PgO.A01(this, 22);
        InterfaceC09390do A00 = C57550PgO.A00(C57550PgO.A01(abstractC59962oe, 19), EnumC09460dv.A02, 20);
        C60842q8 A0a = AbstractC25225BEi.A0a(C57550PgO.A01(A00, 21), A01, C57530Pg4.A00(null, A00, 29), AbstractC25225BEi.A1D(C50940Mf9.class));
        this.A02 = A0a;
        JQ0.A11(abstractC59962oe, C57167PZl.A01(this, null, 29), ((C50940Mf9) A0a.getValue()).A06);
    }

    public final void A00(UpcomingEvent upcomingEvent, boolean z, boolean z2) {
        C14360o3.A0B(upcomingEvent, 0);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A02);
        AbstractC166987dD.A1Z(new PZ6(A0Z, upcomingEvent, null, 8, z2, z), AbstractC141776au.A00(A0Z));
    }
}
