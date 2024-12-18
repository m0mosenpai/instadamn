package X;

import android.app.job.JobParameters;
import com.instagram.contacts.ccu.intf.CCUJobService;

/* loaded from: classes10.dex */
public final class TG9 implements XAL {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ CCUJobService A01;

    public TG9(JobParameters jobParameters, CCUJobService cCUJobService) {
        this.A01 = cCUJobService;
        this.A00 = jobParameters;
    }

    @Override // X.XAL
    public final void onFinish() {
        C0fN.A02(this.A00, this.A01, false);
    }
}
