package com.facebook.analytics2.logger.legacy.uploader;

import X.AbstractC05810Sj;
import X.AbstractC19880yI;
import X.AbstractJobServiceC19890yJ;
import X.C0K8;
import X.C0eQ;
import X.C40401u8;
import X.C5GK;
import X.C63898SvW;
import X.C88643xQ;
import X.C906842g;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.PersistableBundle;
import com.facebook.common.build.BuildConstants;

/* loaded from: classes10.dex */
public class LollipopUploadServiceDelegate extends AbstractC19880yI {
    public C88643xQ A00;

    @Override // X.AbstractC19880yI
    public final int A00(Intent intent, int i, int i2) {
        ConditionVariable conditionVariable = C0eQ.A00;
        C88643xQ c88643xQ = this.A00;
        AbstractC05810Sj.A00(c88643xQ);
        return c88643xQ.A02(intent, new C5GK(this.A01, i2));
    }

    @Override // X.AbstractC19880yI
    public final void A02() {
        ConditionVariable conditionVariable = C0eQ.A00;
        this.A00 = C88643xQ.A00(this.A01);
    }

    @Override // X.AbstractC19880yI
    public final boolean A04(JobParameters jobParameters) {
        C88643xQ c88643xQ = this.A00;
        if (c88643xQ != null) {
            c88643xQ.A03(jobParameters.getJobId());
            return true;
        }
        return true;
    }

    public LollipopUploadServiceDelegate(AbstractJobServiceC19890yJ abstractJobServiceC19890yJ) {
        super(abstractJobServiceC19890yJ);
    }

    @Override // X.AbstractC19880yI
    public final void A01() {
        super.A01();
        this.A00 = null;
    }

    @Override // X.AbstractC19880yI
    public final boolean A03(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            C0K8.A0C("LollipopUploadServiceDel", "Job with no build ID, cancelling job");
        } else {
            try {
                if (BuildConstants.A01() == extras.getInt("__VERSION_CODE", 0)) {
                    z = true;
                }
            } catch (Exception e) {
                C0K8.A0G("LollipopUploadServiceDel", "Corrupt bundle, cancelling job", e);
            }
        }
        boolean z2 = false;
        if (!z) {
            jobParameters.getJobId();
            return false;
        }
        ConditionVariable conditionVariable = C0eQ.A00;
        try {
            C88643xQ c88643xQ = this.A00;
            AbstractC05810Sj.A00(c88643xQ);
            int jobId = jobParameters.getJobId();
            c88643xQ.A04(new C40401u8(new Bundle(jobParameters.getExtras())), new C63898SvW(jobParameters, this), jobParameters.getExtras().getString("action"), jobId);
            z2 = true;
            return true;
        } catch (C906842g e2) {
            C0K8.A0H("LollipopUploadServiceDel", "Misunderstood job service extras: %s", e2);
            return z2;
        }
    }
}
