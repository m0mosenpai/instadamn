package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDE implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String str;
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("origin");
        if (queryParameter == null) {
            queryParameter = "qp";
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C140966Yy A0B = AbstractC31180DnO.A0B(fragmentActivity, userSession);
        FVI.A00();
        if (C18U.A06(C06090Tz.A05, userSession, 36318956419619632L)) {
            str = "com.bloks.www.ig_subscriptions.creator_experience.special_deals";
        } else {
            str = "com.instagram.user_pay.fan_club.screens.creator_onboarding.special_deals";
        }
        A0B.A0D(AbstractC31180DnO.A0G(userSession, str, AbstractC167017dG.A0r("origin", queryParameter)));
        A0B.A04();
    }

    public GDE(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
