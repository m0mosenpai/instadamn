package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.EiI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33059EiI extends AbstractC151906sa {
    @Override // X.AbstractC151906sa
    public final void A02() {
        C70D c70d = this.A01;
        FragmentActivity fragmentActivity = c70d.A06;
        UserSession userSession = c70d.A09;
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        int i = 2131957244;
        if (C18U.A06(C06090Tz.A05, userSession, 36321499040589327L)) {
            i = 2131957153;
        }
        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(2097), AbstractC167017dG.A0r("entrypoint", "profile_menu_native"));
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A10(fragmentActivity, A0C, i);
        A0r.A0E(W6d.A02(A0C, A01));
        A0r.A04();
    }
}
