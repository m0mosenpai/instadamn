package X;

import android.app.job.JobParameters;
import com.instagram.gallery.scanner.MediaScannerJobService;

/* renamed from: X.P2m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56399P2m implements InterfaceC57948Pmu {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ MediaScannerJobService A01;

    public C56399P2m(JobParameters jobParameters, MediaScannerJobService mediaScannerJobService) {
        this.A01 = mediaScannerJobService;
        this.A00 = jobParameters;
    }

    @Override // X.InterfaceC57948Pmu
    public final void DO5() {
        C0fN.A02(this.A00, this.A01, false);
    }
}
