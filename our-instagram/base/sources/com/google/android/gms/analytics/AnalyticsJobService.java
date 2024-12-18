package com.google.android.gms.analytics;

import X.AbstractC63371Sic;
import X.AbstractC93164Fs;
import X.C0f9;
import X.C0fN;
import X.C60683RMb;
import X.C60687RMf;
import X.C63335Shm;
import X.InterfaceC65413Tjk;
import X.RunnableC64645TOb;
import X.SX6;
import X.SYW;
import X.T66;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class AnalyticsJobService extends JobService implements InterfaceC65413Tjk {
    public SYW A00;

    @Override // X.InterfaceC65413Tjk
    public final void FFe(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        return false;
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(79434226);
        super.onCreate();
        SYW syw = this.A00;
        if (syw == null) {
            syw = new SYW(this);
            this.A00 = syw;
        }
        C60687RMf c60687RMf = C63335Shm.A01(syw.A00).A0C;
        C63335Shm.A02(c60687RMf);
        AbstractC63371Sic.A09(c60687RMf, "Local AnalyticsService is starting up", 2);
        C0f9.A0B(1600208358, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(-1496486914);
        SYW syw = this.A00;
        if (syw == null) {
            syw = new SYW(this);
            this.A00 = syw;
        }
        C60687RMf c60687RMf = C63335Shm.A01(syw.A00).A0C;
        C63335Shm.A02(c60687RMf);
        AbstractC63371Sic.A09(c60687RMf, "Local AnalyticsService is shutting down", 2);
        super.onDestroy();
        C0f9.A0B(-1074823759, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(-742697436);
        SYW syw = this.A00;
        if (syw == null) {
            syw = new SYW(this);
            this.A00 = syw;
        }
        int A01 = syw.A01(intent, i2);
        C0f9.A0B(-238538585, A04);
        return A01;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        AbstractC93164Fs.A00(jobParameters, this);
        final SYW syw = this.A00;
        if (syw == null) {
            syw = new SYW(this);
            this.A00 = syw;
        }
        Context context = syw.A00;
        final C60687RMf c60687RMf = C63335Shm.A01(context).A0C;
        C63335Shm.A02(c60687RMf);
        String string = jobParameters.getExtras().getString("action");
        c60687RMf.A0D("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            Runnable runnable = new Runnable(jobParameters, c60687RMf, syw) { // from class: X.TQ6
                public final JobParameters A00;
                public final C60687RMf A01;
                public final SYW A02;

                {
                    this.A02 = syw;
                    this.A01 = c60687RMf;
                    this.A00 = jobParameters;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SYW syw2 = this.A02;
                    C60687RMf c60687RMf2 = this.A01;
                    JobParameters jobParameters2 = this.A00;
                    AbstractC63371Sic.A09(c60687RMf2, "AnalyticsJobService processed last dispatch request", 2);
                    ((InterfaceC65413Tjk) syw2.A00).FFe(jobParameters2, false);
                }
            };
            C60683RMb c60683RMb = C63335Shm.A01(context).A06;
            C63335Shm.A02(c60683RMb);
            T66 t66 = new T66(syw, runnable);
            c60683RMb.A0I();
            SX6 A00 = C63335Shm.A00(c60683RMb);
            A00.A02.submit(new RunnableC64645TOb(c60683RMb, t66));
            return true;
        }
        return true;
    }
}
