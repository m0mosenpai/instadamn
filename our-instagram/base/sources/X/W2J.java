package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;

/* loaded from: classes11.dex */
public final class W2J {
    public EGLContext A00;
    public EGLDisplay A01;
    public EGLSurface A02;

    public W2J() {
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        C14360o3.A08(eGLDisplay);
        this.A01 = eGLDisplay;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        C14360o3.A08(eGLContext);
        this.A00 = eGLContext;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        C14360o3.A08(eGLSurface);
        this.A02 = eGLSurface;
        EGLContext eGLContext2 = EGL14.EGL_NO_CONTEXT;
        C14360o3.A08(eGLContext2);
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A01 = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGL14.eglChooseConfig(this.A01, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
                A00("eglCreateContext RGB888+recordable ES2");
                this.A00 = EGL14.eglCreateContext(this.A01, eGLConfigArr[0], eGLContext2, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                A00("eglCreateContext");
                this.A02 = EGL14.eglCreatePbufferSurface(this.A01, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
                A00("eglCreatePbufferSurface");
                return;
            }
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    public static final void A00(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
        } else {
            throw AbstractC65702TsY.A0U(str, eglGetError);
        }
    }
}
