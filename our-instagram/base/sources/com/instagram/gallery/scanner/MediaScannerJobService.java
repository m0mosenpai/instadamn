package com.instagram.gallery.scanner;

import X.AbstractC93164Fs;
import X.C0fN;
import X.C106044qJ;
import X.C14360o3;
import X.C23591Acl;
import X.C56399P2m;
import android.app.job.JobParameters;
import android.app.job.JobService;

/* loaded from: classes9.dex */
public final class MediaScannerJobService extends JobService {
    public final C106044qJ A00 = new C106044qJ();

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        AbstractC93164Fs.A00(jobParameters, this);
        C14360o3.A0B(jobParameters, 0);
        this.A00.A00(new C56399P2m(jobParameters, this));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        C14360o3.A0B(jobParameters, 0);
        C23591Acl c23591Acl = this.A00.A00;
        if (c23591Acl != null) {
            c23591Acl.A04();
        }
        return false;
    }
}
