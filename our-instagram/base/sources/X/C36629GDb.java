package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36629GDb implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("product");
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        A0P.A0A = "QP";
        A0P.A0B(null, AbstractC34823FVz.A00().A00(AbstractC104314mu.A00(queryParameter), userSession, null, false));
        A0P.A04();
    }

    public C36629GDb(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
