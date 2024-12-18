package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.F8p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34243F8p {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return AbstractC111324zv.A00(2054);
            case 2:
                return "dismiss";
            case 3:
                return "not_shown";
            case 4:
                return "send_confirm_email";
            case 5:
                return AbstractC111324zv.A00(3070);
            case 6:
                return AbstractC111324zv.A00(795);
            case 7:
                return "confirm_phone";
            case 8:
                return AbstractC111324zv.A00(2040);
            case 9:
                return "enroll_two_factor";
            case 10:
            case 11:
                return "learn_more";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return AbstractC111324zv.A00(1900);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "not_business";
            case 14:
                return "create_biz_account";
            case Process.SIGTERM /* 15 */:
                return "report_spam";
            case 16:
                return "report_not_spam";
            case 17:
                return "reset_password_link";
            case 18:
                return "reset_password_page";
            case Process.SIGSTOP /* 19 */:
                return AbstractC111324zv.A00(1352);
            case 20:
                return AbstractC111324zv.A00(839);
            case 21:
                return AbstractC111324zv.A00(3099);
            case 22:
                return "gmail_oauth_confirm_email";
            case 23:
                return "turn_on_sms";
            case 24:
                return "get_started";
            case 25:
                return "not_seller";
            case 26:
                return "promote_merged_media_learn_more";
            case 27:
                return "open_besties_list";
            case 28:
                return "branded_content_learn_more";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return MSV.A00(991);
            case 30:
                return "branded_content_violation_appeal";
            default:
                return "seen";
        }
    }
}
