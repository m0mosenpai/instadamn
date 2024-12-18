package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import com.facebook.fixie.fixes.MediaCodecFixes.hooks.MediaCodecHooks$NativeImpl;
import com.facebook.forker.Process;
import com.facebook.http.historical.NetworkInfoMap;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.service.live.HeroDashLiveManagerImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.29d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C459529d implements InterfaceC220315d {
    public static C459529d A0e;
    public Handler A00;
    public Handler A01;
    public HandlerThread A02;
    public HandlerThread A03;
    public HandlerThread A04;
    public C2A5 A05;
    public C2BZ A06;
    public C2BX A07;
    public C2C8 A08;
    public C2A4 A09;
    public HeroDashLiveManagerImpl A0A;
    public C46442Bh A0B;
    public boolean A0C;
    public Handler A0D;
    public final Context A0E;
    public final InterfaceC460229m A0F;
    public final ServiceEventCallbackImpl A0G;
    public final HeroPlayerSetting A0H;
    public final InterfaceC460429o A0I;
    public final C46602By A0J;
    public final Object A0K = new Object();
    public final Map A0L;
    public final Executor A0M;
    public final ScheduledExecutorService A0N;
    public final AtomicBoolean A0O;
    public final AtomicBoolean A0P;
    public final AtomicBoolean A0Q;
    public final AtomicBoolean A0R;
    public final AtomicReference A0S;
    public final AtomicReference A0T;
    public final AtomicReference A0U;
    public final AtomicReference A0V;
    public final AtomicReference A0W;
    public final AtomicReference A0X;
    public final InterfaceC461129v A0Y;
    public final C459929j A0Z;
    public final AtomicBoolean A0a;
    public volatile C46282Ap A0b;
    public volatile C2BV A0c;
    public volatile InterfaceC459429c A0d;

    public static void A03(final C4AP c4ap, C459529d c459529d) {
        boolean isEmpty;
        C461429y c461429y;
        C2A4 c2a4;
        C4AN c4an = c4ap.A0D;
        C2QC.A03("Prefetch %s\n\tBytes: %d", c4an, Integer.valueOf(c4ap.A02));
        int ordinal = c4an.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal == 1) {
                    long j = c459529d.A0H.A0J;
                    long j2 = c4an.A02;
                    if (j2 > 0) {
                        j = Math.max(j2, j);
                    }
                    int i = (int) j;
                    C2QC.A03("dashLiveEdgeLatencyMs %d", Integer.valueOf(i));
                    HeroDashLiveManagerImpl heroDashLiveManagerImpl = c459529d.A0A;
                    if (heroDashLiveManagerImpl != null) {
                        Handler A00 = A00(c459529d);
                        C46442Bh c46442Bh = c459529d.A0B;
                        ServiceEventCallbackImpl serviceEventCallbackImpl = heroDashLiveManagerImpl.A01;
                        C46302As c46302As = heroDashLiveManagerImpl.A00;
                        C46462Bj c46462Bj = c46442Bh.A03;
                        Map map = c46442Bh.A0F;
                        HeroPlayerSetting heroPlayerSetting = c46442Bh.A0A;
                        C46462Bj.A00(new C92024Ai(new C121985fq(A00, c46442Bh.A04, serviceEventCallbackImpl, c46302As, c4ap, heroPlayerSetting, map, i), 1), c46462Bj, heroPlayerSetting.A2v);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Illegal video type");
            }
            C46442Bh c46442Bh2 = c459529d.A0B;
            c46442Bh2.A0A(null, c46442Bh2.A07(c4ap.A0F), c459529d.A0G, null, c4ap, null, null, c4an.A0G, null, null, 0L, false, false, false, false);
            return;
        }
        final C46442Bh c46442Bh3 = c459529d.A0B;
        final ServiceEventCallbackImpl serviceEventCallbackImpl2 = c459529d.A0G;
        List list = c46442Bh3.A0D;
        if (!list.contains("<ALL>") && ((isEmpty = "".isEmpty()) || !list.contains(""))) {
            List list2 = c46442Bh3.A0C;
            if (list2.isEmpty() || isEmpty || (c461429y = c46442Bh3.A09) == null || C461429y.A00(c461429y, 14) != 1 || (((c2a4 = c46442Bh3.A06) != null && c2a4.A01()) || !list2.contains(""))) {
                C4AX.A01.A00(c4an);
                if (c46442Bh3.A0A.A0w.A0R) {
                    Runnable runnable = new Runnable() { // from class: X.4AY
                        @Override // java.lang.Runnable
                        public final void run() {
                            C46442Bh c46442Bh4 = c46442Bh3;
                            C46442Bh.A04(serviceEventCallbackImpl2, c4ap, c46442Bh4);
                        }
                    };
                    String str = c4an.A0G;
                    Integer num = c4ap.A0F;
                    C46442Bh.A05(c46442Bh3, new C91944Aa(c46442Bh3.A07(num), c4ap, runnable, str), num);
                    return;
                }
                C46442Bh.A04(serviceEventCallbackImpl2, c4ap, c46442Bh3);
                return;
            }
        }
        String str2 = c4an.A0G;
        String A15 = AnonymousClass001.A15("Video Id ", str2, " with tag ", "", " from suborigin ", c4an.A0B, " is blocked for prefetch");
        AbstractC459729h.A02("UnifiedPrefetchManager", A15, new Object[0]);
        serviceEventCallbackImpl2.callback(new C97144Xz(str2, "PREFETCH_MANAGER", "PREFETCH_TAG_BLOCKED", A15));
    }

    public final boolean A0B(long j, long j2, long j3, boolean z) {
        long j4;
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(j2);
        C2QC.A03("id [%d]: seekTo %d", valueOf, valueOf2);
        C95794Sn A00 = this.A0c.A00(j);
        if (A00 == null) {
            return false;
        }
        C95794Sn.A0E(A00, "Seek to %d", valueOf2);
        Handler handler = A00.A0G;
        long[] jArr = new long[3];
        jArr[0] = j2;
        jArr[1] = j3;
        if (z) {
            j4 = 1;
        } else {
            j4 = 0;
        }
        jArr[2] = j4;
        C95794Sn.A07(handler.obtainMessage(4, jArr), A00);
        return true;
    }

    public final boolean A0C(ResultReceiver resultReceiver, long j) {
        C2QC.A03("id [%d]: releaseSurface", Long.valueOf(j));
        C95794Sn A00 = this.A0c.A00(j);
        if (A00 == null) {
            return false;
        }
        C95794Sn.A0E(A00, "Release surface", new Object[0]);
        C95794Sn.A07(A00.A0G.obtainMessage(7, resultReceiver), A00);
        return true;
    }

    public final void finalize() {
        C2QC.A03("HeroService destroy", new Object[0]);
        A00(this).post(new RunnableC24288Apt(this));
    }

    public static Handler A00(C459529d c459529d) {
        int i;
        HandlerThread handlerThread;
        if (c459529d.A0D == null) {
            synchronized (c459529d.A0K) {
                if (c459529d.A0D == null) {
                    if (c459529d.A03 == null) {
                        HandlerThread handlerThread2 = new HandlerThread("HeroManagerBackgroundHandlerThread", 10);
                        AbstractC09770fa.A00(handlerThread2);
                        c459529d.A03 = handlerThread2;
                        handlerThread2.start();
                    }
                    c459529d.A0D = new Handler(c459529d.A03.getLooper());
                }
            }
        }
        if (c459529d.A0H != null && !TextUtils.isEmpty(null)) {
            i = C46642Cc.A0D.A02(EnumC46732Cl.A03, C46642Cc.A04, false);
        } else {
            i = Process.WAIT_RESULT_STOPPED;
        }
        if (i <= 19 && i >= -20 && (handlerThread = c459529d.A03) != null) {
            int threadId = handlerThread.getThreadId();
            if (i != android.os.Process.getThreadPriority(threadId)) {
                android.os.Process.setThreadPriority(threadId, i);
            }
        }
        return c459529d.A0D;
    }

    public static C459529d A01(Context context, HeroPlayerSetting heroPlayerSetting, InterfaceC459429c interfaceC459429c, Map map, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        C459529d c459529d;
        C459529d c459529d2 = A0e;
        if (c459529d2 == null) {
            synchronized (C459529d.class) {
                c459529d = A0e;
                if (c459529d == null) {
                    c459529d = new C459529d(context, heroPlayerSetting, interfaceC459429c, map, executor, scheduledExecutorService);
                    A0e = c459529d;
                }
            }
            return c459529d;
        }
        return c459529d2;
    }

    public static C4BR A02(C4SS c4ss, C459529d c459529d, long j) {
        C95794Sn A00;
        C4TS c4ts;
        C92124As c92124As;
        if (c4ss.A0K.A03() || c459529d.A06 == null || (A00 = c459529d.A0c.A00(j)) == null || (c4ts = A00.A19) == null || (c92124As = c4ts.A0D) == null || c92124As.A0Q.size() < 1) {
            return null;
        }
        C4BI A02 = c92124As.A02(0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C4BF c4bf : A02.A03) {
            int i = c4bf.A01;
            if (i != 1) {
                if (i == 2) {
                    Iterator it = c4bf.A07.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                }
            } else {
                Iterator it2 = c4bf.A07.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next());
                }
            }
        }
        arrayList.isEmpty();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList == null && arrayList2 == null) {
            return null;
        }
        return new C4BR(arrayList, arrayList2);
    }

    public final long A06(C4SS c4ss, InterfaceC95434Rd interfaceC95434Rd, long j) {
        String str;
        C95794Sn A00;
        long j2 = j;
        C2BV c2bv = this.A0c;
        Context context = this.A0E;
        Handler A002 = A00(this);
        AtomicReference atomicReference = this.A0T;
        C2BZ c2bz = this.A06;
        Map map = this.A0L;
        AtomicBoolean atomicBoolean = this.A0Q;
        synchronized (c2bv) {
            if (c4ss == null) {
                str = null;
            } else {
                str = c4ss.A0K.A0G;
            }
            C2QC.A03("id [%d]: verifyOrCreatePlayer, videoId: %s", Long.valueOf(j2), str);
            C95794Sn A003 = c2bv.A00(j2);
            if (j > 0 && A003 != null && (A00 = c2bv.A00(j2)) != null && A00.A19 != null) {
                C95794Sn.A0E(A003, "leaveWarmUpIfNeed", new Object[0]);
                if (A003.A10.get()) {
                    C95794Sn.A07(A003.A0G.obtainMessage(19, interfaceC95434Rd), A003);
                }
            } else {
                if (j > 0) {
                    c2bv.A01(j2, true);
                }
                long addAndGet = c2bv.A03.addAndGet(1L);
                Long valueOf = Long.valueOf(addAndGet);
                C2QC.A03("id [%d]: Create player", valueOf);
                LruCache lruCache = c2bv.A00;
                for (Map.Entry entry : lruCache.snapshot().entrySet()) {
                    if (((C95794Sn) entry.getValue()).A1F) {
                        lruCache.get(entry.getKey());
                    }
                }
                C2QC.A03("id [%d]: refreshed LRUCached for playing players", valueOf);
                C2QC.A03("id [%d]: creating handlerThread", valueOf);
                HandlerThread handlerThread = new HandlerThread("HeroServicePlayer");
                AbstractC09770fa.A00(handlerThread);
                handlerThread.start();
                C2QC.A03("id [%d]: created handlerThread", valueOf);
                C95794Sn c95794Sn = new C95794Sn(context, A002, handlerThread, c2bz, c4ss, interfaceC95434Rd, c2bv.A01, c2bv, map, atomicBoolean, atomicReference, addAndGet);
                C2QC.A03("id [%d]: created HeroServicePlayer", valueOf);
                j2 = c95794Sn.A0q;
                lruCache.put(Long.valueOf(j2), c95794Sn);
            }
        }
        return j2;
    }

    public final void A07() {
        C46602By c46602By = this.A0J;
        if (c46602By != null) {
            synchronized (c46602By) {
                c46602By.A01.evictAll();
                c46602By.A02.evictAll();
            }
        }
    }

    public final void A08() {
        String[] strArr;
        int i;
        AtomicBoolean atomicBoolean = this.A0P;
        if (!atomicBoolean.get()) {
            AtomicBoolean atomicBoolean2 = this.A0O;
            if (!atomicBoolean2.compareAndSet(true, true)) {
                C2VP c2vp = new C2VP();
                c2vp.A09 = true;
                c2vp.A08 = true;
                HeroPlayerSetting heroPlayerSetting = this.A0H;
                c2vp.A00 = heroPlayerSetting.A0P;
                c2vp.A01 = heroPlayerSetting.A0Q;
                c2vp.A0A = heroPlayerSetting.A2N;
                c2vp.A07 = heroPlayerSetting.A2C;
                c2vp.A03 = heroPlayerSetting.A10.A04;
                c2vp.A0B = heroPlayerSetting.A3T;
                c2vp.A04 = heroPlayerSetting.A1W;
                c2vp.A05 = heroPlayerSetting.A1f;
                C2VQ c2vq = new C2VQ(c2vp);
                try {
                    try {
                        C459929j c459929j = this.A0Z;
                        if (heroPlayerSetting.A2T) {
                            strArr = new String[]{"video/x-vnd.on2.vp9"};
                        } else {
                            strArr = new String[]{"video/avc"};
                        }
                        C2VR c2vr = C2VR.A05;
                        synchronized (c2vr) {
                            i = c2vr.A00;
                        }
                        if (i <= 0 && c2vq.A0A) {
                            try {
                                C2IG A01 = C46762Co.A01(strArr[0]);
                                if (A01 != null) {
                                    Integer num = C05F.A00;
                                    String str = A01.A03;
                                    c2vr.A02(c459929j, c2vq, c2vr.A01(c459929j, c2vq, num, str, true), num, str, true);
                                }
                                C2IG A012 = C46762Co.A01("audio/mp4a-latm");
                                if (A012 != null) {
                                    Integer num2 = C05F.A00;
                                    String str2 = A012.A03;
                                    c2vr.A02(c459929j, c2vq, c2vr.A01(c459929j, c2vq, num2, str2, false), num2, str2, false);
                                }
                            } catch (C40J | C40K | IllegalStateException unused) {
                            }
                        }
                        atomicBoolean.set(true);
                    } catch (LinkageError e) {
                        android.util.Log.e("HeroManager", String.format("Failed to preallocate codecs: %s", e));
                    }
                } finally {
                    atomicBoolean2.set(false);
                }
            }
        }
    }

    @Override // X.InterfaceC220315d
    public final void F8d(C1KJ c1kj) {
        if (c1kj != null && this.A0H.A1B.contains(c1kj.name())) {
            A00(this).post(new RunnableC24288Apt(this));
        }
    }

    public static void A04(C459529d c459529d, String str) {
        C2QC.A03("boostOngoingPrefetchPriorityForVideo %s", str);
        C46442Bh c46442Bh = c459529d.A0B;
        C46462Bj c46462Bj = c46442Bh.A03;
        C4TJ c4tj = new C4TJ(c46442Bh, str);
        synchronized (c46462Bj.A04) {
            Iterator it = c46462Bj.A03.iterator();
            while (it.hasNext()) {
                InterfaceC91964Ac interfaceC91964Ac = ((C92024Ai) it.next()).A00;
                if (c4tj.equals(interfaceC91964Ac)) {
                    interfaceC91964Ac.AE9();
                }
            }
        }
    }

    public static void A05(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                A05(file2);
            }
        }
        file.delete();
    }

    public final void A09(long j, boolean z) {
        C2QC.A03("id [%d]: release", Long.valueOf(j));
        this.A0c.A01(j, z);
    }

    public final boolean A0A(long j, long j2) {
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(j2);
        C2QC.A03("id [%d]: setRelativePosition %d", valueOf, valueOf2);
        C95794Sn A00 = this.A0c.A00(j);
        if (A00 == null) {
            return false;
        }
        C95794Sn.A0E(A00, "Set relative position to %d", valueOf2);
        C95794Sn.A07(A00.A0G.obtainMessage(16, valueOf2), A00);
        return true;
    }

    public final boolean A0D(String str, long j, boolean z) {
        Long valueOf = Long.valueOf(j);
        Boolean valueOf2 = Boolean.valueOf(z);
        C2QC.A03("id [%d]: pause, finishPlayback: %b", valueOf, valueOf2);
        C95794Sn A00 = this.A0c.A00(j);
        if (A00 == null) {
            return false;
        }
        C95794Sn.A0E(A00, "Pause: finishPlayback=%b", valueOf2);
        C95794Sn.A07(A00.A0G.obtainMessage(3, new Object[]{valueOf2, str}), A00);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.29v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.2A5] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.29m] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.29o] */
    public C459529d(Context context, HeroPlayerSetting heroPlayerSetting, InterfaceC459429c interfaceC459429c, Map map, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        AtomicReference atomicReference = new AtomicReference(null);
        this.A0T = atomicReference;
        this.A0S = new AtomicReference(new Object());
        this.A0V = new AtomicReference(null);
        this.A0W = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        this.A0X = atomicReference2;
        ServiceEventCallbackImpl serviceEventCallbackImpl = new ServiceEventCallbackImpl(null, atomicReference);
        this.A0G = serviceEventCallbackImpl;
        this.A0Z = new C459929j(serviceEventCallbackImpl);
        this.A0F = new Object();
        this.A0I = new Object();
        this.A0P = new AtomicBoolean(false);
        this.A0O = new AtomicBoolean(false);
        this.A0Q = new AtomicBoolean(false);
        this.A0R = new AtomicBoolean(true);
        this.A0a = new AtomicBoolean(false);
        this.A0U = new AtomicReference(new C460529p());
        this.A0d = InterfaceC459429c.A00;
        AbstractC460729r.A01("initHeroManager");
        try {
            this.A0Y = new Object();
            atomicReference2.set(null);
            this.A0L = map;
            this.A0H = heroPlayerSetting;
            this.A0E = context;
            this.A0N = scheduledExecutorService;
            this.A0M = executor;
            InterfaceC461129v interfaceC461129v = this.A0Y;
            boolean z = heroPlayerSetting.A1q;
            if (z || heroPlayerSetting.A21 || heroPlayerSetting.A23) {
                boolean z2 = heroPlayerSetting.A21;
                boolean z3 = heroPlayerSetting.A23;
                synchronized (C461229w.class) {
                    try {
                        if (!C461229w.A00) {
                            MediaCodecHooks$NativeImpl.install(z, z2, z3, false, false, false, false);
                            C461229w.A00 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            AbstractC459729h.A00 = heroPlayerSetting.A1y;
            AtomicReference atomicReference3 = this.A0V;
            InterfaceC460429o interfaceC460429o = this.A0I;
            atomicReference3.set(new C461429y(heroPlayerSetting, interfaceC460429o));
            Context context2 = this.A0E;
            this.A09 = new C2A4(context2, heroPlayerSetting.A1m);
            this.A05 = new Object();
            synchronized (C2A6.class) {
                try {
                    C2A6.A09 = new C2A6(C2A7.A00);
                } finally {
                }
            }
            A00(this).post(new Runnable() { // from class: X.2Aa
                /* JADX WARN: Type inference failed for: r0v30, types: [X.2Am, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    C2BQ c2bq;
                    C2A4 c2a4;
                    C459529d c459529d = C459529d.this;
                    HeroPlayerSetting heroPlayerSetting2 = c459529d.A0H;
                    if (heroPlayerSetting2.A1n) {
                        String str = heroPlayerSetting2.A0y.A0E;
                        if (str == null) {
                            str = c459529d.A0E.getFilesDir().toString();
                        }
                        try {
                            AbstractC460729r.A01("initNetworkInfoMap");
                            NetworkInfoMap networkInfoMap = NetworkInfoMap.A07;
                            networkInfoMap.A04 = heroPlayerSetting2.A1y;
                            synchronized (networkInfoMap) {
                                try {
                                    if (networkInfoMap.A01 == null) {
                                        String A0R = AnonymousClass001.A0R(str, "/http/historical/");
                                        ?? obj = new Object();
                                        obj.A00 = A0R;
                                        obj.A01 = "vps_network_info_store";
                                        networkInfoMap.A01 = obj;
                                        if (networkInfoMap.A04) {
                                            android.util.Log.w("com.facebook.http.historical.NetworkInfoMap", String.format("Initializing NetworkInfoMap with dir: %s filename: %s", str, "vps_network_info_store"));
                                        }
                                        NetworkInfoMap.A00(networkInfoMap);
                                    }
                                } finally {
                                }
                            }
                            C2A4 c2a42 = c459529d.A09;
                            networkInfoMap.A02(c2a42.A00());
                            C2A6.A00().A05 = c2a42;
                            C2A6 A00 = C2A6.A00();
                            C42081wy c42081wy = heroPlayerSetting2.A0w;
                            synchronized (A00) {
                                try {
                                    if (A00.A08 != null) {
                                        try {
                                            AbstractC460729r.A01("resetTransferAccumulator");
                                            try {
                                                A00.A06 = new C2A9();
                                                A00.A02 = -1L;
                                                A00.A04.reset(c42081wy);
                                                A00.A03 = 0L;
                                                boolean z4 = false;
                                                A00.A01 = 0;
                                                A00.A00 = 0;
                                                synchronized (networkInfoMap) {
                                                    try {
                                                        if (networkInfoMap.A01 != null) {
                                                            z4 = true;
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                if (z4 && (c2a4 = A00.A05) != null) {
                                                    String A002 = c2a4.A00();
                                                    A00.A07 = A002;
                                                    networkInfoMap.A02(A002);
                                                }
                                                synchronized (networkInfoMap) {
                                                    c2bq = networkInfoMap.A02;
                                                }
                                                AbstractC459729h.A01("SharedTransferAccumulator", "Resetting Shared Accumulator. currentConnection: %s record: %s", A00.A07, c2bq);
                                                if (c2bq != null) {
                                                    SystemClock.elapsedRealtime();
                                                    long j = c2bq.A01;
                                                    if (j > 0) {
                                                        int i = (int) c2bq.A03;
                                                        int i2 = (int) (80000000 / j);
                                                        if (i2 == 0) {
                                                            i2 = 1;
                                                        }
                                                        AbstractC459729h.A01("SharedTransferAccumulator", "Initializing with ttfb: %d transfer duration: %d", Integer.valueOf(i), Integer.valueOf(i2));
                                                        C2A6.A01(A00, i, i2, 10000, -1L, 0L, 1L, -1L, false, false, true, true);
                                                    }
                                                }
                                                AbstractC460729r.A00();
                                            } catch (Throwable th3) {
                                            }
                                        } finally {
                                        }
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                        } finally {
                        }
                    }
                }
            });
            if (heroPlayerSetting.A2A) {
                String str = heroPlayerSetting.A17;
                C2QC.A03("LocalSocketProxy is enabled, address: %s", str);
                C56P.A00(heroPlayerSetting, str, this.A0S);
            }
            if (heroPlayerSetting.A25) {
                C46182Ac c46182Ac = new C46182Ac(heroPlayerSetting, this.A0S, atomicReference3);
                C2Ai.A01 = c46182Ac;
                C2Ai.A00 = c46182Ac;
            }
            AtomicReference atomicReference4 = this.A0W;
            C46272Ao c46272Ao = new C46272Ao(atomicReference4);
            C2A4 c2a4 = this.A09;
            C2A5 c2a5 = this.A05;
            InterfaceC460229m interfaceC460229m = this.A0F;
            AtomicReference atomicReference5 = this.A0U;
            this.A0b = new C46282Ap(c2a5, interfaceC460229m, c2a4, interfaceC461129v, c46272Ao, heroPlayerSetting, interfaceC460429o, atomicReference3, atomicReference5, new AtomicReference(null));
            this.A0A = new HeroDashLiveManagerImpl(context2, heroPlayerSetting, interfaceC460229m, this.A0T, this.A09, interfaceC460429o);
            C46282Ap c46282Ap = this.A0b;
            c46282Ap.getClass();
            c46282Ap.A00 = this.A0A.A00;
            this.A0c = new C2BV(c46282Ap, heroPlayerSetting);
            if (this.A06 == null) {
                C41961wm c41961wm = heroPlayerSetting.A0y;
                String str2 = c41961wm.A0E;
                C2BX c2bx = new C2BX(str2 == null ? context2.getFilesDir().toString() : str2, c41961wm.A06, c41961wm.A0Q, c41961wm.A0S, c41961wm.A0R, c41961wm.A0I);
                this.A07 = c2bx;
                Map map2 = this.A0L;
                C2BZ c2bz = new C2BZ(context2, A00(this), c2bx, new C2BY(this), (C461429y) atomicReference3.get(), heroPlayerSetting, map2);
                this.A06 = c2bz;
                this.A0B = new C46442Bh(context2, interfaceC460229m, c2bz, this.A09, (heroPlayerSetting.A2K || heroPlayerSetting.A2n || heroPlayerSetting.A2p) ? new C46432Bg(this) : null, new C46272Ao(atomicReference4), (C461429y) atomicReference3.get(), heroPlayerSetting, interfaceC460429o, map2, atomicReference5);
                C46502Bn c46502Bn = C46492Bm.A09;
                if (c46502Bn.A01 == null) {
                    String A00 = C46502Bn.A00();
                    c46502Bn.A01 = A00;
                    if (A00 == null) {
                        A00 = C46502Bn.A00();
                        c46502Bn.A01 = A00;
                    }
                    String.format("Initializing Live Trace with Player Id: %s", A00);
                    AbstractC46512Bo.A01();
                    String str3 = c46502Bn.A01;
                    c46502Bn.A03 = AnonymousClass001.A0R("PLY:AND:DL:", str3);
                    c46502Bn.A00 = AnonymousClass001.A0R("PLY:AND:DIS:", str3);
                    c46502Bn.A02 = AnonymousClass001.A0R("PLY:AND:", str3);
                }
                if (heroPlayerSetting.A2V) {
                    HandlerThread handlerThread = new HandlerThread("HeroWarmupThread");
                    AbstractC09770fa.A00(handlerThread);
                    handlerThread.start();
                    final Looper looper = handlerThread.getLooper();
                    new Handler(looper).post(new Runnable() { // from class: X.2Bu
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC459729h.A01("HeroManager", "media codec warmup", new Object[0]);
                            HeroPlayerSetting heroPlayerSetting2 = this.A0H;
                            if (heroPlayerSetting2.A2V) {
                                boolean z4 = heroPlayerSetting2.A3c;
                                boolean z5 = heroPlayerSetting2.A3b;
                                C46762Co.A07("video/avc");
                                C46762Co.A07("audio/mp4a-latm");
                                if (z4) {
                                    C46762Co.A07("video/x-vnd.on2.vp9");
                                }
                                if (z5) {
                                    C46762Co.A07("video/av01");
                                }
                            }
                            looper.quit();
                        }
                    });
                }
                if (heroPlayerSetting.A2f && !this.A0P.get() && !this.A0O.get()) {
                    Runnable runnable = new Runnable() { // from class: X.2Bv
                        @Override // java.lang.Runnable
                        public final void run() {
                            C459529d.this.A08();
                        }
                    };
                    ScheduledExecutorService scheduledExecutorService2 = this.A0N;
                    if (scheduledExecutorService2 != null) {
                        scheduledExecutorService2.execute(runnable);
                    }
                }
            }
            this.A0d = interfaceC459429c;
            this.A0J = new C46602By(new C46592Bx(this), heroPlayerSetting, this.A0d);
            C41861wa c41861wa = heroPlayerSetting.A01;
            if (c41861wa != null) {
                C2C5.A01(C2C1.A1D, false);
                C2C1 c2c1 = C2C1.A0P;
                C42361xQ c42361xQ = heroPlayerSetting.A10;
                C2C5.A01(c2c1, c42361xQ.A08);
                C2C5.A01(C2C1.A0X, c42361xQ.A0C);
                C2C5.A01(C2C1.A0n, c42361xQ.A0N);
                C2C5.A01(C2C1.A1P, false);
                C2C5.A01(C2C1.A1S, c41861wa.A0X);
                C2C5.A01(C2C1.A1O, false);
                C2C5.A01(C2C1.A1N, true);
                C2C6 c2c6 = C2C6.A06;
                Map map3 = C2C5.A00;
                map3.put(c2c6, -1);
                map3.put(C2C6.A05, -1);
                C2C5.A01(C2C1.A06, true);
                C2C5.A01(C2C1.A0a, false);
                map3.put(C2C6.A02, 10);
                C2C5.A01(C2C1.A1A, c41861wa.A0O);
                C2C5.A01(C2C1.A1R, c41861wa.A0T);
                C2C5.A01(C2C1.A1L, c41861wa.A0g);
                C2C5.A01(C2C1.A15, c41861wa.A0N);
                C2C5.A01(C2C1.A0b, false);
                map3.put(C2C6.A07, -1);
                C2C5.A01(C2C1.A0E, c41861wa.A08);
                C2C5.A01(C2C1.A0w, c41861wa.A0L);
                C2C5.A01.put(C2C7.A02, Long.valueOf(c41861wa.A02));
                C2C5.A01(C2C1.A0V, c41861wa.A0J);
                C2C5.A01(C2C1.A0Q, true);
                C2C5.A01(C2C1.A0N, c41861wa.A0H);
                C2C5.A01(C2C1.A0t, false);
                C2C5.A01(C2C1.A0p, false);
                C2C5.A01(C2C1.A0o, false);
                map3.put(C2C6.A04, -1);
                C2C5.A01(C2C1.A0D, c41861wa.A07);
                C2C5.A01(C2C1.A0R, false);
                C2C5.A01(C2C1.A0K, c41861wa.A0E);
                C2C5.A01(C2C1.A0r, c41861wa.A0S);
                C2C5.A01(C2C1.A0u, c41861wa.A0W);
                C2C5.A01(C2C1.A0v, c41861wa.A0Y);
                C2C5.A01(C2C1.A0H, c41861wa.A0B);
                C2C5.A01(C2C1.A0B, c41861wa.A06);
                C2C5.A01(C2C1.A0M, true);
                C2C5.A01(C2C1.A09, false);
                C2C5.A01(C2C1.A0J, false);
                C2C5.A01(C2C1.A0A, false);
                C2C5.A01(C2C1.A0I, c41861wa.A0D);
                C2C5.A01(C2C1.A0f, c41861wa.A0P);
                C2C5.A01(C2C1.A07, false);
                C2C5.A01(C2C1.A1H, c41861wa.A0d);
                C2C5.A01(C2C1.A04, c41861wa.A04);
                C2C5.A01(C2C1.A14, false);
                C2C5.A01(C2C1.A1G, c41861wa.A0c);
                C2C5.A01(C2C1.A11, false);
                C2C5.A01(C2C1.A1K, c41861wa.A0f);
                C2C5.A01(C2C1.A0W, c41861wa.A0K);
                C2C5.A01(C2C1.A03, c41861wa.A03);
                map3.put(C2C6.A03, Integer.valueOf(c41861wa.A00));
                C2C5.A01(C2C1.A1F, c41861wa.A0b);
                C2C5.A01(C2C1.A08, c41861wa.A05);
                C2C5.A01(C2C1.A0G, c41861wa.A0A);
                C2C5.A01(C2C1.A0y, false);
                C2C5.A01(C2C1.A02, c41861wa.A0Z);
                C2C5.A01(C2C1.A1I, c41861wa.A0e);
                C2C5.A01(C2C1.A05, false);
                C2C5.A01(C2C1.A0C, c42361xQ.A02);
                C2C5.A01(C2C1.A1E, c42361xQ.A0Z);
                C2C5.A01(C2C1.A1J, c42361xQ.A0a);
                C2C5.A01(C2C1.A0S, c42361xQ.A09);
                C2C5.A01(C2C1.A0F, c42361xQ.A05);
                C2C5.A01(C2C1.A1C, false);
                C2C5.A01(C2C1.A0L, c42361xQ.A06);
                C2C5.A01(C2C1.A1M, false);
                C2C5.A01(C2C1.A0U, c42361xQ.A0A);
                C2C5.A01(C2C1.A0T, c42361xQ.A0B);
                C2C5.A01(C2C1.A0s, c42361xQ.A0P);
                C2C5.A01(C2C1.A10, false);
                C2C5.A01(C2C1.A0O, c42361xQ.A07);
                C2C5.A01(C2C1.A1B, c42361xQ.A0X);
                C2C5.A01(C2C1.A17, c42361xQ.A0U);
                C2C5.A01(C2C1.A16, c42361xQ.A0T);
                C2C5.A01(C2C1.A0m, c42361xQ.A0M);
                C2C5.A01(C2C1.A19, c42361xQ.A0W);
                C2C5.A01(C2C1.A18, c42361xQ.A0V);
                C2C5.A01(C2C1.A0k, c42361xQ.A0J);
                C2C5.A01(C2C1.A0Z, c42361xQ.A0D);
                C2C5.A01(C2C1.A0d, c42361xQ.A0I);
                C2C5.A01(C2C1.A0c, c42361xQ.A0H);
                C2C5.A01(C2C1.A0l, c42361xQ.A0L);
                C2C5.A01(C2C1.A0e, c42361xQ.A0R || c42361xQ.A0S);
                C2C5.A01(C2C1.A0q, c42361xQ.A0O);
                C2C5.A01(C2C1.A0x, false);
                C2C5.A01(C2C1.A0z, false);
                C2C5.A01(C2C1.A12, false);
                C2C5.A01(C2C1.A13, false);
                C2C5.A01(C2C1.A0j, false);
                C2C5.A01(C2C1.A0g, false);
                C2C5.A01(C2C1.A0i, false);
                C2C5.A01(C2C1.A0h, false);
                C2C5.A01(C2C1.A0Y, false);
            }
            if (heroPlayerSetting.A10.A03) {
                C2QC.A00 = false;
            }
            if (heroPlayerSetting.A3V) {
                this.A08 = new C2C8();
            }
        } finally {
            AbstractC460729r.A00();
        }
    }
}
