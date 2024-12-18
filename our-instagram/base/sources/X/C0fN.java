package X;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* renamed from: X.0fN, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fN {
    public static void A01(JobParameters jobParameters, JobService jobService) {
        AbstractC93164Fs.A01(jobParameters, jobService, true);
    }

    public static void A02(JobParameters jobParameters, JobService jobService, boolean z) {
        jobService.jobFinished(jobParameters, z);
        AbstractC93164Fs.A01(jobParameters, jobService, false);
    }

    public static void A00(JobParameters jobParameters, JobService jobService) {
        AbstractC93164Fs.A00(jobParameters, jobService);
    }
}
