package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import android.view.Surface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase10Impl;

/* renamed from: X.7x4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178927x4 implements InterfaceC178897x1 {
    public int A01;
    public EGLConfig A02;
    public final int A06;
    public final Object A07;
    public EGLDisplay A04 = EGL14.EGL_NO_DISPLAY;
    public EGLContext A03 = EGL14.EGL_NO_CONTEXT;
    public final Map A08 = new HashMap();
    public int A00 = 0;
    public C178937x5 A05 = new C178937x5(this);

    public static EGLConfig A00(EGLDisplay eGLDisplay, int[] iArr, int i) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0) && (eGLConfig = eGLConfigArr[0]) != null) {
            return eGLConfig;
        }
        AbstractC180237zD.A01("eglChooseConfig");
        throw new GLException(-1, AnonymousClass001.A0c("unable to find EGL config with flags = ", ", no GL Errors", i));
    }

    @Override // X.InterfaceC178897x1
    public final AbstractC180277zH AMj(Surface surface, int i) {
        AbstractC180277zH abstractC180277zH;
        Object obj = this.A07;
        if (obj != null) {
            synchronized (obj) {
                abstractC180277zH = new AbstractC180277zH(this);
                C178927x4 c178927x4 = abstractC180277zH.A01;
                EGLConfig eGLConfig = c178927x4.A02;
                try {
                    eGLConfig = A01(c178927x4, 5);
                } catch (RuntimeException unused) {
                }
                abstractC180277zH.A00 = A02(eGLConfig, surface, c178927x4);
            }
            return abstractC180277zH;
        }
        AbstractC180277zH abstractC180277zH2 = new AbstractC180277zH(this);
        C178927x4 c178927x42 = abstractC180277zH2.A01;
        EGLConfig eGLConfig2 = c178927x42.A02;
        try {
            eGLConfig2 = A01(c178927x42, 5);
        } catch (RuntimeException unused2) {
        }
        abstractC180277zH2.A00 = A02(eGLConfig2, surface, c178927x42);
        return abstractC180277zH2;
    }

    public static EGLConfig A01(C178927x4 c178927x4, int i) {
        int i2;
        Map map = c178927x4.A08;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (EGLConfig) map.get(valueOf);
        }
        int i3 = 4;
        if ((i & 2) != 0) {
            i3 = 68;
        }
        int i4 = 0;
        if ((i & 4) != 0) {
            i4 = 16;
        }
        int i5 = i & 32;
        int i6 = 8;
        int i7 = 8;
        if (i5 != 0) {
            i6 = 2;
            i7 = 10;
        }
        if ((i & 8) != 0) {
            i6 = 0;
        }
        int[] iArr = {12324, i7, 12323, i7, 12322, i7, 12321, i6, 12325, i4, 12352, i3, 12344, 0, 12344, 0, 12344, 0, 12344, 0, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[20] = 12610;
            iArr[21] = 1;
        }
        int i8 = i & 16;
        if (i8 != 0) {
            iArr[16] = 12338;
            iArr[17] = 1;
            iArr[18] = 12337;
            iArr[19] = 4;
        }
        if ((i & 64) != 0) {
            iArr[14] = 12339;
            iArr[15] = 1;
        }
        if ((i & 128) != 0) {
            iArr[14] = 12339;
            iArr[15] = 4;
        }
        if (i5 == 0 || (i & 4096) == 0) {
            if ((i & C3OO.FLAG_MOVED) != 0) {
                iArr[12] = 12327;
                i2 = -1;
            } else if ((i & 512) != 0) {
                iArr[12] = 12327;
                i2 = 12368;
            } else if ((i & 1024) != 0) {
                iArr[12] = 12327;
                i2 = 12369;
            } else if ((i & 256) != 0) {
                iArr[12] = 12327;
                iArr[13] = 12344;
            }
            iArr[13] = i2;
        }
        try {
            EGLConfig A00 = A00(c178927x4.A04, iArr, i);
            if (i5 != 0 && (i & 4096) != 0) {
                int[] iArr2 = new int[1];
                EGL14.eglGetConfigAttrib(c178927x4.A04, A00, 12327, iArr2, 0);
                iArr[12] = 12327;
                iArr[13] = iArr2[0];
                A00 = A00(c178927x4.A04, iArr, i);
            }
            map.put(valueOf, A00);
            return A00;
        } catch (GLException e) {
            if (i8 != 0) {
                iArr[16] = 12344;
                iArr[17] = 0;
                iArr[18] = 12344;
                iArr[19] = 0;
                EGLConfig A002 = A00(c178927x4.A04, iArr, i);
                map.put(valueOf, A002);
                return A002;
            }
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.7zH, X.7zG] */
    private C180267zG A03(int i, int i2) {
        ?? abstractC180277zH = new AbstractC180277zH(this);
        C178927x4 c178927x4 = abstractC180277zH.A01;
        abstractC180277zH.A00 = EGL14.eglCreatePbufferSurface(c178927x4.A04, c178927x4.A02, new int[]{12375, i, 12374, i2, 12344}, 0);
        AbstractC180237zD.A01("eglCreatePbufferSurface");
        abstractC180277zH.A00.getClass();
        return abstractC180277zH;
    }

    private void A04() {
        EGLDisplay eGLDisplay = this.A04;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
    }

    private void A05() {
        if (this.A04 != EGL14.EGL_NO_DISPLAY) {
            if (CS8()) {
                A04();
                EGL14.eglDestroyContext(this.A04, this.A03);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.A04);
            } else {
                EGL14.eglDestroyContext(this.A04, this.A03);
            }
        }
        this.A04 = EGL14.EGL_NO_DISPLAY;
        this.A03 = EGL14.EGL_NO_CONTEXT;
        this.A02 = null;
        this.A08.clear();
        this.A00 = 0;
        C178937x5 c178937x5 = this.A05;
        if (c178937x5 != null) {
            C180247zE c180247zE = C180247zE.A02;
            synchronized (c180247zE) {
                c180247zE.A01.remove(c178937x5);
            }
            C178937x5 c178937x52 = this.A05;
            List list = c178937x52.A00;
            list.remove(Integer.valueOf(hashCode()));
            if (list.isEmpty()) {
                c178937x52.A01.clear();
            }
            list.isEmpty();
        }
        this.A05 = null;
    }

    private void A06(EGLContext eGLContext, int i) {
        String format;
        this.A00 = i;
        this.A04 = EGL14.eglGetDisplay(0);
        AbstractC180237zD.A01("eglGetDisplay");
        EGLDisplay eGLDisplay = this.A04;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eGLDisplay, iArr, 0, iArr, 1)) {
                EGLConfig A01 = A01(this, i);
                this.A02 = A01;
                int i2 = this.A06;
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.A04, A01, eGLContext, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, i2, 12344}, 0);
                this.A03 = eglCreateContext;
                if (i2 == 3 && (eglCreateContext == null || eglCreateContext == EGL14.EGL_NO_CONTEXT || EGL14.eglGetError() != 12288)) {
                    this.A03 = EGL14.eglCreateContext(this.A04, this.A02, eGLContext, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                    format = "eglCreateContext Version 2 fallback";
                } else {
                    format = String.format(null, "eglCreateContext Version %d", Integer.valueOf(i2));
                }
                AbstractC180237zD.A01(format);
                this.A03.getClass();
                C180247zE c180247zE = C180247zE.A02;
                C178937x5 c178937x5 = this.A05;
                synchronized (c180247zE) {
                    if (c178937x5 != null) {
                        c180247zE.A01.add(c178937x5);
                    }
                }
                int[] iArr2 = new int[1];
                EGL14.eglQueryContext(this.A04, this.A03, EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, iArr2, 0);
                this.A01 = iArr2[0];
                return;
            }
            AbstractC180237zD.A01("eglInitialize");
            throw new GLException(-1, "unable to initialize EGL14, no GL Errors");
        }
        throw new IllegalStateException();
    }

    public static boolean A07(EGLSurface eGLSurface, EGLSurface eGLSurface2, C178927x4 c178927x4) {
        boolean equals = c178927x4.A03.equals(EGL14.eglGetCurrentContext());
        boolean equals2 = c178927x4.A04.equals(EGL14.EGL_NO_DISPLAY);
        boolean equals3 = eGLSurface.equals(EGL14.eglGetCurrentSurface(12377));
        boolean equals4 = eGLSurface2.equals(EGL14.eglGetCurrentSurface(12378));
        if ((!equals || !equals3 || !equals4) && !EGL14.eglMakeCurrent(c178927x4.A04, eGLSurface, eGLSurface2, c178927x4.A03)) {
            StringBuilder sb = new StringBuilder();
            sb.append("eglMakeCurrent, contextWasAlreadyCurrent=");
            sb.append(equals);
            sb.append(" isDisplayNoDisplay=");
            sb.append(equals2);
            sb.append(" drawSurfaceWasAlreadyCurrent=");
            sb.append(equals3);
            sb.append(" readSurfaceWasAlreadyCurrent=");
            sb.append(equals4);
            AbstractC180237zD.A01(sb.toString());
            if (!EGL14.eglMakeCurrent(c178927x4.A04, eGLSurface, eGLSurface2, c178927x4.A03)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("eglMakeCurrent, contextWasAlreadyCurrent=");
                sb2.append(equals);
                sb2.append(" isDisplayNoDisplay=");
                sb2.append(equals2);
                sb2.append(" drawSurfaceWasAlreadyCurrent=");
                sb2.append(equals3);
                sb2.append(" readSurfaceWasAlreadyCurrent=");
                sb2.append(equals4);
                AbstractC180237zD.A01(sb2.toString());
                return false;
            }
        }
        return true;
    }

    public static int[] A08(C178927x4 c178927x4) {
        int[] iArr = {12344};
        int i = c178927x4.A00;
        if ((i & 32) != 0 && (i & 8192) != 0 && EGL14.eglQueryString(c178927x4.A04, 12373) != null && EGL14.eglQueryString(c178927x4.A04, 12373).contains("KHR_gl_colorspace") && EGL14.eglQueryString(c178927x4.A04, 12373) != null && EGL14.eglQueryString(c178927x4.A04, 12373).contains("EXT_gl_colorspace_bt2020")) {
            return new int[]{12445, 13632, 12344};
        }
        return iArr;
    }

    public final void A09(EGLContext eGLContext, int i) {
        Object obj = this.A07;
        if (obj != null) {
            synchronized (obj) {
                A06(eGLContext, i);
            }
        } else {
            A06(eGLContext, i);
        }
    }

    @Override // X.InterfaceC178897x1
    public final AbstractC180277zH AMg(int i, int i2) {
        C180267zG A03;
        Object obj = this.A07;
        if (obj != null) {
            synchronized (obj) {
                A03 = A03(i, i2);
            }
            return A03;
        }
        return A03(i, i2);
    }

    @Override // X.InterfaceC178897x1
    public final AbstractC180277zH AMi(Surface surface) {
        AbstractC180277zH abstractC180277zH;
        Object obj = this.A07;
        if (obj != null) {
            synchronized (obj) {
                abstractC180277zH = new AbstractC180277zH(this);
                C178927x4 c178927x4 = abstractC180277zH.A01;
                abstractC180277zH.A00 = A02(c178927x4.A02, surface, c178927x4);
            }
            return abstractC180277zH;
        }
        AbstractC180277zH abstractC180277zH2 = new AbstractC180277zH(this);
        C178927x4 c178927x42 = abstractC180277zH2.A01;
        abstractC180277zH2.A00 = A02(c178927x42.A02, surface, c178927x42);
        return abstractC180277zH2;
    }

    @Override // X.InterfaceC178897x1
    public final int AqC() {
        return this.A00;
    }

    @Override // X.InterfaceC178897x1
    public final /* bridge */ /* synthetic */ EGLContext B08() {
        return this.A03;
    }

    @Override // X.InterfaceC178897x1
    public final int BZA() {
        return this.A01;
    }

    @Override // X.InterfaceC178897x1
    public final C178937x5 C6u() {
        return this.A05;
    }

    @Override // X.InterfaceC178897x1
    public final boolean CS8() {
        EGLContext eGLContext = this.A03;
        if (eGLContext != EGL14.EGL_NO_CONTEXT) {
            return eGLContext.equals(EGL14.eglGetCurrentContext());
        }
        return false;
    }

    @Override // X.InterfaceC178897x1
    public final void Cml() {
        Object obj = this.A07;
        if (obj != null) {
            synchronized (obj) {
                A04();
            }
        } else {
            A04();
        }
    }

    @Override // X.InterfaceC178897x1
    public final /* bridge */ /* synthetic */ C178927x4 EhY(int i) {
        A09(EGL14.EGL_NO_CONTEXT, i);
        return this;
    }

    @Override // X.InterfaceC178897x1
    public final void release() {
        Object obj = this.A07;
        if (obj != null) {
            synchronized (obj) {
                A05();
            }
        } else {
            A05();
        }
    }

    public C178927x4(Object obj, int i) {
        this.A07 = obj;
        this.A06 = i;
    }

    public static EGLSurface A02(EGLConfig eGLConfig, Surface surface, C178927x4 c178927x4) {
        int[] A08 = A08(c178927x4);
        if (surface.isValid()) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(c178927x4.A04, eGLConfig, surface, A08, 0);
            AbstractC180237zD.A01("eglCreateWindowSurface");
            eglCreateWindowSurface.getClass();
            return eglCreateWindowSurface;
        }
        throw new C80D(-1, "Surface is invalid while createWindowSurface");
    }

    public final void A0A(InterfaceC178897x1 interfaceC178897x1, int i) {
        this.A05 = interfaceC178897x1.C6u();
        A09(interfaceC178897x1.B08(), i);
        C178937x5 c178937x5 = this.A05;
        if (c178937x5 != null) {
            c178937x5.A00.add(Integer.valueOf(hashCode()));
        } else {
            this.A05 = new C178937x5(this);
        }
    }

    @Override // X.InterfaceC178897x1
    public final /* bridge */ /* synthetic */ InterfaceC178897x1 EhZ(InterfaceC178897x1 interfaceC178897x1, int i) {
        A0A(interfaceC178897x1, i);
        return this;
    }
}
