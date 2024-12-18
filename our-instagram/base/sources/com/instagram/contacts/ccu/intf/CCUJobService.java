package com.instagram.contacts.ccu.intf;

import X.AbstractC93164Fs;
import X.C0fN;
import X.C14360o3;
import X.C62808SSc;
import X.SK4;
import X.TG9;
import android.app.job.JobParameters;
import android.app.job.JobService;

/* loaded from: classes3.dex */
public final class CCUJobService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        C14360o3.A0B(jobParameters, 0);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        AbstractC93164Fs.A00(jobParameters, this);
        C14360o3.A0B(jobParameters, 0);
        SK4 A00 = C62808SSc.A00();
        if (A00 == null) {
            return false;
        }
        return A00.onStart(this, new TG9(jobParameters, this));
    }
}
