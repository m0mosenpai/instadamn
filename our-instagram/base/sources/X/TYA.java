package X;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.DeadObjectException;
import com.facebook.common.zopt.ZOpt;
import com.facebook.common.zopt.ZOptBackgroundService;

/* loaded from: classes10.dex */
public final class TYA extends Thread {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ ZOptBackgroundService A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TYA(JobParameters jobParameters, Context context, ZOptBackgroundService zOptBackgroundService) {
        super("ZOptBackgroundService_optimize");
        this.A02 = zOptBackgroundService;
        this.A01 = context;
        this.A00 = jobParameters;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Context context = this.A01;
        ZOpt zOpt = ZOpt.$redex_init_class;
        synchronized (C61767RtN.class) {
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            try {
                try {
                    jobScheduler.cancel(-87105848);
                } catch (RuntimeException e) {
                    if (e.getCause() instanceof DeadObjectException) {
                        C0K8.A0H("ZOptBackgroundService", "Failure to cancel ZOptBackgroundService", e);
                    } else {
                        throw e;
                    }
                }
            } catch (SecurityException e2) {
                C0K8.A0H("ZOptBackgroundService", "Failure to cancel ZOptBackgroundService", e2);
            }
        }
        C0fN.A02(this.A00, this.A02, false);
    }
}
