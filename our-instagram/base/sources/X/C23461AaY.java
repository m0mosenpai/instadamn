package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AaY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23461AaY implements InterfaceC175497rP {
    public final /* synthetic */ C212359b4 A00;

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void D1a(int i) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void DA4(int i) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Dib(int i, int i2) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Did(Surface surface, int i, int i2) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Dif(Surface surface) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void EES(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void EbO(boolean z) {
    }

    public C23461AaY(C212359b4 c212359b4) {
        this.A00 = c212359b4;
    }

    @Override // X.InterfaceC175497rP
    public final InterfaceC177027ty Bcs() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final InterfaceC177027ty BkW() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final SurfaceTexture C4L(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SurfaceTexture surfaceTexture;
        C212359b4 c212359b4 = this.A00;
        Object obj = c212359b4.A04;
        synchronized (obj) {
            if (c212359b4.A05 != null) {
                surfaceTexture = c212359b4.A05;
            } else {
                try {
                    CountDownLatch countDownLatch = c212359b4.A01;
                    if (countDownLatch != null) {
                        countDownLatch.await(5L, TimeUnit.SECONDS);
                    }
                } catch (InterruptedException e) {
                    android.util.Log.e("PassThroughSurfacePipeComponent", AbstractC166997dE.A0y("Timeout when creating SurfaceNode: ", e));
                }
                synchronized (obj) {
                    surfaceTexture = c212359b4.A05;
                }
            }
        }
        return surfaceTexture;
    }

    @Override // X.InterfaceC175497rP
    public final Surface C4M() {
        Surface surface;
        SurfaceHolder holder;
        C212359b4 c212359b4 = this.A00;
        synchronized (c212359b4.A04) {
            SurfaceView surfaceView = c212359b4.A06;
            if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
                surface = holder.getSurface();
            } else {
                surface = null;
            }
        }
        return surface;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ SurfaceTexture C4N() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final InterfaceC176297sm CFN() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC177027ty CIg() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final void Dic(SurfaceTexture surfaceTexture, int i, int i2) {
        C212359b4 c212359b4 = this.A00;
        synchronized (c212359b4.A04) {
            c212359b4.A05 = surfaceTexture;
            CountDownLatch countDownLatch = c212359b4.A01;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    @Override // X.InterfaceC175497rP
    public final void Die(SurfaceTexture surfaceTexture) {
        C212359b4 c212359b4 = this.A00;
        synchronized (c212359b4.A04) {
            if (c212359b4.A05 != null) {
                c212359b4.A05 = null;
                c212359b4.A01 = new CountDownLatch(1);
            }
        }
    }

    @Override // X.InterfaceC175497rP
    public final boolean FE6() {
        C212359b4 c212359b4 = this.A00;
        C178037vc c178037vc = InterfaceC25224BDz.A00;
        Object A0a = AbstractC166997dE.A0a();
        Object AqG = ((AbstractC178657wd) c212359b4).A00.AqG(c178037vc);
        if (AqG != null) {
            A0a = AqG;
        }
        return AbstractC166987dD.A1a(A0a);
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ Object BZG(C176377su c176377su) {
        return null;
    }
}
