package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.memorytimeline.MemoryTimeline;
import com.facebook.memorytimeline.maps.ProcMapsMemoryTimelineMetricsSource;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* renamed from: X.0Hk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03500Hk extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ C17090t4 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03500Hk(C211211o c211211o, C17090t4 c17090t4) {
        super(0);
        this.A00 = c211211o;
        this.A01 = c17090t4;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        final C17090t4 c17090t4 = this.A01;
        return new AbstractC211911v(c211211o, c17090t4) { // from class: X.146
            public final C211211o A00;
            public final C17090t4 A01;

            {
                C14360o3.A0B(c17090t4, 2);
                this.A00 = c211211o;
                this.A01 = c17090t4;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "IgMemoryTimelineInitializer";
            }

            /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, java.util.concurrent.Callable] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.concurrent.Callable] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.2R6] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, X.0IP] */
            /* JADX WARN: Type inference failed for: r1v24, types: [X.0JO, java.lang.Object] */
            @Override // X.AbstractC211911v
            public final void A07() {
                final UserSession userSession;
                ArrayList arrayList;
                InterfaceC49832Qt interfaceC49832Qt;
                C1TU c1tu;
                ArrayList arrayList2;
                MemoryTimeline memoryTimeline;
                long j;
                C04280Ku c04280Ku;
                C2RM c2rm;
                long j2;
                C04280Ku c04280Ku2;
                AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
                if ((A08 instanceof UserSession) && (userSession = (UserSession) A08) != null) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36310821754634552L)) {
                        final C2QQ c2qq = new C2QQ(new C2QP(userSession));
                        C17090t4 c17090t42 = this.A01;
                        HandlerThread handlerThread = new HandlerThread("MemoryTimeline");
                        AbstractC09770fa.A00(handlerThread);
                        handlerThread.start();
                        Looper looper = handlerThread.getLooper();
                        looper.getClass();
                        Handler handler = new Handler(looper);
                        C2QP c2qp = c2qq.A04;
                        int i = c2qp.A00;
                        if ((255 & i) == 2) {
                            C47495KyO c47495KyO = new C47495KyO(i);
                            arrayList = new ArrayList();
                            final Callable callable = new Callable() { // from class: X.2Qp
                                @Override // java.util.concurrent.Callable
                                public final /* bridge */ /* synthetic */ Object call() {
                                    return C0L6.A01();
                                }
                            };
                            final String str = "asl_session_id";
                            arrayList.add(new InterfaceC49832Qt(str, callable) { // from class: X.2Qr
                                public final String A00;
                                public final Callable A01;

                                @Override // X.InterfaceC49832Qt
                                public final String BKd() {
                                    return this.A00;
                                }

                                @Override // X.InterfaceC49832Qt
                                public final String getValue() {
                                    try {
                                        return (String) this.A01.call();
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                {
                                    this.A00 = str;
                                    this.A01 = callable;
                                }
                            });
                            final Callable callable2 = new Callable() { // from class: X.2Qu
                                @Override // java.util.concurrent.Callable
                                public final /* bridge */ /* synthetic */ Object call() {
                                    String A00 = C0L6.A00();
                                    if (A00.isEmpty()) {
                                        return null;
                                    }
                                    return A00;
                                }
                            };
                            final String str2 = "asl_endpoint";
                            arrayList.add(new InterfaceC49832Qt(str2, callable2) { // from class: X.2Qr
                                public final String A00;
                                public final Callable A01;

                                @Override // X.InterfaceC49832Qt
                                public final String BKd() {
                                    return this.A00;
                                }

                                @Override // X.InterfaceC49832Qt
                                public final String getValue() {
                                    try {
                                        return (String) this.A01.call();
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                {
                                    this.A00 = str2;
                                    this.A01 = callable2;
                                }
                            });
                            final Callable callable3 = new Callable() { // from class: X.2Qv
                                @Override // java.util.concurrent.Callable
                                public final /* bridge */ /* synthetic */ Object call() {
                                    if (C0L6.A04 != null) {
                                        boolean z = C0L6.A04.A05;
                                        if (Boolean.valueOf(z) != null) {
                                            return Boolean.toString(z);
                                        }
                                        return "unknown";
                                    }
                                    return "unknown";
                                }
                            };
                            final String str3 = TraceFieldType.IsForeground;
                            arrayList.add(new InterfaceC49832Qt(str3, callable3) { // from class: X.2Qr
                                public final String A00;
                                public final Callable A01;

                                @Override // X.InterfaceC49832Qt
                                public final String BKd() {
                                    return this.A00;
                                }

                                @Override // X.InterfaceC49832Qt
                                public final String getValue() {
                                    try {
                                        return (String) this.A01.call();
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                {
                                    this.A00 = str3;
                                    this.A01 = callable3;
                                }
                            });
                            final ?? obj = new Object();
                            final Callable callable4 = new Callable() { // from class: X.2Qx
                                @Override // java.util.concurrent.Callable
                                public final /* bridge */ /* synthetic */ Object call() {
                                    if (C2RU.A00.nextInt(1000) == 0) {
                                        return obj.call();
                                    }
                                    return null;
                                }
                            };
                            final String str4 = "all_thread_names";
                            arrayList.add(new InterfaceC49832Qt(str4, callable4) { // from class: X.2Qr
                                public final String A00;
                                public final Callable A01;

                                @Override // X.InterfaceC49832Qt
                                public final String BKd() {
                                    return this.A00;
                                }

                                @Override // X.InterfaceC49832Qt
                                public final String getValue() {
                                    try {
                                        return (String) this.A01.call();
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                {
                                    this.A00 = str4;
                                    this.A01 = callable4;
                                }
                            });
                            final String str5 = "java_object_counts";
                            final CallableC50045M7i callableC50045M7i = new CallableC50045M7i(c47495KyO);
                            interfaceC49832Qt = new InterfaceC49832Qt(str5, callableC50045M7i) { // from class: X.2Qr
                                public final String A00;
                                public final Callable A01;

                                @Override // X.InterfaceC49832Qt
                                public final String BKd() {
                                    return this.A00;
                                }

                                @Override // X.InterfaceC49832Qt
                                public final String getValue() {
                                    try {
                                        return (String) this.A01.call();
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                {
                                    this.A00 = str5;
                                    this.A01 = callableC50045M7i;
                                }
                            };
                        } else {
                            arrayList = new ArrayList();
                            final Callable callable5 = new Callable() { // from class: X.2Qp
                                @Override // java.util.concurrent.Callable
                                public final /* bridge */ /* synthetic */ Object call() {
                                    return C0L6.A01();
                                }
                            };
                            final String str6 = "asl_session_id";
                            arrayList.add(new InterfaceC49832Qt(str6, callable5) { // from class: X.2Qr
                                public final String A00;
                                public final Callable A01;

                                @Override // X.InterfaceC49832Qt
                                public final String BKd() {
                                    return this.A00;
                                }

                                @Override // X.InterfaceC49832Qt
                                public final String getValue() {
                                    try {
                                        return (String) this.A01.call();
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                {
                                    this.A00 = str6;
                                    this.A01 = callable5;
                                }
                            });
                            final Callable callable6 = new Callable() { // from class: X.2Qu
                                @Override // java.util.concurrent.Callable
                                public final /* bridge */ /* synthetic */ Object call() {
                                    String A00 = C0L6.A00();
                                    if (A00.isEmpty()) {
                                        return null;
                                    }
                                    return A00;
                                }
                            };
                            final String str7 = "asl_endpoint";
                            arrayList.add(new InterfaceC49832Qt(str7, callable6) { // from class: X.2Qr
                                public final String A00;
                                public final Callable A01;

                                @Override // X.InterfaceC49832Qt
                                public final String BKd() {
                                    return this.A00;
                                }

                                @Override // X.InterfaceC49832Qt
                                public final String getValue() {
                                    try {
                                        return (String) this.A01.call();
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                {
                                    this.A00 = str7;
                                    this.A01 = callable6;
                                }
                            });
                            final Callable callable7 = new Callable() { // from class: X.2Qv
                                @Override // java.util.concurrent.Callable
                                public final /* bridge */ /* synthetic */ Object call() {
                                    if (C0L6.A04 != null) {
                                        boolean z = C0L6.A04.A05;
                                        if (Boolean.valueOf(z) != null) {
                                            return Boolean.toString(z);
                                        }
                                        return "unknown";
                                    }
                                    return "unknown";
                                }
                            };
                            final String str8 = TraceFieldType.IsForeground;
                            arrayList.add(new InterfaceC49832Qt(str8, callable7) { // from class: X.2Qr
                                public final String A00;
                                public final Callable A01;

                                @Override // X.InterfaceC49832Qt
                                public final String BKd() {
                                    return this.A00;
                                }

                                @Override // X.InterfaceC49832Qt
                                public final String getValue() {
                                    try {
                                        return (String) this.A01.call();
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                {
                                    this.A00 = str8;
                                    this.A01 = callable7;
                                }
                            });
                            final ?? obj2 = new Object();
                            final Callable callable8 = new Callable() { // from class: X.2Qx
                                @Override // java.util.concurrent.Callable
                                public final /* bridge */ /* synthetic */ Object call() {
                                    if (C2RU.A00.nextInt(1000) == 0) {
                                        return obj2.call();
                                    }
                                    return null;
                                }
                            };
                            final String str9 = "all_thread_names";
                            interfaceC49832Qt = new InterfaceC49832Qt(str9, callable8) { // from class: X.2Qr
                                public final String A00;
                                public final Callable A01;

                                @Override // X.InterfaceC49832Qt
                                public final String BKd() {
                                    return this.A00;
                                }

                                @Override // X.InterfaceC49832Qt
                                public final String getValue() {
                                    try {
                                        return (String) this.A01.call();
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                {
                                    this.A00 = str9;
                                    this.A01 = callable8;
                                }
                            };
                        }
                        arrayList.add(interfaceC49832Qt);
                        C0E1 c0e1 = new C0E1(new C49882Qy());
                        HashSet hashSet = new HashSet();
                        hashSet.add(new C0TR() { // from class: X.2Qz
                            public final Runtime A00 = Runtime.getRuntime();

                            @Override // X.C0TR
                            public final Collection getDataPoints() {
                                ArrayList arrayList3 = new ArrayList(2);
                                C0TP c0tp = C0TP.A0V;
                                Runtime runtime = this.A00;
                                arrayList3.add(new C0TJ(c0tp, runtime.maxMemory() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED, (runtime.totalMemory() - runtime.freeMemory()) / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                arrayList3.add(new C0TJ(C0TP.A0U, runtime.maxMemory() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED, runtime.totalMemory() / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED));
                                return arrayList3;
                            }

                            @Override // X.C0TR
                            public final /* synthetic */ Map getIndexedDataPoints() {
                                return null;
                            }

                            @Override // X.C0TR
                            public final boolean shouldCollectMetrics(int i2) {
                                return (i2 & 1) != 0;
                            }

                            @Override // X.C0TR
                            public final /* synthetic */ boolean shouldCollectMetrics(int i2, C0TG c0tg) {
                                return C0TQ.A00(c0tg, this, i2);
                            }

                            @Override // X.C0TR
                            public final /* synthetic */ boolean supportsIndexedDataPoints() {
                                return false;
                            }
                        });
                        hashSet.add(new Object());
                        hashSet.add(new Object());
                        hashSet.add(new C2R2(c2qp.A02));
                        hashSet.add(new C0TR() { // from class: X.2R3
                            public final long[] A00 = new long[4];
                            public final C0TP[] A01;

                            @Override // X.C0TR
                            public final /* synthetic */ Map getIndexedDataPoints() {
                                return null;
                            }

                            @Override // X.C0TR
                            public final boolean shouldCollectMetrics(int i2) {
                                return (i2 & 1) != 0;
                            }

                            @Override // X.C0TR
                            public final boolean shouldCollectMetrics(int i2, C0TG c0tg) {
                                return (i2 & 1) != 0;
                            }

                            @Override // X.C0TR
                            public final /* synthetic */ boolean supportsIndexedDataPoints() {
                                return false;
                            }

                            @Override // X.C0TR
                            public final Collection getDataPoints() {
                                ArrayList arrayList3 = new ArrayList();
                                long[] jArr = this.A00;
                                AbstractC51822Zf.A00(jArr);
                                int i2 = 0;
                                do {
                                    arrayList3.add(new C0TJ(this.A01[i2], jArr[i2]));
                                    i2++;
                                } while (i2 < 4);
                                return arrayList3;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.0TP] */
                            {
                                String str10;
                                C0TP[] c0tpArr = new C0TP[4];
                                this.A01 = c0tpArr;
                                int i2 = 0;
                                do {
                                    C0TP c0tp = C0TP.A0I;
                                    if (i2 != 0) {
                                        if (i2 != 1) {
                                            if (i2 != 2) {
                                                if (i2 != 3) {
                                                    str10 = "unknown_gc_stat";
                                                } else {
                                                    str10 = "total_time_in_blocking_gc";
                                                }
                                            } else {
                                                str10 = "total_time_in_gc";
                                            }
                                        } else {
                                            str10 = "total_blocking_gc_count";
                                        }
                                    } else {
                                        str10 = "total_gc_count";
                                    }
                                    String str11 = c0tp.A02;
                                    Integer num = c0tp.A01;
                                    Integer num2 = c0tp.A00;
                                    ?? obj3 = new Object();
                                    obj3.A03 = "";
                                    obj3.A02 = str11;
                                    obj3.A01 = num;
                                    obj3.A00 = num2;
                                    obj3.A03 = str10;
                                    c0tpArr[i2] = obj3;
                                    i2++;
                                } while (i2 < 4);
                            }
                        });
                        if (c2qp.A04) {
                            hashSet.add(new C2R4());
                        }
                        if (c2qp.A06) {
                            boolean z = c2qp.A05;
                            C109994xT c109994xT = new C109994xT(z);
                            hashSet.add(c109994xT);
                            if (z) {
                                arrayList.add(c109994xT.A0E);
                            }
                        }
                        if (c2qp.A03) {
                            hashSet.add(new ProcMapsMemoryTimelineMetricsSource(true));
                        }
                        hashSet.add(new Object());
                        C03420Gu c03420Gu = C0J1.A00;
                        ?? obj3 = new Object();
                        obj3.A00 = Long.MIN_VALUE;
                        obj3.A01 = c03420Gu;
                        ?? obj4 = new Object();
                        obj4.A00 = obj3;
                        hashSet.add(obj4);
                        hashSet.add(new Object());
                        hashSet.add(new Object());
                        if (C18U.A06(c06090Tz, userSession, 36311680744948443L)) {
                            hashSet.add(new C0TR() { // from class: X.2RC
                                public final C2RD A00;

                                @Override // X.C0TR
                                public final Collection getDataPoints() {
                                    int i2;
                                    long j3;
                                    ArrayList arrayList3 = new ArrayList(4);
                                    C2RD c2rd = this.A00;
                                    synchronized (c2rd) {
                                        C2RG c2rg = c2rd.A01;
                                        i2 = c2rg.A00;
                                        j3 = c2rg.A01;
                                    }
                                    arrayList3.add(new C0TJ(C0TP.A0B, j3));
                                    arrayList3.add(new C0TJ(C0TP.A0A, i2));
                                    return arrayList3;
                                }

                                @Override // X.C0TR
                                public final /* synthetic */ Map getIndexedDataPoints() {
                                    return null;
                                }

                                @Override // X.C0TR
                                public final boolean shouldCollectMetrics(int i2) {
                                    return (i2 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0;
                                }

                                @Override // X.C0TR
                                public final /* synthetic */ boolean shouldCollectMetrics(int i2, C0TG c0tg) {
                                    return C0TQ.A00(c0tg, this, i2);
                                }

                                @Override // X.C0TR
                                public final /* synthetic */ boolean supportsIndexedDataPoints() {
                                    return false;
                                }

                                {
                                    if (C2RD.A06 == null) {
                                        C2RD c2rd = new C2RD(new C2RE(Executors.newSingleThreadExecutor()));
                                        C2RD.A06 = c2rd;
                                        this.A00 = c2rd;
                                        return;
                                    }
                                    throw new IllegalArgumentException("BitmapMemoryTimelineMetric has already been created!");
                                }
                            });
                            if (C18U.A06(c06090Tz, userSession, 36311680745013980L)) {
                                final Callable callable9 = new Callable() { // from class: X.4mr
                                    @Override // java.util.concurrent.Callable
                                    public final /* bridge */ /* synthetic */ Object call() {
                                        String obj5;
                                        C2RD c2rd = C2RD.A06;
                                        if (c2rd == null) {
                                            return null;
                                        }
                                        synchronized (c2rd) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("cur:");
                                            sb.append(c2rd.A03.A01);
                                            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                            for (C2RG c2rg : c2rd.A04.values()) {
                                                long j3 = c2rg.A01;
                                                if (j3 > 0) {
                                                    sb.append(c2rg.A02);
                                                    sb.append(":");
                                                    sb.append(j3);
                                                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                                }
                                            }
                                            if (sb.length() != 0) {
                                                obj5 = sb.toString();
                                            } else {
                                                obj5 = null;
                                            }
                                        }
                                        return obj5;
                                    }
                                };
                                final String str10 = "bitmap_accumulation";
                                arrayList.add(new InterfaceC49832Qt(str10, callable9) { // from class: X.2Qr
                                    public final String A00;
                                    public final Callable A01;

                                    @Override // X.InterfaceC49832Qt
                                    public final String BKd() {
                                        return this.A00;
                                    }

                                    @Override // X.InterfaceC49832Qt
                                    public final String getValue() {
                                        try {
                                            return (String) this.A01.call();
                                        } catch (Exception unused) {
                                            return null;
                                        }
                                    }

                                    {
                                        this.A00 = str10;
                                        this.A01 = callable9;
                                    }
                                });
                            }
                        }
                        if (C18U.A06(c06090Tz, userSession, 36313059429451469L)) {
                            hashSet.add(new C0TR(userSession) { // from class: X.4nf
                                public final UserSession A00;

                                @Override // X.C0TR
                                public final boolean shouldCollectMetrics(int i2) {
                                    return (i2 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0;
                                }

                                @Override // X.C0TR
                                public final /* synthetic */ boolean shouldCollectMetrics(int i2, C0TG c0tg) {
                                    return C0TQ.A00(c0tg, this, i2);
                                }

                                @Override // X.C0TR
                                public final Collection getDataPoints() {
                                    int i2;
                                    int i3;
                                    C96384Uw c96384Uw;
                                    InterfaceC96344Us AbB;
                                    UserSession userSession2 = this.A00;
                                    C41711wL A01 = C41711wL.A01(userSession2);
                                    C2BZ c2bz = A01.A00.A06;
                                    if (c2bz != null) {
                                        c2bz.A03();
                                    }
                                    C2BZ c2bz2 = A01.A00.A06;
                                    if (c2bz2 != null) {
                                        c2bz2.A03();
                                    }
                                    Pair pair = new Pair(0, 0);
                                    C0TP c0tp = C0TP.A15;
                                    C2BV c2bv = C41711wL.A01(userSession2).A00.A0c;
                                    synchronized (c2bv) {
                                        i2 = 0;
                                        for (C95794Sn c95794Sn : c2bv.A00.snapshot().values()) {
                                            if (c95794Sn.A19 != null && (c96384Uw = c95794Sn.A19.A09) != null && (AbB = c96384Uw.A00.AbB()) != null) {
                                                i3 = AbB.C9k();
                                            } else {
                                                i3 = 0;
                                            }
                                            i2 += i3;
                                        }
                                    }
                                    C0TJ[] c0tjArr = {new C0TJ(c0tp, -1L, i2 / 1024), new C0TJ(C0TP.A16, ((Number) pair.second).intValue() / 1024, ((Number) pair.first).intValue() / 1024)};
                                    C14360o3.A0B(c0tjArr, 0);
                                    return AbstractC009903n.A0I(c0tjArr);
                                }

                                @Override // X.C0TR
                                public final /* synthetic */ Map getIndexedDataPoints() {
                                    return null;
                                }

                                @Override // X.C0TR
                                public final /* synthetic */ boolean supportsIndexedDataPoints() {
                                    return false;
                                }

                                {
                                    this.A00 = userSession;
                                }
                            });
                        }
                        if (C18U.A06(c06090Tz, userSession, 36311977097691985L)) {
                            int intValue = Long.valueOf(C18U.A01(c06090Tz, userSession, 36593452074468680L)).intValue();
                            if (C2RI.A04 == null) {
                                C2RI.A04 = new C2RI(intValue);
                            } else {
                                throw new IllegalArgumentException("DialogTracker has already been created!");
                            }
                        }
                        if (c2qp.A07) {
                            final ?? obj5 = new Object();
                            hashSet.add(new C0TR(obj5) { // from class: X.40S
                                public C0B9 A00;
                                public long A01;
                                public final C0JO A02;

                                @Override // X.C0TR
                                public final boolean shouldCollectMetrics(int i2) {
                                    return (i2 & 64) != 0;
                                }

                                @Override // X.C0TR
                                public final /* synthetic */ boolean shouldCollectMetrics(int i2, C0TG c0tg) {
                                    return C0TQ.A00(c0tg, this, i2);
                                }

                                @Override // X.C0TR
                                public final /* synthetic */ Map getIndexedDataPoints() {
                                    return null;
                                }

                                @Override // X.C0TR
                                public final /* synthetic */ boolean supportsIndexedDataPoints() {
                                    return false;
                                }

                                {
                                    this.A02 = obj5;
                                }

                                @Override // X.C0TR
                                public final Collection getDataPoints() {
                                    C0B9 A00 = C0B9.A00();
                                    if (A00 == null) {
                                        return C16930sl.A00;
                                    }
                                    long now = this.A02.now();
                                    ArrayList arrayList3 = new ArrayList();
                                    C0B9 c0b9 = this.A00;
                                    if (c0b9 != null) {
                                        C0B9 A01 = A00.A01(c0b9);
                                        Integer num = C05F.A0Y;
                                        arrayList3.add(new C0TJ(new C0TP("read_chars", num), A01.A02));
                                        arrayList3.add(new C0TJ(new C0TP("write_chars", num), A01.A05));
                                        arrayList3.add(new C0TJ(new C0TP("read_bytes", num), A01.A01));
                                        arrayList3.add(new C0TJ(new C0TP("write_bytes", num), A01.A04));
                                        arrayList3.add(new C0TJ(new C0TP("read_syscalls", num), A01.A03));
                                        arrayList3.add(new C0TJ(new C0TP("write_syscalls", num), A01.A06));
                                        arrayList3.add(new C0TJ(new C0TP("cancelled_write_bytes", num), A01.A00));
                                        arrayList3.add(new C0TJ(new C0TP("time_since_last_report", C05F.A0N), now - this.A01));
                                    }
                                    this.A00 = A00;
                                    this.A01 = now;
                                    return arrayList3;
                                }
                            });
                        }
                        if (C18U.A06(c06090Tz, userSession, 36312020047496060L)) {
                            final C55J c55j = new C55J(c0e1, Long.valueOf(C18U.A01(c06090Tz, userSession, 36593495024141651L)).intValue());
                            hashSet.add(c55j);
                            final Callable callable10 = new Callable() { // from class: X.55K
                                @Override // java.util.concurrent.Callable
                                public final /* bridge */ /* synthetic */ Object call() {
                                    C55J c55j2 = c55j;
                                    C55J.A00(c55j2);
                                    String str11 = c55j2.A00;
                                    c55j2.A00 = null;
                                    return str11;
                                }
                            };
                            final String str11 = "window_accumulation";
                            arrayList.add(new InterfaceC49832Qt(str11, callable10) { // from class: X.2Qr
                                public final String A00;
                                public final Callable A01;

                                @Override // X.InterfaceC49832Qt
                                public final String BKd() {
                                    return this.A00;
                                }

                                @Override // X.InterfaceC49832Qt
                                public final String getValue() {
                                    try {
                                        return (String) this.A01.call();
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                {
                                    this.A00 = str11;
                                    this.A01 = callable10;
                                }
                            });
                        }
                        C2RK c2rk = new C2RK(handler, c0e1, arrayList, hashSet);
                        c2qq.A00 = c2rk;
                        boolean z2 = c2qp.A08;
                        synchronized (C1TU.class) {
                            c1tu = C1TU.A0C;
                            if (c1tu == null) {
                                c1tu = new C1TU(c2rk, userSession, c2qp, z2);
                                C1TU.A0C = c1tu;
                            }
                        }
                        c2qq.A01 = c1tu;
                        if (c2qp.A09) {
                            C2RK c2rk2 = (C2RK) c2qq.A00;
                            java.util.Set set = c2rk2.A0C;
                            synchronized (set) {
                                set.add(c1tu);
                            }
                            C2RK.A01(c2rk2);
                        }
                        if (c2qp.A0B) {
                            if (c2qp.A0C) {
                                int i2 = c2qp.A01;
                                if (i2 > 0 && new Random().nextInt(i2) == 0) {
                                    memoryTimeline = c2qq.A00;
                                    C006802i c006802i = C006802i.A0p;
                                    if (C0L6.A04 == null) {
                                        j2 = 0;
                                    } else {
                                        j2 = C0L6.A04.A00;
                                    }
                                    if (C0L6.A04 == null) {
                                        c04280Ku2 = null;
                                    } else {
                                        c04280Ku2 = C0L6.A04.A01;
                                    }
                                    c2rm = new C2RM(c04280Ku2, memoryTimeline, c006802i, j2);
                                }
                            } else {
                                memoryTimeline = c2qq.A00;
                                C006802i c006802i2 = C006802i.A0p;
                                if (C0L6.A04 == null) {
                                    j = 0;
                                } else {
                                    j = C0L6.A04.A00;
                                }
                                if (C0L6.A04 == null) {
                                    c04280Ku = null;
                                } else {
                                    c04280Ku = C0L6.A04.A01;
                                }
                                c2rm = new C2RM(c04280Ku, memoryTimeline, c006802i2, j);
                            }
                            memoryTimeline.AAR(c2rm);
                        }
                        c17090t42.A01(new C2RN(c2qq));
                        C0L6.A03(new C0L3() { // from class: X.2RP
                            @Override // X.C0L3
                            public final void Cx1() {
                                HashMap hashMap;
                                C2QQ c2qq2 = C2QQ.this;
                                C2RK c2rk3 = (C2RK) c2qq2.A00;
                                synchronized (c2rk3) {
                                    c2rk3.A04 = false;
                                }
                                C2RK.A02(c2rk3, true);
                                AbstractC25061Kk.A00().A09(c2qq2.A03);
                                C2R2.A02 = 0L;
                                C2QP c2qp2 = c2qq2.A04;
                                if (c2qp2.A09 && c2qp2.A0A) {
                                    try {
                                        C1TU c1tu2 = c2qq2.A01;
                                        C18920wW c18920wW = c1tu2.A06;
                                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "memory_red_v3");
                                        if (A00.isSampled()) {
                                            HashMap hashMap2 = new HashMap();
                                            synchronized (c1tu2.A08) {
                                                try {
                                                    hashMap = new HashMap(c1tu2.A08);
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            for (C0TU c0tu : hashMap.values()) {
                                                String str12 = c0tu.A09;
                                                HashMap hashMap3 = new HashMap();
                                                hashMap3.put("TIME_IN_ADDRESS_SPACE_RED_MS", Long.valueOf(c0tu.A01));
                                                hashMap3.put("TIME_IN_ADDRESS_SPACE_YELLOW_MS", Long.valueOf(c0tu.A02));
                                                hashMap3.put("TIME_IN_ADDRESS_SPACE_GREEN_MS", Long.valueOf(c0tu.A00));
                                                hashMap3.put("TIME_IN_JAVA_HEAP_RED_MS", Long.valueOf(c0tu.A04));
                                                hashMap3.put("TIME_IN_JAVA_HEAP_YELLOW_MS", Long.valueOf(c0tu.A05));
                                                hashMap3.put("TIME_IN_JAVA_HEAP_GREEN_MS", Long.valueOf(c0tu.A03));
                                                hashMap3.put("TIME_IN_SYSTEM_RED_MS", Long.valueOf(c0tu.A07));
                                                hashMap3.put("TIME_IN_SYSTEM_YELLOW_MS", Long.valueOf(c0tu.A08));
                                                hashMap3.put("TIME_IN_SYSTEM_GREEN_MS", Long.valueOf(c0tu.A06));
                                                hashMap2.put(str12, hashMap3);
                                            }
                                            A00.A9M("per_surface_status_times", hashMap2);
                                            A00.AAP("asl_session_id", C0L6.A01());
                                            A00.Cht();
                                            synchronized (c1tu2.A08) {
                                                try {
                                                    c1tu2.A05 = null;
                                                    c1tu2.A00 = 0L;
                                                    c1tu2.A08 = new HashMap();
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        C0K8.A05(C2QQ.class, "Error sending event. %s", e);
                                    }
                                }
                            }

                            @Override // X.C0L3
                            public final void Cwx() {
                                C0AT.A00();
                                C2R2.A02 = C0AT.A01[30];
                                C2QQ.this.A00();
                            }
                        }, true);
                        c2qq.A02 = true;
                        C2RK c2rk3 = (C2RK) c2qq.A00;
                        synchronized (c2rk3) {
                            c2rk3.A02 = true;
                        }
                        C2RK.A01(c2rk3);
                        MemoryTimeline memoryTimeline2 = c2qq.A00;
                        C14360o3.A0B(memoryTimeline2, 0);
                        if (AbstractC24921Jr.A01 == null) {
                            AbstractC24921Jr.A01 = memoryTimeline2;
                            List list = AbstractC24921Jr.A00;
                            synchronized (list) {
                                arrayList2 = new ArrayList(list);
                                list.clear();
                            }
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                InterfaceC24911Jq interfaceC24911Jq = (InterfaceC24911Jq) it.next();
                                MemoryTimeline memoryTimeline3 = AbstractC24921Jr.A01;
                                if (memoryTimeline3 != null) {
                                    interfaceC24911Jq.DSe(memoryTimeline3);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            MemoryTimeline memoryTimeline4 = c2qq.A00;
                            synchronized (C05920Tc.class) {
                                C05920Tc.A00 = memoryTimeline4;
                                List list2 = C05920Tc.A01;
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    InterfaceC05910Tb interfaceC05910Tb = (InterfaceC05910Tb) ((WeakReference) it2.next()).get();
                                    if (interfaceC05910Tb != null) {
                                        interfaceC05910Tb.DSd(C05920Tc.A00);
                                    }
                                }
                                list2.clear();
                            }
                            C1TU c1tu2 = c2qq.A01;
                            synchronized (C05900Ta.class) {
                                C05900Ta.A00 = c1tu2;
                                List list3 = C05900Ta.A01;
                                Iterator it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    C20250yy c20250yy = (C20250yy) ((WeakReference) it3.next()).get();
                                    if (c20250yy != null) {
                                        C0WL.A01(C05900Ta.A00, c20250yy.A00);
                                    }
                                }
                                list3.clear();
                            }
                            c2qq.A00();
                            C1TU A01 = C1TU.A01();
                            if (A01 != null) {
                                A01.A93(AbstractC25061Kk.A00());
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("MemoryTimeline has already been created");
                    }
                }
            }
        };
    }
}
