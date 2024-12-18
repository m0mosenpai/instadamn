package com.instagram.urlhandlers.blokscommerceappeal;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31180DnO;
import X.C140966Yy;
import X.C72743Nv;
import X.MSV;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes7.dex */
public final class BloksCommerceAppealUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, bundle2);
        String string = bundle2.getString("original_url");
        if (string != null) {
            Uri A0B = AbstractC25227BEk.A0B(string);
            String queryParameter = A0B.getQueryParameter("media_id");
            String queryParameter2 = A0B.getQueryParameter("action");
            String queryParameter3 = A0B.getQueryParameter(CacheBehaviorLogger.SOURCE);
            if (queryParameter != null && queryParameter2 != null && queryParameter3 != null) {
                C72743Nv A0G = AbstractC31180DnO.A0G(userSession, MSV.A00(1039), AbstractC06930Yk.A02(AbstractC167007dF.A1b(CacheBehaviorLogger.SOURCE, queryParameter3, AbstractC166987dD.A1L("ig_media_id", queryParameter), AbstractC166987dD.A1L("action", queryParameter2))));
                C140966Yy A0r = AbstractC25225BEi.A0r(this, userSession);
                A0r.A0D(A0G);
                A0r.A0D = false;
                A0r.A04();
                return;
            }
        }
        finish();
    }
}
