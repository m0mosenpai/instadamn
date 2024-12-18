package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

/* renamed from: X.EiJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33060EiJ extends AbstractC151906sa {
    @Override // X.AbstractC151906sa
    public final void A02() {
        Fragment c26761Bri;
        C70D c70d = this.A01;
        UserSession userSession = c70d.A09;
        AbstractC28393Cfw.A03(userSession, "hamburger_menu", "creator_tools_row");
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36315778143882803L);
        C140966Yy A0r = AbstractC25225BEi.A0r(c70d.A06, userSession);
        if (A06) {
            c26761Bri = CIQ.A00(ValuePropsFlow.A04.A00, null);
        } else {
            c26761Bri = new C26761Bri();
        }
        A0r.A0E(c26761Bri);
        A0r.A04();
    }
}
