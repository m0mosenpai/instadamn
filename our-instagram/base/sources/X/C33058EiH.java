package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.EiH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33058EiH extends AbstractC151906sa {
    @Override // X.AbstractC151906sa
    public final void A02() {
        C70D c70d = this.A01;
        UserSession userSession = c70d.A09;
        FRU fru = new FRU(c70d.A0A, userSession);
        EnumC33505Ere enumC33505Ere = EnumC33505Ere.SETTINGS;
        fru.A01(enumC33505Ere);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(EnumC33367Ep0.A0A, null);
        A1G.put(EnumC33367Ep0.A07, enumC33505Ere);
        A1G.put(EnumC33367Ep0.A04, null);
        FragmentActivity fragmentActivity = c70d.A06;
        EOT A00 = AbstractC34039F0s.A00(null, userSession, A1G);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0U = A00;
        A0y.A0T = A00;
        A0y.A0X = null;
        AbstractC31173DnH.A0w(fragmentActivity, A00, A0y);
    }
}
