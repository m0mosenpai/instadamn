package X;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.AuI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24561AuI implements Runnable {
    public final /* synthetic */ C23463Aaa A00;
    public final /* synthetic */ CountDownLatch A01;

    @Override // java.lang.Runnable
    public final void run() {
        C23463Aaa c23463Aaa;
        C180177z7 c180177z7;
        try {
            c23463Aaa = this.A00;
            C176507t8 c176507t8 = c23463Aaa.A06;
            c23463Aaa.A06 = null;
            if (c176507t8 != null) {
                c176507t8.A01();
            }
            c180177z7 = c23463Aaa.A07;
        } catch (RuntimeException e) {
            C0K8.A0L("RendererSurfacePipeComponent", "Failed to create SurfaceNode: %s", e, e.getMessage());
        }
        if (c180177z7.A0B.getLooper() == Looper.myLooper()) {
            WIL wil = c180177z7.A0K;
            if (wil == null) {
                wil = new WIL(c180177z7.A0F);
                c180177z7.A0K = wil;
                C180177z7.A00(c180177z7);
            }
            c23463Aaa.A06 = new C176507t8(new SurfaceTexture(wil.A03.A00), false);
            this.A01.countDown();
            return;
        }
        throw AbstractC166987dD.A14("getInputTextureId() must be called at SurfacePipe thread.");
    }

    public RunnableC24561AuI(C23463Aaa c23463Aaa, CountDownLatch countDownLatch) {
        this.A00 = c23463Aaa;
        this.A01 = countDownLatch;
    }
}
