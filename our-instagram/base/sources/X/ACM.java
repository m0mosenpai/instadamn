package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes4.dex */
public abstract class ACM {
    public InterfaceC72007XEv A00;
    public U7W A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;
    public volatile boolean A06;

    public Surface A00(U7W u7w) {
        C52041N0p c52041N0p = (C52041N0p) this;
        c52041N0p.A01 = u7w;
        boolean z = c52041N0p.A05;
        if (z) {
            c52041N0p.A00.setSurfaceTextureListener(new AQ2(c52041N0p, 1));
        }
        TextureView textureView = c52041N0p.A00;
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (z) {
            if (surfaceTexture == null) {
                Object obj = c52041N0p.A03;
                if (obj != null) {
                    synchronized (obj) {
                        while (!c52041N0p.A06) {
                            try {
                                obj.wait(2000L);
                            } catch (InterruptedException e) {
                                U7W u7w2 = c52041N0p.A01;
                                if (u7w2 != null && u7w2.A0E()) {
                                    AbstractC58318PtA.A18();
                                }
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    surfaceTexture = textureView.getSurfaceTexture();
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            return new Surface(surfaceTexture);
        }
        if (surfaceTexture == null) {
            throw new IllegalStateException("TextureView's SurfaceTexture is null. The TextureView either hasn't been attached to a window yet or it hasn't been initialized.");
        }
        return new Surface(surfaceTexture);
    }

    public boolean A01() {
        return AbstractC167007dF.A1W(((C52041N0p) this).A00.getSurfaceTexture());
    }

    public ACM(boolean z, boolean z2) {
        Object obj;
        this.A05 = z;
        this.A04 = z2;
        if (z) {
            obj = new Object();
        } else {
            obj = null;
        }
        this.A03 = obj;
        this.A02 = new Object();
    }
}
