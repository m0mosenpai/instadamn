package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public abstract class FT3 {
    public static final void A01(AbstractC12990ll abstractC12990ll, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        AbstractC167007dF.A1F(str, 1, str4);
        C19280xC A04 = C1QE.A01("business_profile").A04("business_profile_action");
        A04.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A04.A0C("action", str2);
        A04.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str3);
        A04.A0C("consumer_user_id", str4);
        A04.A0C("follow_status", str5);
        if (bool != null) {
            C19260xA c19260xA = new C19260xA();
            C19260xA.A00(c19260xA, bool.toString(), "should_show_public_contacts");
            A04.A05(c19260xA, "selected_values");
        }
        AbstractC31173DnH.A1S(A04, abstractC12990ll);
    }

    public static final void A00(C19260xA c19260xA, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4) {
        C19280xC A04 = C1QE.A01("business_profile").A04("business_profile_action");
        A04.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A04.A0C("action", str2);
        A04.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "business_profile");
        A04.A0C("consumer_user_id", str3);
        A04.A0C("follow_status", str4);
        A04.A05(c19260xA, "selected_values");
        AbstractC31173DnH.A1S(A04, abstractC12990ll);
    }
}
