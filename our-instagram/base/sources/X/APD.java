package X;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class APD implements SurfaceTexture.OnFrameAvailableListener {
    public final int A00;
    public final Object A01;

    public APD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.A00 != 0) {
            InterfaceC1809280u interfaceC1809280u = ((C9MM) this.A01).A04;
            if (interfaceC1809280u != null) {
                interfaceC1809280u.DIE();
                return;
            }
            return;
        }
        AWZ awz = (AWZ) this.A01;
        if (awz.A02 == null) {
            return;
        }
        awz.A06.incrementAndGet();
        awz.A00++;
        if (awz.A01 == 0) {
            awz.A01 = SystemClock.elapsedRealtimeNanos();
        }
        InterfaceC197808or interfaceC197808or = awz.A0H;
        if (interfaceC197808or == null) {
            return;
        }
        interfaceC197808or.CtB(awz);
    }
}
