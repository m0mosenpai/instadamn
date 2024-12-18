package com.instagram.publisher;

import X.AbstractC03260Dj;
import X.AbstractC93164Fs;
import X.C09Y;
import X.C14360o3;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class HeartbeatJobService extends JobService {
    public static final long A00 = TimeUnit.MINUTES.toMillis(15);

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        AbstractC93164Fs.A01(jobParameters, this, true);
        C14360o3.A0B(jobParameters, 0);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String str;
        AbstractC93164Fs.A00(jobParameters, this);
        C14360o3.A0B(jobParameters, 0);
        PersistableBundle extras = jobParameters.getExtras();
        if (extras != null) {
            str = extras.getString("IgSessionManager.SESSION_TOKEN_KEY");
        } else {
            str = null;
        }
        UserSession userSession = C09Y.A00().A05.A00;
        if (userSession == null || !AbstractC03260Dj.A00(str, userSession.token)) {
            return false;
        }
        jobFinished(jobParameters, false);
        return true;
    }
}
