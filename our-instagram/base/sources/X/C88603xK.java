package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.ConditionVariable;
import android.os.PersistableBundle;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUploadService;
import com.facebook.common.build.BuildConstants;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.3xK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88603xK extends AbstractC40481uH {
    public ComponentName A00;
    public final JobScheduler A01;
    public final Context A02;
    public final ConcurrentLinkedQueue A03 = new ConcurrentLinkedQueue();

    @Override // X.AbstractC40481uH
    public final long A01(int i) {
        JobScheduler jobScheduler = this.A01;
        if (jobScheduler != null) {
            try {
                List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                if (allPendingJobs != null) {
                    for (JobInfo jobInfo : allPendingJobs) {
                        if (jobInfo.getId() == i) {
                            String className = jobInfo.getService().getClassName();
                            String className2 = this.A00.getClassName();
                            if (!className.equals(className2)) {
                                C0K8.A0P("LollipopUploadScheduler", "Job scheduled with wrong component. Expected %s, but got %s Cancelling.", className2, className);
                                jobScheduler.cancel(i);
                                return Long.MAX_VALUE;
                            }
                            return jobInfo.getMinLatencyMillis();
                        }
                    }
                }
            } catch (NullPointerException e) {
                C0K8.A0K("LollipopUploadScheduler", "Scheduler binder is null. Skipping scheduling.", e);
                return Long.MAX_VALUE;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // X.AbstractC40481uH
    public final void A02(C40401u8 c40401u8, String str, int i, long j, long j2) {
        ComponentName componentName;
        JobScheduler jobScheduler = this.A01;
        if (jobScheduler != null && (componentName = this.A00) != null) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", str);
            persistableBundle.putInt("__VERSION_CODE", BuildConstants.A01());
            JobInfo.Builder overrideDeadline = new JobInfo.Builder(i, componentName).setMinimumLatency(j).setOverrideDeadline(j2);
            persistableBundle.putString("uploader_class", c40401u8.A0B);
            persistableBundle.putString("flexible_sampling_updater", c40401u8.A08);
            persistableBundle.putString("privacy_policy", c40401u8.A07);
            persistableBundle.putString("thread_handler_factory", c40401u8.A09);
            persistableBundle.putString("upload_job_instrumentation", c40401u8.A0A);
            persistableBundle.putString("priority_dir", c40401u8.A02.getAbsolutePath());
            persistableBundle.putInt("network_priority", c40401u8.A03.intValue());
            persistableBundle.putString("marauder_tier", c40401u8.A06);
            persistableBundle.putInt("multi_batch_payload_size", c40401u8.A01);
            persistableBundle.putInt("non_sticky_handling", c40401u8.A0C ? 1 : 0);
            persistableBundle.putInt("use_fifo_uploads", c40401u8.A0D ? 1 : 0);
            persistableBundle.putString("batch_payload_iterator_factory", c40401u8.A04);
            persistableBundle.putString("acs_provider", c40401u8.A00);
            persistableBundle.putString("ffdb_provider", c40401u8.A05);
            JobInfo build = overrideDeadline.setExtras(persistableBundle).setRequiredNetworkType(1).setPersisted(false).build();
            ConditionVariable conditionVariable = C0eQ.A00;
            if (build != null) {
                try {
                    jobScheduler.schedule(build);
                } catch (IllegalArgumentException e) {
                    PackageManager packageManager = this.A02.getPackageManager();
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
                    if (componentEnabledSetting != 1 && componentEnabledSetting != 2 && componentEnabledSetting != 3 && componentEnabledSetting != 4) {
                        try {
                            packageManager.getServiceInfo(componentName, 512).isEnabled();
                        } catch (Throwable th) {
                            C0K8.A0F("LollipopUploadScheduler", "Error getting serviceInfo from PackageManager", th);
                        }
                    }
                    C0K8.A0M("LollipopUploadScheduler", "The Service is disabled, cannot schedule job for %s", e, componentName);
                } catch (NullPointerException e2) {
                    C0K8.A0I("LollipopUploadScheduler", "Nullpointer exception encountered while scheduling job", e2);
                }
            }
        }
    }

    public C88603xK(Context context) {
        this.A02 = context;
        this.A01 = (JobScheduler) context.getSystemService("jobscheduler");
        ConditionVariable conditionVariable = C0eQ.A00;
        this.A00 = new ComponentName(context, (Class<?>) LollipopUploadService.class);
    }
}
