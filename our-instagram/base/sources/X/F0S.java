package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes6.dex */
public abstract class F0S {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "learn_from_others";
            case 2:
                return "share_media";
            case 3:
                return "share_reels";
            case 4:
                return "invite_followers";
            case 5:
                return "invite_followers_via_story";
            case 6:
                return "invite_followers_via_dm";
            case 7:
                return "learn_professional_tools";
            case 8:
                return "promote";
            case 9:
                return "boost";
            case 10:
                return "business_objectives";
            case 11:
                return "boost_guidance";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "meta_verified";
            default:
                return "complete_profile";
        }
    }
}
