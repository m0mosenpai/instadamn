package X;

import android.app.job.JobParameters;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.RrI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61646RrI {
    public static int A00(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
                return stopReason;
            default:
                return -512;
        }
    }
}
