package com.instagram.aistudio.deeplink;

import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.C06090Tz;
import X.C0K8;
import X.C14360o3;
import X.C17060sy;
import X.C18U;
import X.C25531Mh;
import X.C28484Chc;
import X.C6XJ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes5.dex */
public final class AiSettingsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        String string;
        AbstractC167017dG.A1P(userSession, bundle2);
        C17060sy.A01.A01(userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36324011596197670L) && (string = bundle2.getString("original_url")) != null) {
            Uri A0B = AbstractC25227BEk.A0B(string);
            String queryParameter = A0B.getQueryParameter("persona_id");
            if (queryParameter != null && queryParameter.length() != 0) {
                String queryParameter2 = A0B.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                C25531Mh A00 = C28484Chc.A00(new C28484Chc(userSession));
                if (AbstractC25226BEj.A1Z(A00)) {
                    A00.A0k("thread_view_edit_ai_confirmation_admin_text_clicked");
                    A00.Cht();
                }
                if (C14360o3.A0K(queryParameter2, "in_thread_admin_text")) {
                    C25531Mh A002 = C28484Chc.A00(new C28484Chc(userSession));
                    if (AbstractC25226BEj.A1Z(A002)) {
                        A002.A0k("thread_view_edit_ai_confirmation_admin_text_clicked");
                        A002.Cht();
                    }
                }
                Bundle bundle3 = new Bundle(0);
                bundle3.putString("persona_id", queryParameter);
                C6XJ.A03(this, bundle3, userSession, ModalActivity.class, "AI_SETTINGS").A0C(this);
            } else {
                C0K8.A0E("AiSettingsUrlHandlerActivity", "Persona id is invalid");
                return;
            }
        }
        finish();
    }
}
