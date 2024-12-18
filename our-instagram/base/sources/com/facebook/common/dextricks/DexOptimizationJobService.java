package com.facebook.common.dextricks;

import X.C0fN;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.PersistableBundle;
import com.facebook.common.dextricks.DexOptimization;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* loaded from: classes.dex */
public class DexOptimizationJobService extends JobService {
    public static final int JOB_ID = -87105850;
    public static final String KEY_SCHEDULED_AT = "scheduledAt";
    public static final String TAG = "DexOptimizationJobService";

    /* loaded from: classes.dex */
    public class Client {
        public static void cancel(Context context) {
            Mlog.safeFmt("DexOptimizationJobService: canceling dexoptjobsvc", new Object[0]);
            try {
                ((JobScheduler) context.getSystemService("jobscheduler")).cancel(DexOptimizationJobService.JOB_ID);
            } catch (SecurityException e) {
                Mlog.w("Failure to cancel DexOptimizationJobService", e);
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    Mlog.w("Failure to cancel DexOptimizationJobService", e2);
                    return;
                }
                throw e2;
            }
        }

        public static void schedule(Context context, DexStore dexStore, boolean z, boolean z2, long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("DexOptimizationJobService: scheduling dexoptjobsvc requiresCharging:");
            sb.append(z);
            sb.append(" requiresDeviceIdle:");
            sb.append(z2);
            sb.append(" idleOptimizationPeriod:");
            sb.append(j / StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            sb.append("min");
            Mlog.safeFmt(sb.toString(), new Object[0]);
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong(DexOptimizationJobService.KEY_SCHEDULED_AT, System.currentTimeMillis());
            try {
                jobScheduler.schedule(new JobInfo.Builder(DexOptimizationJobService.JOB_ID, new ComponentName(context, (Class<?>) DexOptimizationJobService.class)).setPeriodic(j).setExtras(persistableBundle).setRequiresCharging(z).setRequiresDeviceIdle(z2).build());
            } catch (SecurityException e) {
                Mlog.w("Failure to schedule DexOptimizationJobService", e);
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    Mlog.w("Failure to schedule DexOptimizationJobService", e2);
                    return;
                }
                throw e2;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        C0fN.A00(jobParameters, this);
        Mlog.safeFmt("DexOptimizationJobService: onStartJob", new Object[0]);
        DexStore mainDexStore = DexLibLoader.getMainDexStore();
        if (mainDexStore == null) {
            Mlog.w("DexOptimizationJobService: onStartJob: no main dex store", new Object[0]);
            return false;
        }
        DexOptimization.Client.startBackgroundOptimization(this, mainDexStore);
        jobFinished(jobParameters, false);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        Mlog.safeFmt("DexOptimizationJobService: onStopJob", new Object[0]);
        return false;
    }
}
