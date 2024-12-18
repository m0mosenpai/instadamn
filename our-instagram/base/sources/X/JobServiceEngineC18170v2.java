package X;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;

/* renamed from: X.0v2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class JobServiceEngineC18170v2 extends JobServiceEngine implements AnonymousClass025 {
    public JobParameters A00;
    public final AnonymousClass028 A01;
    public final Object A02;

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.A00 = jobParameters;
        this.A01.ensureProcessorRunningLocked(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean doStopCurrentWork = this.A01.doStopCurrentWork();
        synchronized (this.A02) {
            this.A00 = null;
        }
        return doStopCurrentWork;
    }

    public JobServiceEngineC18170v2(AnonymousClass028 anonymousClass028) {
        super(anonymousClass028);
        this.A02 = new Object();
        this.A01 = anonymousClass028;
    }
}
