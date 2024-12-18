package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.9MM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9MM implements InterfaceC175517rR {
    public final SurfaceTexture.OnFrameAvailableListener A00;
    public final Object A01;
    public final boolean A02;
    public volatile SurfaceTexture A03;
    public volatile InterfaceC1809280u A04;
    public volatile int A05;

    private SurfaceTexture A00() {
        SurfaceTexture surfaceTexture;
        SurfaceTexture surfaceTexture2 = this.A03;
        if (surfaceTexture2 == null) {
            synchronized (this.A01) {
                surfaceTexture = this.A03;
                int i = this.A05;
                if (surfaceTexture == null) {
                    surfaceTexture = new SurfaceTexture(i);
                    this.A03 = surfaceTexture;
                }
                if (i != 0 && this.A02) {
                    surfaceTexture.setOnFrameAvailableListener(this.A00);
                }
            }
            return surfaceTexture;
        }
        return surfaceTexture2;
    }

    @Override // X.InterfaceC175517rR
    public final long C8d() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            return surfaceTexture.getTimestamp();
        }
        return 0L;
    }

    @Override // X.InterfaceC175517rR
    public final void CAY(float[] fArr) {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr);
        }
    }

    @Override // X.InterfaceC175517rR
    public final void Dsj(int i) {
        this.A05 = i;
        if (i != 0) {
            SurfaceTexture surfaceTexture = this.A03;
            if (surfaceTexture != null) {
                surfaceTexture.detachFromGLContext();
                surfaceTexture.attachToGLContext(i);
                if (this.A02) {
                    surfaceTexture.setOnFrameAvailableListener(this.A00);
                }
                surfaceTexture.updateTexImage();
                return;
            }
            A00();
        }
    }

    @Override // X.InterfaceC175517rR
    public final void Dsk() {
        if (this.A03 != null) {
            synchronized (this.A01) {
                SurfaceTexture surfaceTexture = this.A03;
                this.A03 = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
        }
        this.A05 = 0;
    }

    @Override // X.InterfaceC175517rR
    public final void FCQ() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    @Override // X.InterfaceC175517rR
    public final SurfaceTexture getSurfaceTexture() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture == null) {
            return A00();
        }
        return surfaceTexture;
    }

    public C9MM(boolean z) {
        this.A01 = new Object();
        this.A00 = new APD(this, 1);
        this.A02 = z;
    }

    @Override // X.InterfaceC175517rR
    public final void ET4(int i, int i2) {
        getSurfaceTexture().setDefaultBufferSize(i, i2);
    }

    @Override // X.InterfaceC175517rR
    public final void EZr(InterfaceC1809280u interfaceC1809280u) {
        this.A04 = interfaceC1809280u;
    }

    public C9MM() {
        this(true);
    }
}
