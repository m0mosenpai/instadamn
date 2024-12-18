package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.7rQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175507rQ implements InterfaceC175517rR {
    public int A00;
    public InterfaceC176367st A01;
    public boolean A02;
    public final SurfaceTexture.OnFrameAvailableListener A03 = new SurfaceTexture.OnFrameAvailableListener() { // from class: X.7rS
        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            InterfaceC1809280u interfaceC1809280u;
            C175507rQ c175507rQ = C175507rQ.this;
            if (surfaceTexture == c175507rQ.A05 && (interfaceC1809280u = c175507rQ.A06) != null) {
                interfaceC1809280u.DIE();
            }
        }
    };
    public volatile SurfaceTexture A04;
    public volatile SurfaceTexture A05;
    public volatile InterfaceC1809280u A06;

    @Override // X.InterfaceC175517rR
    public final void Dsk() {
        this.A00 = 0;
    }

    public final void A00() {
        SurfaceTexture surfaceTexture = this.A05;
        this.A05 = null;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.A04 = null;
        this.A02 = false;
    }

    @Override // X.InterfaceC175517rR
    public final long C8d() {
        InterfaceC176367st interfaceC176367st;
        if (this.A02 && (interfaceC176367st = this.A01) != null) {
            long frameTimestamp = interfaceC176367st.getFrameTimestamp();
            if (frameTimestamp != 0) {
                return frameTimestamp;
            }
        }
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        surfaceTexture.getClass();
        return surfaceTexture.getTimestamp();
    }

    @Override // X.InterfaceC175517rR
    public final void FCQ() {
        InterfaceC176367st interfaceC176367st;
        SurfaceTexture surfaceTexture = this.A05;
        if (this.A02 && (interfaceC176367st = this.A01) != null) {
            interfaceC176367st.update();
        } else {
            if (surfaceTexture == null) {
                return;
            }
            surfaceTexture.updateTexImage();
        }
    }

    @Override // X.InterfaceC175517rR
    public final SurfaceTexture getSurfaceTexture() {
        if (this.A02) {
            return this.A04;
        }
        return this.A05;
    }

    @Override // X.InterfaceC175517rR
    public final void CAY(float[] fArr) {
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        surfaceTexture.getClass();
        surfaceTexture.getTransformMatrix(fArr);
    }

    @Override // X.InterfaceC175517rR
    public final void Dsj(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC175517rR
    public final void ET4(int i, int i2) {
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        surfaceTexture.getClass();
        surfaceTexture.setDefaultBufferSize(i, i2);
    }

    @Override // X.InterfaceC175517rR
    public final void EZr(InterfaceC1809280u interfaceC1809280u) {
        this.A06 = interfaceC1809280u;
    }
}
