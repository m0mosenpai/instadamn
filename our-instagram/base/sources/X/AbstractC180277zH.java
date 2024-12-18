package X;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;

/* renamed from: X.7zH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC180277zH {
    public C178927x4 A01;
    public final C178927x4 A02;
    public EGLSurface A00 = EGL14.EGL_NO_SURFACE;
    public final int[] A04 = new int[1];
    public final int[] A03 = new int[1];

    public final int A00() {
        C178927x4 c178927x4 = this.A01;
        EGLSurface eGLSurface = this.A00;
        int[] iArr = this.A03;
        EGL14.eglQuerySurface(c178927x4.A04, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public final int A01() {
        C178927x4 c178927x4 = this.A01;
        EGLSurface eGLSurface = this.A00;
        int[] iArr = this.A04;
        EGL14.eglQuerySurface(c178927x4.A04, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public final void A02() {
        EGLSurface eGLSurface = this.A00;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.A01.A04, eGLSurface);
        }
        this.A00 = EGL14.EGL_NO_SURFACE;
    }

    public final void A03() {
        C178927x4 c178927x4 = this.A01;
        EGLSurface eGLSurface = this.A00;
        Object obj = c178927x4.A07;
        if (obj != null) {
            synchronized (obj) {
                EGL14.eglSwapBuffers(c178927x4.A04, eGLSurface);
            }
        } else {
            EGL14.eglSwapBuffers(c178927x4.A04, eGLSurface);
        }
    }

    public final void A04(long j) {
        C178927x4 c178927x4 = this.A01;
        EGLExt.eglPresentationTimeANDROID(c178927x4.A04, this.A00, j);
    }

    public final boolean A05() {
        boolean A07;
        C178927x4 c178927x4 = this.A01;
        EGLSurface eGLSurface = this.A00;
        Object obj = c178927x4.A07;
        if (obj != null) {
            synchronized (obj) {
                A07 = C178927x4.A07(eGLSurface, eGLSurface, c178927x4);
            }
            return A07;
        }
        return C178927x4.A07(eGLSurface, eGLSurface, c178927x4);
    }

    public AbstractC180277zH(C178927x4 c178927x4) {
        this.A01 = c178927x4;
        this.A02 = c178927x4;
    }
}
