package com.instagram.urlhandlers.creatortools;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.C09530e4;
import X.C140966Yy;
import X.C26775Brw;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes5.dex */
public final class CreatorToolsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, bundle2);
        String string = bundle2.getString("original_url");
        if (string == null) {
            finish();
            return;
        }
        String queryParameter = AbstractC25227BEk.A0B(string).getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        C140966Yy A0r = AbstractC25225BEi.A0r(this, userSession);
        C26775Brw c26775Brw = new C26775Brw();
        AbstractC25227BEk.A1C(c26775Brw, new C09530e4[]{AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter)});
        A0r.A0D(c26775Brw);
        A0r.A08();
        A0r.A0D = false;
        A0r.A04();
    }
}
