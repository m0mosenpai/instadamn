package com.instagram.urlhandlers.storytemplate;

import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.C14360o3;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes9.dex */
public final class StoryTemplateDiscoverySurfaceUriHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        AbstractC25228BEl.A1G(this, AbstractC166987dD.A0b(), userSession, ModalActivity.class, "story_template_discovery_surface");
    }
}
