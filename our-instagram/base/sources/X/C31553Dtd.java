package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dtd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31553Dtd extends AbstractC151906sa {
    public final UserSession A00;

    public C31553Dtd(UserSession userSession, C70D c70d, String str) {
        super(c70d, new C31554Dte(str), "tap_barcelona", R.drawable.instagram_app_threads_pano_outline_24);
        this.A00 = userSession;
    }

    @Override // X.AbstractC151906sa
    public final InterfaceC37108GWt A01() {
        InterfaceC37108GWt interfaceC37108GWt;
        int i;
        C70P c70p = this.A01.A0D;
        if (c70p != null && (i = c70p.A00) > 0) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36320854795101130L)) {
                return new C36585GBj(i);
            }
        }
        if (!AbstractC31172DnG.A1a(AbstractC166987dD.A0x(r5.A09), AbstractC111324zv.A00(4001))) {
            interfaceC37108GWt = C36583GBh.A00;
        } else {
            interfaceC37108GWt = C36584GBi.A00;
        }
        return interfaceC37108GWt;
    }

    @Override // X.AbstractC151906sa
    public final void A02() {
        C70D c70d = this.A01;
        C70P c70p = c70d.A0D;
        boolean z = false;
        if (c70p != null) {
            if (c70p.A00 > 0) {
                z = true;
            }
            if (!C18U.A06(C06090Tz.A05, c70d.A09, 36318857639107185L)) {
                c70p.A00 = 0;
            }
        }
        C70D.A01(c70d);
        UserSession userSession = c70d.A09;
        if (C151366re.A02(userSession) && C151366re.A01(userSession) && C18U.A06(C06090Tz.A05, userSession, 36318857637403225L)) {
            C35135Fec.A00(c70d.A06, userSession);
            return;
        }
        if (z) {
            FragmentActivity fragmentActivity = c70d.A06;
            if (AbstractC14490oL.A0A(fragmentActivity)) {
                AbstractC41776Ies.A02(fragmentActivity, AnonymousClass001.A0R(AbstractC111324zv.A00(3998), ""));
                return;
            } else {
                C35265Fh0.A03(fragmentActivity, userSession, "settings", null);
                return;
            }
        }
        User user = c70d.A0E;
        if (user == null) {
            user = AbstractC166987dD.A10(userSession);
        }
        C35265Fh0.A01(c70d.A06, userSession, null, c70d.A0I, user.getUsername(), "settings");
    }

    @Override // X.AbstractC151906sa
    public final void A03() {
        C70D c70d = this.A01;
        C70D.A01(c70d);
        C35135Fec.A00(c70d.A06, c70d.A09);
    }
}
