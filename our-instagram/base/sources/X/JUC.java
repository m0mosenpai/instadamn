package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Map;

/* loaded from: classes8.dex */
public final class JUC {
    public final C18920wW A00;

    public final void A00(String str, Map map, String str2) {
        C14360o3.A0B(map, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_privacy_experience_upsells_event");
        if (A0f.isSampled()) {
            if (str2 != null) {
                map.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            }
            A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
            A0f.AAP("surface", "direct_nudge_android");
            A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "tags");
            A0f.AAP("entrypoint", "tag_direct");
            A0f.A9M("extra_values", map);
            A0f.Cht();
        }
    }

    public JUC(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
