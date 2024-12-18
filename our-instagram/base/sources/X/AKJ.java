package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes4.dex */
public final class AKJ {
    public final InterfaceC09390do A00;

    public static final void A01(C9CN c9cn, AKJ akj, C97K c97k, Integer num) {
        String str;
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) akj.A00.getValue(), "one_link_debug_event");
        A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c9cn.A03);
        A0f.AAP("flow", c9cn.A04);
        A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, c9cn.A05);
        A0f.AAP("caller_context", ((CallerContext) c9cn.A01).A02);
        A0f.AAP("caller_name", c9cn.A02);
        A0f.AAP("event", "graphql_empty_response_not_found");
        if (c97k.equals(C97J.A00)) {
            str = "ig_business_user_auth_config";
        } else if (c97k instanceof C211799a6) {
            str = "facebook_access_token_auth_config";
        } else {
            throw B4Z.A00();
        }
        A0f.AAP("auth_policy", str);
        if (num != null) {
            str2 = A00(num);
        } else {
            str2 = null;
        }
        A0f.AAP("info_type", str2);
        A0f.Cht();
    }

    public final void A02(C97K c97k, Integer num, String str) {
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A00.getValue(), "one_link_graphql_event");
        A0f.AAP("info_type", A00(num));
        A0f.AAP("event", MSV.A00(1208));
        if (c97k.equals(C97J.A00)) {
            str2 = "ig_business_user_auth_config";
        } else if (c97k instanceof C211799a6) {
            str2 = "facebook_access_token_auth_config";
        } else {
            throw B4Z.A00();
        }
        A0f.AAP("auth_policy", str2);
        A0f.AAP("error_message", str);
        A0f.Cht();
    }

    public AKJ(UserSession userSession) {
        this.A00 = AbstractC09440dt.A01(new X2y(userSession, 49));
    }

    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        return "ad_account";
                    }
                    throw B4Z.A00();
                }
                return "business_account";
            }
            return "whatsapp_business";
        }
        return "fb_page";
    }
}
