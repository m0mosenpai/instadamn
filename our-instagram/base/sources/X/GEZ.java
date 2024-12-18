package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEZ implements GYB {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        A0P.A0A = "QP";
        A0P.A0D(AbstractC34897FZj.A00().A04(fragmentActivity, this.A01, userSession, uri.getQueryParameter("fbid_of_incentive"), "QP"));
        A0P.A04();
    }

    public GEZ(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
