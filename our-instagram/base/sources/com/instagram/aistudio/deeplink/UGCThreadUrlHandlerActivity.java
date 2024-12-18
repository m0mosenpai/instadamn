package com.instagram.aistudio.deeplink;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.C17060sy;
import X.InterfaceC11380iw;
import X.MBY;
import X.MSV;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes8.dex */
public final class UGCThreadUrlHandlerActivity extends UserSessionUrlHandlerActivity implements InterfaceC11380iw {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        Uri A0B;
        String queryParameter;
        AbstractC167007dF.A1D(userSession, 1, bundle2);
        C17060sy.A01.A01(userSession);
        String string = bundle2.getString(MSV.A00(244));
        if (string != null && (queryParameter = (A0B = AbstractC25227BEk.A0B(string)).getQueryParameter("bot_id")) != null) {
            String queryParameter2 = A0B.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (queryParameter2 == null) {
                queryParameter2 = "unknown";
            }
            AbstractC166987dD.A1Z(new MBY(userSession, this, queryParameter, queryParameter2, null, 1), AbstractC25229BEm.A0a(this));
            return;
        }
        finish();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "UGCThreadUrlHandlerActivity";
    }
}
