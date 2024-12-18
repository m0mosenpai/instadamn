package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEU implements GYB {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final FLA A02;

    public GEU(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(abstractC59962oe, 1);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = new FLA(abstractC59962oe, userSession);
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        FLA fla = this.A02;
        AbstractC34213F7l.A00().A01(fla.A01, fla.A02, new C36783GJg(fla, 3)).A06("ig_fb_profile_link_integration", null);
    }
}
