package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Odl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55180Odl {
    public static String A01(InterfaceC02590Ai interfaceC02590Ai, EnumC222416a enumC222416a, String str, String str2) {
        interfaceC02590Ai.AAP("event_name", str);
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        if (enumC222416a != null) {
            return String.valueOf(enumC222416a.A00);
        }
        return null;
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, String str3) {
        interfaceC02590Ai.AAP("ig_user_account_type", str);
        interfaceC02590Ai.AAP(AbstractC37314GcG.A00(), str2);
        interfaceC02590Ai.AAP("waterfall_id", str3);
        interfaceC02590Ai.Cht();
    }

    public static InterfaceC02590Ai A00(AbstractC12990ll abstractC12990ll) {
        C18920wW A02 = AbstractC12220kQ.A02(abstractC12990ll);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "ig_xposting_to_fb_client");
        A00.AAP("flow_name", "ig_feed_crossposting_to_fb");
        return A00;
    }

    public static final void A03(UserSession userSession, ShareType shareType, String str, String str2, String str3) {
        AbstractC167017dG.A1N(userSession, shareType);
        if (str != null) {
            EnumC222416a A0I = AbstractC166997dE.A0Y(userSession).A0I();
            if (shareType == ShareType.A0H || (shareType == ShareType.A0J && str.equals("video_feed_composer"))) {
                InterfaceC02590Ai A00 = A00(userSession);
                A02(A00, A01(A00, A0I, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, str), str2, str3);
            }
        }
    }

    public static final void A04(UserSession userSession, ShareType shareType, String str, String str2, String str3) {
        AbstractC167017dG.A1N(userSession, shareType);
        if (str != null) {
            EnumC222416a A0I = AbstractC166997dE.A0Y(userSession).A0I();
            if (shareType == ShareType.A0H || (shareType == ShareType.A0J && str.equals("video_feed_composer"))) {
                InterfaceC02590Ai A00 = A00(userSession);
                A02(A00, A01(A00, A0I, "success", str), str2, str3);
            }
        }
    }

    public static final void A05(UserSession userSession, String str, String str2, String str3) {
        EnumC222416a A0I = AbstractC31178DnM.A0T(userSession).A0I();
        InterfaceC02590Ai A00 = A00(userSession);
        A02(A00, A01(A00, A0I, "primary_click", str), str2, str3);
    }
}
