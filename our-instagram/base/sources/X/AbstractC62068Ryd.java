package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Ryd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62068Ryd {
    public static String A00(int i) {
        switch (i) {
            case 2:
                return "REACTION_REACTION_DIALOG_WAIT_TIME";
            case 3:
                return "REACTION_REACTION_PLACETIPS_SUGGESTIFIER_COMBINED_FETCH_TIME";
            case 4:
                return "REACTION_REACTION_PAGE_WAIT_TIME";
            case 5:
            case 8:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                return "UNDEFINED_QPL_EVENT";
            case 6:
                return "REACTION_COMPONENT_STYLE_MAPPER";
            case 7:
                return "REACTION_ATTACHMENT_STYLE_MAPPER";
            case 9:
                return "REACTION_REACTION_INITIAL_RENDER_WAIT_TIME";
            case 10:
                return "REACTION_PRIOR_REACTION_LOAD_TIME";
            case 11:
                return "REACTION_REACTION_MULTI_ROW_RENDER_TIME";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "REACTION_LOCAL_SERP_INITIAL_WAIT_TIME";
            case 14:
                return "REACTION_LOCAL_SERP_INITIAL_NETWORK_WAIT_TIME";
            case Process.SIGTERM /* 15 */:
                return "REACTION_REACTION_INITIAL_CACHE_WAIT_TIME";
        }
    }
}
