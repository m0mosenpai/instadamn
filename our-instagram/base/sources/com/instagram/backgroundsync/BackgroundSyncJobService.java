package com.instagram.backgroundsync;

import X.AbstractC18680vv;
import X.AbstractC60392pN;
import X.AbstractC93164Fs;
import X.C023409i;
import X.C06090Tz;
import X.C0w9;
import X.C1115650v;
import X.C14360o3;
import X.C18U;
import X.C23051Ak;
import X.C23061Al;
import X.C2FO;
import X.C60362pK;
import X.EnumC12410kj;
import X.EnumC23071Am;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.keepalive.RealtimeClientKeepAlive;

/* loaded from: classes2.dex */
public final class BackgroundSyncJobService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        AbstractC93164Fs.A01(jobParameters, this, true);
        C14360o3.A0B(jobParameters, 0);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        AbstractC93164Fs.A00(jobParameters, this);
        C14360o3.A0B(jobParameters, 0);
        C1115650v c1115650v = C1115650v.A00;
        Context applicationContext = getApplicationContext();
        C14360o3.A07(applicationContext);
        try {
            AbstractC18680vv A05 = C023409i.A0A.A05(c1115650v);
            if (A05 instanceof UserSession) {
                UserSession userSession = (UserSession) A05;
                if (!userSession.hasEnded()) {
                    if (!AbstractC60392pN.A00(A05).booleanValue() && !C18U.A06(C06090Tz.A05, A05, 36321125378040987L)) {
                        return false;
                    }
                    long j = C23051Ak.A02;
                    if (!C23061Al.A00(A05).A00(EnumC23071Am.A0V)) {
                        C2FO.A00(userSession).A07 = true;
                        RealtimeClientKeepAlive.getInstance(userSession).doKeepAlive("periodic_sync");
                    }
                    C60362pK A00 = C60362pK.A03.A00(applicationContext, userSession);
                    UserSession userSession2 = A00.A01;
                    if (!AbstractC60392pN.A00(userSession2).booleanValue() && !C18U.A06(C06090Tz.A05, userSession2, 36321125378040987L)) {
                        return false;
                    }
                    C60362pK.A01(A00);
                    return false;
                }
            }
        } catch (Exception e) {
            C0w9.A02(EnumC12410kj.A09, "BackgroundSyncExecutor", "Exception in BackgroundSyncExecutor", e);
        }
        return false;
    }
}
