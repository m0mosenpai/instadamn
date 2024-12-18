package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.8zG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203558zG {
    public static final String A00(C22P c22p) {
        C14360o3.A0B(c22p, 1);
        switch (c22p.ordinal()) {
            case 0:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 70:
            case 162:
                return "stories_camera";
            case 2:
            case 7:
            case 523:
            case 560:
                return "direct_camera";
            case 35:
                return "stories_attribution";
            case 45:
                return "test_lint";
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return "permalink";
            case 47:
                return "ar_notification";
            case 54:
                return AbstractC111324zv.A00(3141);
            case 64:
                return "effect_gallery";
            case 65:
                return "effect_tab";
            case 72:
            case 73:
            case 74:
            case 75:
                return "shopping_camera";
            case 101:
                return "feed_attribution";
            case 116:
            case HucClient.BODY_UPLOAD_TIMEOUT_SECONDS /* 120 */:
            case 121:
            case 166:
            case 185:
                return "reels_camera";
            case 122:
                return "reels_attribution";
            case 219:
                return "igtv_camera";
            case 241:
                return "live_camera";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown product surface for entry point: ");
                sb.append(c22p);
                AbstractC12120kG.A07("CameraPerfUtil", sb.toString(), null);
                return "unknown";
        }
    }
}
