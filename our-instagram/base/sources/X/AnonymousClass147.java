package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LruCache;
import android.util.Pair;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.memory.javamemtracker.JavaMemoryTrackerForMetrics;
import com.facebook.memory.surfacememtracking.SurfaceNativeMemTracker;
import com.facebook.memorytimeline.MemoryTimeline;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.147, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass147 extends AbstractC211911v {
    public C0L2 A00;
    public C2RQ A01;
    public final long A02;
    public final C211211o A03;

    @Override // X.AbstractC211911v
    public final String A06() {
        return "IgMemoryProgramQplInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        C211211o c211211o = this.A03;
        if (((AnonymousClass122) c211211o.A00()).A08() instanceof UserSession) {
            C2RQ c2rq = new C2RQ(((AnonymousClass122) c211211o.A00()).A08());
            this.A01 = c2rq;
            if (C18U.A06(C06090Tz.A05, c2rq.A00, 36312269155533852L)) {
                AbstractC24921Jr.A00(new InterfaceC24911Jq() { // from class: X.4pD
                    /* JADX WARN: Type inference failed for: r0v60, types: [X.0N1, java.lang.Object] */
                    @Override // X.InterfaceC24911Jq
                    public final void DSe(final MemoryTimeline memoryTimeline) {
                        C2RQ c2rq2;
                        final int intValue;
                        final int intValue2;
                        final int intValue3;
                        C105544pR c105544pR;
                        int intValue4;
                        AnonymousClass147 anonymousClass147 = AnonymousClass147.this;
                        C006802i c006802i = C006802i.A0p;
                        if (c006802i != null && (c2rq2 = anonymousClass147.A01) != null) {
                            AbstractC12990ll abstractC12990ll = c2rq2.A00;
                            C06090Tz c06090Tz = C06090Tz.A05;
                            if (C18U.A06(c06090Tz, abstractC12990ll, 36312269156320291L)) {
                                ?? obj = new Object();
                                obj.A00 = c006802i;
                                synchronized (C0Gj.class) {
                                    C0Gj.A00 = obj;
                                }
                            }
                            C2RQ c2rq3 = anonymousClass147.A01;
                            C14360o3.A0A(c2rq3);
                            boolean A06 = C18U.A06(c06090Tz, c2rq3.A00, 36312269155861534L);
                            C2RQ c2rq4 = anonymousClass147.A01;
                            C14360o3.A0A(c2rq4);
                            boolean A062 = C18U.A06(c06090Tz, c2rq4.A00, 36312269155927071L);
                            if (anonymousClass147.A01 != null) {
                                HandlerThread handlerThread = new HandlerThread("NavigationTrackerWithMemoryInfoThread");
                                AbstractC09770fa.A00(handlerThread);
                                handlerThread.start();
                                Looper looper = handlerThread.getLooper();
                                if (looper != null) {
                                    Handler handler = new Handler(looper);
                                    C2RQ c2rq5 = anonymousClass147.A01;
                                    C14360o3.A0A(c2rq5);
                                    Long valueOf = Long.valueOf(C18U.A01(c06090Tz, c2rq5.A00, 36593744132441574L));
                                    if (valueOf == null) {
                                        intValue = 0;
                                    } else {
                                        intValue = valueOf.intValue();
                                    }
                                    final boolean A02 = BuildConstants.A02();
                                    InterfaceC105444pF interfaceC105444pF = new InterfaceC105444pF(memoryTimeline, A02) { // from class: X.4pE
                                        public final java.util.Set A00;

                                        @Override // X.InterfaceC105444pF
                                        public final HashMap AIR(int i) {
                                            C105634pa c105634pa;
                                            long j;
                                            long A00;
                                            long j2;
                                            long j3;
                                            HashMap hashMap = new HashMap();
                                            long j4 = 0;
                                            long j5 = 0;
                                            for (EnumC105454pG enumC105454pG : this.A00) {
                                                HashMap hashMap2 = enumC105454pG.A01;
                                                synchronized (hashMap2) {
                                                    c105634pa = (C105634pa) hashMap2.remove(Integer.valueOf(i));
                                                }
                                                if (c105634pa != null) {
                                                    C0TP c0tp = c105634pa.A00.A02;
                                                    String A01 = c0tp.A01();
                                                    if (c0tp == C0TP.A08) {
                                                        C0TJ c0tj = c105634pa.A00;
                                                        C0TJ c0tj2 = c105634pa.A01;
                                                        if (c0tj2 != null && C0TJ.A00(c0tj2, c0tj) == c0tj2) {
                                                            c0tj = c0tj2;
                                                        }
                                                        C0TJ c0tj3 = c105634pa.A02;
                                                        if (c0tj3 != null && C0TJ.A00(c0tj3, c0tj) == c0tj3) {
                                                            c0tj = c0tj3;
                                                        }
                                                        if (c0tj.A00 <= 4194304) {
                                                            A00 = 0;
                                                        }
                                                    } else {
                                                        C0TJ c0tj4 = c105634pa.A01;
                                                        if (c0tj4 != null) {
                                                            j = c0tj4.A00;
                                                        } else {
                                                            j = -1;
                                                        }
                                                        long j6 = c105634pa.A00.A00;
                                                        j4 += j - j6;
                                                        A00 = enumC105454pG.A00() - j6;
                                                        j5 += A00;
                                                    }
                                                    String A0g = AnonymousClass001.A0g("worst_", A01, "_kb");
                                                    C0TJ c0tj5 = c105634pa.A00;
                                                    C0TJ c0tj6 = c105634pa.A01;
                                                    if (c0tj6 != null && C0TJ.A00(c0tj6, c0tj5) == c0tj6) {
                                                        c0tj5 = c0tj6;
                                                    }
                                                    C0TJ c0tj7 = c105634pa.A02;
                                                    if (c0tj7 != null && C0TJ.A00(c0tj7, c0tj5) == c0tj7) {
                                                        c0tj5 = c0tj7;
                                                    }
                                                    hashMap.put(A0g, Long.valueOf(c0tj5.A00));
                                                    String A0g2 = AnonymousClass001.A0g("start_", A01, "_kb");
                                                    long j7 = c105634pa.A00.A00;
                                                    hashMap.put(A0g2, Long.valueOf(j7));
                                                    String A0g3 = AnonymousClass001.A0g("end_", A01, "_kb");
                                                    C0TJ c0tj8 = c105634pa.A01;
                                                    if (c0tj8 != null) {
                                                        j2 = c0tj8.A00;
                                                    } else {
                                                        j2 = -1;
                                                    }
                                                    hashMap.put(A0g3, Long.valueOf(j2));
                                                    String A0g4 = AnonymousClass001.A0g("accum_", A01, "_kb");
                                                    C0TJ c0tj9 = c105634pa.A01;
                                                    if (c0tj9 != null) {
                                                        j3 = c0tj9.A00;
                                                    } else {
                                                        j3 = -1;
                                                    }
                                                    hashMap.put(A0g4, Long.valueOf(j3 - j7));
                                                    hashMap.put(AnonymousClass001.A0g("accum_", A01, "_after_exit_kb"), Long.valueOf(A00));
                                                }
                                            }
                                            hashMap.put("total_surface_accum_kb", Long.valueOf(j4));
                                            hashMap.put("total_surface_accum_after_exit_kb", Long.valueOf(j5));
                                            return hashMap;
                                        }

                                        /* JADX WARN: Type inference failed for: r0v3, types: [X.4pa, java.lang.Object] */
                                        @Override // X.InterfaceC105444pF
                                        public final void ASu(int i, boolean z, boolean z2, boolean z3) {
                                            for (EnumC105454pG enumC105454pG : this.A00) {
                                                C0TJ c0tj = new C0TJ(enumC105454pG.A00, enumC105454pG.A00());
                                                ?? obj2 = new Object();
                                                obj2.A00 = c0tj;
                                                HashMap hashMap = enumC105454pG.A01;
                                                synchronized (hashMap) {
                                                    Integer valueOf2 = Integer.valueOf(i);
                                                    hashMap.put(valueOf2, obj2);
                                                    enumC105454pG.A02.add(valueOf2);
                                                }
                                            }
                                        }

                                        @Override // X.InterfaceC105444pF
                                        public final void ATm(int i) {
                                            C105634pa c105634pa;
                                            for (EnumC105454pG enumC105454pG : this.A00) {
                                                HashMap hashMap = enumC105454pG.A01;
                                                synchronized (hashMap) {
                                                    Integer valueOf2 = Integer.valueOf(i);
                                                    c105634pa = (C105634pa) hashMap.get(valueOf2);
                                                    enumC105454pG.A02.remove(valueOf2);
                                                }
                                                if (c105634pa != null) {
                                                    c105634pa.A01 = new C0TJ(enumC105454pG.A00, enumC105454pG.A00());
                                                }
                                            }
                                        }

                                        {
                                            HashSet hashSet = new HashSet();
                                            this.A00 = hashSet;
                                            EnumC105454pG enumC105454pG = EnumC105454pG.A04;
                                            hashSet.add(enumC105454pG);
                                            memoryTimeline.AAR(enumC105454pG);
                                            EnumC105454pG enumC105454pG2 = EnumC105454pG.A05;
                                            hashSet.add(enumC105454pG2);
                                            memoryTimeline.AAR(enumC105454pG2);
                                            if (!A02) {
                                                EnumC105454pG enumC105454pG3 = EnumC105454pG.A03;
                                                hashSet.add(enumC105454pG3);
                                                memoryTimeline.AAR(enumC105454pG3);
                                            }
                                        }
                                    };
                                    InterfaceC105444pF interfaceC105444pF2 = new InterfaceC105444pF(memoryTimeline, intValue) { // from class: X.4pK
                                        public final int A00;
                                        public final LruCache A01 = new LruCache(30);
                                        public final LruCache A02 = new LruCache(30);
                                        public final MemoryTimeline A03;

                                        @Override // X.InterfaceC105444pF
                                        public final HashMap AIR(int i) {
                                            C0TJ c0tj;
                                            C0TS A00 = C2RK.A00(C0TG.A00, (C2RK) this.A03, this.A00);
                                            HashMap hashMap = new HashMap();
                                            LruCache lruCache = this.A01;
                                            Integer valueOf2 = Integer.valueOf(i);
                                            C0TS c0ts = (C0TS) lruCache.remove(valueOf2);
                                            C0TS c0ts2 = (C0TS) this.A02.remove(valueOf2);
                                            if (c0ts != null && c0ts2 != null) {
                                                HashMap hashMap2 = new HashMap();
                                                for (C0TJ c0tj2 : c0ts2.A00) {
                                                    hashMap2.put(c0tj2.A02, c0tj2);
                                                }
                                                HashMap hashMap3 = new HashMap();
                                                for (C0TJ c0tj3 : A00.A00) {
                                                    hashMap3.put(c0tj3.A02, c0tj3);
                                                }
                                                for (C0TJ c0tj4 : c0ts.A00) {
                                                    C0TP c0tp = c0tj4.A02;
                                                    if (c0tp != C0TP.A0V && c0tp != C0TP.A08 && c0tp != C0TP.A0o && (c0tj = (C0TJ) hashMap2.get(c0tp)) != null) {
                                                        String A0u = AnonymousClass001.A0u("_", c0tp.A01(), "_", C0TO.A00(c0tp.A01));
                                                        long j = c0tj4.A00;
                                                        long j2 = c0tj.A00;
                                                        hashMap.put(AnonymousClass001.A0R("start", A0u), Long.valueOf(j));
                                                        hashMap.put(AnonymousClass001.A0R("end", A0u), Long.valueOf(j2));
                                                        hashMap.put(AnonymousClass001.A0R("accum", A0u), Long.valueOf(j2 - j));
                                                        C0TJ c0tj5 = (C0TJ) hashMap3.get(c0tp);
                                                        if (c0tj5 != null) {
                                                            hashMap.put(AnonymousClass001.A0R("after", A0u), Long.valueOf(c0tj5.A00 - j2));
                                                        }
                                                    }
                                                }
                                            }
                                            return hashMap;
                                        }

                                        @Override // X.InterfaceC105444pF
                                        public final void ASu(int i, boolean z, boolean z2, boolean z3) {
                                            MemoryTimeline memoryTimeline2 = this.A03;
                                            this.A01.put(Integer.valueOf(i), C2RK.A00(C0TG.A01, (C2RK) memoryTimeline2, this.A00));
                                        }

                                        @Override // X.InterfaceC105444pF
                                        public final void ATm(int i) {
                                            MemoryTimeline memoryTimeline2 = this.A03;
                                            this.A02.put(Integer.valueOf(i), C2RK.A00(C0TG.A02, (C2RK) memoryTimeline2, this.A00));
                                        }

                                        {
                                            this.A03 = memoryTimeline;
                                            this.A00 = intValue;
                                        }
                                    };
                                    HashSet hashSet = new HashSet();
                                    hashSet.add(interfaceC105444pF);
                                    hashSet.add(interfaceC105444pF2);
                                    C2RQ c2rq6 = anonymousClass147.A01;
                                    C14360o3.A0A(c2rq6);
                                    final boolean A063 = C18U.A06(c06090Tz, c2rq6.A00, 36312269156058145L);
                                    C2RQ c2rq7 = anonymousClass147.A01;
                                    C14360o3.A0A(c2rq7);
                                    final boolean A064 = C18U.A06(c06090Tz, c2rq7.A00, 36312269156123682L);
                                    if (A063 || A064) {
                                        C2RQ c2rq8 = anonymousClass147.A01;
                                        C14360o3.A0A(c2rq8);
                                        Long valueOf2 = Long.valueOf(C18U.A01(c06090Tz, c2rq8.A00, 36593744132900328L));
                                        if (valueOf2 == null) {
                                            intValue2 = 0;
                                        } else {
                                            intValue2 = valueOf2.intValue();
                                        }
                                        C2RQ c2rq9 = anonymousClass147.A01;
                                        C14360o3.A0A(c2rq9);
                                        Long valueOf3 = Long.valueOf(C18U.A01(c06090Tz, c2rq9.A00, 36593744132965865L));
                                        if (valueOf3 == null) {
                                            intValue3 = 0;
                                        } else {
                                            intValue3 = valueOf3.intValue();
                                        }
                                        C14360o3.A0A(anonymousClass147.A01);
                                        C14360o3.A0A(anonymousClass147.A01);
                                        C14360o3.A0A(anonymousClass147.A01);
                                        C14360o3.A0A(anonymousClass147.A01);
                                        C14360o3.A0A(anonymousClass147.A01);
                                        C14360o3.A0A(anonymousClass147.A01);
                                        hashSet.add(new InterfaceC105444pF(intValue2, intValue3, A063, A064) { // from class: X.4pL
                                            public final JavaMemoryTrackerForMetrics A00;
                                            public final SurfaceNativeMemTracker A01;
                                            public final Map A02 = new HashMap();

                                            {
                                                JavaMemoryTrackerForMetrics javaMemoryTrackerForMetrics;
                                                if (A063) {
                                                    synchronized (JavaMemoryTrackerForMetrics.class) {
                                                        javaMemoryTrackerForMetrics = JavaMemoryTrackerForMetrics.sInstance;
                                                        if (javaMemoryTrackerForMetrics == null) {
                                                            javaMemoryTrackerForMetrics = new JavaMemoryTrackerForMetrics(intValue2, 1, true, false);
                                                            JavaMemoryTrackerForMetrics.sInstance = javaMemoryTrackerForMetrics;
                                                        }
                                                    }
                                                    this.A00 = javaMemoryTrackerForMetrics;
                                                    synchronized (C0Gj.class) {
                                                        C0Mq c0Mq = C04770Mv.A00;
                                                        StringBuilder sb = new StringBuilder(32);
                                                        sb.append(intValue2);
                                                        sb.append(',');
                                                        sb.append(1);
                                                        sb.append(',');
                                                        sb.append(1);
                                                        sb.append(',');
                                                        sb.append(0);
                                                        sb.append(',');
                                                        sb.append(0);
                                                        sb.append(',');
                                                        sb.append(1);
                                                        sb.append(',');
                                                        sb.append(0);
                                                        sb.append(',');
                                                        sb.append(0);
                                                        c0Mq.A02(C0LK.A6M, C0M6.CRITICAL_REPORT, sb.toString());
                                                    }
                                                }
                                                if (A064) {
                                                    this.A01 = new SurfaceNativeMemTracker(intValue3);
                                                    synchronized (C0Gj.class) {
                                                        C04770Mv.A00.A02(C0LK.A7c, C0M6.CRITICAL_REPORT, Integer.toString(intValue3));
                                                    }
                                                }
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, com.facebook.memory.common.MapStats] */
                                            /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.memory.common.SurfaceVisitStats, java.lang.Object] */
                                            @Override // X.InterfaceC105444pF
                                            public final HashMap AIR(int i) {
                                                long j;
                                                HashMap hashMap = new HashMap();
                                                Map map = this.A02;
                                                Integer valueOf4 = Integer.valueOf(i);
                                                Pair pair = (Pair) map.get(valueOf4);
                                                if (pair != null) {
                                                    ?? obj2 = new Object();
                                                    ?? obj3 = new Object();
                                                    long longValue = ((Number) pair.first).longValue();
                                                    JavaMemoryTrackerForMetrics javaMemoryTrackerForMetrics = this.A00;
                                                    long j2 = 0;
                                                    if (javaMemoryTrackerForMetrics != 0) {
                                                        long[] jArr = new long[4];
                                                        javaMemoryTrackerForMetrics.getAccumulatedSizeAndStopTrackingSurface(i, obj3, jArr);
                                                        int i2 = 0;
                                                        loop0: while (true) {
                                                            String str = "total_gc_count";
                                                            while (true) {
                                                                hashMap.put(str, Long.valueOf(jArr[i2]));
                                                                i2++;
                                                                if (i2 >= 4) {
                                                                    break loop0;
                                                                }
                                                                if (i2 != 0) {
                                                                    if (i2 != 1) {
                                                                        if (i2 != 2) {
                                                                            if (i2 != 3) {
                                                                                str = "unknown_gc_stat";
                                                                            } else {
                                                                                str = "total_time_in_blocking_gc";
                                                                            }
                                                                        } else {
                                                                            str = "total_time_in_gc";
                                                                        }
                                                                    } else {
                                                                        str = "total_blocking_gc_count";
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        j2 = obj3.A02;
                                                        if (j2 != -1) {
                                                            hashMap.put("java_unfreed_allocations_kb", Long.valueOf(j2 / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                                        }
                                                        if (longValue != -1) {
                                                            hashMap.put("java_unfreed_allocations_on_exit_kb", Long.valueOf(longValue / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                                        }
                                                        long j3 = obj3.A00;
                                                        if (j3 != -1) {
                                                            hashMap.put("maximum_java_unfreed_allocations_kb", Long.valueOf(j3 / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                                        }
                                                        j = obj3.A01;
                                                        if (j != -1) {
                                                            hashMap.put("total_java_allocations_kb", Long.valueOf(j / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                                        }
                                                        javaMemoryTrackerForMetrics.getMapStats(obj2);
                                                        hashMap.put("java_allocation_map_max_size", Long.valueOf(obj2.A02));
                                                        hashMap.put("java_allocation_map_max_bucket_count", Long.valueOf(obj2.A01));
                                                        hashMap.put("java_allocation_map_max_load_factor", Long.valueOf(Math.round(obj2.A00 * 1000000.0f)));
                                                    } else {
                                                        j = 0;
                                                    }
                                                    SurfaceNativeMemTracker surfaceNativeMemTracker = this.A01;
                                                    if (surfaceNativeMemTracker != 0) {
                                                        long longValue2 = ((Number) pair.second).longValue();
                                                        surfaceNativeMemTracker.getAccumulatedAndMaxSizeAndStopTrackingSurface(i, obj3);
                                                        hashMap.put("native_unfreed_allocations_on_exit_kb", Long.valueOf(longValue2 / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                                        long j4 = obj3.A02;
                                                        hashMap.put("native_unfreed_allocations_kb", Long.valueOf(j4 / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                                        hashMap.put("maximum_native_unfreed_allocations_kb", Long.valueOf(obj3.A00 / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                                        long j5 = obj3.A01;
                                                        hashMap.put("total_native_allocations_kb", Long.valueOf(j5 / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                                        surfaceNativeMemTracker.getMapStats(obj2);
                                                        hashMap.put("native_allocation_map_max_size", Long.valueOf(obj2.A02));
                                                        hashMap.put("native_allocation_map_max_bucket_count", Long.valueOf(obj2.A01));
                                                        hashMap.put("native_allocation_map_max_load_factor", Long.valueOf(Math.round(obj2.A00 * 1000000.0f)));
                                                        if (javaMemoryTrackerForMetrics != 0) {
                                                            if (longValue != -1) {
                                                                hashMap.put("total_unfreed_allocations_on_exit_kb", Long.valueOf((longValue + longValue2) / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                                            }
                                                            if (j2 != -1) {
                                                                hashMap.put("total_unfreed_allocations_kb", Long.valueOf((j2 + j4) / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                                            }
                                                            if (j != -1) {
                                                                hashMap.put("total_allocations_kb", Long.valueOf((j + j5) / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                                            }
                                                        }
                                                    }
                                                    map.remove(valueOf4);
                                                }
                                                return hashMap;
                                            }

                                            @Override // X.InterfaceC105444pF
                                            public final void ASu(int i, boolean z, boolean z2, boolean z3) {
                                                if (z && z2 && !z3) {
                                                    this.A02.put(Integer.valueOf(i), null);
                                                    JavaMemoryTrackerForMetrics javaMemoryTrackerForMetrics = this.A00;
                                                    if (javaMemoryTrackerForMetrics != null) {
                                                        synchronized (C0Gj.class) {
                                                            C0Gj.A01 = true;
                                                            C0Gj.A02 = true;
                                                            C0Gj.A00();
                                                        }
                                                        javaMemoryTrackerForMetrics.startTrackingAccumulationForSurface(i, false, 0);
                                                    }
                                                    SurfaceNativeMemTracker surfaceNativeMemTracker = this.A01;
                                                    if (surfaceNativeMemTracker != null) {
                                                        synchronized (C0Gj.class) {
                                                            C0Gj.A01 = true;
                                                            C0Gj.A03 = true;
                                                            C0Gj.A00();
                                                        }
                                                        surfaceNativeMemTracker.start(i);
                                                    }
                                                }
                                            }

                                            @Override // X.InterfaceC105444pF
                                            public final void ATm(int i) {
                                                long j;
                                                Map map = this.A02;
                                                Integer valueOf4 = Integer.valueOf(i);
                                                if (map.containsKey(valueOf4)) {
                                                    JavaMemoryTrackerForMetrics javaMemoryTrackerForMetrics = this.A00;
                                                    long j2 = 0;
                                                    if (javaMemoryTrackerForMetrics != null) {
                                                        j = javaMemoryTrackerForMetrics.stopTrackingAllocationsForSurface(i);
                                                        synchronized (C0Gj.class) {
                                                            C0Gj.A02 = false;
                                                            C0Gj.A00();
                                                        }
                                                    } else {
                                                        j = 0;
                                                    }
                                                    SurfaceNativeMemTracker surfaceNativeMemTracker = this.A01;
                                                    if (surfaceNativeMemTracker != null) {
                                                        j2 = surfaceNativeMemTracker.stop(i);
                                                        synchronized (C0Gj.class) {
                                                            C0Gj.A03 = false;
                                                            C0Gj.A00();
                                                        }
                                                    }
                                                    map.put(valueOf4, new Pair(Long.valueOf(j), Long.valueOf(j2)));
                                                }
                                            }
                                        });
                                    }
                                    C2RQ c2rq10 = anonymousClass147.A01;
                                    C14360o3.A0A(c2rq10);
                                    if (C18U.A06(c06090Tz, c2rq10.A00, 36312269156385828L)) {
                                        C2RQ c2rq11 = anonymousClass147.A01;
                                        C14360o3.A0A(c2rq11);
                                        String A04 = C18U.A04(c06090Tz, c2rq11.A00, 36875219109871682L);
                                        C2RQ c2rq12 = anonymousClass147.A01;
                                        C14360o3.A0A(c2rq12);
                                        Long valueOf4 = Long.valueOf(C18U.A01(c06090Tz, c2rq12.A00, 36593744133228010L));
                                        if (valueOf4 == null) {
                                            intValue4 = 0;
                                        } else {
                                            intValue4 = valueOf4.intValue();
                                        }
                                        C14360o3.A0A(anonymousClass147.A01);
                                        C14360o3.A0A(anonymousClass147.A01);
                                        C14360o3.A0A(anonymousClass147.A01);
                                        c105544pR = new C105544pR(A04, intValue4);
                                    } else {
                                        c105544pR = null;
                                    }
                                    C2RQ c2rq13 = anonymousClass147.A01;
                                    C14360o3.A0A(c2rq13);
                                    long A01 = C18U.A01(c06090Tz, c2rq13.A00, 36593744132179429L);
                                    long j = anonymousClass147.A02;
                                    C2RQ c2rq14 = anonymousClass147.A01;
                                    C14360o3.A0A(c2rq14);
                                    final C105574pU c105574pU = new C105574pU(handler, c105544pR, c006802i, hashSet, A01, j, A06, A062, C18U.A06(c06090Tz, c2rq14.A00, 36312269155992608L));
                                    if (A06) {
                                        C35795FrX c35795FrX = new C35795FrX(c105574pU);
                                        anonymousClass147.A00 = c35795FrX;
                                        C0L6.A02(c35795FrX);
                                        return;
                                    }
                                    C105584pV c105584pV = new C105584pV(c006802i);
                                    C2U1 c2u1 = C2U1.A03;
                                    if (c2u1 == null) {
                                        c2u1 = new C2U1();
                                        C2U1.A03 = c2u1;
                                    }
                                    c2u1.A00 = c105584pV;
                                    c105584pV.A02.add(new C105594pW(c105574pU));
                                    if (A062) {
                                        C0L6.A03(new C0L3() { // from class: X.4pX
                                            @Override // X.C0L3
                                            public final void Cwx() {
                                            }

                                            @Override // X.C0L3
                                            public final void Cx1() {
                                                boolean z;
                                                C105574pU c105574pU2 = C105574pU.this;
                                                synchronized (c105574pU2) {
                                                    z = c105574pU2.A01;
                                                }
                                                if (z) {
                                                    c105574pU2.A01();
                                                }
                                            }
                                        }, false);
                                        return;
                                    }
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                });
            }
        }
    }

    public AnonymousClass147(C211211o c211211o, long j) {
        this.A03 = c211211o;
        this.A02 = j;
    }
}
