package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDM implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        A0P.A0A = "QP";
        A0P.A0D(AbstractC34897FZj.A00().A03(userSession, "QP", AbstractC31172DnG.A11(uri), uri.getQueryParameter("program")));
        A0P.A04();
    }

    public GDM(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}