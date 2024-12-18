package com.facebook.common.jobscheduler.compat;

import X.AbstractC121025du;
import X.AbstractC93164Fs;
import X.C0K8;
import X.C0f9;
import X.C0fN;
import X.C2SL;
import X.C2SS;
import X.InterfaceC121045dw;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.jobscheduler.compat.JobServiceCompat;

/* loaded from: classes.dex */
public abstract class JobServiceCompat extends JobService {
    public abstract AbstractC121025du A00();

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(-1247149497);
        A00();
        C0f9.A0B(925118995, A04);
        return 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        AbstractC93164Fs.A00(jobParameters, this);
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            C0K8.A0C("JobServiceCompat", "Job with no build ID, cancelling job");
        } else {
            if (BuildConstants.A01() == extras.getInt("__VERSION_CODE", 0)) {
                z = true;
            }
        }
        boolean z2 = false;
        if (!z) {
            jobParameters.getJobId();
        } else {
            int jobId = jobParameters.getJobId();
            try {
                C2SL A00 = C2SL.A00(this, 0);
                Class<?> cls = getClass();
                Class cls2 = (Class) A00.A02.get(jobId);
                if (cls2 != null) {
                    if (cls2.equals(cls)) {
                        z2 = A00().A01(new Bundle(jobParameters.getExtras()), new InterfaceC121045dw(jobParameters, this, this) { // from class: X.5dv
                            public final JobParameters A00;
                            public final Context A01;
                            public final /* synthetic */ JobServiceCompat A02;

                            {
                                this.A02 = this;
                                this.A00 = jobParameters;
                                this.A01 = this;
                            }

                            @Override // X.InterfaceC121045dw
                            public final void DO6(boolean z3) {
                                JobServiceCompat jobServiceCompat = this.A02;
                                JobParameters jobParameters2 = this.A00;
                                C0fN.A02(jobParameters2, jobServiceCompat, z3);
                                if (!z3) {
                                    C2SS A002 = C2SS.A00(this.A01);
                                    synchronized (A002) {
                                        A002.A00.put(jobParameters2.getJobId(), false);
                                    }
                                }
                            }
                        }, jobParameters.getJobId());
                        if (!z2) {
                            C2SS A002 = C2SS.A00(this);
                            synchronized (A002) {
                                A002.A00.put(jobParameters.getJobId(), false);
                            }
                            return z2;
                        }
                    }
                }
            } catch (RuntimeException unused) {
                C0K8.A0O("JobServiceCompat", "Runtime error getting service info, cancelling: %d", Integer.valueOf(jobId));
            }
            ((JobScheduler) getSystemService("jobscheduler")).cancel(jobParameters.getJobId());
            return false;
        }
        return z2;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        boolean A00 = A00().A00(jobParameters.getJobId());
        if (!A00) {
            C2SS A002 = C2SS.A00(this);
            synchronized (A002) {
                A002.A00.put(jobParameters.getJobId(), false);
            }
            return A00;
        }
        return A00;
    }
}
