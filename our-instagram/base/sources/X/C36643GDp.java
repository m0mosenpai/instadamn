package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36643GDp implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("email");
        if (queryParameter != null) {
            C140966Yy A0r = AbstractC25225BEi.A0r(this.A00.requireActivity(), this.A01);
            A0r.A0D(AbstractC31364DqT.A02().A03(queryParameter, "profile_qp"));
            A0r.A04();
        }
    }

    public C36643GDp(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
