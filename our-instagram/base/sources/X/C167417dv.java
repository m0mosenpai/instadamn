package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.7dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167417dv implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "AvatarStickerSuggestionLogger";
    public final C18920wW A00;
    public final UserSession A01;

    public C167417dv(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(this, userSession);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void A00(Integer num, String str, long j, long j2) {
        String str2;
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "contextual_recommendations_avatar_banner_event");
        if (A00.isSampled()) {
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
            C09530e4 c09530e4 = new C09530e4(AbstractC111324zv.A00(63), str);
            switch (num.intValue()) {
                case 0:
                    str2 = "impression";
                    break;
                case 1:
                    str2 = "dismiss";
                    break;
                default:
                    str2 = "enable";
                    break;
            }
            C09530e4 c09530e42 = new C09530e4("action", str2);
            UserSession userSession = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            A00.A9M("extra_client_data", AbstractC06930Yk.A06(c09530e4, c09530e42, new C09530e4("decay_length", String.valueOf(C18U.A01(c06090Tz, userSession, 36604464370750538L))), new C09530e4("impression_limit", String.valueOf(C18U.A01(c06090Tz, userSession, 36604464370816075L))), new C09530e4("impression_count", String.valueOf(j)), new C09530e4("surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT), new C09530e4("cool_down_phase", String.valueOf(j2))));
            A00.Cht();
        }
    }
}
