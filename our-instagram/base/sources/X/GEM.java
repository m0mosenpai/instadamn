package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEM implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        UserSession userSession = this.A01;
        if (AbstractC63292u7.A03(userSession)) {
            String queryParameter = uri.getQueryParameter("origin");
            if (queryParameter == null) {
                java.util.Set set = FE3.A00;
                queryParameter = "fan_qp_upsell";
            }
            String queryParameter2 = uri.getQueryParameter(AbstractC111324zv.A00(2705));
            if (queryParameter2 != null) {
                FVI.A01().A05(this.A00, userSession, queryParameter2, queryParameter);
            }
        }
    }

    public GEM(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
