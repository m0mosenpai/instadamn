package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.facebook.live.livestreaming.opengl.EglCore;

/* renamed from: X.Vto, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69693Vto {
    public EGLSurface A00;
    public EglCore A01;
    public Surface A02;

    public final void A00() {
        EglCore eglCore = this.A01;
        EGLSurface eGLSurface = this.A00;
        if (EGL14.eglMakeCurrent(eglCore.A02, eGLSurface, eGLSurface, eglCore.A01)) {
        } else {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void A01() {
        EglCore eglCore = this.A01;
        EGLSurface eGLSurface = this.A00;
        EGLDisplay eGLDisplay = eglCore.A02;
        EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, eglCore.A01);
        EGL14.eglDestroySurface(eglCore.A02, eGLSurface);
        this.A00 = EGL14.EGL_NO_SURFACE;
        if (this.A02 != null) {
            this.A02 = null;
        }
    }

    public C69693Vto(Surface surface, EglCore eglCore) {
        this.A00 = EGL14.EGL_NO_SURFACE;
        this.A01 = eglCore;
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eglCore.A02, eglCore.A00, surface, new int[]{12344}, 0);
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            if (eglCreateWindowSurface != null) {
                this.A00 = eglCreateWindowSurface;
                this.A02 = surface;
                return;
            }
            throw new RuntimeException("surface was null");
        }
        throw AbstractC65702TsY.A0U("eglCreateWindowSurface", eglGetError);
    }
}
