package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;

/* renamed from: X.Vtv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69700Vtv {
    public EGLSurface A01 = EGL14.EGL_NO_SURFACE;
    public EGLContext A02 = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay A00 = EGL14.EGL_NO_DISPLAY;

    public final void A01(Surface surface) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A00 = eglGetDisplay;
        int[] iArr = new int[2];
        EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.A00, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
        this.A02 = EGL14.eglCreateContext(this.A00, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.A00, eGLConfigArr[0], surface, new int[]{12344}, 0);
        this.A01 = eglCreateWindowSurface;
        EGL14.eglMakeCurrent(this.A00, eglCreateWindowSurface, eglCreateWindowSurface, this.A02);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
    }

    public final void A00() {
        EGLSurface eGLSurface = this.A01;
        EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            EGL14.eglMakeCurrent(this.A00, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.A00, this.A01);
            this.A01 = EGL14.EGL_NO_SURFACE;
        }
        EGLContext eGLContext = this.A02;
        if (eGLContext != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglDestroyContext(this.A00, eGLContext);
            this.A02 = EGL14.EGL_NO_CONTEXT;
        }
        EGLDisplay eGLDisplay = this.A00;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglTerminate(eGLDisplay);
            this.A00 = EGL14.EGL_NO_DISPLAY;
        }
    }
}
