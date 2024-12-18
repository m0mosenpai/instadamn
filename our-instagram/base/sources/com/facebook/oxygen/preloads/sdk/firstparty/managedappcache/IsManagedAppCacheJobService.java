package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.AbstractC93164Fs;
import X.C0f9;
import X.C0fN;
import X.C55342Oh7;
import X.MSY;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes9.dex */
public class IsManagedAppCacheJobService extends JobService {
    public static HandlerThread A02;
    public Handler A00;
    public volatile boolean A01;

    @Override // android.app.Service
    public final void onCreate() {
        HandlerThread handlerThread;
        int A04 = C0f9.A04(1923869393);
        synchronized (IsManagedAppCacheJobService.class) {
            if (A02 == null) {
                HandlerThread A0A = MSY.A0A("th-IsManagedAppCacheJobSvc");
                A02 = A0A;
                A0A.start();
            }
            handlerThread = A02;
        }
        this.A00 = new Handler(handlerThread.getLooper(), new C55342Oh7(this, 0));
        C0f9.A0B(2020117912, A04);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        AbstractC93164Fs.A00(jobParameters, this);
        this.A01 = false;
        Handler handler = this.A00;
        handler.sendMessage(handler.obtainMessage(1, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        this.A01 = true;
        return true;
    }
}
