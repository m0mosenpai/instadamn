package com.instagram.creator.agent.disclosure.inthread.deeplink;

import X.AbstractC08820cl;
import X.AbstractC153636vY;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.AbstractC61636Rr0;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes5.dex */
public final class CreatorAIFanNuxDeeplinkActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, bundle2);
        String A01 = AbstractC153636vY.A01(bundle2, "original_url");
        String queryParameter = AbstractC08820cl.A03(A01).getQueryParameter("creator_id");
        String queryParameter2 = AbstractC08820cl.A03(A01).getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (queryParameter2 == null) {
            queryParameter2 = "unknown";
        }
        AbstractC25228BEl.A1G(this, AbstractC61636Rr0.A00(AbstractC167007dF.A1b("creator_ai_is_new_thread_extra", false, AbstractC166987dD.A1L("creator_ai_creator_igid", queryParameter), AbstractC166987dD.A1L("creator_ai_entry_point_extra", queryParameter2))), userSession, TransparentModalActivity.class, "creator_ai_terms");
        finish();
    }
}
