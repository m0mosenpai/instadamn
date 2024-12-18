package com.facebook.analytics2.logger.legacy.uploader;

import X.AbstractC05810Sj;
import X.AbstractC58317Pt9;
import X.AbstractC93164Fs;
import X.C0K8;
import X.C0eQ;
import X.C0f9;
import X.C40401u8;
import X.C5GK;
import X.C88643xQ;
import X.C906842g;
import X.InterfaceC107844tT;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.PersistableBundle;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUploadService;
import com.facebook.common.build.BuildConstants;

/* loaded from: classes2.dex */
public class LollipopUploadService extends JobService {
    public C88643xQ A00;

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        AbstractC93164Fs.A01(jobParameters, this, true);
        C88643xQ c88643xQ = this.A00;
        if (c88643xQ != null) {
            c88643xQ.A03(jobParameters.getJobId());
        }
        return true;
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(1518969629);
        ConditionVariable conditionVariable = C0eQ.A00;
        this.A00 = C88643xQ.A00(this);
        C0f9.A0B(1318666777, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(-2137746405);
        super.onDestroy();
        this.A00 = null;
        C0f9.A0B(1150396897, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(-2051245152);
        C88643xQ c88643xQ = this.A00;
        AbstractC05810Sj.A00(c88643xQ);
        int A02 = c88643xQ.A02(intent, new C5GK(this, i2));
        C0f9.A0B(948061333, A04);
        return A02;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        AbstractC93164Fs.A00(jobParameters, this);
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            C0K8.A0C("PostLolliopUploadService", AbstractC58317Pt9.A00(580));
        } else {
            try {
                if (BuildConstants.A01() == extras.getInt("__VERSION_CODE", 0)) {
                    z = true;
                }
            } catch (Exception e) {
                C0K8.A0G("PostLolliopUploadService", AbstractC58317Pt9.A00(543), e);
            }
        }
        boolean z2 = false;
        if (!z) {
            jobParameters.getJobId();
            return false;
        }
        ConditionVariable conditionVariable = C0eQ.A00;
        try {
            C88643xQ c88643xQ = this.A00;
            AbstractC05810Sj.A00(c88643xQ);
            int jobId = jobParameters.getJobId();
            c88643xQ.A04(new C40401u8(new Bundle(jobParameters.getExtras())), new InterfaceC107844tT(jobParameters, this) { // from class: X.4tS
                public final JobParameters A00;
                public final /* synthetic */ LollipopUploadService A01;

                {
                    this.A01 = this;
                    this.A00 = jobParameters;
                }

                @Override // X.InterfaceC107844tT
                public final void E1W(boolean z3) {
                    JobParameters jobParameters2 = this.A00;
                    jobParameters2.getJobId();
                    C0fN.A02(jobParameters2, this.A01, z3);
                }
            }, jobParameters.getExtras().getString("action"), jobId);
            z2 = true;
            return true;
        } catch (C906842g e2) {
            C0K8.A0H("PostLolliopUploadService", AbstractC58317Pt9.A00(587), e2);
            return z2;
        }
    }
}
