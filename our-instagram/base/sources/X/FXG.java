package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes6.dex */
public abstract class FXG {
    public static void A01(AbstractC23721Ec abstractC23721Ec, UserSession userSession, Integer num, String str) {
        abstractC23721Ec.A9s("share_to_app", A00(num));
        abstractC23721Ec.A9s("containermodule", str);
        abstractC23721Ec.A0I("exposed_to_experiment", AbstractC35242Fgb.A04(userSession));
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "facebook";
            case 2:
                return "messenger";
            case 3:
                return "nametag";
            case 4:
                return "share_sheet";
            case 5:
                return "tumblr";
            case 6:
                return "twitter";
            case 7:
                return "snapchat";
            case 8:
                return "user_email";
            case 9:
                return "user_sms";
            case 10:
                return "whats_app";
            case 11:
                return "vk";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "kakaotalk";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "line";
            case 14:
                return "discord";
            case Process.SIGTERM /* 15 */:
                return "barcelona";
            case 16:
                return "band";
            case 17:
                return "private_reply";
            case 18:
                return "qr_code";
            case Process.SIGSTOP /* 19 */:
                return "download_qr_code";
            case 20:
                return "ig_dm";
            case 21:
                return "ig_story";
            case 22:
                return "ig_feed";
            case 23:
                return "ig_reels";
            case 24:
                return "messenger_control";
            case 25:
                return "whatsapp_control";
            case 26:
                return "copy_link_control";
            case 27:
                return "share_sheet_control";
            case 28:
                return "story_control";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "feed_control";
            case 30:
                return "line_control";
            case 31:
                return "kakaotalk_control";
            case 32:
                return "reels_control";
            case 33:
                return "messenger_test";
            case 34:
                return "whatsapp_test";
            case 35:
                return "copy_link_test";
            case 36:
                return "share_sheet_test";
            case 37:
                return "story_test";
            case 38:
                return "feed_test";
            case 39:
                return "line_test";
            case 40:
                return "kakaotalk_test";
            case Seq.NULL_REFNUM /* 41 */:
                return "reels_test";
            default:
                return "copy_link";
        }
    }
}
