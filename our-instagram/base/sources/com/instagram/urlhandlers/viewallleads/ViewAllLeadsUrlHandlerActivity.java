package com.instagram.urlhandlers.viewallleads;

import X.AbstractC08820cl;
import X.AbstractC167017dG;
import X.C14360o3;
import X.WFR;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes11.dex */
public final class ViewAllLeadsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, bundle2);
        String string = bundle2.getString("original_url");
        if (string != null && string.length() != 0) {
            Uri A03 = AbstractC08820cl.A03(string);
            C14360o3.A07(A03);
            WFR.A01(this, userSession, "com.bloks.www.ig.smb.services.lead_gen.all_leads", WFR.A00(A03));
            return;
        }
        finish();
    }
}
