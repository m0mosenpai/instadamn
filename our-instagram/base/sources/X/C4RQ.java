package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4RQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RQ implements Handler.Callback {
    public long A00;
    public long A01;
    public C95544Ro A02;
    public C4RO A03;
    public C4RF A04;
    public C95444Re A05;
    public C4RD A06;
    public InterfaceC95434Rd A07;
    public HeroPlayerSetting A08;
    public String A09;
    public List A0A;
    public AtomicReference A0B;
    public boolean A0C;
    public boolean A0D;
    public final Handler A0E;
    public final C4RT A0F;
    public final C4RW A0G;
    public final C4RX A0H;
    public final Object A0I;
    public final Object A0J;
    public final Object A0K;
    public final List A0L;
    public final TreeMap A0M;
    public final AtomicReference A0N;
    public final long[] A0O;
    public volatile float A0P;
    public volatile float A0Q;
    public volatile int A0R;
    public volatile long A0S;
    public volatile long A0T;
    public volatile long A0U;
    public volatile long A0V;
    public volatile String A0W;
    public volatile boolean A0X;
    public volatile boolean A0Y;
    public static final AtomicLong A0c = new AtomicLong(0);
    public static final AtomicInteger A0b = new AtomicInteger();
    public static final java.util.Set A0Z = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public static final java.util.Set A0a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public static void A02(C4RQ c4rq, C4Y0 c4y0, EnumC117265Sl enumC117265Sl, String str, String str2, Throwable th) {
        A04(c4rq, str, th, new Object[0]);
        synchronized (c4rq.A0K) {
            C95544Ro c95544Ro = c4rq.A02;
            if (c95544Ro != null) {
                C4RU c4ru = (C4RU) c4rq.A0B.get();
                c95544Ro.A0I(new C117275Sm(c4y0, enumC117265Sl, str, ""), (C4RV) c4rq.A0N.get(), c4ru, str2);
            }
        }
        C4RW c4rw = c4rq.A0G;
        C4RU c4ru2 = (C4RU) c4rq.A0B.get();
        c4rw.DZ1(null, new C117275Sm(c4y0, enumC117265Sl, str, ""), (C4RV) c4rq.A0N.get(), c4ru2, str2);
    }

    public final void A0B() {
        A05(this, "play", new Object[0]);
        HeroPlayerSetting heroPlayerSetting = this.A08;
        C95544Ro c95544Ro = this.A02;
        if (c95544Ro != null && !heroPlayerSetting.A12.A0C) {
            C42351xP c42351xP = c95544Ro.A0C;
            if (!c42351xP.A0D || c42351xP.A0C) {
                c95544Ro.A0E();
            }
        }
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(2, -1L));
    }

    @Deprecated
    public final void A0C(int i) {
        A05(this, "seekTo: seekTimeMsWithPreview: %d", Integer.valueOf(i));
        this.A0T = i;
        this.A0U = A0c.incrementAndGet();
        this.A0V = SystemClock.elapsedRealtime();
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(4, new long[]{this.A0T, this.A0U, 0}));
    }

    public final void A0D(Surface surface) {
        int hashCode;
        if (surface == null) {
            hashCode = 0;
        } else {
            hashCode = surface.hashCode();
        }
        A05(this, "setSurface %x", Integer.valueOf(hashCode));
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(6, new Object[]{surface, -1, -1}));
        A0a.add(surface);
    }

    public final void A0E(C4SS c4ss) {
        C4AN c4an = c4ss.A0K;
        A05(this, "setVideoPlaybackParams: %s", c4an);
        Pair A01 = c4an.A01();
        if (!((Boolean) A01.first).booleanValue()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid video source");
            A02(this, C4Y0.A0e, EnumC117265Sl.A0Q, AnonymousClass001.A0R("Invalid video source: ", (String) A01.second), c4ss.A07, illegalArgumentException);
        } else {
            A05(this, "dash manifest: %s", c4an.A09);
            Handler handler = this.A0E;
            handler.sendMessage(handler.obtainMessage(1, c4ss));
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.4Re] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.4Re] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.4RX, java.lang.Object] */
    public C4RQ(Handler handler, Looper looper, C4RO c4ro, C4RF c4rf, C4RS c4rs, final C459529d c459529d, C4RD c4rd, HeroPlayerSetting heroPlayerSetting) {
        final HashSet hashSet = new HashSet();
        this.A0F = new C4RT(this);
        this.A0J = new Object();
        this.A0O = new long[]{0, 0};
        this.A0B = new AtomicReference(new C4RU());
        this.A0N = new AtomicReference(C4RV.A0D);
        this.A0L = new LinkedList();
        this.A0M = new TreeMap();
        this.A09 = "";
        this.A01 = -1L;
        this.A0C = false;
        this.A0S = 0L;
        this.A0P = 1.0f;
        this.A00 = -1L;
        this.A0A = new ArrayList();
        this.A0I = new Object();
        this.A0K = new Object();
        A05(this, "Create HeroPlayer", new Object[0]);
        this.A0E = new Handler(looper, this);
        C4RW c4rw = new C4RW(handler, c4rs);
        this.A0G = c4rw;
        ?? r1 = new C4RS(this, hashSet) { // from class: X.4RX
            public C98704bq A00;
            public C98704bq A01;
            public C5RJ A02;
            public C5RJ A03;
            public final WeakReference A04;
            public final C4RY A05;
            public final C95414Rb A06 = new C95414Rb(new Object() { // from class: X.4RZ
            }, new Object());
            public static final AtomicBoolean A08 = new AtomicBoolean(false);
            public static final LruCache A07 = new LruCache(200);

            @Override // X.C4RS
            public final /* synthetic */ void Cy0(C98704bq c98704bq) {
            }

            @Override // X.C4RS
            public final /* synthetic */ void D5g(String str, boolean z) {
            }

            @Override // X.C4RS
            public final void D9S(long j, String str, boolean z) {
            }

            @Override // X.C4RS
            public final void D9T(int i, int i2, int i3, int i4) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [X.4by, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v1, types: [X.4Tj, X.4bz] */
            @Override // X.C4RS
            public final void DBq(C98704bq c98704bq, String str, List list, long j, boolean z) {
                A02(null, null);
                String str2 = c98704bq.A0E;
                boolean z2 = true;
                if (str2 != null) {
                    boolean z3 = false;
                    if (str2.contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        z3 = true;
                    }
                    if (!str2.contains(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                        z2 = false;
                    }
                    if (z3 || z2) {
                        C4ZO A00 = A00(new Object());
                        this.A04.get();
                        this.A05.A05(new AbstractC96004Tj(A00));
                        if (z3) {
                            this.A01 = c98704bq;
                        }
                        if (z2) {
                            this.A00 = c98704bq;
                        }
                    }
                }
            }

            @Override // X.C4RS
            public final void DER(C117275Sm c117275Sm, String str, String str2, String str3, long j) {
            }

            @Override // X.C4RS
            public final /* synthetic */ void DIJ(String str, long j) {
            }

            @Override // X.C4RS
            public final /* synthetic */ void DLl(String str, byte[] bArr, long j) {
            }

            @Override // X.C4RS
            public final void DPI(boolean z) {
            }

            @Override // X.C4RS
            public final void DPK(String str, byte[] bArr, long j, long j2) {
            }

            @Override // X.C4RS
            public final /* synthetic */ void DPS(C68692VaS c68692VaS) {
            }

            @Override // X.C4RS
            public final /* synthetic */ void DTa(Object obj) {
            }

            @Override // X.C4RS
            public final void DVN(byte[] bArr, long j) {
            }

            @Override // X.C4RS
            public final /* synthetic */ void DY8(String str, String str2) {
            }

            @Override // X.C4RS
            public final /* synthetic */ void DZ0() {
            }

            @Override // X.C4RS
            public final void DZ1(C5n5 c5n5, C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str) {
                A02(c4ru, null);
                this.A05.A01(new Uta(c5n5, c117275Sm, c4rv, c4ru, str));
            }

            @Override // X.C4RS
            public final /* synthetic */ void DZ6(EnumC46692Ch enumC46692Ch) {
            }

            @Override // X.C4RS
            public final void DZA(C4RU c4ru, float f, long j) {
            }

            @Override // X.C4RS
            public final void DaU(long j, String str) {
            }

            @Override // X.C4RS
            public final void DaY() {
            }

            @Override // X.C4RS
            public final void Dny(C4RV c4rv, C4RU c4ru, String str, long j, boolean z, boolean z2) {
            }

            @Override // X.C4RS
            public final void Dou(long j, long j2, boolean z, boolean z2, boolean z3) {
            }

            @Override // X.C4RS
            public final /* synthetic */ void Dp7(C5n5 c5n5) {
            }

            @Override // X.C4RS
            public final void DpT(boolean z) {
            }

            @Override // X.C4RS
            public final void DtM(List list) {
            }

            @Override // X.C4RS
            public final void Duk(C117275Sm c117275Sm, C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, List list, long j) {
            }

            @Override // X.C4RS
            public final void Dzs() {
            }

            @Override // X.C4RS
            public final void Dzu(int i, int i2, float f) {
            }

            @Override // X.C4RS
            public final void E1K(boolean z, boolean z2) {
            }

            @Override // X.C4RS
            public final void onCues(List list) {
            }

            @Override // X.C4RS
            public final void onDrawnToSurface() {
            }

            @Override // X.C4RS
            public final void onSeeking(long j) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [X.4ZO] */
            private C4ZO A00(C98784by c98784by) {
                C98784by c98784by2;
                C98784by c98784by3;
                C98704bq c98704bq = this.A01;
                if (c98704bq == null) {
                    c98784by2 = 0;
                } else {
                    C14360o3.A0B(c98704bq.A0E, 2);
                    c98784by2 = new Object();
                }
                C98704bq c98704bq2 = this.A00;
                if (c98704bq2 == null) {
                    c98784by3 = 0;
                } else {
                    C14360o3.A0B(c98704bq2.A0E, 2);
                    c98784by3 = new Object();
                }
                return new Object(this.A03, this.A02, c98784by2, c98784by3, c98784by) { // from class: X.4ZO
                    public final C5RJ A00;
                    public final C5RJ A01;
                    public final C98784by A02;
                    public final C98784by A03;
                    public final C98784by A04;

                    {
                        this.A03 = c98784by2;
                        this.A02 = c98784by3;
                        this.A04 = c98784by;
                        this.A01 = r1;
                        this.A00 = r2;
                    }
                };
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, X.5RF] */
            private C5RH A01() {
                List list;
                C5RE c5re;
                ArrayList arrayList;
                C5RG c5rg;
                C95414Rb c95414Rb = this.A06;
                synchronized (c95414Rb) {
                    if (c95414Rb.A03 >= 0) {
                        AbstractC459729h.A01("StallTimeCalculation", "Must call .end() first", new Object[0]);
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - 1800000;
                    while (true) {
                        list = c95414Rb.A0B;
                        if (!(!list.isEmpty())) {
                            break;
                        }
                        C5RE c5re2 = (C5RE) list.get(0);
                        if (c5re2.A02 + c5re2.A00 > elapsedRealtime) {
                            break;
                        }
                        list.remove(0);
                    }
                    c5re = c95414Rb.A05;
                    arrayList = new ArrayList(list);
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        C14360o3.A07(it);
                        while (it.hasNext()) {
                            it.next();
                        }
                        C14360o3.A07(arrayList.get(0));
                    }
                }
                ?? obj = new Object();
                if (c5re != null) {
                    c5rg = new Object();
                } else {
                    c5rg = null;
                }
                LinkedList linkedList = new LinkedList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    linkedList.add(new Object());
                }
                return new C5RH(c5rg, obj, linkedList);
            }

            private Integer A02(C4RU c4ru, Integer num) {
                C4SS c4ss;
                C4RQ c4rq = (C4RQ) this.A04.get();
                if (c4rq != null) {
                    c4ss = c4rq.A0F.A07;
                } else {
                    c4ss = null;
                }
                if (c4ss != null) {
                    int ordinal = c4ss.A0K.A07.ordinal();
                    if (ordinal != 2) {
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                return C05F.A0C;
                            }
                        } else {
                            return C05F.A01;
                        }
                    } else {
                        return C05F.A0N;
                    }
                } else {
                    if (c4ru != null) {
                        try {
                            num = C5n6.A00(c4ru.A0M);
                            return num;
                        } catch (IllegalArgumentException | NullPointerException unused) {
                        }
                    }
                    if (num != null) {
                        return num;
                    }
                }
                return C05F.A00;
            }

            @Override // X.C4RS
            public final void Dyn(C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, long j, boolean z) {
                this.A06.A01();
                C5RH A01 = A01();
                A02(null, A02(c4ru, null));
                this.A05.A00(new C65795TuD(c4ru, A01, str, str3));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [X.5n9] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.5RF] */
            @Override // X.C4RS
            public final void Dyu(C5n5 c5n5, C4RV c4rv, C4RU c4ru, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
                C4RQ c4rq = (C4RQ) this.A04.get();
                if (c4rq != null) {
                    c4rq.A08();
                    c4rq.A07();
                }
                final C5RH c5rh = new C5RH(null, new Object(), Collections.emptyList());
                A02(null, num);
                final C4ZO A00 = A00(null);
                this.A05.A02(new AbstractC96004Tj(A00, c5rh) { // from class: X.5n9
                    public final C5RH A00;

                    {
                        this.A00 = c5rh;
                    }
                });
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [X.5tj] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.5RF] */
            @Override // X.C4RS
            public final void DzE(C5n5 c5n5, C4RV c4rv, final C4RU c4ru, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z) {
                C4RQ c4rq = (C4RQ) this.A04.get();
                if (c4rq != null) {
                    c4rq.A08();
                    c4rq.A07();
                }
                final C5RH c5rh = new C5RH(null, new Object(), Collections.emptyList());
                A02(null, num);
                final C4ZO A00 = A00(null);
                this.A05.A03(new AbstractC96004Tj(c4ru, A00, c5rh) { // from class: X.5tj
                    public final C4RU A00;
                    public final C5RH A01;

                    {
                        super(A00);
                        this.A00 = c4ru;
                        this.A01 = c5rh;
                    }
                });
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [X.4Tj, X.4Ti] */
            @Override // X.C4RS
            public final void Dzn() {
                long j;
                C4SS c4ss;
                String str;
                A08.compareAndSet(false, true);
                WeakReference weakReference = this.A04;
                C4RQ c4rq = (C4RQ) weakReference.get();
                if (c4rq != null) {
                    j = c4rq.A08();
                    c4rq.A07();
                } else {
                    j = -1;
                }
                C95414Rb c95414Rb = this.A06;
                c95414Rb.A00();
                synchronized (c95414Rb) {
                    if (j == -1) {
                        if (c95414Rb.A03 < 0) {
                            c95414Rb.A03 = SystemClock.elapsedRealtime();
                        }
                    } else if (c95414Rb.A03 < 0) {
                        c95414Rb.A03 = SystemClock.elapsedRealtime();
                        c95414Rb.A02 = j;
                    }
                }
                C4RQ c4rq2 = (C4RQ) weakReference.get();
                if (c4rq2 != null && (c4ss = c4rq2.A0F.A07) != null && (str = c4ss.A0K.A0G) != null) {
                    LruCache lruCache = A07;
                    synchronized (lruCache) {
                        lruCache.get(str);
                    }
                }
                A02(null, null);
                weakReference.get();
                this.A05.A06(new AbstractC96004Tj(null));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.5RJ] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.5RJ] */
            /* JADX WARN: Type inference failed for: r1v1, types: [X.5iK] */
            /* JADX WARN: Type inference failed for: r1v2, types: [X.5RI] */
            @Override // X.C4RS
            public final void E08(final C4RV c4rv, final C4RU c4ru, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
                C4SS c4ss;
                String str8;
                C4RQ c4rq = (C4RQ) this.A04.get();
                if (c4rq != null && (c4ss = c4rq.A0F.A07) != null && (str8 = c4ss.A0K.A0G) != null) {
                    this.A06.A01();
                    final C5RH A01 = A01();
                    boolean z3 = false;
                    LruCache lruCache = A07;
                    synchronized (lruCache) {
                        if (lruCache.get(str8) == null) {
                            z3 = true;
                        }
                        lruCache.put(str8, str8);
                    }
                    A02(c4ru, null);
                    final C4ZO A00 = A00(null);
                    if (z3) {
                        this.A05.A07(new AbstractC96004Tj(c4rv, c4ru, A00, A01) { // from class: X.5RI
                            public final C4RV A00;
                            public final C4RU A01;
                            public final C5RH A02;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(A00);
                                C14360o3.A0B(c4ru, 1);
                                C14360o3.A0B(c4rv, 2);
                                this.A01 = c4ru;
                                this.A00 = c4rv;
                                this.A02 = A01;
                            }
                        });
                    } else {
                        this.A05.A08(new AbstractC96004Tj(c4rv, c4ru, A00, A01) { // from class: X.5iK
                            public final C4RV A00;
                            public final C4RU A01;
                            public final C5RH A02;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(A00);
                                C14360o3.A0B(c4ru, 1);
                                C14360o3.A0B(c4rv, 2);
                                this.A01 = c4ru;
                                this.A00 = c4rv;
                                this.A02 = A01;
                            }
                        });
                    }
                    this.A03 = new Object();
                    this.A02 = new Object();
                }
            }

            @Override // X.C4RS
            public final void E1j(C117275Sm c117275Sm) {
                this.A04.get();
                this.A05.A04(new UtZ(c117275Sm));
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [X.4Ra, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v0, types: [X.4RZ] */
            {
                this.A05 = new C4RY(hashSet);
                this.A04 = new WeakReference(this);
            }
        };
        this.A0H = r1;
        c4rw.A00.add(r1);
        this.A04 = c4rf;
        if (c4rd != null) {
            this.A06 = c4rd;
            this.A08 = heroPlayerSetting;
            this.A0C |= heroPlayerSetting.A1y;
            this.A07 = new InterfaceC95434Rd(this) { // from class: X.4Rc
                public final WeakReference A00;

                @Override // X.InterfaceC95434Rd
                public final void Deb(boolean z, boolean z2) {
                    String str;
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null && c4rq.A0I()) {
                        if (z) {
                            str = "evicted";
                        } else {
                            str = "released";
                        }
                        C4RQ.A05(c4rq, "Service player was %s", str);
                        Handler handler2 = c4rq.A0E;
                        handler2.sendMessage(handler2.obtainMessage(12, new Object[]{Boolean.valueOf(z), false}));
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void Cy0(C98704bq c98704bq) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        if (c98704bq != null) {
                            C4RQ.A05(c4rq, "onAudioInputFormatChanged Channels: %d, SampleRate: %d", Integer.valueOf(c98704bq.A00), Integer.valueOf(c98704bq.A01));
                        }
                        c4rq.A0G.Cy0(c98704bq);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void D0a(C4RV c4rv, C4RU c4ru, boolean z) {
                    long j;
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A03(c4rq, c4ru, false);
                        C4RQ.A05(c4rq, "onBufferingStarted", new Object[0]);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        boolean z2 = false;
                        if (elapsedRealtime - c4rq.A0V < 500) {
                            z2 = true;
                        }
                        long j2 = c4rq.A01;
                        if (j2 != -1) {
                            j = elapsedRealtime - j2;
                        } else {
                            j = -1;
                        }
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != null) {
                            C14360o3.A0B(c4rv, 1);
                            if (c95544Ro.A0C.A0B) {
                                C95544Ro.A07(c95544Ro, c4rv, c4ru);
                            }
                        }
                        c4rq.A0G.Dny(c4rv, c4ru, c4rq.A09, j, z, z2);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void D0b(C4RU c4ru, boolean z) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A03(c4rq, c4ru, z);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void D23(C4RU c4ru, String str, String str2, String str3, String str4, long j, boolean z) {
                    DZK(c4ru);
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onCancelled", new Object[0]);
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != null) {
                            C4RV c4rv = (C4RV) c4rq.A0N.get();
                            C14360o3.A0B(c4rv, 1);
                            C14360o3.A0B(str4, 2);
                            if (c95544Ro.A0C.A0B) {
                                C95544Ro.A08(c95544Ro, c4rv, c4ru, str4);
                            }
                        }
                        c4rq.A0G.Dyn((C4RV) c4rq.A0N.get(), c4ru, str, str2, "", str4, j, z);
                        synchronized (c4rq.A05) {
                        }
                        c4rq.hashCode();
                        C4RT.A02(c4rq.A0F);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void D5g(String str, boolean z) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        C4RQ.A05(c4rq, "onCodecInitStart name: %s, isVideo %s", str, Boolean.valueOf(z));
                        c4rq.A0G.D5g(str, z);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void D6k(C4RU c4ru, String str, String str2, String str3, boolean z) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A03(c4rq, c4ru, false);
                        C4RQ.A05(c4rq, "onCompletion", new Object[0]);
                        C5n5 A0A = c4rq.A0A();
                        Integer A00 = C5n6.A00(c4ru.A0M);
                        if (c4ru.A0E > 0 || c4ru.A0O) {
                            c4ru.A0O = false;
                            c4ru.A0E = -1L;
                            c4ru.A0F = -1L;
                        }
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != null) {
                            C4RV c4rv = (C4RV) c4rq.A0N.get();
                            boolean z2 = c4rq.A0X;
                            C14360o3.A0B(c4rv, 1);
                            C14360o3.A0B(str3, 3);
                            if (c95544Ro.A0C.A0B) {
                                C95544Ro.A0B(c95544Ro, c4rv, c4ru, str3, z2);
                            }
                        }
                        c4rq.A0G.Dyu(A0A, (C4RV) c4rq.A0N.get(), c4ru, A00, str, str2, str3, z, c4rq.A0X);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void D9S(long j, String str, boolean z) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        C4RQ.A05(c4rq, "onDecoderInitialized name: %s, isVideo %s, duration: %d", str, Boolean.valueOf(z), Long.valueOf(j));
                        c4rq.A0G.D9S(j, str, z);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void D9T(int i, int i2, int i3, int i4) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        C4RQ.A05(c4rq, "onDecoderPerfReport avgDecodeTimeMsPerFrame: %d, width %d, height: %d, bitrate %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                        c4rq.A0G.D9T(i, i2, i3, i4);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DBp(C98704bq c98704bq, String str, List list, boolean z) {
                    String str2;
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        long A08 = c4rq.A08();
                        if (c98704bq != null) {
                            C4RQ.A05(c4rq, "onDownStreamFormatChanged Format: %s, bitrate: %d kbps, w: %d, h: %d", c98704bq.A0E, Integer.valueOf(c98704bq.A02 / 1000), Integer.valueOf(c98704bq.A05), Integer.valueOf(c98704bq.A04));
                        }
                        if (list != null) {
                            str2 = TextUtils.join(", ", list);
                        } else {
                            str2 = "<none>";
                        }
                        C4RQ.A05(c4rq, "onDownStreamFormatChanged customQualities: %s", str2);
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != null && c98704bq != null) {
                            C14360o3.A0B(str, 1);
                            if (c95544Ro.A0C.A0B) {
                                C95544Ro.A0C(c95544Ro, c98704bq);
                            }
                        }
                        c4rq.A0G.DBq(c98704bq, str, list, A08, z);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DEK(String str, String str2, String str3, String str4, String str5) {
                    C4Y0 c4y0;
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        EnumC117265Sl A00 = EnumC117265Sl.A00(str);
                        try {
                            c4y0 = C4Y0.valueOf(str2);
                        } catch (IllegalArgumentException | NullPointerException unused) {
                            c4y0 = C4Y0.A1Y;
                        }
                        C4RQ.A05(c4rq, "onError", new Object[0]);
                        if (c4y0 == C4Y0.A1D) {
                            Handler handler2 = c4rq.A0E;
                            handler2.sendMessage(handler2.obtainMessage(17, new String[]{A00.name(), "RESPONSE_CODE_410", str3, str4, str5}));
                        } else {
                            C95544Ro c95544Ro = c4rq.A02;
                            if (c95544Ro != null) {
                                C4RU c4ru = (C4RU) c4rq.A0B.get();
                                c95544Ro.A0I(new C117275Sm(c4y0, A00, str3, str4), (C4RV) c4rq.A0N.get(), c4ru, str5);
                            }
                            C4RW c4rw2 = c4rq.A0G;
                            C4RU c4ru2 = (C4RU) c4rq.A0B.get();
                            c4rw2.DZ1(null, new C117275Sm(c4y0, A00, str3, str4), (C4RV) c4rq.A0N.get(), c4ru2, str5);
                            synchronized (c4rq.A05) {
                            }
                        }
                        c4rq.hashCode();
                        C4RT.A02(c4rq.A0F);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DEQ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                    C4Y0 c4y0;
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        EnumC117265Sl A00 = EnumC117265Sl.A00(str);
                        try {
                            c4y0 = C4Y0.valueOf(str2);
                        } catch (IllegalArgumentException | NullPointerException unused) {
                            c4y0 = C4Y0.A1Y;
                        }
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        long A08 = c4rq.A08();
                        C4RQ.A05(c4rq, "onErrorRecoveryAttempt reason: %s", str6);
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != null) {
                            C117275Sm c117275Sm = new C117275Sm(c4y0, A00, str3, str4);
                            if (c95544Ro.A0C.A0B) {
                                C95544Ro.A06(c95544Ro, c117275Sm, "");
                            }
                        }
                        c4rq.A0G.DER(new C117275Sm(c4y0, A00, str3, str4), str5, str6, "", A08);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DIJ(String str, long j) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        c4rq.A0G.DIJ(str, j);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DLl(String str, byte[] bArr, long j) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onImfEventEmsgReceived", new Object[0]);
                        c4rq.A0G.DLl(str, bArr, j);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [X.4T2, X.0Zx] */
                @Override // X.InterfaceC95434Rd
                public final void DPI(boolean z) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onLiveBroadcastInterruptStatusChanged", new Object[0]);
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != 0 && c95544Ro.A0C.A0B) {
                            ?? c0Zx = new C0Zx();
                            c0Zx.A03("is_broadcast_interrupted", Boolean.valueOf(z));
                            c95544Ro.A0G(c0Zx);
                        }
                        c4rq.A0G.DPI(z);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DPK(String str, byte[] bArr, long j, long j2) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onLiveEmsg", new Object[0]);
                        c4rq.A0G.DPK(str, bArr, j, j2);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DPP(C4RV c4rv) {
                    int i;
                    C4RW c4rw2;
                    boolean z;
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        C4RQ c4rq2 = c4rq.A0F.A0D;
                        AtomicReference atomicReference = c4rq2.A0N;
                        synchronized (atomicReference) {
                            C4RV c4rv2 = (C4RV) atomicReference.get();
                            TreeMap treeMap = c4rq2.A0M;
                            if (treeMap.isEmpty() || (i = c4rv.A00) != c4rv2.A00) {
                                Long valueOf = Long.valueOf(c4rv.A09);
                                i = c4rv.A00;
                                treeMap.put(valueOf, Integer.valueOf(i));
                            }
                            if (c4rv2.A09 <= c4rv.A09) {
                                atomicReference.set(c4rv);
                            }
                            int i2 = c4rq2.A08.A0d;
                            int i3 = c4rv2.A00;
                            if (i3 >= i2 || i < i2) {
                                if (i3 >= i2 && i < i2) {
                                    c4rw2 = c4rq2.A0G;
                                    z = false;
                                }
                            } else {
                                c4rw2 = c4rq2.A0G;
                                z = true;
                            }
                            c4rw2.DpT(z);
                        }
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DPS(C68692VaS c68692VaS) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        synchronized (c4rq.A0I) {
                            c4rq.A0A.add(c68692VaS);
                        }
                        synchronized (c4rq.A0K) {
                            if (c4rq.A02 != null) {
                                C14360o3.A0B(c68692VaS, 0);
                            }
                        }
                        c4rq.A0G.DPS(c68692VaS);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DTa(Object obj) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onMetadataMsg", new Object[0]);
                        c4rq.A0G.DTa(obj);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DVN(byte[] bArr, long j) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onNewAudioData", new Object[0]);
                        c4rq.A0G.DVN(bArr, j);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DXx(C4RU c4ru, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A03(c4rq, c4ru, false);
                        long A00 = c4ru.A00();
                        C4RQ.A05(c4rq, "onPaused", new Object[0]);
                        C5n5 A0A = c4rq.A0A();
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != null) {
                            C4RV c4rv = (C4RV) c4rq.A0N.get();
                            C14360o3.A0B(c4rv, 1);
                            C14360o3.A0B(str5, 3);
                            if (c95544Ro.A0C.A0B) {
                                C95544Ro.A0A(c95544Ro, c4rv, c4ru, str5, A00);
                            }
                        }
                        c4rq.A0G.DzE(A0A, (C4RV) c4rq.A0N.get(), c4ru, C5n6.A00(c4ru.A0M), str, str2, str3, str4, str5, A00, j, z);
                        synchronized (c4rq.A05) {
                        }
                        c4rq.hashCode();
                        C4RT.A02(c4rq.A0F);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DY8(String str, String str2) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        if (!TextUtils.isEmpty(str)) {
                            c4rq.A0G.DY8(str, str2);
                        }
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DZ0() {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onPlaybackAboutToFinish", new Object[0]);
                        c4rq.A0G.DZ0();
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DZ6(EnumC46692Ch enumC46692Ch) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onPlaybackPositionReached", new Object[0]);
                        c4rq.A0G.DZ6(enumC46692Ch);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0, types: [X.4T2, X.0Zx] */
                @Override // X.InterfaceC95434Rd
                public final void DZ9(float f) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onPlaybackSpeedChanged", new Object[0]);
                        long A08 = c4rq.A08();
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != 0 && c95544Ro.A0C.A0B) {
                            ?? c0Zx = new C0Zx();
                            c0Zx.A04("playback_speed", Double.valueOf(f));
                            c95544Ro.A0G(c0Zx);
                        }
                        c4rq.A0G.DZA((C4RU) c4rq.A0B.get(), f, A08);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DZK(C4RU c4ru) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A03(c4rq, c4ru, false);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DaV(C4RU c4ru, String str) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A03(c4rq, c4ru, false);
                        long A00 = c4ru.A00();
                        C4RQ.A05(c4rq, "onPrepared", new Object[0]);
                        c4rq.A0G.DaU(A00, str);
                        synchronized (c4rq.A05) {
                        }
                        c4rq.hashCode();
                        C4RT.A02(c4rq.A0F);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void Dk1(C4RU c4ru, long j) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A03(c4rq, c4ru, false);
                        C4RQ.A05(c4rq, "onSeeking", new Object[0]);
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != null && c95544Ro.A0C.A0B) {
                            C95544Ro.A04(c95544Ro);
                        }
                        c4rq.A0G.onSeeking(j);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void Dkr(long j) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "setRebindServicePlayerListener: message not sent to internal player", new Object[0]);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DoK(C4RU c4ru, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A03(c4rq, c4ru, false);
                        C4RQ.A05(c4rq, "onStartedPlaying", new Object[0]);
                        C4RT c4rt = c4rq.A0F;
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != null) {
                            C4RV c4rv = (C4RV) c4rq.A0N.get();
                            C14360o3.A0B(c4rv, 1);
                            if (c95544Ro.A0C.A0B) {
                                C95544Ro.A09(c95544Ro, c4rv, c4ru, str4);
                            }
                        }
                        c4rq.A0G.E08((C4RV) c4rq.A0N.get(), c4ru, str, str2, str3, str4, str5, str6, str7, j, z, z2);
                        synchronized (c4rq.A05) {
                        }
                        c4rq.hashCode();
                        C4RT.A02(c4rt);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void DtM(List list) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onWarn", new Object[0]);
                        c4rq.A0G.DtM(list);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void Dul(C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
                    C4Y0 c4y0;
                    String str7;
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        EnumC117265Sl A00 = EnumC117265Sl.A00(str3);
                        try {
                            c4y0 = C4Y0.valueOf(str4);
                        } catch (IllegalArgumentException | NullPointerException unused) {
                            c4y0 = C4Y0.A1Y;
                        }
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        long A08 = c4rq.A08();
                        if (c98704bq != null && c98704bq2 != null) {
                            C4RQ.A05(c4rq, "onTrackSelectionFallback MimeType: %s, QualityLabel: %s, nextQualityLabel: %s, reason: %s, error: %s", c98704bq.A0E, c98704bq.A0B, c98704bq2.A0B, str2, str5);
                        }
                        if (list != null) {
                            str7 = TextUtils.join(", ", list);
                        } else {
                            str7 = "<none>";
                        }
                        C4RQ.A05(c4rq, "onTrackSelectionFallback customQualities: %s", str7);
                        c4rq.A0G.Duk(new C117275Sm(c4y0, A00, str5, str6), c98704bq, c98704bq2, str, str2, list, A08);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [X.4T2, X.0Zx] */
                @Override // X.InterfaceC95434Rd
                public final void Dzu(int i, int i2, float f) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        AtomicInteger atomicInteger = C4RQ.A0b;
                        C4RQ.A05(c4rq, "onVideoSizeChanged: w=%d, h=%d", Integer.valueOf(i), Integer.valueOf(i2));
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != 0 && c95544Ro.A0C.A0B) {
                            ?? c0Zx = new C0Zx();
                            c0Zx.A05("video_width", Long.valueOf(i));
                            c0Zx.A05("video_height", Long.valueOf(i2));
                            c95544Ro.A0G(c0Zx);
                        }
                        c4rq.A0G.Dzu(i, i2, f);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void E1k(String str, String str2, String str3) {
                    C4Y0 c4y0;
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        EnumC117265Sl A00 = EnumC117265Sl.A00(str);
                        try {
                            c4y0 = C4Y0.valueOf(str2);
                        } catch (IllegalArgumentException | NullPointerException unused) {
                            c4y0 = C4Y0.A1Y;
                        }
                        C4RQ.A05(c4rq, "onWarn", new Object[0]);
                        c4rq.A0G.E1j(new C117275Sm(c4y0, A00, str3));
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void onCues(List list) {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onCues", new Object[0]);
                        c4rq.A0G.onCues(list);
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void onDrawnToSurface() {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onDrawnToSurface", new Object[0]);
                        c4rq.A0G.onDrawnToSurface();
                    }
                }

                @Override // X.InterfaceC95434Rd
                public final void onStopped() {
                    C4RQ c4rq = (C4RQ) this.A00.get();
                    if (c4rq != null) {
                        C4RQ.A05(c4rq, "onStopped", new Object[0]);
                        c4rq.A0G.Dp7(c4rq.A0A());
                    }
                }

                {
                    this.A00 = new WeakReference(this);
                }
            };
            A0Z.add(this);
            this.A05 = new Object();
            this.A03 = c4ro;
            return;
        }
        this.A06 = new C4RD(new C4R2() { // from class: X.WYK
            @Override // X.C4R2
            public final C459529d AXY() {
                C459529d c459529d2 = C459529d.this;
                AtomicLong atomicLong = C4RQ.A0c;
                return c459529d2;
            }
        }, false);
        this.A08 = heroPlayerSetting;
        this.A0C |= heroPlayerSetting.A1y;
        this.A07 = new InterfaceC95434Rd(this) { // from class: X.4Rc
            public final WeakReference A00;

            @Override // X.InterfaceC95434Rd
            public final void Deb(boolean z, boolean z2) {
                String str;
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null && c4rq.A0I()) {
                    if (z) {
                        str = "evicted";
                    } else {
                        str = "released";
                    }
                    C4RQ.A05(c4rq, "Service player was %s", str);
                    Handler handler2 = c4rq.A0E;
                    handler2.sendMessage(handler2.obtainMessage(12, new Object[]{Boolean.valueOf(z), false}));
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void Cy0(C98704bq c98704bq) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    if (c98704bq != null) {
                        C4RQ.A05(c4rq, "onAudioInputFormatChanged Channels: %d, SampleRate: %d", Integer.valueOf(c98704bq.A00), Integer.valueOf(c98704bq.A01));
                    }
                    c4rq.A0G.Cy0(c98704bq);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void D0a(C4RV c4rv, C4RU c4ru, boolean z) {
                long j;
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A03(c4rq, c4ru, false);
                    C4RQ.A05(c4rq, "onBufferingStarted", new Object[0]);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z2 = false;
                    if (elapsedRealtime - c4rq.A0V < 500) {
                        z2 = true;
                    }
                    long j2 = c4rq.A01;
                    if (j2 != -1) {
                        j = elapsedRealtime - j2;
                    } else {
                        j = -1;
                    }
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != null) {
                        C14360o3.A0B(c4rv, 1);
                        if (c95544Ro.A0C.A0B) {
                            C95544Ro.A07(c95544Ro, c4rv, c4ru);
                        }
                    }
                    c4rq.A0G.Dny(c4rv, c4ru, c4rq.A09, j, z, z2);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void D0b(C4RU c4ru, boolean z) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A03(c4rq, c4ru, z);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void D23(C4RU c4ru, String str, String str2, String str3, String str4, long j, boolean z) {
                DZK(c4ru);
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onCancelled", new Object[0]);
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != null) {
                        C4RV c4rv = (C4RV) c4rq.A0N.get();
                        C14360o3.A0B(c4rv, 1);
                        C14360o3.A0B(str4, 2);
                        if (c95544Ro.A0C.A0B) {
                            C95544Ro.A08(c95544Ro, c4rv, c4ru, str4);
                        }
                    }
                    c4rq.A0G.Dyn((C4RV) c4rq.A0N.get(), c4ru, str, str2, "", str4, j, z);
                    synchronized (c4rq.A05) {
                    }
                    c4rq.hashCode();
                    C4RT.A02(c4rq.A0F);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void D5g(String str, boolean z) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    C4RQ.A05(c4rq, "onCodecInitStart name: %s, isVideo %s", str, Boolean.valueOf(z));
                    c4rq.A0G.D5g(str, z);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void D6k(C4RU c4ru, String str, String str2, String str3, boolean z) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A03(c4rq, c4ru, false);
                    C4RQ.A05(c4rq, "onCompletion", new Object[0]);
                    C5n5 A0A = c4rq.A0A();
                    Integer A00 = C5n6.A00(c4ru.A0M);
                    if (c4ru.A0E > 0 || c4ru.A0O) {
                        c4ru.A0O = false;
                        c4ru.A0E = -1L;
                        c4ru.A0F = -1L;
                    }
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != null) {
                        C4RV c4rv = (C4RV) c4rq.A0N.get();
                        boolean z2 = c4rq.A0X;
                        C14360o3.A0B(c4rv, 1);
                        C14360o3.A0B(str3, 3);
                        if (c95544Ro.A0C.A0B) {
                            C95544Ro.A0B(c95544Ro, c4rv, c4ru, str3, z2);
                        }
                    }
                    c4rq.A0G.Dyu(A0A, (C4RV) c4rq.A0N.get(), c4ru, A00, str, str2, str3, z, c4rq.A0X);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void D9S(long j, String str, boolean z) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    C4RQ.A05(c4rq, "onDecoderInitialized name: %s, isVideo %s, duration: %d", str, Boolean.valueOf(z), Long.valueOf(j));
                    c4rq.A0G.D9S(j, str, z);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void D9T(int i, int i2, int i3, int i4) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    C4RQ.A05(c4rq, "onDecoderPerfReport avgDecodeTimeMsPerFrame: %d, width %d, height: %d, bitrate %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                    c4rq.A0G.D9T(i, i2, i3, i4);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DBp(C98704bq c98704bq, String str, List list, boolean z) {
                String str2;
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    long A08 = c4rq.A08();
                    if (c98704bq != null) {
                        C4RQ.A05(c4rq, "onDownStreamFormatChanged Format: %s, bitrate: %d kbps, w: %d, h: %d", c98704bq.A0E, Integer.valueOf(c98704bq.A02 / 1000), Integer.valueOf(c98704bq.A05), Integer.valueOf(c98704bq.A04));
                    }
                    if (list != null) {
                        str2 = TextUtils.join(", ", list);
                    } else {
                        str2 = "<none>";
                    }
                    C4RQ.A05(c4rq, "onDownStreamFormatChanged customQualities: %s", str2);
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != null && c98704bq != null) {
                        C14360o3.A0B(str, 1);
                        if (c95544Ro.A0C.A0B) {
                            C95544Ro.A0C(c95544Ro, c98704bq);
                        }
                    }
                    c4rq.A0G.DBq(c98704bq, str, list, A08, z);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DEK(String str, String str2, String str3, String str4, String str5) {
                C4Y0 c4y0;
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    EnumC117265Sl A00 = EnumC117265Sl.A00(str);
                    try {
                        c4y0 = C4Y0.valueOf(str2);
                    } catch (IllegalArgumentException | NullPointerException unused) {
                        c4y0 = C4Y0.A1Y;
                    }
                    C4RQ.A05(c4rq, "onError", new Object[0]);
                    if (c4y0 == C4Y0.A1D) {
                        Handler handler2 = c4rq.A0E;
                        handler2.sendMessage(handler2.obtainMessage(17, new String[]{A00.name(), "RESPONSE_CODE_410", str3, str4, str5}));
                    } else {
                        C95544Ro c95544Ro = c4rq.A02;
                        if (c95544Ro != null) {
                            C4RU c4ru = (C4RU) c4rq.A0B.get();
                            c95544Ro.A0I(new C117275Sm(c4y0, A00, str3, str4), (C4RV) c4rq.A0N.get(), c4ru, str5);
                        }
                        C4RW c4rw2 = c4rq.A0G;
                        C4RU c4ru2 = (C4RU) c4rq.A0B.get();
                        c4rw2.DZ1(null, new C117275Sm(c4y0, A00, str3, str4), (C4RV) c4rq.A0N.get(), c4ru2, str5);
                        synchronized (c4rq.A05) {
                        }
                    }
                    c4rq.hashCode();
                    C4RT.A02(c4rq.A0F);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DEQ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                C4Y0 c4y0;
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    EnumC117265Sl A00 = EnumC117265Sl.A00(str);
                    try {
                        c4y0 = C4Y0.valueOf(str2);
                    } catch (IllegalArgumentException | NullPointerException unused) {
                        c4y0 = C4Y0.A1Y;
                    }
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    long A08 = c4rq.A08();
                    C4RQ.A05(c4rq, "onErrorRecoveryAttempt reason: %s", str6);
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != null) {
                        C117275Sm c117275Sm = new C117275Sm(c4y0, A00, str3, str4);
                        if (c95544Ro.A0C.A0B) {
                            C95544Ro.A06(c95544Ro, c117275Sm, "");
                        }
                    }
                    c4rq.A0G.DER(new C117275Sm(c4y0, A00, str3, str4), str5, str6, "", A08);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DIJ(String str, long j) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    c4rq.A0G.DIJ(str, j);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DLl(String str, byte[] bArr, long j) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onImfEventEmsgReceived", new Object[0]);
                    c4rq.A0G.DLl(str, bArr, j);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [X.4T2, X.0Zx] */
            @Override // X.InterfaceC95434Rd
            public final void DPI(boolean z) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onLiveBroadcastInterruptStatusChanged", new Object[0]);
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != 0 && c95544Ro.A0C.A0B) {
                        ?? c0Zx = new C0Zx();
                        c0Zx.A03("is_broadcast_interrupted", Boolean.valueOf(z));
                        c95544Ro.A0G(c0Zx);
                    }
                    c4rq.A0G.DPI(z);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DPK(String str, byte[] bArr, long j, long j2) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onLiveEmsg", new Object[0]);
                    c4rq.A0G.DPK(str, bArr, j, j2);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DPP(C4RV c4rv) {
                int i;
                C4RW c4rw2;
                boolean z;
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    C4RQ c4rq2 = c4rq.A0F.A0D;
                    AtomicReference atomicReference = c4rq2.A0N;
                    synchronized (atomicReference) {
                        C4RV c4rv2 = (C4RV) atomicReference.get();
                        TreeMap treeMap = c4rq2.A0M;
                        if (treeMap.isEmpty() || (i = c4rv.A00) != c4rv2.A00) {
                            Long valueOf = Long.valueOf(c4rv.A09);
                            i = c4rv.A00;
                            treeMap.put(valueOf, Integer.valueOf(i));
                        }
                        if (c4rv2.A09 <= c4rv.A09) {
                            atomicReference.set(c4rv);
                        }
                        int i2 = c4rq2.A08.A0d;
                        int i3 = c4rv2.A00;
                        if (i3 >= i2 || i < i2) {
                            if (i3 >= i2 && i < i2) {
                                c4rw2 = c4rq2.A0G;
                                z = false;
                            }
                        } else {
                            c4rw2 = c4rq2.A0G;
                            z = true;
                        }
                        c4rw2.DpT(z);
                    }
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DPS(C68692VaS c68692VaS) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    synchronized (c4rq.A0I) {
                        c4rq.A0A.add(c68692VaS);
                    }
                    synchronized (c4rq.A0K) {
                        if (c4rq.A02 != null) {
                            C14360o3.A0B(c68692VaS, 0);
                        }
                    }
                    c4rq.A0G.DPS(c68692VaS);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DTa(Object obj) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onMetadataMsg", new Object[0]);
                    c4rq.A0G.DTa(obj);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DVN(byte[] bArr, long j) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onNewAudioData", new Object[0]);
                    c4rq.A0G.DVN(bArr, j);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DXx(C4RU c4ru, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A03(c4rq, c4ru, false);
                    long A00 = c4ru.A00();
                    C4RQ.A05(c4rq, "onPaused", new Object[0]);
                    C5n5 A0A = c4rq.A0A();
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != null) {
                        C4RV c4rv = (C4RV) c4rq.A0N.get();
                        C14360o3.A0B(c4rv, 1);
                        C14360o3.A0B(str5, 3);
                        if (c95544Ro.A0C.A0B) {
                            C95544Ro.A0A(c95544Ro, c4rv, c4ru, str5, A00);
                        }
                    }
                    c4rq.A0G.DzE(A0A, (C4RV) c4rq.A0N.get(), c4ru, C5n6.A00(c4ru.A0M), str, str2, str3, str4, str5, A00, j, z);
                    synchronized (c4rq.A05) {
                    }
                    c4rq.hashCode();
                    C4RT.A02(c4rq.A0F);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DY8(String str, String str2) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    if (!TextUtils.isEmpty(str)) {
                        c4rq.A0G.DY8(str, str2);
                    }
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DZ0() {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onPlaybackAboutToFinish", new Object[0]);
                    c4rq.A0G.DZ0();
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DZ6(EnumC46692Ch enumC46692Ch) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onPlaybackPositionReached", new Object[0]);
                    c4rq.A0G.DZ6(enumC46692Ch);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [X.4T2, X.0Zx] */
            @Override // X.InterfaceC95434Rd
            public final void DZ9(float f) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onPlaybackSpeedChanged", new Object[0]);
                    long A08 = c4rq.A08();
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != 0 && c95544Ro.A0C.A0B) {
                        ?? c0Zx = new C0Zx();
                        c0Zx.A04("playback_speed", Double.valueOf(f));
                        c95544Ro.A0G(c0Zx);
                    }
                    c4rq.A0G.DZA((C4RU) c4rq.A0B.get(), f, A08);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DZK(C4RU c4ru) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A03(c4rq, c4ru, false);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DaV(C4RU c4ru, String str) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A03(c4rq, c4ru, false);
                    long A00 = c4ru.A00();
                    C4RQ.A05(c4rq, "onPrepared", new Object[0]);
                    c4rq.A0G.DaU(A00, str);
                    synchronized (c4rq.A05) {
                    }
                    c4rq.hashCode();
                    C4RT.A02(c4rq.A0F);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void Dk1(C4RU c4ru, long j) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A03(c4rq, c4ru, false);
                    C4RQ.A05(c4rq, "onSeeking", new Object[0]);
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != null && c95544Ro.A0C.A0B) {
                        C95544Ro.A04(c95544Ro);
                    }
                    c4rq.A0G.onSeeking(j);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void Dkr(long j) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "setRebindServicePlayerListener: message not sent to internal player", new Object[0]);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DoK(C4RU c4ru, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A03(c4rq, c4ru, false);
                    C4RQ.A05(c4rq, "onStartedPlaying", new Object[0]);
                    C4RT c4rt = c4rq.A0F;
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != null) {
                        C4RV c4rv = (C4RV) c4rq.A0N.get();
                        C14360o3.A0B(c4rv, 1);
                        if (c95544Ro.A0C.A0B) {
                            C95544Ro.A09(c95544Ro, c4rv, c4ru, str4);
                        }
                    }
                    c4rq.A0G.E08((C4RV) c4rq.A0N.get(), c4ru, str, str2, str3, str4, str5, str6, str7, j, z, z2);
                    synchronized (c4rq.A05) {
                    }
                    c4rq.hashCode();
                    C4RT.A02(c4rt);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void DtM(List list) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onWarn", new Object[0]);
                    c4rq.A0G.DtM(list);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void Dul(C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
                C4Y0 c4y0;
                String str7;
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    EnumC117265Sl A00 = EnumC117265Sl.A00(str3);
                    try {
                        c4y0 = C4Y0.valueOf(str4);
                    } catch (IllegalArgumentException | NullPointerException unused) {
                        c4y0 = C4Y0.A1Y;
                    }
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    long A08 = c4rq.A08();
                    if (c98704bq != null && c98704bq2 != null) {
                        C4RQ.A05(c4rq, "onTrackSelectionFallback MimeType: %s, QualityLabel: %s, nextQualityLabel: %s, reason: %s, error: %s", c98704bq.A0E, c98704bq.A0B, c98704bq2.A0B, str2, str5);
                    }
                    if (list != null) {
                        str7 = TextUtils.join(", ", list);
                    } else {
                        str7 = "<none>";
                    }
                    C4RQ.A05(c4rq, "onTrackSelectionFallback customQualities: %s", str7);
                    c4rq.A0G.Duk(new C117275Sm(c4y0, A00, str5, str6), c98704bq, c98704bq2, str, str2, list, A08);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [X.4T2, X.0Zx] */
            @Override // X.InterfaceC95434Rd
            public final void Dzu(int i, int i2, float f) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    AtomicInteger atomicInteger = C4RQ.A0b;
                    C4RQ.A05(c4rq, "onVideoSizeChanged: w=%d, h=%d", Integer.valueOf(i), Integer.valueOf(i2));
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != 0 && c95544Ro.A0C.A0B) {
                        ?? c0Zx = new C0Zx();
                        c0Zx.A05("video_width", Long.valueOf(i));
                        c0Zx.A05("video_height", Long.valueOf(i2));
                        c95544Ro.A0G(c0Zx);
                    }
                    c4rq.A0G.Dzu(i, i2, f);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void E1k(String str, String str2, String str3) {
                C4Y0 c4y0;
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    EnumC117265Sl A00 = EnumC117265Sl.A00(str);
                    try {
                        c4y0 = C4Y0.valueOf(str2);
                    } catch (IllegalArgumentException | NullPointerException unused) {
                        c4y0 = C4Y0.A1Y;
                    }
                    C4RQ.A05(c4rq, "onWarn", new Object[0]);
                    c4rq.A0G.E1j(new C117275Sm(c4y0, A00, str3));
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void onCues(List list) {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onCues", new Object[0]);
                    c4rq.A0G.onCues(list);
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void onDrawnToSurface() {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onDrawnToSurface", new Object[0]);
                    c4rq.A0G.onDrawnToSurface();
                }
            }

            @Override // X.InterfaceC95434Rd
            public final void onStopped() {
                C4RQ c4rq = (C4RQ) this.A00.get();
                if (c4rq != null) {
                    C4RQ.A05(c4rq, "onStopped", new Object[0]);
                    c4rq.A0G.Dp7(c4rq.A0A());
                }
            }

            {
                this.A00 = new WeakReference(this);
            }
        };
        A0Z.add(this);
        this.A05 = new Object();
        this.A03 = c4ro;
        this.A0F.A08 = c459529d;
    }

    public static void A01(C4RQ c4rq) {
        C95544Ro c95544Ro = c4rq.A02;
        if (c95544Ro != null && c4rq.A08.A12.A0C) {
            C42351xP c42351xP = c95544Ro.A0C;
            if (!c42351xP.A0D || c42351xP.A0C) {
                c95544Ro.A0E();
            }
        }
        c4rq.A0G.Dzn();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r0.isValid() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C4RQ r23, X.C4RU r24, boolean r25) {
        /*
            r4 = r23
            X.4RT r5 = r4.A0F
            r6 = r24
            X.C4RT.A06(r5, r6)
            long r7 = r6.A0E
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L74
            long r1 = r6.A0F
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L74
            long r13 = r6.A00()
            long r2 = r6.A0E
            long r0 = r6.A0F
            boolean r7 = r6.A0Q
            r18 = r7 ^ 1
            boolean r7 = r6.A0N
            java.lang.String r9 = "onBufferingStopped, %dms"
            long r15 = r0 - r2
            java.lang.Long r8 = java.lang.Long.valueOf(r15)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            A05(r4, r9, r8)
            r11 = 20
            long r9 = r2 + r11
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L5e
            java.util.List r8 = r4.A0L
            monitor-enter(r8)
            X.4c8 r9 = new X.4c8     // Catch: java.lang.Throwable -> L5b
            r22 = r0
            r24 = r7
            r19 = r9
            r20 = r2
            r19.<init>(r20, r22, r24)     // Catch: java.lang.Throwable -> L5b
            r8.add(r9)     // Catch: java.lang.Throwable -> L5b
            long r0 = r4.A00     // Catch: java.lang.Throwable -> L5b
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L59
            r4.A00 = r13     // Catch: java.lang.Throwable -> L5b
        L59:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5b
            goto L5e
        L5b:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5b
            throw r0
        L5e:
            X.4Ro r1 = r4.A02
            if (r1 == 0) goto L6b
            X.1xP r0 = r1.A0C
            boolean r0 = r0.A0B
            if (r0 == 0) goto L6b
            X.C95544Ro.A05(r1, r13, r7)
        L6b:
            X.4RW r12 = r4.A0G
            r17 = r25
            r19 = r7
            r12.Dou(r13, r15, r17, r18, r19)
        L74:
            boolean r0 = r4.A0D
            boolean r3 = r6.A0R
            if (r0 == r3) goto L95
            r4.A0D = r3
            android.view.Surface r0 = r5.A0C
            if (r0 == 0) goto L87
            boolean r0 = r0.isValid()
            r2 = 1
            if (r0 != 0) goto L88
        L87:
            r2 = 0
        L88:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "onVisualPlayStateChanged"
            A05(r4, r0, r1)
            X.4RW r0 = r4.A0G
            r0.E1K(r3, r2)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4RQ.A03(X.4RQ, X.4RU, boolean):void");
    }

    public static void A04(C4RQ c4rq, String str, Throwable th, Object... objArr) {
        if (c4rq.A0C) {
            StringBuilder sb = new StringBuilder();
            sb.append(c4rq.hashCode());
            sb.append(", playerId[");
            sb.append(c4rq.A0S);
            sb.append("]: ");
            sb.append(str);
            sb.append(", message = ");
            sb.append(th.getMessage());
            android.util.Log.e("HeroPlayer", String.format(sb.toString(), objArr), th);
        }
    }

    public static void A05(C4RQ c4rq, String str, Object... objArr) {
        if (c4rq.A0C) {
            StringBuilder sb = new StringBuilder();
            sb.append(c4rq.hashCode());
            sb.append(", playerId[");
            sb.append(c4rq.A0S);
            sb.append("]: ");
            sb.append(str);
            AbstractC459729h.A02("HeroPlayer", sb.toString(), objArr);
        }
    }

    public final long A09() {
        long j = ((C4RU) this.A0B.get()).A0U;
        if (j < 0) {
            return -1L;
        }
        return j;
    }

    public final C5n5 A0A() {
        long j;
        int i;
        int i2;
        List<C98884c8> list = this.A0L;
        synchronized (list) {
            j = 0;
            i = 0;
            i2 = 0;
            for (C98884c8 c98884c8 : list) {
                long j2 = c98884c8.A00;
                long j3 = c98884c8.A01;
                if (j2 > j3 && j3 > 0 && j2 > 0) {
                    long j4 = j2 - j3;
                    j += j4;
                    i++;
                    C4SS c4ss = this.A0F.A07;
                    if (c4ss != null && c4ss.A0K.A03()) {
                        AbstractC459729h.A04(this.A0M, this.A08.A0d, j3, j2);
                    }
                    if (j4 > 200) {
                        i2++;
                    }
                } else {
                    A04(this, "stallStartMs = %d, stallEndMs = %d", new IllegalStateException("Start stall time is greater or equal to end stall time"), Long.valueOf(j3), Long.valueOf(j2));
                }
            }
            list.clear();
            this.A0M.clear();
            this.A00 = -1L;
        }
        return new C5n5(i, i2, j);
    }

    public final void A0F(String str) {
        A05(this, "pause", new Object[0]);
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(3, str));
        synchronized (this.A0K) {
            C95544Ro c95544Ro = this.A02;
            if (c95544Ro != null) {
                c95544Ro.A0F(A08(), str);
            }
        }
    }

    public final boolean A0I() {
        if (this.A0S == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x03b2, code lost:
    
        if (r7 == null) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r4.get(r8.A07) != null) goto L20;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0ef7: IGET (r4 I:X.4RQ) = (r7 I:X.4RT) (LINE:3831) X.4RT.A0D X.4RQ, block:B:648:0x0ef7 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0fa2: IGET (r4 I:X.4RQ) = (r7 I:X.4RT) (LINE:4002) X.4RT.A0D X.4RQ, block:B:644:0x0fa2 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0fbc A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.4RT] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.4RT] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r31) {
        /*
            Method dump skipped, instructions count: 4132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4RQ.handleMessage(android.os.Message):boolean");
    }

    private long A00() {
        if (A0I()) {
            C4RU c4ru = (C4RU) this.A0B.get();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (c4ru.A0Q && !c4ru.A0O) {
                return elapsedRealtime - c4ru.A0H;
            }
            return 0L;
        }
        return 0L;
    }

    public final long A06() {
        if (!A0I()) {
            return 0L;
        }
        if (this.A0Y && SystemClock.elapsedRealtime() - this.A0V <= 1000) {
            return this.A0T;
        }
        return ((C4RU) this.A0B.get()).A08 + A00();
    }

    public final long A07() {
        if (A0I()) {
            return ((C4RU) this.A0B.get()).A0B;
        }
        return 0L;
    }

    public final long A08() {
        C4SS c4ss;
        if (!A0I()) {
            return 0L;
        }
        C4RT c4rt = this.A0F;
        if (c4rt.A07 == null || !this.A0Y || SystemClock.elapsedRealtime() - this.A0V > 1000 || ((c4ss = c4rt.A07) != null && c4ss.A0K.A03())) {
            return ((C4RU) this.A0B.get()).A00() + A00();
        }
        return this.A0T;
    }

    public final void A0G(String str, float f) {
        Float valueOf = Float.valueOf(f);
        A05(this, "setVolume %f, trigger: %s", valueOf, str);
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(5, new Object[]{valueOf, str}));
    }

    public final void A0H(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        A05(this, "setLooping: %s", valueOf);
        Handler handler = this.A0E;
        handler.sendMessage(handler.obtainMessage(19, valueOf));
    }

    public final boolean A0J() {
        if (A0I() && ((C4RU) this.A0B.get()).A0Q) {
            return true;
        }
        return false;
    }
}
