package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Arrays;

/* renamed from: X.4Fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93164Fs {
    public static final C006802i A00 = C006802i.A0p;

    public static final void A00(JobParameters jobParameters, JobService jobService) {
        Integer num = null;
        if (jobParameters != null) {
            jobParameters.getJobId();
        }
        String name = jobService.getClass().getName();
        if (jobParameters != null) {
            num = Integer.valueOf(jobParameters.getJobId());
        }
        int hashCode = Arrays.hashCode(new Object[]{name, num});
        C006802i c006802i = A00;
        c006802i.markerStart(883764695, hashCode, false);
        c006802i.markerAnnotate(883764695, hashCode, "job_service", name);
        c006802i.markerAnnotate(883764695, hashCode, "is_app_bg_on_start", C218914p.A08());
    }

    public static final void A01(JobParameters jobParameters, JobService jobService, boolean z) {
        String str;
        if (jobParameters != null) {
            jobParameters.getJobId();
        }
        int hashCode = Arrays.hashCode(new Object[]{jobService.getClass().getName(), jobParameters != null ? Integer.valueOf(jobParameters.getJobId()) : null});
        C006802i c006802i = A00;
        if (c006802i.isMarkerOn(883764695, hashCode)) {
            if (Build.VERSION.SDK_INT >= 31 && jobParameters != null) {
                int stopReason = jobParameters.getStopReason();
                switch (stopReason) {
                    case 0:
                        str = "undefined";
                        break;
                    case 1:
                        str = "cancelled_by_app";
                        break;
                    case 2:
                        str = "preempt";
                        break;
                    case 3:
                        str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
                        break;
                    case 4:
                        str = "device_idle";
                        break;
                    case 5:
                        str = "constraint_battery_not_low";
                        break;
                    case 6:
                        str = "constraint_charging";
                        break;
                    case 7:
                        str = "constraint_connectivity";
                        break;
                    case 8:
                        str = "constraint_device_idle";
                        break;
                    case 9:
                        str = "constraint_storage_not_low";
                        break;
                    case 10:
                        str = "quota";
                        break;
                    case 11:
                        str = "background_restriction";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        str = "app_standby";
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                        break;
                    case 14:
                        str = "system_processing";
                        break;
                    case Process.SIGTERM /* 15 */:
                        str = "estimated_app_launch_time_changed";
                        break;
                    default:
                        str = AnonymousClass001.A0O("unknown:", stopReason);
                        break;
                }
                c006802i.markerAnnotate(883764695, hashCode, "stop_reason", str);
            }
            c006802i.markerAnnotate(883764695, hashCode, "is_app_bg_on_end", C218914p.A08());
            c006802i.markerAnnotate(883764695, hashCode, "is_forced_stop", z);
            c006802i.markerEnd(883764695, hashCode, (short) 467);
        }
    }
}
