package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.Nyk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54264Nyk {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "footer_invite_screen";
            case 2:
                return "footer_invite_screen_r2j";
            case 3:
                return "footer_r2j";
            case 4:
                return "header_invite_screen";
            case 5:
                return "header_invite_screen_r2j";
            case 6:
                return "banner_r2j";
            case 7:
                return "banner_invite_screen";
            case 8:
                return "banner_invite_screen_r2j";
            case 9:
                return "comment_r2j";
            case 10:
                return "comment_invite_screen";
            case 11:
                return "comment_invite_screen_r2j";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "viewer_list";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "viewer_list_more_menu";
            case 14:
                return "unknown";
            default:
                return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
        }
    }
}
