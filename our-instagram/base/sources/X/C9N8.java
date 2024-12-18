package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import android.view.Surface;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.VideoFilter;
import org.webrtc.EglBase10Impl;

/* renamed from: X.9N8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9N8 implements InterfaceC58163PqS {
    public HandlerThread A03;
    public Surface A04;
    public C9NE A05;
    public C9NA A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final UserSession A0A;
    public final XOT A0B;
    public final boolean A0C;
    public EGLDisplay A01 = EGL14.EGL_NO_DISPLAY;
    public EGLContext A00 = EGL14.EGL_NO_CONTEXT;
    public EGLSurface A02 = EGL14.EGL_NO_SURFACE;

    public C9N8(Context context, UserSession userSession, VideoFilter videoFilter, XOT xot, C9N6 c9n6) {
        this.A09 = context;
        this.A0B = xot;
        this.A0A = userSession;
        Point point = c9n6.A03;
        this.A08 = point.x;
        this.A07 = point.y;
        boolean A00 = C6PX.A00(context);
        this.A0C = A00;
        if (A00) {
            synchronized (C178117vk.A06) {
                A00();
            }
        } else {
            A00();
        }
        if (this.A0C) {
            synchronized (C178117vk.A06) {
                EGLDisplay eGLDisplay = this.A01;
                EGLSurface eGLSurface = this.A02;
                EGLContext eGLContext = this.A00;
                eGLContext.getClass();
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                    throw new RuntimeException(AbstractC111324zv.A00(2304));
                }
            }
        } else {
            EGLDisplay eGLDisplay2 = this.A01;
            EGLSurface eGLSurface2 = this.A02;
            EGLContext eGLContext2 = this.A00;
            eGLContext2.getClass();
            if (!EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, eGLContext2)) {
                throw new RuntimeException(AbstractC111324zv.A00(2304));
            }
        }
        C9N2 c9n2 = C9NA.A0X;
        Context context2 = this.A09;
        EGLContext eGLContext3 = this.A00;
        eGLContext3.getClass();
        C9NA c9na = new C9NA(context2, eGLContext3, userSession, this.A0B, c9n6, this.A08, this.A07, true);
        this.A06 = c9na;
        SurfaceTexture A03 = c9na.A03(userSession, null, videoFilter);
        this.A05 = new C9NE(videoFilter, this.A06);
        HandlerThread handlerThread = new HandlerThread("gl-callback-runner", -19);
        AbstractC09770fa.A00(handlerThread);
        this.A03 = handlerThread;
        handlerThread.start();
        AbstractC65702TsY.A0y(this.A05, A03, this.A03);
        this.A04 = new Surface(A03);
    }

    private void A00() {
        String str;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A01 = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.A01, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.A01, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 3, 12344}, 0);
                    this.A00 = eglCreateContext;
                    if (eglCreateContext != null && eglCreateContext != EGL14.EGL_NO_CONTEXT && EGL14.eglGetError() == 12288) {
                        str = String.format(null, "eglCreateContext Version %d", AbstractC25228BEl.A1Y(3));
                    } else {
                        this.A00 = EGL14.eglCreateContext(this.A01, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                        str = "eglCreateContext Version 2 fallback";
                    }
                    A02(str);
                    if (this.A00 != null) {
                        this.A02 = EGL14.eglCreatePbufferSurface(this.A01, eGLConfigArr[0], new int[]{12375, this.A08, 12374, this.A07, 12344}, 0);
                        A02("createEGLSurface");
                        if (this.A02 != null) {
                            return;
                        } else {
                            throw new RuntimeException("surface was null");
                        }
                    }
                    throw new RuntimeException("null context");
                }
                throw new RuntimeException(AbstractC111324zv.A00(138));
            }
            this.A01 = null;
            throw new RuntimeException(AbstractC111324zv.A00(3265));
        }
        throw new RuntimeException(AbstractC111324zv.A00(3264));
    }

    public static void A02(String str) {
        boolean z = false;
        while (true) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            C0K8.A0O(AbstractC111324zv.A00(1824), "%s: EGL error: 0x%s", str, Integer.toHexString(eglGetError));
            z = true;
        }
        if (!z) {
        } else {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    @Override // X.InterfaceC58163PqS
    public final void Eel(boolean z) {
    }

    private void A01() {
        if (this.A00 != null && EGL14.eglGetCurrentContext().equals(this.A00)) {
            EGLDisplay eGLDisplay = this.A01;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.A01, this.A02);
        EGL14.eglDestroyContext(this.A01, this.A00);
        Surface surface = this.A04;
        surface.getClass();
        surface.release();
        C9NA c9na = this.A06;
        c9na.getClass();
        c9na.A04();
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
        this.A06 = null;
        this.A04 = null;
        this.A05 = null;
        HandlerThread handlerThread = this.A03;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.A03 = null;
        }
    }

    @Override // X.InterfaceC58163PqS
    public final void AD7() {
        C9NE c9ne = this.A05;
        c9ne.getClass();
        long nanoTime = System.nanoTime();
        long j = 2500000000L + nanoTime;
        synchronized (c9ne) {
            while (!c9ne.A00) {
                if (nanoTime < j) {
                    try {
                        c9ne.wait(2500L);
                        nanoTime = System.nanoTime();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                    }
                } else {
                    throw new RuntimeException(AbstractC111324zv.A00(3776));
                }
            }
            c9ne.A00 = false;
        }
        C209089Mq.A05("before updateTexImage");
    }

    @Override // X.InterfaceC58163PqS
    public final void AQj(long j) {
        C9NE c9ne = this.A05;
        c9ne.getClass();
        c9ne.A02.A05(null, c9ne.A01, j);
    }

    @Override // X.InterfaceC58163PqS
    public final Surface getSurface() {
        Surface surface = this.A04;
        surface.getClass();
        return surface;
    }

    @Override // X.InterfaceC58163PqS
    public final void release() {
        if (this.A0C) {
            synchronized (C178117vk.A06) {
                A01();
            }
            return;
        }
        A01();
    }
}
