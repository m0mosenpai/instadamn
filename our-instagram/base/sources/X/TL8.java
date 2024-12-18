package X;

import com.facebook.smartcapture.view.IdCaptureActivity;

/* loaded from: classes10.dex */
public final class TL8 implements Runnable {
    public final /* synthetic */ IdCaptureActivity A00;

    public TL8(IdCaptureActivity idCaptureActivity) {
        this.A00 = idCaptureActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IdCaptureActivity idCaptureActivity = this.A00;
        idCaptureActivity.finish();
        idCaptureActivity.A02().logFlowEnd();
    }
}
