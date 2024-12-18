package X;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1E implements Callable {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C175297r3 A01;
    public final /* synthetic */ C177047u0 A02;

    public B1E(CaptureRequest.Builder builder, C175297r3 c175297r3, C177047u0 c177047u0) {
        this.A01 = c175297r3;
        this.A02 = c177047u0;
        this.A00 = builder;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C175297r3 c175297r3 = this.A01;
        c175297r3.A0A.A00("Cannot schedule reset focus task, not prepared");
        C177017tx c177017tx = c175297r3.A03;
        c177017tx.getClass();
        if (c177017tx.A00.isConnected() && !c175297r3.A0E && c175297r3.A0D) {
            c175297r3.A0C = false;
            c175297r3.A00();
            c175297r3.A05(C05F.A01, null);
            C177047u0 c177047u0 = this.A02;
            c177047u0.A06 = null;
            c177047u0.A05 = null;
            try {
                c175297r3.A01(this.A00, c177047u0);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
