package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.8v1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201198v1 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ACCOUNT_EXPIRE_ERROR";
            case 1:
                return "EXPOSURE_ERROR";
            case 2:
                return "JSON_EXCEPTION";
            case 3:
                return "NO_ACCOUNT_FOUND";
            case 4:
                return "NO_CONTENT_PROVIDER_CLIENT_ERROR";
            case 5:
                return "PREF_STORE_ERROR";
            case 6:
                return "PROVIDER_NOT_FOUND";
            case 7:
                return "PROVIDER_NOT_TRUSTED";
            case 8:
                return AbstractC58317Pt9.A00(614);
            case 9:
                return "TRANSFORMER_ERROR";
            case 10:
                return "UNSUPPORTEDOPERATION_EXCEPTION";
            case 11:
                return "UNALLOWED_CALLER";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "ACL_EMPTY";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "GENERAL_EXCEPTION";
            case 14:
                return "WRITE_ERROR";
            case Process.SIGTERM /* 15 */:
                return "APP_DISABLED";
            default:
                return "APP_NOT_INSTALLED";
        }
    }
}
