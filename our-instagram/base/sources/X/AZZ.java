package X;

import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.View;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class AZZ implements InterfaceC178677wf {
    public final int A00;
    public final Object A01;

    public AZZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC178677wf
    public final void Dah(C176507t8 c176507t8) {
        CountDownLatch countDownLatch;
        if (2 - this.A00 == 0) {
            C14360o3.A0B(c176507t8, 0);
            SurfaceTexture surfaceTexture = c176507t8.A0B;
            C212359b4 c212359b4 = (C212359b4) this.A01;
            if (surfaceTexture != null) {
                c212359b4.A03.Dic(surfaceTexture, 0, 0);
                return;
            }
            synchronized (c212359b4.A04) {
                if (c212359b4.A06 != null && (countDownLatch = c212359b4.A01) != null) {
                    countDownLatch.countDown();
                }
            }
        }
    }

    @Override // X.InterfaceC178677wf
    public final void Dai(C176507t8 c176507t8) {
        if (2 - this.A00 == 0) {
            C14360o3.A0B(c176507t8, 0);
            SurfaceTexture surfaceTexture = c176507t8.A0B;
            C212359b4 c212359b4 = (C212359b4) this.A01;
            if (surfaceTexture != null) {
                c212359b4.A03.Die(surfaceTexture);
                return;
            }
            synchronized (c212359b4.A04) {
                if (c212359b4.A06 != null) {
                    c212359b4.A01 = new CountDownLatch(1);
                }
            }
        }
    }

    @Override // X.InterfaceC178677wf
    public final void Daj(C176507t8 c176507t8, int i, int i2) {
        CountDownLatch countDownLatch;
        switch (this.A00) {
            case 0:
                C180197z9 c180197z9 = (C180197z9) this.A01;
                int A00 = C180197z9.A00(c180197z9);
                if (c180197z9.A01 == A00) {
                    return;
                }
                c180197z9.A01 = A00;
                C180197z9.A01(c180197z9);
                return;
            case 1:
                AKN akn = (AKN) this.A01;
                akn.A02 = i;
                akn.A01 = i2;
                AKN.A01(akn);
                return;
            default:
                C14360o3.A0B(c176507t8, 0);
                SurfaceTexture surfaceTexture = c176507t8.A0B;
                C212359b4 c212359b4 = (C212359b4) this.A01;
                if (surfaceTexture != null) {
                    c212359b4.A03.Dic(surfaceTexture, i, i2);
                    return;
                }
                synchronized (c212359b4.A04) {
                    if (c212359b4.A06 != null && (countDownLatch = c212359b4.A01) != null) {
                        countDownLatch.countDown();
                    }
                }
                return;
        }
    }

    @Override // X.InterfaceC178677wf
    public final void Dan(View view) {
        SurfaceView surfaceView;
        if (2 - this.A00 == 0) {
            C212359b4 c212359b4 = (C212359b4) this.A01;
            synchronized (c212359b4.A04) {
                if (view instanceof SurfaceView) {
                    surfaceView = (SurfaceView) view;
                } else {
                    surfaceView = null;
                }
                c212359b4.A06 = surfaceView;
                SurfaceTexture surfaceTexture = c212359b4.A05;
                if (surfaceTexture != null) {
                    c212359b4.A03.Die(surfaceTexture);
                }
            }
        }
    }
}
