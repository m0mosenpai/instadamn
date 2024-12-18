package X;

import com.facebook.smartcapture.view.IdCaptureActivity;

/* loaded from: classes10.dex */
public final class TL7 implements Runnable {
    public final /* synthetic */ IdCaptureActivity A00;

    public TL7(IdCaptureActivity idCaptureActivity) {
        this.A00 = idCaptureActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64094SzB c64094SzB = this.A00.A03;
        if (c64094SzB == null) {
            C14360o3.A0F("presenter");
            throw C00O.createAndThrow();
        }
        c64094SzB.A03();
    }
}
