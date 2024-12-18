package X;

import android.app.job.JobParameters;
import com.facebook.papaya.fb.instagram.papaya.PapayaExecutionJobService;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PPV implements Runnable {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ PapayaExecutionJobService A01;

    public PPV(JobParameters jobParameters, PapayaExecutionJobService papayaExecutionJobService) {
        this.A01 = papayaExecutionJobService;
        this.A00 = jobParameters;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1Ke, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture;
        PapayaExecutionJobService papayaExecutionJobService = this.A01;
        JobParameters jobParameters = this.A00;
        synchronized (papayaExecutionJobService) {
            try {
                UserSession A0Q = MSW.A0Q(papayaExecutionJobService);
                listenableFuture = C2OD.A02(((OII) A0Q.A01(OII.class, new C57533Pg7(5, papayaExecutionJobService, A0Q))).A00());
            } catch (IllegalStateException unused) {
                IllegalStateException A14 = AbstractC166987dD.A14("Can't locate Papaya instance when User session has ended.");
                ?? obj = new Object();
                obj.setException(A14);
                listenableFuture = obj;
            }
            C2OD.A03(new C55811OqM(0, jobParameters, papayaExecutionJobService), listenableFuture, C1M8.A01);
        }
    }
}
