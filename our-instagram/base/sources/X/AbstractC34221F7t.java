package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.F7t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34221F7t {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "qp_intro";
            case 1:
                return "tos";
            case 2:
                return "age_consent_two_button";
            case 3:
                return "age_consent_three_button";
            case 4:
                return "tos_and_two_age_button";
            case 5:
                return "tos_and_three_age_button";
            case 6:
                return "age_dialog";
            case 7:
                return "dob";
            case 8:
                return "dob_dialog";
            case 9:
                return "block_dialog";
            case 10:
                return "block_screen";
            case 11:
                return "parental_approval";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "parental_contact";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "multiple_account";
            case 14:
                return "underage";
            case Process.SIGTERM /* 15 */:
                return "gdpr_block_screen";
            case 16:
                return "already_finished_screen";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE;
        }
    }
}
