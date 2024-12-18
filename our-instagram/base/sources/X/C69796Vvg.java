package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: X.Vvg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69796Vvg {
    public C176507t8 A00;
    public EGLSurface A01;
    public W68 A02;
    public final Object A05;
    public final float[] A03 = new float[16];
    public final int[] A06 = new int[2];
    public final C176537tB A04 = new C176537tB();

    public final int A00() {
        EGLSurface eGLSurface;
        W68 w68 = this.A02;
        if (w68 != null && !w68.A03() && (eGLSurface = this.A01) != EGL14.EGL_NO_SURFACE) {
            EGLDisplay eGLDisplay = w68.A02;
            int[] iArr = this.A06;
            EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12374, iArr, 1);
            return iArr[1];
        }
        return 0;
    }

    public final int A01() {
        EGLSurface eGLSurface;
        W68 w68 = this.A02;
        if (w68 == null || w68.A03() || (eGLSurface = this.A01) == EGL14.EGL_NO_SURFACE) {
            return 0;
        }
        EGLDisplay eGLDisplay = w68.A02;
        int[] iArr = this.A06;
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public final void A02() {
        W68 w68 = this.A02;
        if (w68 != null && !w68.A03() && this.A01 != EGL14.EGL_NO_SURFACE) {
            synchronized (this.A05) {
                W68 w682 = this.A02;
                EGLDisplay eGLDisplay = w682.A02;
                EGLSurface eGLSurface = this.A01;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, w682.A01)) {
                    throw new RuntimeException("eglMakeCurrent failed");
                }
            }
        }
    }

    public final void A03() {
        W68 w68 = this.A02;
        if (w68 != null && !w68.A03() && this.A01 != EGL14.EGL_NO_SURFACE) {
            synchronized (this.A05) {
                EGL14.eglDestroySurface(this.A02.A02, this.A01);
            }
        }
        C176507t8 c176507t8 = this.A00;
        if (c176507t8 != null) {
            c176507t8.A01();
        }
        this.A02 = null;
        this.A00 = null;
        this.A01 = EGL14.EGL_NO_SURFACE;
    }

    public final void A04() {
        W68 w68 = this.A02;
        if (w68 != null && !w68.A03() && this.A01 != EGL14.EGL_NO_SURFACE) {
            synchronized (this.A05) {
                EGL14.eglSwapBuffers(this.A02.A02, this.A01);
            }
        }
    }

    public final void A05(long j) {
        C176507t8 c176507t8;
        W68 w68 = this.A02;
        if (w68 != null && !w68.A03() && this.A01 != EGL14.EGL_NO_SURFACE && (c176507t8 = this.A00) != null) {
            int i = c176507t8.A09;
            if (i != 0) {
                if (i == 1) {
                    j = this.A04.A00(j);
                } else {
                    return;
                }
            }
            synchronized (this.A05) {
                EGLExt.eglPresentationTimeANDROID(this.A02.A02, this.A01, j);
            }
        }
    }

    public C69796Vvg(W68 w68, C176507t8 c176507t8, Object obj) {
        this.A01 = EGL14.EGL_NO_SURFACE;
        this.A05 = obj;
        this.A02 = w68;
        this.A00 = c176507t8;
        if (!w68.A03() && w68.A00 != null) {
            int[] iArr = {12344};
            Surface A00 = c176507t8.A00();
            if (A00 != null) {
                synchronized (obj) {
                    W68 w682 = this.A02;
                    this.A01 = EGL14.eglCreateWindowSurface(w682.A02, w682.A00, A00, iArr, 0);
                }
            }
            if (this.A01 == null || EGL14.eglGetError() != 12288) {
                this.A01 = EGL14.EGL_NO_SURFACE;
            }
        }
    }
}
