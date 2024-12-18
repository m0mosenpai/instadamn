package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUpload;

/* renamed from: X.SvX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63899SvX implements InterfaceC107844tT {
    public final JobParameters A00;
    public final InterfaceC65198Tfg A01;
    public final /* synthetic */ LollipopUpload A02;

    public C63899SvX(JobParameters jobParameters, LollipopUpload lollipopUpload, InterfaceC65198Tfg interfaceC65198Tfg) {
        this.A02 = lollipopUpload;
        this.A00 = jobParameters;
        this.A01 = interfaceC65198Tfg;
    }

    @Override // X.InterfaceC107844tT
    public final void E1W(boolean z) {
        JobParameters jobParameters = this.A00;
        jobParameters.getJobId();
        ((JobService) this.A01).jobFinished(jobParameters, z);
    }
}
