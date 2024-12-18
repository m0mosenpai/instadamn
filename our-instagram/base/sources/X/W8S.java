package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes11.dex */
public abstract class W8S {
    public static final C19270xB A00 = new C19270xB("app");

    public static final void A01(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        C18920wW A01 = AbstractC12220kQ.A01(A00, userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "payments_tap_entry_point");
        if (A002.isSampled()) {
            A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            AbstractC65702TsY.A1F(A002, "ads_manager");
            A002.Cht();
        }
    }

    public static final void A00(VG4 vg4, UserSession userSession, String str) {
        AbstractC167017dG.A1O(vg4, userSession);
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A002 = A02.A00(A02.A00, "promoted_posts_start_step_error");
        if (A002.isSampled()) {
            A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            AbstractC65702TsY.A1F(A002, "boost_posts");
            A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, vg4.toString());
            A002.AAP("fb_user_id", userSession.userId);
            A002.Cht();
        }
    }
}
