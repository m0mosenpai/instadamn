package X;

import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes11.dex */
public final class WD4 {
    public static final C22962AAg A06 = new Object();
    public EGL10 A00;
    public EGLConfig A01;
    public EGLContext A02;
    public EGLDisplay A03;
    public EGLSurface A04;
    public final WeakReference A05;

    public WD4(WeakReference weakReference) {
        C14360o3.A0B(weakReference, 1);
        this.A05 = weakReference;
    }

    public static final void A00(WD4 wd4) {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = wd4.A04;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            EGL10 egl10 = wd4.A00;
            if (egl10 != null) {
                egl10.eglMakeCurrent(wd4.A03, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            GLDrawingView gLDrawingView = (GLDrawingView) wd4.A05.get();
            if (gLDrawingView != null && gLDrawingView.A03 != null) {
                EGL10 egl102 = wd4.A00;
                EGLDisplay eGLDisplay = wd4.A03;
                EGLSurface eGLSurface3 = wd4.A04;
                if (egl102 != null) {
                    egl102.eglDestroySurface(eGLDisplay, eGLSurface3);
                }
            }
            wd4.A04 = null;
        }
    }

    public final void A01() {
        EGLContext eGLContext = this.A02;
        if (eGLContext != null) {
            GLDrawingView gLDrawingView = (GLDrawingView) this.A05.get();
            if (gLDrawingView != null && gLDrawingView.A02 != null) {
                EGL10 egl10 = this.A00;
                EGLDisplay eGLDisplay = this.A03;
                if (egl10 != null && !egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("display:");
                    sb.append(eGLDisplay);
                    C0K8.A0C("DefaultContextFactory", AbstractC167017dG.A0n(eGLContext, " context: ", sb));
                    throw new RuntimeException(A06.A00("eglDestroyContex", egl10.eglGetError()));
                }
            }
            this.A02 = null;
        }
        EGLDisplay eGLDisplay2 = this.A03;
        if (eGLDisplay2 != null) {
            EGL10 egl102 = this.A00;
            if (egl102 != null) {
                egl102.eglTerminate(eGLDisplay2);
            }
            this.A03 = null;
        }
    }
}
