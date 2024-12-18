package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.U1c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66135U1c {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "BLENDED";
            case 2:
                return "HASHTAG";
            case 3:
                return "USER";
            case 4:
                return "USER_GRID";
            case 5:
                return "USER_HSCROLL";
            case 6:
                return "PLACE";
            case 7:
                return "KEYWORD";
            case 8:
                return "ECHO";
            case 9:
                return "AUDIO";
            case 10:
                return "CLIPS";
            case 11:
                return "IGTV_PROFILE";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "EFFECT";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "SHOPPING_SEARCH";
            case 14:
                return "MAP_QUERY";
            case Process.SIGTERM /* 15 */:
                return "MAP_SEARCH";
            case 16:
                return "UNKNOWN";
            case 17:
                return "HCM_AUDIO";
            case 18:
                return "HCM_META_AI";
            case Process.SIGSTOP /* 19 */:
                return "HCM_USER";
            case 20:
                return "HCM_THREADS";
            case 21:
                return "HCM_PLACES";
            case 22:
                return "HCM_REELS_TRENDS";
            case 23:
                return "HCM_ACCOUNT";
            case 24:
                return "EMPTY_SERP";
            case 25:
                return "UPSELL";
            case 26:
                return "BARCELONA_TAG";
            case 27:
                return AbstractC111324zv.A00(1691);
            default:
                return AbstractC111324zv.A00(1812);
        }
    }
}
