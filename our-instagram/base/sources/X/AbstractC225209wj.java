package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225209wj {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "TRAIN";
            case 2:
                return "TRAIN_ALL";
            case 3:
                return "PREDICT";
            case 4:
                return "PREDICT_ALL";
            case 5:
                return "SIGNAL_STORE_COLLECT";
            case 6:
                return "SIGNAL_STORE_COLLECT_ALL";
            case 7:
                return "SIGNAL_STORE_STORE";
            case 8:
                return "SIGNAL_STORE_EXTRACT";
            case 9:
                return "DEFAULT_TASK";
            case 10:
                return "SIGNAL_STORE_METADATA_FETCH";
            case 11:
                return "DCP_METADATA_FETCH";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "USER_PREDICT";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "PYTORCH_DOWNLOAD";
            case 14:
                return "PREDICT_AND_TRAIN";
            case Process.SIGTERM /* 15 */:
                return "FEATURES_AGGREGATION";
            default:
                return "TEST";
        }
    }
}
