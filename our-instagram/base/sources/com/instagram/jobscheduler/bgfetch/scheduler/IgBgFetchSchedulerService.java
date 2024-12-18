package com.instagram.jobscheduler.bgfetch.scheduler;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC93164Fs;
import X.C0fN;
import X.C0w9;
import X.C107224sT;
import X.C206629Ct;
import X.C2JW;
import X.C57534Pg8;
import X.C9D0;
import X.InterfaceC23621Ds;
import X.MSW;
import X.OAO;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class IgBgFetchSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        UserSession userSession;
        AbstractC93164Fs.A00(jobParameters, this);
        try {
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            Integer num = null;
            if ((A0F instanceof UserSession) && (userSession = (UserSession) A0F) != null) {
                if (jobParameters != null) {
                    num = Integer.valueOf(jobParameters.getJobId());
                }
                C107224sT A00 = C2JW.A00(AbstractC166987dD.A0O(this), userSession);
                if (num != null && A00 != null) {
                    AbstractC166987dD.A1Z(new C9D0(A00, new OAO(AbstractC166987dD.A0O(this), C57534Pg8.A00(this, jobParameters, 0), num.intValue()), (InterfaceC23621Ds) null, 47), A00.A07);
                    return true;
                }
            }
            jobFinished(jobParameters, false);
            return false;
        } catch (Exception e) {
            jobFinished(jobParameters, false);
            C0w9.A03("IgBgFetchSchedulerService", AbstractC166997dE.A0y("Failed to run job with exception: ", e));
            return false;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        C107224sT A00 = C2JW.A00(AbstractC166987dD.A0O(this), MSW.A0Q(this));
        if (A00 != null) {
            AbstractC166987dD.A1Z(new C206629Ct(A00, null, 32), A00.A07);
            return false;
        }
        return false;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        C107224sT A00 = C2JW.A00(AbstractC166987dD.A0O(this), MSW.A0Q(this));
        if (A00 != null) {
            AbstractC166987dD.A1Z(new C206629Ct(A00, null, 32), A00.A07);
        }
    }
}
