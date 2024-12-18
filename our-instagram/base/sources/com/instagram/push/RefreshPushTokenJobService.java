package com.instagram.push;

import X.C0fN;
import android.app.job.JobParameters;
import android.app.job.JobService;

/* loaded from: classes10.dex */
public final class RefreshPushTokenJobService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if (r3 <= 0) goto L11;
     */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStartJob(android.app.job.JobParameters r14) {
        /*
            r13 = this;
            X.AbstractC93164Fs.A00(r14, r13)
            com.facebook.quicklog.QuickPerformanceLogger r8 = com.facebook.quicklog.QuickPerformanceLoggerProvider.getQPLInstance()
            if (r8 != 0) goto Lb
            X.0dz r8 = com.facebook.quicklog.QuickPerformanceLoggerProvider.A01
        Lb:
            r7 = 813776631(0x30813ef7, float:9.403881E-10)
            r8.markerStart(r7)
            X.0do r4 = X.C96A.A00
            java.lang.Object r2 = r4.getValue()
            X.0xq r2 = (X.InterfaceC19630xq) r2
            java.lang.String r1 = "REFRESH_PUSH_TOKEN_EXPERIMENT_SHOULD_REFRESH_PREF_KEY"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L45
            java.lang.Object r3 = r4.getValue()
            X.0xq r3 = (X.InterfaceC19630xq) r3
            java.lang.String r0 = "REFRESH_PUSH_TOKEN_EXPERIMENT_REFRESH_INTERVAL_PREF_KEY"
            r1 = 0
            long r5 = r3.getLong(r0, r1)
            java.lang.Object r3 = r4.getValue()
            X.0xq r3 = (X.InterfaceC19630xq) r3
            java.lang.String r0 = "REFRESH_PUSH_TOKEN_EXPERIMENT_JOB_INTERVAL_PREF_KEY"
            long r3 = r3.getLong(r0, r1)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L45
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L46
        L45:
            r1 = 0
        L46:
            r12 = 1
            if (r1 == 0) goto Lb2
            if (r14 == 0) goto Lad
            android.os.PersistableBundle r3 = r14.getExtras()
            r1 = -1
            if (r3 == 0) goto Lad
            java.lang.String r0 = "refresh_interval"
            long r10 = r3.getLong(r0, r1)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto Lad
            X.0vz r9 = X.AbstractC12960li.A00
            X.0y2 r0 = X.AbstractC19730y1.A00(r9)
            X.0xq r5 = r0.A00
            java.lang.String r2 = "last_push_token_successful_refresh"
            r0 = 0
            long r2 = r5.getLong(r2, r0)
            java.lang.String r4 = "last_push_token_refresh_attempt_via_background_job"
            long r0 = r5.getLong(r4, r0)
            long r5 = java.lang.Math.max(r2, r0)
            long r5 = r5 + r10
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r1 = r0.getTime()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lad
            java.lang.String r0 = "refresh_token_start"
            r8.markerPoint(r7, r0)
            X.0y2 r3 = X.AbstractC19730y1.A00(r9)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r1 = r0.getTime()
            X.0xq r0 = r3.A00
            X.0xo r0 = r0.ARD()
            r0.E7G(r4, r1)
            r0.apply()
            java.lang.Integer r0 = X.C05F.A0j
            X.C3JG.A02(r0)
            java.lang.String r0 = "refresh_token_end"
            r8.markerPoint(r7, r0)
        Lad:
            r0 = 2
        Lae:
            r8.markerEnd(r7, r0)
            return r12
        Lb2:
            android.content.Context r1 = X.AbstractC166987dD.A0O(r13)
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r1 = r1.getSystemService(r0)
            boolean r0 = r1 instanceof android.app.job.JobScheduler
            if (r0 == 0) goto Lca
            android.app.job.JobScheduler r1 = (android.app.job.JobScheduler) r1
            if (r1 == 0) goto Lca
            r0 = 1560068420(0x5cfcc144, float:5.6915354E17)
            r1.cancel(r0)
        Lca:
            r0 = 4
            goto Lae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.push.RefreshPushTokenJobService.onStartJob(android.app.job.JobParameters):boolean");
    }
}
