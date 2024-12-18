package X;

import android.app.job.JobParameters;
import com.facebook.voltron.download.scheduledinstaller.OxygenScheduledInstallerJobService;

/* loaded from: classes10.dex */
public final class TOG implements Runnable {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ OxygenScheduledInstallerJobService A01;

    public TOG(JobParameters jobParameters, OxygenScheduledInstallerJobService oxygenScheduledInstallerJobService) {
        this.A01 = oxygenScheduledInstallerJobService;
        this.A00 = jobParameters;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0048, code lost:
    
        if (r3 == false) goto L18;
     */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.1Tc, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TOG.run():void");
    }
}
