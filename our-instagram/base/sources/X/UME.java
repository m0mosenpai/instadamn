package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

/* loaded from: classes11.dex */
public final class UME extends W53 {
    public final void A00() {
        W53.A00("before makeCurrent");
        EGLDisplay eGLDisplay = this.A01;
        EGLSurface eGLSurface = this.A02;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A00)) {
        } else {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public UME(Surface surface) {
        surface.getClass();
        this.A03 = surface;
        this.A02 = EGL14.eglCreateWindowSurface(this.A01, this.A04[0], surface, new int[]{12344}, 0);
        W53.A00("eglCreateWindowSurface");
        if (this.A02 != null) {
        } else {
            throw new RuntimeException("surface was null");
        }
    }
}
