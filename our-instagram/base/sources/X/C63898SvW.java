package X;

import android.app.job.JobParameters;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUploadServiceDelegate;

/* renamed from: X.SvW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63898SvW implements InterfaceC107844tT {
    public final JobParameters A00;
    public final /* synthetic */ LollipopUploadServiceDelegate A01;

    public C63898SvW(JobParameters jobParameters, LollipopUploadServiceDelegate lollipopUploadServiceDelegate) {
        this.A01 = lollipopUploadServiceDelegate;
        this.A00 = jobParameters;
    }

    @Override // X.InterfaceC107844tT
    public final void E1W(boolean z) {
        JobParameters jobParameters = this.A00;
        jobParameters.getJobId();
        C0fN.A02(jobParameters, this.A01.A01, z);
    }
}
