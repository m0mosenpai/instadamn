package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36621GCt implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        boolean z;
        C14360o3.A0B(uri, 0);
        String A00 = F9A.A00(uri.getQueryParameter("origin"));
        if (A00 == null) {
            A00 = "QP";
        }
        String queryParameter = uri.getQueryParameter("start_onboarding");
        if (queryParameter != null) {
            z = Boolean.parseBoolean(queryParameter);
        } else {
            z = false;
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        A0P.A0A = A00;
        A0P.A0B(null, C27S.A00().A02().A00(userSession, A00, AbstractC31172DnG.A11(uri), null, z));
        A0P.A04();
    }

    public C36621GCt(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
