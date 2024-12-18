package X;

import android.app.Service;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.IBinder;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.meta.arfx.engine.common.AREngineService$binder$1;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.8vN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractServiceC201348vN extends Service {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AssetManager A04;
    public SurfaceTexture A05;
    public Surface A09;
    public Surface A0A;
    public InterfaceC201328vH A0B;
    public AREngineController A0C;
    public C23336AWf A0D;
    public C23341AWl A0E;
    public C63967Swt A0F;
    public VersionedSharedMemory A0G;
    public AnonymousClass810 A0H;
    public ABC A0I;
    public IAREngineServiceCallback A0J;
    public Integer A0K;
    public ByteBuffer A0L;
    public boolean A0M;
    public final AndroidAsyncExecutorFactory A0O;
    public final AndroidAsyncExecutorFactory A0P;
    public final LinkedList A0Q;
    public final LinkedList A0R;
    public final BlockingQueue A0S;
    public final ExecutorService A0T;
    public final ExecutorService A0U;
    public final AREngineService$binder$1 A0Y;
    public final ScheduledExecutorService A0Z;
    public volatile EffectServiceHost A0a;
    public final SurfaceTexture.OnFrameAvailableListener A0N = new APC(this);
    public EGLDisplay A07 = EGL14.EGL_NO_DISPLAY;
    public EGLContext A06 = EGL14.EGL_NO_CONTEXT;
    public EGLSurface A08 = EGL14.EGL_NO_SURFACE;
    public final float[] A0W = new float[16];
    public final float[] A0X = new float[16];
    public final float[] A0V = new float[16];

    public static final void A00(AbstractServiceC201348vN abstractServiceC201348vN) {
        EGLDisplay eGLDisplay = abstractServiceC201348vN.A07;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(abstractServiceC201348vN.A07, abstractServiceC201348vN.A08);
        EGL14.eglDestroyContext(abstractServiceC201348vN.A07, abstractServiceC201348vN.A06);
        Surface surface = abstractServiceC201348vN.A0A;
        if (surface != null) {
            surface.release();
        }
        abstractServiceC201348vN.A0A = null;
        Surface surface2 = abstractServiceC201348vN.A09;
        if (surface2 != null) {
            surface2.release();
        }
        abstractServiceC201348vN.A09 = null;
        SurfaceTexture surfaceTexture = abstractServiceC201348vN.A05;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        abstractServiceC201348vN.A05 = null;
        AnonymousClass810 anonymousClass810 = abstractServiceC201348vN.A0H;
        if (anonymousClass810 != null) {
            anonymousClass810.A01();
        }
        abstractServiceC201348vN.A0H = null;
        abstractServiceC201348vN.A01 = 0;
        abstractServiceC201348vN.A00 = 0;
        abstractServiceC201348vN.A07 = EGL14.EGL_NO_DISPLAY;
        abstractServiceC201348vN.A06 = EGL14.EGL_NO_CONTEXT;
        abstractServiceC201348vN.A08 = EGL14.EGL_NO_SURFACE;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.A0U.execute(new RunnableC24518Atb(this));
        return true;
    }

    public AbstractServiceC201348vN() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C14360o3.A07(newSingleThreadExecutor);
        this.A0U = newSingleThreadExecutor;
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        C14360o3.A07(newSingleThreadExecutor2);
        this.A0T = newSingleThreadExecutor2;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
        C14360o3.A07(newScheduledThreadPool);
        this.A0Z = newScheduledThreadPool;
        this.A0Q = new LinkedList();
        this.A0R = new LinkedList();
        this.A0K = C05F.A00;
        this.A0S = new LinkedBlockingQueue();
        this.A0Y = new AREngineService$binder$1(this);
        C0K8.A00(2);
        this.A0O = new AndroidAsyncExecutorFactory(newScheduledThreadPool);
        this.A0P = new AndroidAsyncExecutorFactory(newScheduledThreadPool);
        newSingleThreadExecutor.execute(B0C.A00);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.A0Y;
    }

    @Override // android.app.Service
    public void onCreate() {
        int A04 = C0f9.A04(-1706485714);
        AssetManager assets = getResources().getAssets();
        C14360o3.A07(assets);
        this.A04 = assets;
        C0f9.A0B(1662005804, A04);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C0f9.A0B(-948934655, C0f9.A04(1107409225));
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(-488905658);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        C14360o3.A0B(intent, 0);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        C0f9.A0B(-233204559, A04);
        return onStartCommand;
    }
}
