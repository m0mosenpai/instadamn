package com.instagram.urlhandlers.nido;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC70160WDy;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes7.dex */
public final class NidoExplainerDeeplinkHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        String queryParameter;
        AbstractC167017dG.A1P(userSession, bundle2);
        String string = bundle2.getString("original_url");
        if (string != null && string.length() != 0 && (queryParameter = AbstractC25227BEk.A0B(string).getQueryParameter("params")) != null && queryParameter.length() != 0) {
            AbstractC70160WDy.A03(userSession, this, string);
        } else {
            finish();
        }
    }
}
