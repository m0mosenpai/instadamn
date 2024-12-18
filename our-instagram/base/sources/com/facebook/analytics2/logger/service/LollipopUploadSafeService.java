package com.facebook.analytics2.logger.service;

import X.AbstractC05810Sj;
import X.AbstractC93164Fs;
import X.C0K8;
import X.C0f9;
import X.C0fN;
import X.C40401u8;
import X.C5GK;
import X.C63899SvX;
import X.C88643xQ;
import X.C906842g;
import X.InterfaceC65198Tfg;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUpload;
import com.facebook.common.build.BuildConstants;

/* loaded from: classes10.dex */
public class LollipopUploadSafeService extends JobService implements InterfaceC65198Tfg {
    public LollipopUpload A00;

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(-1174714972);
        try {
            LollipopUpload lollipopUpload = (LollipopUpload) Class.forName("com.facebook.analytics2.logger.legacy.uploader.LollipopUpload").newInstance();
            this.A00 = lollipopUpload;
            lollipopUpload.A00 = C88643xQ.A00(this);
        } catch (Exception e) {
            C0K8.A0N("LollipopUploadSafeService", "LollipopUpload failed to be created, className %s", e, "com.facebook.analytics2.logger.legacy.uploader.LollipopUpload");
        }
        C0f9.A0B(-1140422133, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(2115989313);
        super.onDestroy();
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload != null) {
            lollipopUpload.A00 = null;
        }
        this.A00 = null;
        C0f9.A0B(-1362703904, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A02;
        int i3;
        int A04 = C0f9.A04(-1465034373);
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null) {
            A02 = 1;
            i3 = -2147350927;
        } else {
            C88643xQ c88643xQ = lollipopUpload.A00;
            AbstractC05810Sj.A00(c88643xQ);
            A02 = c88643xQ.A02(intent, new C5GK(this, i2));
            i3 = -742844753;
        }
        C0f9.A0B(i3, A04);
        return A02;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        AbstractC93164Fs.A00(jobParameters, this);
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload != null) {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null) {
                C0K8.A0C("PostLolliopUploadService", "Job with no build ID, cancelling job");
            } else {
                try {
                    if (BuildConstants.A01() == extras.getInt("__VERSION_CODE", 0)) {
                        try {
                            C88643xQ c88643xQ = lollipopUpload.A00;
                            AbstractC05810Sj.A00(c88643xQ);
                            int jobId = jobParameters.getJobId();
                            c88643xQ.A04(new C40401u8(new Bundle(jobParameters.getExtras())), new C63899SvX(jobParameters, lollipopUpload, this), jobParameters.getExtras().getString("action"), jobId);
                            return true;
                        } catch (C906842g e) {
                            C0K8.A0H("PostLolliopUploadService", "Misunderstood job service extras: %s", e);
                            return false;
                        }
                    }
                } catch (Exception e2) {
                    C0K8.A0G("PostLolliopUploadService", "Corrupt bundle, cancelling job", e2);
                }
            }
            jobParameters.getJobId();
            return false;
        }
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C88643xQ c88643xQ;
        C0fN.A01(jobParameters, this);
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload != null && (c88643xQ = lollipopUpload.A00) != null) {
            c88643xQ.A03(jobParameters.getJobId());
            return true;
        }
        return true;
    }
}
