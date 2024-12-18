package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;

/* renamed from: X.Vnm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69463Vnm {
    public int A00;
    public SurfaceTexture A02;
    public HandlerThread A03;
    public Surface A04;
    public C68695VaV A05;
    public WDI A06;
    public C69331Vld A07;
    public C69408Vms A08;
    public C68238VJa A09;
    public C66048Tyl A0A;
    public final C179877yd A0E;
    public final float[] A0D = new float[16];
    public long A01 = 0;
    public final List A0C = new ArrayList();
    public List A0B = new ArrayList();

    /* JADX WARN: Type inference failed for: r3v0, types: [X.VJa, java.lang.Object] */
    public C69463Vnm(Surface surface, C179877yd c179877yd, WDI wdi) {
        this.A0E = c179877yd;
        this.A06 = wdi;
        this.A05 = wdi.A0F;
        ?? obj = new Object();
        obj.A02 = EGL14.EGL_NO_DISPLAY;
        obj.A01 = EGL14.EGL_NO_CONTEXT;
        obj.A03 = EGL14.EGL_NO_SURFACE;
        obj.A00 = null;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        obj.A02 = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(obj.A02, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    obj.A01 = EGL14.eglCreateContext(obj.A02, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                    AbstractC180237zD.A01("eglCreateContext");
                    if (obj.A01 != null) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        obj.A00 = eGLConfig;
                        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(obj.A02, eGLConfig, surface, new int[]{12344}, 0);
                        AbstractC180237zD.A01("eglCreateWindowSurface");
                        if (eglCreateWindowSurface != null) {
                            obj.A03 = eglCreateWindowSurface;
                            this.A09 = obj;
                            if (EGL14.eglMakeCurrent(obj.A02, eglCreateWindowSurface, eglCreateWindowSurface, obj.A01)) {
                                int[] iArr2 = new int[1];
                                GLES20.glGenTextures(1, iArr2, 0);
                                AbstractC180237zD.A02("glGenTextures", new Object[0]);
                                int i = iArr2[0];
                                GLES20.glBindTexture(36197, i);
                                AbstractC180237zD.A02(AnonymousClass001.A0O("glBindTexture ", i), new Object[0]);
                                AbstractC65702TsY.A0r();
                                AbstractC180237zD.A02("glTexParameter", new Object[0]);
                                this.A00 = i;
                                SurfaceTexture surfaceTexture = new SurfaceTexture(i);
                                this.A02 = surfaceTexture;
                                this.A0A = new C66048Tyl(surfaceTexture);
                                HandlerThread handlerThread = new HandlerThread("videotranscoder-framecallback-boomerang", -19);
                                AbstractC09770fa.A00(handlerThread);
                                this.A03 = handlerThread;
                                handlerThread.start();
                                SurfaceTexture surfaceTexture2 = this.A02;
                                C66048Tyl c66048Tyl = this.A0A;
                                HandlerThread handlerThread2 = this.A03;
                                handlerThread2.getClass();
                                AbstractC65702TsY.A0y(c66048Tyl, surfaceTexture2, handlerThread2);
                                this.A04 = new Surface(this.A02);
                                this.A07 = new C69331Vld(c179877yd);
                                this.A08 = new C69408Vms(c179877yd, wdi);
                                return;
                            }
                            throw new RuntimeException("eglMakeCurrent failed");
                        }
                        throw new RuntimeException("surface was null");
                    }
                    throw new RuntimeException("null context");
                }
                throw new RuntimeException(AbstractC111324zv.A00(138));
            }
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }
}
