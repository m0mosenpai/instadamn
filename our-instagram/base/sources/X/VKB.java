package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

/* loaded from: classes11.dex */
public final class VKB {
    public EGLContext A00;
    public EGLDisplay A01;
    public EGLSurface A02;
    public Surface A03;
    public EGLConfig[] A04;

    public final void A00() {
        EGLDisplay eGLDisplay = this.A01;
        EGLSurface eGLSurface = this.A02;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A00)) {
        } else {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void A01() {
        EGLDisplay eGLDisplay = this.A01;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
        } else {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }
}
