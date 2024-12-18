package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9wR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225029wR {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "EFFECT_FETCH_SUCCESS";
            case 2:
                return "EFFECT_FETCH_FAILED";
            case 3:
                return "EFFECT_RENDER_SET";
            case 4:
                return "EFFECT_RENDER_STARTED";
            case 5:
                return "EFFECT_FIRST_FRAME_RENDERED";
            case 6:
                return "EFFECT_RENDER_RECUR";
            case 7:
                return "EFFECT_RENDER_FAILED";
            case 8:
                return "EFFECT_RENDER_STOPPED";
            case 9:
                return "AVATAR_FETCH_STARTED";
            case 10:
                return "AVATAR_FETCH_COMPLETED";
            case 11:
                return "AVATAR_FETCH_FAILED";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "AVATAR_FIRST_FRAME_COLORIZATION_APPLIED";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "AVATAR_DYNAMIC_COLOR_APPLIED";
            case 14:
                return "AVATAR_RENDERED";
            case Process.SIGTERM /* 15 */:
                return "AVATAR_LOADED_VIA_AR_EFFECT";
            case 16:
                return "AVATAR_LOADED_VIA_AR_EFFECT_ERROR";
            default:
                return "EFFECT_FETCH_STARTED";
        }
    }
}
