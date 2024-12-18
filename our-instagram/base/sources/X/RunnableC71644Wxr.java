package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;
import org.webrtc.EglBase10Impl;

/* renamed from: X.Wxr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71644Wxr implements Runnable, SurfaceTexture.OnFrameAvailableListener {
    public static final int[] A06 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public SurfaceTexture A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = new int[1];

    public final void A01(int i) {
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr3 = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1)) {
                this.A02 = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, A06, 0, eGLConfigArr, 0, 1, iArr4, 0);
                if (eglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLDisplay eGLDisplay = this.A02;
                    if (i == 0) {
                        iArr = new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344};
                    } else {
                        iArr = new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12992, 1, 12344};
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eglCreateContext != null) {
                        this.A01 = eglCreateContext;
                        EGLDisplay eGLDisplay2 = this.A02;
                        if (i == 1) {
                            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            if (i == 2) {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                            } else {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                            }
                            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                            if (eglCreatePbufferSurface == null) {
                                throw new RuntimeException("eglCreatePbufferSurface failed");
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                            this.A03 = eglCreatePbufferSurface;
                            int[] iArr5 = this.A05;
                            GLES20.glGenTextures(1, iArr5, 0);
                            int glGetError = GLES20.glGetError();
                            if (glGetError == 0) {
                                SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
                                this.A00 = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(this);
                                return;
                            }
                            throw new RuntimeException(AnonymousClass001.A0R("glGenTextures failed. Error: ", Integer.toHexString(glGetError)));
                        }
                        throw new RuntimeException("eglMakeCurrent failed");
                    }
                    throw new RuntimeException("eglCreateContext failed");
                }
                throw new RuntimeException(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]));
            }
            throw new RuntimeException("eglInitialize failed");
        }
        throw new RuntimeException("eglGetDisplay failed");
    }

    /* JADX WARN: Finally extract failed */
    public final void A00() {
        this.A04.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.A00;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.A05, 0);
            }
            EGLSurface eGLSurface = this.A03;
            if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A02, this.A03);
            }
            EGLContext eGLContext = this.A01;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.A02, eGLContext);
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
        } catch (Throwable th) {
            EGLSurface eGLSurface2 = this.A03;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A02, this.A03);
            }
            EGLContext eGLContext2 = this.A01;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.A02, eGLContext2);
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public RunnableC71644Wxr(Handler handler) {
        this.A04 = handler;
    }
}
