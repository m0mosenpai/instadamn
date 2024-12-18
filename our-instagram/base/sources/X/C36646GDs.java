package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36646GDs implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("email");
        C140966Yy A0r = AbstractC25225BEi.A0r(this.A00, this.A01);
        C28431Ze A02 = AbstractC31364DqT.A02();
        C14360o3.A0A(queryParameter);
        A0r.A0D(A02.A03(queryParameter, "profile_qp"));
        A0r.A04();
    }

    public C36646GDs(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
