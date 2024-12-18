package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import X.AbstractC166987dD;
import X.AbstractC25230BEn;
import X.AbstractC62859SUg;
import X.AbstractC93164Fs;
import X.C0fN;
import X.EnumC61103RfI;
import X.S2F;
import X.SJH;
import X.T43;
import X.TQk;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.facebook.location.platform.api.Location;

/* loaded from: classes10.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        AbstractC93164Fs.A00(jobParameters, this);
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(Location.EXTRAS);
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        T43.A01(getApplicationContext());
        byte[] bArr = null;
        if (string != null) {
            EnumC61103RfI enumC61103RfI = (EnumC61103RfI) AbstractC62859SUg.A00.get(i);
            if (enumC61103RfI != null) {
                if (string2 != null) {
                    bArr = Base64.decode(string2, 0);
                }
                SJH sjh = T43.A00().A01;
                sjh.A08.execute(new TQk(S2F.A00(enumC61103RfI, string, bArr), sjh, new Runnable() { // from class: X.TOT
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.jobFinished(jobParameters, false);
                    }
                }, i2));
                return true;
            }
            throw AbstractC25230BEn.A0n("Unknown Priority for value ", i);
        }
        throw AbstractC166987dD.A15("Null backendName");
    }
}
