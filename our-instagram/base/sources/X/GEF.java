package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEF implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("product");
        String queryParameter2 = uri.getQueryParameter("created_deal_id");
        String queryParameter3 = uri.getQueryParameter("fe_id");
        FW0.A01(null, this.A00, AbstractC104314mu.A00(queryParameter), this.A01, "ResumePayoutOnboardingActionHandler", "QP", queryParameter2, queryParameter3, null);
    }

    public GEF(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
