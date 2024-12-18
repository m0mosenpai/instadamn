package com.facebook.papaya.fb.instagram.papaya;

import X.AbstractC167017dG;
import X.AbstractC93164Fs;
import X.C0f9;
import X.C0fN;
import X.C54660OCm;
import X.C54714OEr;
import X.C57533Pg7;
import X.MSW;
import X.PPV;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.facebook.papaya.client.PapayaJNI;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public final class PapayaExecutionJobService extends JobService {
    public C54660OCm A00;
    public ExecutorService A01;

    @Override // android.app.job.JobService
    public final synchronized boolean onStartJob(JobParameters jobParameters) {
        boolean z;
        UserSession A0Q;
        AbstractC93164Fs.A00(jobParameters, this);
        try {
            A0Q = MSW.A0Q(this);
            AbstractC167017dG.A1N(this, A0Q);
        } catch (IllegalStateException unused) {
        }
        if (((C54714OEr) A0Q.A01(C54714OEr.class, new C57533Pg7(4, this, A0Q))).A07) {
            ExecutorService executorService = this.A01;
            if (executorService == null) {
                executorService = Executors.newSingleThreadExecutor();
                this.A01 = executorService;
            }
            executorService.execute(new PPV(jobParameters, this));
            z = true;
        }
        z = false;
        return z;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // android.app.job.JobService
    public final synchronized boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        final C54660OCm c54660OCm = this.A00;
        if (c54660OCm != null) {
            final ?? obj = new Object();
            c54660OCm.A04.execute(new Runnable() { // from class: X.PPT
                @Override // java.lang.Runnable
                public final void run() {
                    C54660OCm c54660OCm2 = C54660OCm.this;
                    SettableFuture settableFuture = obj;
                    c54660OCm2.A00.A00();
                    PapayaJNI.stop();
                    settableFuture.set(null);
                }
            });
        }
        return false;
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(-2038292478);
        super.onCreate();
        C0f9.A0B(1604463720, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(724985562);
        super.onDestroy();
        C0f9.A0B(-1091795650, A04);
    }
}
