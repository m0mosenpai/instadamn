package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.S1b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62180S1b {
    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 49153;
            case 2:
                return 49154;
            case 3:
                return 49155;
            case 4:
                return 49156;
            case 5:
                return 49157;
            case 6:
                return 49158;
            case 7:
                return 53249;
            case 8:
                return 53250;
            case 9:
                return 53251;
            case 10:
                return 53252;
            case 11:
                return 53264;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return 53280;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return 53281;
            case 14:
                return 57345;
            case Process.SIGTERM /* 15 */:
                return Constants.LOAD_RESULT_PGO_ATTEMPTED;
            default:
                return 0;
        }
    }
}
