package org.webrtc;

import X.AbstractC25229BEm;
import X.AbstractC65702TsY;
import X.AnonymousClass001;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.EglBase14Impl;

/* loaded from: classes11.dex */
public class EglBase14Impl implements EglBase14 {
    public static final int EGLExt_SDK_VERSION = 18;
    public static final String TAG = "EglBase14Impl";
    public EglConnection eglConnection;
    public EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;
    public static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    public static final EglConnection EGL_NO_CONNECTION = new EglConnection();

    /* loaded from: classes11.dex */
    public class Context implements EglBase14.Context {
        public final EGLContext egl14Context;

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            int i = EglBase14Impl.CURRENT_SDK_VERSION;
            EGLContext eGLContext = this.egl14Context;
            if (i >= 21) {
                return eGLContext.getNativeHandle();
            }
            return eGLContext.getHandle();
        }

        @Override // org.webrtc.EglBase14.Context
        public EGLContext getRawContext() {
            return this.egl14Context;
        }

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }
    }

    /* loaded from: classes11.dex */
    public class EglConnection implements EglBase14.EglConnection {
        public final EGLConfig eglConfig;
        public final EGLContext eglContext;
        public final EGLDisplay eglDisplay;
        public final RefCountDelegate refCountDelegate;

        public static /* synthetic */ void lambda$new$1() {
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public EGLConfig getConfig() {
            return this.eglConfig;
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public EGLContext getContext() {
            return this.eglContext;
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public EGLDisplay getDisplay() {
            return this.eglDisplay;
        }

        /* renamed from: lambda$new$0$org-webrtc-EglBase14Impl$EglConnection, reason: not valid java name */
        public /* synthetic */ void m110lambda$new$0$orgwebrtcEglBase14Impl$EglConnection() {
            synchronized (EglBase.lock) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.eglDisplay);
        }

        @Override // org.webrtc.RefCounted
        public void release() {
            this.refCountDelegate.release();
        }

        @Override // org.webrtc.RefCounted
        public void retain() {
            this.refCountDelegate.retain();
        }

        public EglConnection(EGLContext eGLContext, int[] iArr) {
            EGLDisplay eglDisplay = EglBase14Impl.getEglDisplay();
            this.eglDisplay = eglDisplay;
            EGLConfig eglConfig = EglBase14Impl.getEglConfig(eglDisplay, iArr);
            this.eglConfig = eglConfig;
            int openGlesVersionFromConfig = EglBase.CC.getOpenGlesVersionFromConfig(iArr);
            boolean z = Logging.loggingEnabled;
            this.eglContext = EglBase14Impl.createEglContext(eGLContext, eglDisplay, eglConfig, openGlesVersionFromConfig);
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.EglBase14Impl$EglConnection$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    EglBase14Impl.EglConnection.this.m110lambda$new$0$orgwebrtcEglBase14Impl$EglConnection();
                }
            });
        }

        public EglConnection() {
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.EglBase14Impl$EglConnection$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            if (iArr2[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig != null) {
                    return eGLConfig;
                }
                throw new RuntimeException("eglChooseConfig returned null");
            }
            throw new RuntimeException("Unable to find any matching EGL config");
        }
        throw AbstractC65702TsY.A0T("eglChooseConfig failed: 0x", EGL14.eglGetError());
    }

    public static EGLDisplay getEglDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw AbstractC65702TsY.A0T("Unable to initialize EGL14: 0x", EGL14.eglGetError());
        }
        throw AbstractC65702TsY.A0T("Unable to get EGL14 display: 0x", EGL14.eglGetError());
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    private void checkIsNotReleased() {
        if (this.eglConnection != EGL_NO_CONNECTION) {
        } else {
            throw new RuntimeException("This object has been released");
        }
    }

    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext;
        if (eGLContext != null && eGLContext == EGL14.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw AbstractC65702TsY.A0T("Failed to create EGL context: 0x", EGL14.eglGetError());
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
        }
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            EglConnection eglConnection = this.eglConnection;
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eglConnection.getDisplay(), eglConnection.getConfig(), obj, new int[]{12344}, 0);
            this.eglSurface = eglCreateWindowSurface;
            if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                return;
            } else {
                throw AbstractC65702TsY.A0T("Failed to create window surface: 0x", EGL14.eglGetError());
            }
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public static boolean isEGL14Supported() {
        int i = CURRENT_SDK_VERSION;
        boolean z = Logging.loggingEnabled;
        if (i >= 18) {
            return true;
        }
        return false;
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        synchronized (EglBase.lock) {
            EGLDisplay display = this.eglConnection.getDisplay();
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(display, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                throw AbstractC65702TsY.A0T("eglDetachCurrent failed: 0x", EGL14.eglGetError());
            }
        }
    }

    @Override // org.webrtc.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglConnection.getContext());
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        return AbstractC25229BEm.A1a(this.eglSurface, EGL14.EGL_NO_SURFACE);
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglConnection.getDisplay(), eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    public EglBase14Impl(EglConnection eglConnection) {
        this.eglConnection = eglConnection;
        eglConnection.retain();
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            EglConnection eglConnection = this.eglConnection;
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglConnection.getDisplay(), eglConnection.getConfig(), new int[]{12375, i, 12374, i2, 12344}, 0);
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                return;
            } else {
                throw new RuntimeException(AnonymousClass001.A0x("Failed to create pixel buffer surface with size ", "x", ": 0x", Integer.toHexString(EGL14.eglGetError()), i, i2));
            }
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    @Override // org.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EglConnection eglConnection = this.eglConnection;
                EGLDisplay display = eglConnection.getDisplay();
                EGLSurface eGLSurface = this.eglSurface;
                if (!EGL14.eglMakeCurrent(display, eGLSurface, eGLSurface, eglConnection.getContext())) {
                    throw AbstractC65702TsY.A0T("eglMakeCurrent failed: 0x", EGL14.eglGetError());
                }
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    @Override // org.webrtc.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        this.eglConnection.release();
        this.eglConnection = EGL_NO_CONNECTION;
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long j) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGLExt.eglPresentationTimeANDROID(this.eglConnection.getDisplay(), this.eglSurface, j);
                EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    public EglBase14Impl(EGLContext eGLContext, int[] iArr) {
        this.eglConnection = new EglConnection(eGLContext, iArr);
    }

    @Override // org.webrtc.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
}
