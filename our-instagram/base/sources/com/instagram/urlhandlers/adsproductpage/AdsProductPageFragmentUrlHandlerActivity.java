package com.instagram.urlhandlers.adsproductpage;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC41358ISl;
import X.AbstractC43591JPw;
import X.C06N;
import X.C140966Yy;
import X.C1XJ;
import X.C35756Fqt;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes7.dex */
public final class AdsProductPageFragmentUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final C06N A00 = new C35756Fqt(this, 3);

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, bundle2);
        String string = bundle2.getString("original_url");
        if (string != null) {
            getSupportFragmentManager().A0r(this.A00);
            Uri A0B = AbstractC25227BEk.A0B(string);
            String queryParameter = A0B.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            String queryParameter2 = A0B.getQueryParameter("product_id");
            String queryParameter3 = A0B.getQueryParameter(AbstractC43591JPw.A00(132));
            String queryParameter4 = A0B.getQueryParameter("business_username");
            if (queryParameter != null && queryParameter2 != null && queryParameter3 != null && queryParameter4 != null) {
                Long A0d = AbstractC167007dF.A0d();
                C140966Yy A0P = AbstractC31173DnH.A0P(this, userSession);
                C1XJ.A00.A0T();
                AbstractC31175DnJ.A0v(AbstractC41358ISl.A00(null, null, null, null, null, null, null, null, null, A0d, null, null, null, null, null, null, null, queryParameter3, queryParameter4, null, null, null, null, null, "Shop", queryParameter, queryParameter, null, null, null, queryParameter2, null, null, null, null, null, -1, false, false, false, false, false), new AdsProductPageFragment(), A0P);
                return;
            }
        }
        finish();
    }
}
