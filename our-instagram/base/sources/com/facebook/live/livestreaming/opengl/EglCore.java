package com.facebook.live.livestreaming.opengl;

import X.AbstractC111324zv;
import X.AbstractC25228BEl;
import X.AbstractC65702TsY;
import X.C0K8;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import org.webrtc.EglBase10Impl;

/* loaded from: classes11.dex */
public final class EglCore {
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;

    public EglCore() {
        this.A02 = EGL14.EGL_NO_DISPLAY;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.A01 = eGLContext;
        this.A00 = null;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A02 = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLContext eGLContext2 = this.A01;
                if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (!EGL14.eglChooseConfig(this.A02, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        C0K8.A0P("com.facebook.live.livestreaming.opengl.EglCore", "unable to find RGB8888 /%d EGLConfig", AbstractC25228BEl.A1Y(2));
                    } else {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        if (eGLConfig != null) {
                            eGLContext2 = EGL14.eglCreateContext(this.A02, eGLConfig, eGLContext, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                            int eglGetError = EGL14.eglGetError();
                            if (eglGetError == 12288) {
                                this.A00 = eGLConfig;
                                this.A01 = eGLContext2;
                            } else {
                                throw AbstractC65702TsY.A0U("eglCreateContext", eglGetError);
                            }
                        }
                    }
                    throw new RuntimeException(AbstractC111324zv.A00(1828));
                }
                EGL14.eglQueryContext(this.A02, eGLContext2, EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, new int[1], 0);
                return;
            }
            this.A02 = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    public final void A00() {
        EGLDisplay eGLDisplay = this.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.A02, this.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.A02);
        }
        this.A02 = EGL14.EGL_NO_DISPLAY;
        this.A01 = EGL14.EGL_NO_CONTEXT;
        this.A00 = null;
    }

    public final void finalize() {
        if (this.A02 != EGL14.EGL_NO_DISPLAY) {
            C0K8.A0D("com.facebook.live.livestreaming.opengl.EglCore", AbstractC111324zv.A00(3815));
            A00();
        }
    }
}
