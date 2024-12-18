package com.instagram.service.tigon;

import X.AbstractC12990ll;
import X.AbstractC20100yh;
import X.C09170dP;
import X.C14250np;
import X.C1G0;
import X.C1G1;
import X.C20150ym;
import X.C24041Fy;
import X.C42511xf;
import com.facebook.jni.HybridData;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.tigon.TigonXplatService;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.tigon.observers.TigonXplatObserversHolder;
import com.instagram.service.tigon.IGTigonService;
import com.instagram.service.tigon.interceptors.IGTigonXplatInterceptorsHolder;
import com.instagram.transientanalysis.InstagramTransientNetworkDataCollector;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class IGTigonService extends TigonXplatService {
    public static final ReadWriteLock PREFETCH_MAP_LOCK;
    public static IGTigonService sTigonService;
    public C42511xf mPrefetchItemMap;
    public TigonServiceHolder mTigonServiceHolder;

    public static native HybridData initHybrid(TigonServiceHolder tigonServiceHolder, IGTigonConfig iGTigonConfig, ScheduledExecutorService scheduledExecutorService, String str, InstagramTransientNetworkDataCollector instagramTransientNetworkDataCollector, IGTigonXplatInterceptorsHolder iGTigonXplatInterceptorsHolder, TigonXplatObserversHolder tigonXplatObserversHolder);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBackgroundStateChanged, reason: merged with bridge method [inline-methods] */
    public native void m101lambda$new$0$cominstagramservicetigonIGTigonService(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void pauseRtcQueue();

    /* JADX INFO: Access modifiers changed from: private */
    public native void resumeRtcQueue();

    public IGTigonService(TigonServiceHolder tigonServiceHolder, AbstractC12990ll abstractC12990ll, IGTigonXplatInterceptorsHolder iGTigonXplatInterceptorsHolder, TigonXplatObserversHolder tigonXplatObserversHolder) {
        super(initHybrid(tigonServiceHolder, new IGTigonConfig(), C14250np.A00().A00, "567067343352427", (InstagramTransientNetworkDataCollector) InstagramTransientNetworkDataCollector.instance$delegate.getValue(), iGTigonXplatInterceptorsHolder, tigonXplatObserversHolder));
        C09170dP.A0C("tigonjni");
        this.mTigonServiceHolder = tigonServiceHolder;
        C24041Fy c24041Fy = new C24041Fy(this);
        if (BackgroundStartupDetector.A07 == null) {
            BackgroundStartupDetector.A07 = c24041Fy;
            Boolean bool = true;
            c24041Fy.A00.m101lambda$new$0$cominstagramservicetigonIGTigonService(bool.equals(BackgroundStartupDetector.A0G));
            if (C20150ym.A07(AbstractC20100yh.A00(36325205597893505L))) {
                C1G0 c1g0 = new C1G0() { // from class: X.1Fz
                    @Override // X.C1G0
                    public final void EKd() {
                        IGTigonService.this.resumeRtcQueue();
                    }

                    @Override // X.C1G0
                    public final void pause() {
                        IGTigonService.this.pauseRtcQueue();
                    }
                };
                synchronized (C1G1.class) {
                    synchronized (C1G1.A01) {
                        C1G1.A00 = c1g0;
                    }
                }
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Only one listener is supported at this time.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (X.C19870yH.A01() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x030b A[Catch: all -> 0x0642, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0017, B:9:0x001c, B:11:0x002b, B:26:0x0066, B:28:0x0088, B:29:0x008c, B:31:0x028f, B:34:0x02ad, B:36:0x030b, B:37:0x031b, B:40:0x0342, B:44:0x058e, B:47:0x0628, B:48:0x062d, B:49:0x063b, B:52:0x02a0, B:53:0x05e1, B:56:0x063f, B:13:0x0034, B:15:0x0042, B:17:0x004a, B:19:0x0059), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x05e0  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r13v1, types: [javax.net.ssl.SSLSocketFactory, X.1FM] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.1EI, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.instagram.service.tigon.IGTigonService getTigonService(X.AbstractC12990ll r20) {
        /*
            Method dump skipped, instructions count: 1605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.tigon.IGTigonService.getTigonService(X.0ll):com.instagram.service.tigon.IGTigonService");
    }

    public void setPrefetchItemMap(C42511xf c42511xf) {
        ReadWriteLock readWriteLock = PREFETCH_MAP_LOCK;
        readWriteLock.writeLock().lock();
        try {
            this.mPrefetchItemMap = c42511xf;
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    static {
        C09170dP.A0C("igtigon-jni");
        PREFETCH_MAP_LOCK = new ReentrantReadWriteLock();
    }
}
