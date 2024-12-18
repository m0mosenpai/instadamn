package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.VxE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69887VxE {
    public static final void A01(UserSession userSession, String str, String str2) {
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "promoted_posts_tap_component");
        if (A00.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A03("is_business_user_access_token_enabled", true);
            c0Zx.A03("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(AbstractC68468VRy.A00(userSession).A00 != null));
            A00.AAP("component", str2);
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            AbstractC65702TsY.A1F(A00, "boost_posts");
            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "media_selection");
            AbstractC65702TsY.A1B(A00, c0Zx);
        }
    }

    public static final void A00(UserSession userSession, String str, String str2) {
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "promoted_posts_start_step_error");
        if (A00.isSampled()) {
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            AbstractC65702TsY.A1F(A00, "boost_posts");
            A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "media_selection");
            A00.AAP("fb_user_id", userSession.userId);
            A00.AAP("error_message", str2);
            A00.Cht();
        }
    }
}
