package org.webrtc;

import X.AbstractC25229BEm;
import X.AbstractC65702TsY;
import X.AnonymousClass001;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.webrtc.EglBase;
import org.webrtc.EglBase10;
import org.webrtc.EglBase10Impl;

/* loaded from: classes11.dex */
public class EglBase10Impl implements EglBase10 {
    public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    public static final EglConnection EGL_NO_CONNECTION = new EglConnection();
    public static final String TAG = "EglBase10Impl";
    public EglConnection eglConnection;
    public EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;

    /* loaded from: classes11.dex */
    public class Context implements EglBase10.Context {
        public final EGLContext eglContext;

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            return 0L;
        }

        @Override // org.webrtc.EglBase10.Context
        public EGLContext getRawContext() {
            return this.eglContext;
        }

        public Context(EGLContext eGLContext) {
            this.eglContext = eGLContext;
        }
    }

    /* loaded from: classes11.dex */
    public class EglConnection implements EglBase10.EglConnection {
        public final EGL10 egl;
        public final EGLConfig eglConfig;
        public final EGLContext eglContext;
        public final EGLDisplay eglDisplay;
        public final RefCountDelegate refCountDelegate;

        public static /* synthetic */ void lambda$new$1() {
        }

        @Override // org.webrtc.EglBase10.EglConnection
        public EGLConfig getConfig() {
            return this.eglConfig;
        }

        @Override // org.webrtc.EglBase10.EglConnection
        public EGLContext getContext() {
            return this.eglContext;
        }

        @Override // org.webrtc.EglBase10.EglConnection
        public EGLDisplay getDisplay() {
            return this.eglDisplay;
        }

        @Override // org.webrtc.EglBase10.EglConnection
        public EGL10 getEgl() {
            return this.egl;
        }

        /* renamed from: lambda$new$0$org-webrtc-EglBase10Impl$EglConnection, reason: not valid java name */
        public /* synthetic */ void m109lambda$new$0$orgwebrtcEglBase10Impl$EglConnection() {
            synchronized (EglBase.lock) {
                EGL10 egl10 = this.egl;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.egl.eglDestroyContext(this.eglDisplay, this.eglContext);
            this.egl.eglTerminate(this.eglDisplay);
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
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl = egl10;
            EGLDisplay eglDisplay = EglBase10Impl.getEglDisplay(egl10);
            this.eglDisplay = eglDisplay;
            EGLConfig eglConfig = EglBase10Impl.getEglConfig(egl10, eglDisplay, iArr);
            this.eglConfig = eglConfig;
            int openGlesVersionFromConfig = EglBase.CC.getOpenGlesVersionFromConfig(iArr);
            boolean z = Logging.loggingEnabled;
            this.eglContext = EglBase10Impl.createEglContext(egl10, eGLContext, eglDisplay, eglConfig, openGlesVersionFromConfig);
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.EglBase10Impl$EglConnection$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    EglBase10Impl.EglConnection.this.m109lambda$new$0$orgwebrtcEglBase10Impl$EglConnection();
                }
            });
        }

        public EglConnection() {
            this.egl = (EGL10) EGLContext.getEGL();
            this.eglContext = EGL10.EGL_NO_CONTEXT;
            this.eglDisplay = EGL10.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.EglBase10Impl$EglConnection$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public static EGLConfig getEglConfig(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, 1, iArr2)) {
            if (iArr2[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig != null) {
                    return eGLConfig;
                }
                throw new RuntimeException("eglChooseConfig returned null");
            }
            throw new RuntimeException("Unable to find any matching EGL config");
        }
        throw AbstractC65702TsY.A0T("eglChooseConfig failed: 0x", egl10.eglGetError());
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EglConnection eglConnection = this.eglConnection;
        eglConnection.getEgl().eglQuerySurface(eglConnection.getDisplay(), this.eglSurface, 12374, iArr);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EglConnection eglConnection = this.eglConnection;
        eglConnection.getEgl().eglQuerySurface(eglConnection.getDisplay(), this.eglSurface, 12375, iArr);
        return iArr[0];
    }

    private void checkIsNotReleased() {
        if (this.eglConnection != EGL_NO_CONNECTION) {
        } else {
            throw new RuntimeException("This object has been released");
        }
    }

    public static EGLContext createEglContext(EGL10 egl10, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext;
        if (eGLContext != null && eGLContext == EGL10.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
        if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
            return eglCreateContext;
        }
        throw AbstractC65702TsY.A0T("Failed to create EGL context: 0x", egl10.eglGetError());
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof SurfaceHolder) && !(obj instanceof SurfaceTexture)) {
            throw new IllegalStateException("Input must be either a SurfaceHolder or SurfaceTexture");
        }
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface == eGLSurface2) {
            EglConnection eglConnection = this.eglConnection;
            EGL10 egl = eglConnection.getEgl();
            EGLSurface eglCreateWindowSurface = egl.eglCreateWindowSurface(eglConnection.getDisplay(), eglConnection.getConfig(), obj, new int[]{12344});
            this.eglSurface = eglCreateWindowSurface;
            if (eglCreateWindowSurface != eGLSurface2) {
                return;
            } else {
                throw AbstractC65702TsY.A0T("Failed to create window surface: 0x", egl.eglGetError());
            }
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public static EGLDisplay getEglDisplay(EGL10 egl10) {
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (egl10.eglInitialize(eglGetDisplay, new int[2])) {
                return eglGetDisplay;
            }
            throw AbstractC65702TsY.A0T("Unable to initialize EGL10: 0x", egl10.eglGetError());
        }
        throw AbstractC65702TsY.A0T("Unable to get EGL10 display: 0x", egl10.eglGetError());
    }

    @Override // org.webrtc.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(new SurfaceHolder(surface) { // from class: org.webrtc.EglBase10Impl.1FakeSurfaceHolder
            public final Surface surface;

            @Override // android.view.SurfaceHolder
            public void addCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public Rect getSurfaceFrame() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public boolean isCreating() {
                return false;
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas(Rect rect) {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public void removeCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public void setFixedSize(int i, int i2) {
            }

            @Override // android.view.SurfaceHolder
            public void setFormat(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void setKeepScreenOn(boolean z) {
            }

            @Override // android.view.SurfaceHolder
            public void setSizeFromLayout() {
            }

            @Override // android.view.SurfaceHolder
            @Deprecated
            public void setType(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void unlockCanvasAndPost(Canvas canvas) {
            }

            {
                this.surface = surface;
            }

            @Override // android.view.SurfaceHolder
            public Surface getSurface() {
                return this.surface;
            }
        });
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        synchronized (EglBase.lock) {
            EglConnection eglConnection = this.eglConnection;
            EGL10 egl = eglConnection.getEgl();
            EGLDisplay display = eglConnection.getDisplay();
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            if (!egl.eglMakeCurrent(display, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
                throw AbstractC65702TsY.A0T("eglDetachCurrent failed: 0x", egl.eglGetError());
            }
        }
    }

    @Override // org.webrtc.EglBase
    public EglBase.Context getEglBaseContext() {
        return new Context(this.eglConnection.getContext());
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        return AbstractC25229BEm.A1a(this.eglSurface, EGL10.EGL_NO_SURFACE);
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            EglConnection eglConnection = this.eglConnection;
            eglConnection.getEgl().eglDestroySurface(eglConnection.getDisplay(), eGLSurface);
            this.eglSurface = eGLSurface2;
        }
    }

    public EglBase10Impl(EglConnection eglConnection) {
        this.eglConnection = eglConnection;
        eglConnection.retain();
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface == eGLSurface2) {
            EglConnection eglConnection = this.eglConnection;
            EGL10 egl = eglConnection.getEgl();
            EGLSurface eglCreatePbufferSurface = egl.eglCreatePbufferSurface(eglConnection.getDisplay(), eglConnection.getConfig(), new int[]{12375, i, 12374, i2, 12344});
            this.eglSurface = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface != eGLSurface2) {
                return;
            } else {
                throw new RuntimeException(AnonymousClass001.A0x("Failed to create pixel buffer surface with size ", "x", ": 0x", Integer.toHexString(egl.eglGetError()), i, i2));
            }
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EglConnection eglConnection = this.eglConnection;
                EGL10 egl = eglConnection.getEgl();
                EGLDisplay display = eglConnection.getDisplay();
                EGLSurface eGLSurface = this.eglSurface;
                if (!egl.eglMakeCurrent(display, eGLSurface, eGLSurface, eglConnection.getContext())) {
                    throw AbstractC65702TsY.A0T("eglMakeCurrent failed: 0x", egl.eglGetError());
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
        swapBuffers();
    }

    public EglBase10Impl(EGLContext eGLContext, int[] iArr) {
        this.eglConnection = new EglConnection(eGLContext, iArr);
    }

    @Override // org.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL10.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EglConnection eglConnection = this.eglConnection;
                eglConnection.getEgl().eglSwapBuffers(eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
}
