package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Nze, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54320Nze {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CONFIG_FETCH_FAILED";
            case 2:
                return "CONFIG_FETCH_SUCCESS";
            case 3:
                return "PING_SKIP";
            case 4:
                return "PING_START";
            case 5:
                return "PING_FAILED";
            case 6:
                return "PING_SUCCESS";
            case 7:
                return "HEADWIND_PROGRAM_START";
            case 8:
                return "HEADWIND_LOG";
            case 9:
                return "HEADWIND_PROGRAM_FAILED";
            case 10:
                return "HEADWIND_PROGRAM_SUCCESS";
            case 11:
                return "HEADWIND_SIDE_EFFECTS_START";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "HEADWIND_SIDE_EFFECTS_END";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "UNEXPECTED_FAILURE";
            default:
                return "CONFIG_FETCH_START";
        }
    }
}
