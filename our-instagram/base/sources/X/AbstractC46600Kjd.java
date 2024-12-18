package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Kjd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46600Kjd {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "approx_earnings";
            case 2:
                return "switch_on";
            case 3:
                return "switch_off_confirmation";
            case 4:
                return "monetisation_status";
            case 5:
                return "payout_account";
            case 6:
                return "learn_more";
            case 7:
                return "turn_on_gifts";
            case 8:
                return "turn_off_gifts";
            case 9:
                return "keep";
            case 10:
                return "exit";
            case 11:
                return "info";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "top_reels";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "reel";
            case 14:
                return "in_development";
            case Process.SIGTERM /* 15 */:
                return "start_earning";
            case 16:
                return "change_global_gifts_settings";
            case 17:
                return "ok";
            case 18:
                return "hide_gifts_count";
            default:
                return "unhide_gifts_count";
        }
    }
}
