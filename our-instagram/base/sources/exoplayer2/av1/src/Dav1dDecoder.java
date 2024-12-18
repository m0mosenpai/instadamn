package exoplayer2.av1.src;

import X.AbstractC111324zv;
import X.AbstractC117285Sn;
import X.AbstractC96104Tt;
import X.AbstractC98594be;
import X.AnonymousClass001;
import X.C09170dP;
import X.C15R;
import X.C2CZ;
import X.C4YB;
import X.C96094Ts;
import X.C98644bj;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.service.errorcallback.ErrorCallback;
import exoplayer2.av1.src.Dav1dDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class Dav1dDecoder extends AbstractC98594be {
    public static Context sAppContext;
    public static C15R sThreadAffinityBoostBuilder;
    public static ThreadPoolExecutor sThreadPoolExecutor;
    public long dav1dDecContext;
    public int lockCanvasErrorCount;
    public final Dav1dMediaCodecAdapterSetting mDav1dMediaCodecAdapterSetting;
    public boolean mEnableAV1SRShader;
    public volatile int outputMode;
    public volatile int prevSurfaceHash;
    public volatile long totalDecodeTime;
    public volatile int totalSampleCount;

    public Dav1dDecoder(Dav1dMediaCodecAdapterSetting dav1dMediaCodecAdapterSetting) {
        super(new C98644bj[4], new Dav1dOutputBuffer[4]);
        long dav1dInit;
        this.prevSurfaceHash = Integer.MAX_VALUE;
        this.mDav1dMediaCodecAdapterSetting = dav1dMediaCodecAdapterSetting;
        this.mEnableAV1SRShader = dav1dMediaCodecAdapterSetting.enableAV1SRShader;
        ErrorCallback errorCallback = C2CZ.A01.A00;
        if (dav1dMediaCodecAdapterSetting.enableDav1dJniV2) {
            dav1dInit = dav1dInit2(dav1dMediaCodecAdapterSetting, dav1dMediaCodecAdapterSetting.vpsEventCallback);
        } else {
            int i = dav1dMediaCodecAdapterSetting.nThreads;
            int i2 = dav1dMediaCodecAdapterSetting.maxFrameDelay;
            boolean z = dav1dMediaCodecAdapterSetting.applyGrain;
            dav1dInit = dav1dInit(i, i2, z ? 1 : 0, dav1dMediaCodecAdapterSetting.enableOpenGLRendering, dav1dMediaCodecAdapterSetting.enableMmeLogging, dav1dMediaCodecAdapterSetting.scalingMode.getValue(), dav1dMediaCodecAdapterSetting.alignLeft, dav1dMediaCodecAdapterSetting.enableDav1dOpenGLRenderingHandleAspectRatio, dav1dMediaCodecAdapterSetting.enableDynamicNDK, dav1dMediaCodecAdapterSetting.vpsEventCallback, errorCallback);
        }
        this.dav1dDecContext = dav1dInit;
        if (dav1dInit != 0) {
            A03(921600);
            if (dav1dMediaCodecAdapterSetting.useThreadAffinity) {
                synchronized (Dav1dDecoder.class) {
                    if (sThreadPoolExecutor == null) {
                        sThreadPoolExecutor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.B1k
                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                C15R c15r = Dav1dDecoder.sThreadAffinityBoostBuilder;
                                Thread thread = new Thread(runnable);
                                thread.setPriority(1);
                                return thread;
                            }
                        });
                    }
                }
                ThreadPoolExecutor threadPoolExecutor = sThreadPoolExecutor;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.execute(new Runnable() { // from class: X.Atd
                        /* JADX WARN: Type inference failed for: r0v31, types: [X.15R, X.15E, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context = Dav1dDecoder.this.mDav1dMediaCodecAdapterSetting.appContext;
                            Context context2 = Dav1dDecoder.sAppContext;
                            if (context2 == null) {
                                Dav1dDecoder.sAppContext = context;
                                context2 = context;
                            }
                            if (Dav1dDecoder.sThreadAffinityBoostBuilder == null) {
                                ?? obj = new Object();
                                Dav1dDecoder.sThreadAffinityBoostBuilder = obj;
                                obj.A04(context2);
                            }
                            if (Dav1dDecoder.sAppContext != null && Dav1dDecoder.sThreadAffinityBoostBuilder != null) {
                                ArrayList A1E = AbstractC166987dD.A1E();
                                HashMap A01 = C55025OXc.A01();
                                if (A01 != null) {
                                    Iterator A14 = AbstractC166997dE.A14(A01);
                                    while (A14.hasNext()) {
                                        Map.Entry A1K = AbstractC166987dD.A1K(A14);
                                        if (((String) A1K.getValue()).contains("dav1d-worker")) {
                                            try {
                                                AbstractC166997dE.A1W(A1E, Integer.parseInt((String) A1K.getKey()));
                                            } catch (NumberFormatException e) {
                                                android.util.Log.w("Dav1dDecoderJava", String.format("Failed to parse thread id due to exception %s", e.getMessage()));
                                            }
                                        }
                                    }
                                }
                                Iterator it = A1E.iterator();
                                while (it.hasNext()) {
                                    Integer num = (Integer) it.next();
                                    C15P c15p = new C15P();
                                    c15p.A00 = 90000;
                                    String obj2 = num.toString();
                                    Map map = c15p.A04;
                                    if (map == null) {
                                        map = AbstractC166987dD.A1G();
                                        c15p.A04 = map;
                                    }
                                    map.put("threadId", obj2);
                                    try {
                                        if (Dav1dDecoder.sThreadAffinityBoostBuilder.A01(c15p, 0).EJ2(null, 0) != 1) {
                                            android.util.Log.w("Dav1dDecoderJava", String.format("Attempt boost the thread affinity for tid %d did not result in success", num));
                                        }
                                    } catch (Exception e2) {
                                        android.util.Log.w("Dav1dDecoderJava", String.format("Could not boost the thread affinity for tid %d due to exception e", num, e2.getMessage()));
                                    }
                                }
                            }
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        throw new Exception(AnonymousClass001.A0R("Dav1dDecoderException: ", "Failed to initialize Dav1d decoder"));
    }

    private native long dav1dClose(long j);

    private native long dav1dClose2(long j);

    private native long dav1dDecode(long j, ByteBuffer byteBuffer, int i, int i2, VpsEventCallback vpsEventCallback);

    private native long dav1dDecode2(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long dav1dFlush(long j);

    private native long dav1dFlush2(long j);

    private native int dav1dGetOutputHeight(long j);

    private native int dav1dGetOutputHeight2(long j);

    private native int dav1dGetOutputWidth(long j);

    private native int dav1dGetOutputWidth2(long j);

    private native int dav1dGetPicture(long j, Dav1dOutputBuffer dav1dOutputBuffer, boolean z, VpsEventCallback vpsEventCallback);

    private native int dav1dGetPicture2(long j, Dav1dOutputBuffer dav1dOutputBuffer, boolean z);

    private native int dav1dGetStatusCode(long j);

    private native int dav1dGetStatusCode2(long j);

    private native long dav1dInit(int i, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, boolean z4, boolean z5, VpsEventCallback vpsEventCallback, ErrorCallback errorCallback);

    private native long dav1dInit2(Dav1dMediaCodecAdapterSetting dav1dMediaCodecAdapterSetting, VpsEventCallback vpsEventCallback);

    private native long dav1dReleaseBuffer(long j, Dav1dOutputBuffer dav1dOutputBuffer);

    private native long dav1dReleaseBuffer2(long j, Dav1dOutputBuffer dav1dOutputBuffer);

    private native String dav1dVersion();

    private native String dav1dVersion2();

    private native long dav1dYuvSurfaceRender(long j, Dav1dOutputBuffer dav1dOutputBuffer, Surface surface, boolean z, boolean z2, int i, boolean z3, VpsEventCallback vpsEventCallback);

    private native long dav1dYuvSurfaceRender2(long j, Dav1dOutputBuffer dav1dOutputBuffer, Surface surface);

    @Override // X.AbstractC98594be
    public /* bridge */ /* synthetic */ C96094Ts createInputBuffer() {
        return new C96094Ts(2);
    }

    public void renderYuvFrameToSurface(Dav1dOutputBuffer dav1dOutputBuffer, Surface surface) {
        int hashCode;
        long dav1dYuvSurfaceRender;
        int dav1dGetStatusCode;
        if (surface == null) {
            hashCode = 0;
        } else {
            hashCode = surface.hashCode();
        }
        boolean z = false;
        if (this.prevSurfaceHash != hashCode) {
            z = true;
        }
        this.prevSurfaceHash = hashCode;
        Dav1dMediaCodecAdapterSetting dav1dMediaCodecAdapterSetting = this.mDav1dMediaCodecAdapterSetting;
        if (dav1dMediaCodecAdapterSetting.enableDav1dJniV2) {
            dav1dYuvSurfaceRender = dav1dYuvSurfaceRender2(this.dav1dDecContext, dav1dOutputBuffer, surface);
        } else {
            dav1dYuvSurfaceRender = dav1dYuvSurfaceRender(this.dav1dDecContext, dav1dOutputBuffer, surface, z, this.mEnableAV1SRShader, dav1dMediaCodecAdapterSetting.maxWidthForAV1SRShader, dav1dMediaCodecAdapterSetting.enableDav1dOpenGLRenderingHandleAspectRatio, dav1dMediaCodecAdapterSetting.vpsEventCallback);
        }
        if (dav1dYuvSurfaceRender != 0) {
            boolean z2 = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
            long j = this.dav1dDecContext;
            if (z2) {
                dav1dGetStatusCode = dav1dGetStatusCode2(j);
            } else {
                dav1dGetStatusCode = dav1dGetStatusCode(j);
            }
            String.format("Render YUV Result %d, Status Code %d", Long.valueOf(dav1dYuvSurfaceRender), Integer.valueOf(dav1dGetStatusCode));
            if (dav1dGetStatusCode == 5) {
                this.lockCanvasErrorCount++;
                Log.w("Dav1dDecoderJava", "Failed to lock canvas");
                if (this.lockCanvasErrorCount <= this.mDav1dMediaCodecAdapterSetting.maxNumRetryLockingCanvas) {
                    return;
                }
            } else {
                this.lockCanvasErrorCount = 0;
                if (dav1dGetStatusCode == 0) {
                    return;
                }
            }
            this.lockCanvasErrorCount = 0;
            throw new Exception(AnonymousClass001.A0R("Dav1dDecoderException: ", AnonymousClass001.A0O("Get Frame Result error: ", dav1dGetStatusCode)));
        }
    }

    static {
        C09170dP.A0C("Dav1dExo");
    }

    @Override // X.AbstractC98594be
    public /* bridge */ /* synthetic */ AbstractC117285Sn createOutputBuffer() {
        return new Dav1dOutputBuffer(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.4YB, java.lang.Exception] */
    @Override // X.AbstractC98594be
    public /* bridge */ /* synthetic */ C4YB createUnexpectedDecodeException(Throwable th) {
        return new Exception(AnonymousClass001.A0R("Dav1dDecoderException: ", AbstractC111324zv.A00(3800)), th);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [X.4YB, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.4YB, java.lang.Exception] */
    @Override // X.AbstractC98594be
    public /* bridge */ /* synthetic */ C4YB decode(C96094Ts c96094Ts, AbstractC117285Sn abstractC117285Sn, boolean z) {
        long dav1dDecode;
        int dav1dGetPicture;
        int dav1dGetStatusCode;
        int dav1dGetStatusCode2;
        C98644bj c98644bj = (C98644bj) c96094Ts;
        Dav1dOutputBuffer dav1dOutputBuffer = (Dav1dOutputBuffer) abstractC117285Sn;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ByteBuffer byteBuffer = c98644bj.A02;
        int limit = byteBuffer.limit();
        boolean z2 = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
        long j = this.dav1dDecContext;
        int i = this.outputMode;
        if (z2) {
            dav1dDecode = dav1dDecode2(j, byteBuffer, limit, i);
        } else {
            dav1dDecode = dav1dDecode(j, byteBuffer, limit, i, this.mDav1dMediaCodecAdapterSetting.vpsEventCallback);
        }
        if (dav1dDecode != 0 && dav1dDecode != 1) {
            boolean z3 = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
            long j2 = this.dav1dDecContext;
            if (z3) {
                dav1dGetStatusCode2 = dav1dGetStatusCode2(j2);
            } else {
                dav1dGetStatusCode2 = dav1dGetStatusCode(j2);
            }
            if (dav1dGetStatusCode2 != 0) {
                return new Exception(AnonymousClass001.A0R("Dav1dDecoderException: ", AnonymousClass001.A0O("Decode error: ", dav1dGetStatusCode2)));
            }
        }
        long j3 = c98644bj.A01;
        int i2 = this.outputMode;
        ((AbstractC117285Sn) dav1dOutputBuffer).A00 = j3;
        dav1dOutputBuffer.mode = i2;
        dav1dOutputBuffer.bufferId = -1;
        dav1dOutputBuffer.colorInfo = c98644bj.A00;
        if ((((AbstractC96104Tt) c98644bj).A00 & 4) == 4) {
            ((AbstractC96104Tt) dav1dOutputBuffer).A00 = 4;
        }
        Dav1dMediaCodecAdapterSetting dav1dMediaCodecAdapterSetting = this.mDav1dMediaCodecAdapterSetting;
        boolean z4 = dav1dMediaCodecAdapterSetting.enableDav1dJniV2;
        long j4 = this.dav1dDecContext;
        if (z4) {
            boolean z5 = false;
            if ((((AbstractC96104Tt) c98644bj).A00 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                z5 = true;
            }
            dav1dGetPicture = dav1dGetPicture2(j4, dav1dOutputBuffer, z5);
        } else {
            boolean z6 = false;
            if ((((AbstractC96104Tt) c98644bj).A00 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                z6 = true;
            }
            dav1dGetPicture = dav1dGetPicture(j4, dav1dOutputBuffer, z6, dav1dMediaCodecAdapterSetting.vpsEventCallback);
        }
        if ((((AbstractC96104Tt) c98644bj).A00 & Integer.MIN_VALUE) == Integer.MIN_VALUE || dav1dGetPicture != 0) {
            ((AbstractC96104Tt) dav1dOutputBuffer).A00 = Integer.MIN_VALUE | ((AbstractC96104Tt) dav1dOutputBuffer).A00;
            if (dav1dGetPicture != 0 && dav1dGetPicture != 1) {
                boolean z7 = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
                long j5 = this.dav1dDecContext;
                if (z7) {
                    dav1dGetStatusCode = dav1dGetStatusCode2(j5);
                } else {
                    dav1dGetStatusCode = dav1dGetStatusCode(j5);
                }
                if (dav1dGetStatusCode != 0) {
                    Log.w("Dav1dDecoderJava", String.format("AV1 Error: %d", Integer.valueOf(dav1dGetStatusCode)));
                    boolean z8 = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
                    long j6 = this.dav1dDecContext;
                    if (z8) {
                        dav1dFlush2(j6);
                    } else {
                        dav1dFlush(j6);
                    }
                    if (this.mDav1dMediaCodecAdapterSetting.dav1dThrowExceptionOnPictureError) {
                        return new Exception(AnonymousClass001.A0R("Dav1dDecoderException: ", AnonymousClass001.A0O("Get Frame Result error: ", dav1dGetStatusCode)));
                    }
                }
            }
        }
        synchronized (this) {
            this.totalDecodeTime += SystemClock.elapsedRealtime() - elapsedRealtime;
            this.totalSampleCount++;
        }
        return null;
    }

    public void releaseOutputBufferInternalDav1d(Dav1dOutputBuffer dav1dOutputBuffer) {
        if (dav1dOutputBuffer.mode == 0 && dav1dOutputBuffer.bufferId != -1) {
            boolean z = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
            long j = this.dav1dDecContext;
            if (z) {
                dav1dReleaseBuffer2(j, dav1dOutputBuffer);
            } else {
                dav1dReleaseBuffer(j, dav1dOutputBuffer);
            }
        }
        dav1dOutputBuffer.mode = -1;
        dav1dOutputBuffer.bufferId = -1;
        dav1dOutputBuffer.height = 0;
        dav1dOutputBuffer.width = 0;
    }

    @Override // X.AbstractC98594be, X.InterfaceC98604bf
    public void release() {
        super.release();
        boolean z = this.mDav1dMediaCodecAdapterSetting.enableDav1dJniV2;
        long j = this.dav1dDecContext;
        if (z) {
            dav1dClose2(j);
            this.dav1dDecContext = 0L;
        } else {
            dav1dClose(j);
        }
    }
}
