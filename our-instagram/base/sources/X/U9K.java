package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Choreographer;
import com.facebook.gltf.jni.GLTFCameraOrientation;
import com.facebook.gltf.jni.GltfRenderSession;
import com.facebook.spherical.util.Quaternion;

/* loaded from: classes11.dex */
public abstract class U9K extends HandlerThread implements InterfaceC71867X8a {
    public int A00;
    public int A01;
    public Handler A02;
    public C180367zQ A03;
    public Quaternion A04;
    public W4Y A05;
    public int A06;
    public Throwable A07;
    public final int A08;
    public final SurfaceTexture A09;
    public final Choreographer.FrameCallback A0A;
    public final Choreographer A0B;
    public final C149366nm A0C;
    public final InterfaceC149306ng A0D;
    public final WIR A0E;
    public final boolean A0F;
    public volatile boolean A0G;
    public volatile boolean A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9K(Context context, SurfaceTexture surfaceTexture, W4Y w4y, C149366nm c149366nm, InterfaceC149306ng interfaceC149306ng, int i, int i2) {
        super("IgGlMediaRenderThread");
        C14360o3.A0B(c149366nm, 4);
        this.A09 = surfaceTexture;
        this.A0C = c149366nm;
        this.A0D = interfaceC149306ng;
        this.A0F = true;
        this.A08 = 20;
        this.A0E = new WIR(context, this);
        this.A0A = new WKn(this);
        Choreographer choreographer = Choreographer.getInstance();
        C14360o3.A07(choreographer);
        this.A0B = choreographer;
        this.A04 = new Quaternion();
        this.A05 = w4y;
        this.A0H = true;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Thread
    public final synchronized void start() {
        super.start();
        HandlerC65967TxK handlerC65967TxK = new HandlerC65967TxK(getLooper(), this, 11);
        this.A02 = handlerC65967TxK;
        handlerC65967TxK.sendEmptyMessage(0);
    }

    public final void A01() {
        if (this.A0H) {
            this.A0B.postFrameCallbackDelayed(this.A0A, 15L);
            this.A0H = false;
            if (this.A0C.A02) {
                A02();
            }
        }
    }

    public final void A02() {
        Handler handler;
        this.A0C.A03 = false;
        WIR wir = this.A0E;
        if (this.A0F) {
            handler = this.A02;
        } else {
            handler = null;
        }
        wir.A00 = 5;
        SensorManager sensorManager = wir.A01;
        if (sensorManager != null) {
            try {
                Sensor defaultSensor = sensorManager.getDefaultSensor(WIR.A06);
                boolean registerListener = sensorManager.registerListener(wir, defaultSensor, 1, handler);
                if (registerListener) {
                    C0BW.A00.A05(wir, defaultSensor);
                } else {
                    WIR.A06 = 11;
                    Sensor defaultSensor2 = sensorManager.getDefaultSensor(11);
                    registerListener = sensorManager.registerListener(wir, defaultSensor2, 1, handler);
                    if (registerListener) {
                        C0BW.A00.A05(wir, defaultSensor2);
                    }
                }
                if (WIR.A07 == null) {
                    WIR.A07 = Boolean.valueOf(registerListener);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.7zH, X.7zQ] */
    public void A03() {
        try {
            SurfaceTexture surfaceTexture = this.A09;
            int i = this.A08;
            C178927x4 c178927x4 = new C178927x4(null, 2);
            c178927x4.A09(EGL14.EGL_NO_CONTEXT, i);
            ?? abstractC180277zH = new AbstractC180277zH(c178927x4);
            C178927x4 c178927x42 = abstractC180277zH.A01;
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(c178927x42.A04, c178927x42.A02, surfaceTexture, C178927x4.A08(c178927x42), 0);
            AbstractC180237zD.A01("eglCreateWindowSurface");
            eglCreateWindowSurface.getClass();
            abstractC180277zH.A00 = eglCreateWindowSurface;
            this.A03 = abstractC180277zH;
            abstractC180277zH.A05();
            W4Y w4y = this.A05;
            if (w4y.A02 != null) {
                w4y.A01();
            }
            w4y.A02 = new C68865VdL();
            int i2 = this.A06;
            if (i2 != 0) {
                Throwable th = this.A07;
                if (th != null) {
                    this.A0D.EmP(AnonymousClass001.A0O("GlMediaRenderThread-", i2), AnonymousClass001.A0c("Succeeded creating an OutputSurface after ", " retries!", i2), th);
                }
                this.A07 = null;
            }
        } catch (RuntimeException e) {
            if (this.A06 == 0) {
                this.A0D.EmP("IgGlMediaRenderThread", "Failed to create OutputSurface", e);
            }
            this.A07 = e;
            C180367zQ c180367zQ = this.A03;
            if (c180367zQ != null) {
                c180367zQ.A02();
                this.A03 = null;
            }
            int i3 = this.A06 + 1;
            this.A06 = i3;
            if (i3 > 2) {
                this.A0D.EmP(AnonymousClass001.A0O("GlMediaRenderThread-", i3), AnonymousClass001.A0c("Failed to create OutputSurface after ", " retries! Aborting!", i3), e);
                this.A07 = null;
                return;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            Handler handler = this.A02;
            if (handler == null) {
                return;
            }
            handler.sendEmptyMessage(0);
        }
    }

    public void A04() {
        C180367zQ c180367zQ = this.A03;
        if (c180367zQ != null) {
            W4Y w4y = this.A05;
            C68865VdL c68865VdL = w4y.A02;
            if (c68865VdL != null && w4y.A04) {
                GLTFCameraOrientation gLTFCameraOrientation = w4y.A05.A07;
                ((GltfRenderSession) c68865VdL.A00.getValue()).setCameraPosition((float) gLTFCameraOrientation.cx, (float) gLTFCameraOrientation.cy, (float) gLTFCameraOrientation.cz, (float) gLTFCameraOrientation.tx, (float) gLTFCameraOrientation.ty, (float) gLTFCameraOrientation.tz);
                float f = (float) gLTFCameraOrientation.fov;
                InterfaceC09390do interfaceC09390do = c68865VdL.A00;
                ((GltfRenderSession) interfaceC09390do.getValue()).updateFieldOfView(f);
                ((GltfRenderSession) interfaceC09390do.getValue()).setClippingPlanes((float) gLTFCameraOrientation.near, (float) gLTFCameraOrientation.far);
                ((GltfRenderSession) interfaceC09390do.getValue()).render(w4y.A01, w4y.A00);
            }
            c180367zQ.A03();
        }
    }
}
