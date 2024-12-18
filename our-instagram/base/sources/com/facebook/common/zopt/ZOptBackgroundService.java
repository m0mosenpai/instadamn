package com.facebook.common.zopt;

import X.AbstractC166997dE;
import X.AbstractC93164Fs;
import X.C0fN;
import X.TYA;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public class ZOptBackgroundService extends JobService {
    public final AtomicBoolean A00 = AbstractC166997dE.A17();

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        AbstractC93164Fs.A00(jobParameters, this);
        this.A00.set(false);
        PersistableBundle extras = jobParameters.getExtras();
        extras.getInt("profile_delta_size", 0);
        extras.getInt("profile_delta_pct", 0);
        extras.getBoolean("skip_quickening", false);
        new TYA(jobParameters, this, this).start();
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        this.A00.set(true);
        return false;
    }
}
