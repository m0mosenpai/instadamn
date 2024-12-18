package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;

/* loaded from: classes11.dex */
public final class UMF extends W53 implements InterfaceC58163PqS, SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture A00;
    public HandlerThread A01;
    public boolean A02;
    public final int A03;
    public final Object A04 = new Object();

    @Override // X.InterfaceC58163PqS
    public final void AQj(long j) {
    }

    @Override // X.InterfaceC58163PqS
    public final void Eel(boolean z) {
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = this.A04;
        synchronized (obj) {
            if (this.A02) {
                C0w9.A03("VideoOverlayDecoderOutputSurface", AbstractC111324zv.A00(232));
            }
            this.A02 = true;
            obj.notifyAll();
        }
    }

    public UMF() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        AbstractC66018TyG.A01("glBindTexture mTextureID");
        AbstractC65702TsY.A0r();
        AbstractC66018TyG.A01("glTexParameter");
        this.A03 = i;
        W53.A00("before createSurfaceTexture");
        this.A00 = new SurfaceTexture(i);
        if (EGL14.eglGetError() != 12288) {
            C0w9.A03("VideoOverlayDecoderOutputSurface", "EGL Error after creating a SurfaceTexture");
        }
        HandlerThread A0A = MSY.A0A("output-surface-cb-runner");
        this.A01 = A0A;
        A0A.start();
        AbstractC65702TsY.A0y(this, this.A00, this.A01);
        super.A03 = new Surface(this.A00);
    }

    @Override // X.InterfaceC58163PqS
    public final void AD7() {
        long currentTimeMillis = System.currentTimeMillis() + 1000;
        Object obj = this.A04;
        synchronized (obj) {
            while (!this.A02) {
                try {
                    obj.wait(1000L);
                    if (!this.A02 && System.currentTimeMillis() >= currentTimeMillis) {
                        break;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.A02 = false;
        }
        W53.A00("before updateTexImage");
        SurfaceTexture surfaceTexture = this.A00;
        surfaceTexture.getClass();
        surfaceTexture.updateTexImage();
    }

    @Override // X.W53, X.InterfaceC58163PqS
    public final void release() {
        super.release();
        this.A00 = null;
        HandlerThread handlerThread = this.A01;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.A01 = null;
        }
    }
}
