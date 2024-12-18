package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Xjd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72647Xjd {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "HIGHEST_POSITION_ENFORCEMENT_FAILURE";
            case 2:
                return "TARGET_POSITION_NO_LONGER_VALID";
            case 3:
                return "BRAND_SAFETY_VIOLATION";
            case 4:
                return "INCOMPATIBLE_CONTENT_BLOCKLIST";
            case 5:
                return "REPLACED_SLOT_TARGET_POSITION_NO_LONGER_VALID";
            case 6:
                return "AD_POSITION_IS_PASSED";
            case 7:
                return "PUSH_DOWN_OUT_OF_SPACE";
            case 8:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            default:
                return "MIN_GAP_ENFORCEMENT_FAILURE";
        }
    }
}
