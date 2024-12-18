package X;

/* renamed from: X.NoF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53664NoF {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_TEMPLATE_ID";
            case 2:
                return "FILE_IO_TYPE";
            case 3:
                return "ASSET_DOWNLOAD_FAILURE";
            case 4:
                return "NETWORK_ERROR";
            case 5:
                return "AVATAR_LOAD_ERROR";
            case 6:
                return "CAPTURE_ERROR";
            case 7:
                return "OUTPUT_VALIDATION_FAILURE";
            case 8:
                return "CDL_ERROR";
            case 9:
                return "AVATAR_DOWNLOAD_ERROR";
            case 10:
                return "EFFECT_ERROR";
            case 11:
                return "ODR_NOT_ENABLED";
            default:
                return "UNKNOWN_ERROR";
        }
    }
}
