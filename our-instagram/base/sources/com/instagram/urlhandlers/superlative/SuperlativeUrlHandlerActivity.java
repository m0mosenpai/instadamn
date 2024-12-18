package com.instagram.urlhandlers.superlative;

import X.AbstractC167017dG;
import X.AbstractC40784I5m;
import X.C06090Tz;
import X.C18U;
import X.C1GJ;
import X.C1ON;
import X.C39028HGe;
import X.C6WQ;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes7.dex */
public final class SuperlativeUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, bundle2);
        String string = bundle2.getString("original_url");
        if (string != null && C18U.A06(C06090Tz.A05, userSession, 36319394506218908L)) {
            C1ON A00 = AbstractC40784I5m.A00(userSession);
            A00.A00 = new C39028HGe(new C6WQ(this, true), this, userSession, string, 5);
            C1GJ.A06(A00, -5, 1, true, true);
            return;
        }
        finish();
    }
}
