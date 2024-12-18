package com.instagram.aistudio.deeplink;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC43591JPw;
import X.C06090Tz;
import X.C14360o3;
import X.C17060sy;
import X.C18U;
import X.C6XJ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.modal.ModalActivity;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes5.dex */
public final class UGCAiCreationUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        String string;
        Class<ModalActivity> cls;
        String str;
        C6XJ A03;
        AbstractC167017dG.A1P(userSession, bundle2);
        C17060sy.A01.A01(userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36324011596197670L) && (string = bundle2.getString("original_url")) != null) {
            Uri A0B = AbstractC25227BEk.A0B(string);
            if ("ugc_quick_create".equals(A0B.getAuthority())) {
                String queryParameter = A0B.getQueryParameter(DevServerEntity.COLUMN_DESCRIPTION);
                String queryParameter2 = A0B.getQueryParameter("campaign_id");
                String queryParameter3 = A0B.getQueryParameter("condition");
                Bundle A0b = AbstractC166987dD.A0b();
                if (queryParameter2 != null) {
                    A0b.putString("AiStudioArgumentKeys.creation_ai_campaign_id", queryParameter2);
                }
                if (queryParameter3 != null) {
                    A0b.putString("AiStudioArgumentKeys.creation_ai_condition", queryParameter3);
                }
                A0b.putString("AiStudioArgumentKeys.creation_entry_point", AbstractC43591JPw.A00(333));
                if (queryParameter == null) {
                    A0b.putString("AiStudioArgumentKeys.creation_ai_description", "");
                    A03 = C6XJ.A03(this, A0b, userSession, ModalActivity.class, "AI_CREATION_CUSTOM_AI");
                } else {
                    A0b.putString("AiStudioArgumentKeys.creation_ai_description", queryParameter);
                    A0b.putString("AiStudioArgumentKeys.selected_template_option_id", A0B.getQueryParameter(AbstractC111324zv.A00(3219)));
                    A03 = C6XJ.A03(this, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(3482));
                }
            } else {
                String queryParameter4 = A0B.getQueryParameter("has_personas");
                Bundle A0b2 = AbstractC166987dD.A0b();
                boolean A0K = C14360o3.A0K(queryParameter4, "True");
                String queryParameter5 = A0B.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                if (A0K) {
                    A0b2.putString("your_ais_entry_point", queryParameter5);
                    cls = ModalActivity.class;
                    str = "YOUR_AIS";
                } else {
                    A0b2.putString("AiStudioArgumentKeys.creation_entry_point", queryParameter5);
                    cls = ModalActivity.class;
                    if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36330101860090558L)) {
                        A03 = C6XJ.A03(this, A0b2, userSession, cls, "AI_CREATION_CUSTOM_AI");
                        A03.A08();
                    } else {
                        str = "AI_CREATION_TEMPLATES";
                    }
                }
                A03 = C6XJ.A03(this, A0b2, userSession, cls, str);
            }
            A03.A0C(this);
        }
        finish();
    }
}
