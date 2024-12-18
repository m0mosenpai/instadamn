package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLSurfaceView;
import org.webrtc.EglBase10Impl;

/* renamed from: X.VrP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69560VrP {
    public GLSurfaceView.Renderer A00;
    public final C68241VJd A01;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.VJd, java.lang.Object] */
    public C69560VrP() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = {0, 0};
        EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[]{0}, 0);
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], new int[]{12375, 4, 12374, 4, 12344}, 0);
        C14360o3.A0K(eglCreatePbufferSurface, EGL14.EGL_NO_SURFACE);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
        C14360o3.A0K(eglCreateContext, EGL14.EGL_NO_CONTEXT);
        C14360o3.A0A(eglCreateContext);
        C14360o3.A0A(eglGetDisplay);
        C14360o3.A0A(eglCreatePbufferSurface);
        C14360o3.A0B(eglCreateContext, 1);
        C14360o3.A0B(eglGetDisplay, 2);
        C14360o3.A0B(eglCreatePbufferSurface, 3);
        ?? obj = new Object();
        obj.A00 = eglCreateContext;
        obj.A01 = eglGetDisplay;
        obj.A03 = eglCreatePbufferSurface;
        obj.A02 = eglCreatePbufferSurface;
        this.A01 = obj;
        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
    }

    public final void A00() {
        C68241VJd c68241VJd = this.A01;
        if (!C14360o3.A0K(c68241VJd.A02, EGL14.EGL_NO_SURFACE) || !C14360o3.A0K(c68241VJd.A03, EGL14.EGL_NO_SURFACE)) {
            EGLDisplay eGLDisplay = c68241VJd.A01;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            if (!C14360o3.A0K(c68241VJd.A02, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(c68241VJd.A01, c68241VJd.A02);
                c68241VJd.A02 = EGL14.EGL_NO_SURFACE;
            }
            if (!C14360o3.A0K(c68241VJd.A03, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(c68241VJd.A01, c68241VJd.A03);
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                C14360o3.A0B(eGLSurface2, 0);
                c68241VJd.A03 = eGLSurface2;
            }
        }
        if (!C14360o3.A0K(c68241VJd.A00, EGL14.EGL_NO_CONTEXT)) {
            EGLDisplay eGLDisplay2 = c68241VJd.A01;
            EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(c68241VJd.A01, c68241VJd.A00);
            EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
            C14360o3.A0B(eGLContext, 0);
            c68241VJd.A00 = eGLContext;
        }
        if (!C14360o3.A0K(c68241VJd.A01, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglTerminate(c68241VJd.A01);
            EGLDisplay eGLDisplay3 = EGL14.EGL_NO_DISPLAY;
            C14360o3.A0B(eGLDisplay3, 0);
            c68241VJd.A01 = eGLDisplay3;
        }
    }
}
