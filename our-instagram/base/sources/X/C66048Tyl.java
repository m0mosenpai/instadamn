package X;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Tyl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66048Tyl implements SurfaceTexture.OnFrameAvailableListener {
    public static final long A07 = TimeUnit.MILLISECONDS.toNanos(10000);
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SurfaceTexture A05;
    public final Object A06 = new Object();
    public long A01 = 0;
    public int A00 = 0;

    public final void A00() {
        if (!this.A02) {
            long nanoTime = System.nanoTime();
            long j = A07 + nanoTime;
            Object obj = this.A06;
            synchronized (obj) {
                while (!this.A04) {
                    if (nanoTime < j) {
                        try {
                            obj.wait(10000L);
                            nanoTime = System.nanoTime();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new RuntimeException(e);
                        }
                    } else {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                }
                this.A04 = false;
                this.A00 = 0;
            }
            AbstractC180237zD.A02("before updateTexImage", new Object[0]);
            this.A05.updateTexImage();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z = this.A02;
        synchronized (this) {
            if (z) {
                this.A01++;
                return;
            }
            this.A01++;
            Object obj = this.A06;
            synchronized (obj) {
                if (this.A03) {
                    this.A00++;
                } else if (this.A04) {
                    throw new RuntimeException(AbstractC111324zv.A00(232));
                }
                this.A04 = true;
                obj.notifyAll();
            }
        }
    }

    public C66048Tyl(SurfaceTexture surfaceTexture) {
        this.A05 = surfaceTexture;
    }
}
