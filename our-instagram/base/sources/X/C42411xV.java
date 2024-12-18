package X;

import android.content.Context;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.uigraph.UiGraph;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1xV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42411xV implements InterfaceC13050lr, InterfaceC42421xW, InterfaceC42441xY, InterfaceC42451xZ {
    public static final Integer A0F = -1;
    public C70780Wgt A00;
    public C42891yH A01;
    public final Context A02;
    public final C1CQ A03;
    public final UserSession A04;
    public final C42851yD A05;
    public final C42941yM A06;
    public final C42621xq A07;
    public final C42841yC A08;
    public final C42571xl A09;
    public final C42521xg A0A;
    public final InterfaceC42731y1 A0B;
    public final C42511xf A0C;
    public final InterfaceC41501vz A0D;
    public final C42611xp A0E;

    public static void A02(C42411xV c42411xV, C3ZO c3zo, String str) {
        if (C9BP.A00(c3zo, 1)) {
            c42411xV.A05((C43121yf) ((C9BP) c3zo).A03, str);
            return;
        }
        if (C9BP.A00(c3zo, 0)) {
            Iterator it = ((List) ((C9BP) c3zo).A03).iterator();
            while (it.hasNext()) {
                c42411xV.A05((C43121yf) it.next(), str);
            }
        } else {
            if (c3zo instanceof C902940o) {
                Iterator it2 = ((C902940o) c3zo).A02.iterator();
                while (it2.hasNext()) {
                    c42411xV.A05((C43121yf) it2.next(), str);
                }
                return;
            }
            throw new IllegalArgumentException("Unsupported UiGraphNodeParams");
        }
    }

    public final void A07(C3AR c3ar, C3AX c3ax, String str) {
        C11T.A00();
        C42571xl c42571xl = this.A09;
        synchronized (c42571xl) {
            if (c42571xl.A00.A08) {
                Map map = c42571xl.A02;
                C3AY c3ay = (C3AY) map.get(str);
                if (c3ay == null) {
                    c3ay = new C3AY(c3ax, new AtomicInteger(0));
                    map.put(str, c3ay);
                }
                AtomicInteger atomicInteger = (AtomicInteger) c3ay.A01;
                atomicInteger.getClass();
                atomicInteger.incrementAndGet();
            } else {
                c42571xl.A02.put(str, new C3AY(c3ax, new AtomicInteger(1)));
            }
            c42571xl.A03.put(str, c3ar);
        }
        this.A0B.EDb(str, -1);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.1yC] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.1yD] */
    public C42411xV(Context context, UserSession userSession) {
        InterfaceC42731y1 c42711xz;
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.1xd
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1557320075);
                int A032 = C0f9.A03(1524596208);
                C11T.A00();
                C11T.A00();
                C0f9.A0A(890643790, A032);
                C0f9.A0A(51967640, A03);
            }
        };
        this.A0D = interfaceC41501vz;
        final C42511xf c42511xf = new C42511xf();
        this.A0C = c42511xf;
        this.A02 = context;
        this.A04 = userSession;
        final C42521xg c42521xg = new C42521xg(userSession);
        this.A0A = c42521xg;
        final C42571xl c42571xl = new C42571xl(c42521xg);
        this.A09 = c42571xl;
        this.A0E = new C42611xp(userSession);
        this.A07 = new C42621xq(userSession, c42571xl);
        C41451vu.A01.A02(interfaceC41501vz, C42661xu.class);
        synchronized (C42681xw.class) {
        }
        if (c42521xg.A06.A02) {
            c42711xz = new C49548Lv2(context, userSession, c42571xl, c42521xg, C42771y5.A00, new C49549Lv3(this));
        } else {
            c42711xz = new C42711xz(context, userSession, c42571xl, new C42701xy(this), c42521xg);
        }
        this.A0B = c42711xz;
        final C42821yA c42821yA = new C42821yA(this);
        this.A08 = new Object(c42571xl, c42821yA, c42521xg) { // from class: X.1yC
            public InterfaceC42591xn A00;
            public final C42821yA A01;
            public final C42521xg A02;
            public final HashSet A03 = new HashSet();

            {
                this.A02 = c42521xg;
                this.A00 = c42571xl;
                this.A01 = c42821yA;
            }
        };
        this.A05 = new InterfaceC42861yE(c42571xl, c42821yA, c42521xg, c42511xf) { // from class: X.1yD
            public InterfaceC42591xn A00;
            public C42821yA A01;
            public C42521xg A02;
            public C42511xf A03;
            public final Random A04 = new Random();

            /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
            @Override // X.InterfaceC42861yE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final synchronized void DLa(X.C1QW r7, X.C1QY r8, boolean r9) {
                /*
                    r6 = this;
                    monitor-enter(r6)
                    X.2o3 r0 = r8.A08     // Catch: java.lang.Throwable -> L67
                    if (r0 == 0) goto L65
                    java.lang.String r1 = r0.A00()     // Catch: java.lang.Throwable -> L67
                    X.1xf r0 = r6.A03     // Catch: java.lang.Throwable -> L67
                    X.1yf r3 = r0.A00(r1)     // Catch: java.lang.Throwable -> L67
                    if (r3 == 0) goto L65
                    if (r9 != 0) goto L30
                    X.1xn r2 = r6.A00     // Catch: java.lang.Throwable -> L67
                    X.3ZM r1 = r3.A01     // Catch: java.lang.Throwable -> L67
                    java.lang.String r0 = r1.A02     // Catch: java.lang.Throwable -> L67
                    X.3yo r0 = r2.BfU(r0)     // Catch: java.lang.Throwable -> L67
                    if (r0 == 0) goto L23
                    int r0 = r0.A00     // Catch: java.lang.Throwable -> L67
                    if (r0 > 0) goto L30
                L23:
                    X.2nt r0 = r1.A00     // Catch: java.lang.Throwable -> L67
                    if (r0 == 0) goto L2e
                    X.2nt r0 = r0.AIB()     // Catch: java.lang.Throwable -> L67
                    r0.E7X()     // Catch: java.lang.Throwable -> L67
                L2e:
                    r5 = 1
                    goto L31
                L30:
                    r5 = 0
                L31:
                    X.1yA r4 = r6.A01     // Catch: java.lang.Throwable -> L67
                    X.3ZM r0 = r3.A01     // Catch: java.lang.Throwable -> L67
                    java.lang.String r3 = r0.A02     // Catch: java.lang.Throwable -> L67
                    X.1xV r0 = r4.A00     // Catch: java.lang.Throwable -> L67
                    X.1xl r2 = r0.A09     // Catch: java.lang.Throwable -> L67
                    monitor-enter(r2)     // Catch: java.lang.Throwable -> L67
                    if (r3 == 0) goto L5c
                    java.util.Map r0 = r2.A01     // Catch: java.lang.Throwable -> L59
                    java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L59
                    X.3yo r1 = (X.C89483yo) r1     // Catch: java.lang.Throwable -> L59
                    if (r1 != 0) goto L50
                    X.3yo r1 = new X.3yo     // Catch: java.lang.Throwable -> L59
                    r1.<init>()     // Catch: java.lang.Throwable -> L59
                    r0.put(r3, r1)     // Catch: java.lang.Throwable -> L59
                L50:
                    if (r5 == 0) goto L5c
                    int r0 = r1.A00     // Catch: java.lang.Throwable -> L59
                    int r0 = r0 + 1
                    r1.A00 = r0     // Catch: java.lang.Throwable -> L59
                    goto L5c
                L59:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
                    throw r0     // Catch: java.lang.Throwable -> L67
                L5c:
                    monitor-exit(r2)     // Catch: java.lang.Throwable -> L67
                    X.3yp r0 = new X.3yp     // Catch: java.lang.Throwable -> L67
                    r0.<init>()     // Catch: java.lang.Throwable -> L67
                    X.C11T.A02(r0)     // Catch: java.lang.Throwable -> L67
                L65:
                    monitor-exit(r6)
                    return
                L67:
                    r0 = move-exception
                    monitor-exit(r6)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C42851yD.DLa(X.1QW, X.1QY, boolean):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:86:0x0109, code lost:
            
                if (r6 == null) goto L65;
             */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[Catch: all -> 0x0194, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001a, B:7:0x0024, B:8:0x0037, B:10:0x003d, B:12:0x004b, B:14:0x004f, B:16:0x0053, B:18:0x0057, B:21:0x007a, B:23:0x0080, B:25:0x0088, B:27:0x0094, B:29:0x0098, B:31:0x009c, B:32:0x009e, B:34:0x00a6, B:36:0x00fd, B:37:0x0105, B:39:0x00c2, B:40:0x00bb, B:63:0x00c7, B:67:0x00d1, B:70:0x00d7, B:43:0x00e0, B:47:0x00ea, B:50:0x00f0, B:80:0x0064, B:82:0x0068, B:91:0x0114, B:93:0x011a, B:95:0x0121, B:97:0x012b, B:99:0x0137, B:100:0x0172, B:102:0x017a, B:104:0x0180), top: B:3:0x0003 }] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[Catch: all -> 0x0194, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001a, B:7:0x0024, B:8:0x0037, B:10:0x003d, B:12:0x004b, B:14:0x004f, B:16:0x0053, B:18:0x0057, B:21:0x007a, B:23:0x0080, B:25:0x0088, B:27:0x0094, B:29:0x0098, B:31:0x009c, B:32:0x009e, B:34:0x00a6, B:36:0x00fd, B:37:0x0105, B:39:0x00c2, B:40:0x00bb, B:63:0x00c7, B:67:0x00d1, B:70:0x00d7, B:43:0x00e0, B:47:0x00ea, B:50:0x00f0, B:80:0x0064, B:82:0x0068, B:91:0x0114, B:93:0x011a, B:95:0x0121, B:97:0x012b, B:99:0x0137, B:100:0x0172, B:102:0x017a, B:104:0x0180), top: B:3:0x0003 }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00e0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00c1 A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, X.4Fn] */
            @Override // X.InterfaceC42861yE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final synchronized X.C89143yG BE0(java.util.List r19) {
                /*
                    Method dump skipped, instructions count: 407
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C42851yD.BE0(java.util.List):X.3yG");
            }

            {
                this.A02 = c42521xg;
                this.A00 = c42571xl;
                this.A03 = c42511xf;
                this.A01 = c42821yA;
            }
        };
        this.A01 = new C42891yH(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        final boolean A06 = C18U.A06(c06090Tz, userSession, 36325248548549555L);
        this.A03 = new C1CQ(c42511xf, A06) { // from class: X.1yL
            public final C42511xf A00;
            public final boolean A01;

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
            
                if (r3 != null) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
            
                if (r0 == false) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
            
                if (r1 == false) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
            
                if (r0 != 1) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
            
                r10 = 5;
             */
            @Override // X.C1CQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C09530e4 AIp(X.C1QW r12, X.C1QY r13) {
                /*
                    r11 = this;
                    r7 = 1
                    r6 = 2
                    X.1Rh r0 = X.C26771Rh.A00()
                    java.lang.String r8 = r0.A00
                    r10 = 6
                    r9 = 0
                    if (r8 != 0) goto L28
                    X.1Ef r0 = r13.A00()
                    int r0 = r0.ordinal()
                    if (r0 == r6) goto L26
                    if (r0 == r7) goto L77
                L18:
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
                    X.0e4 r0 = new X.0e4
                    r0.<init>(r2, r1)
                    return r0
                L26:
                    r10 = 2
                    goto L18
                L28:
                    X.1Bw r5 = r13.A09
                    X.1Bw r4 = X.EnumC23341Bw.Image
                    r1 = 0
                    if (r5 != r4) goto L5f
                    X.2o3 r0 = r13.A08
                    if (r0 == 0) goto L44
                    java.lang.String r1 = r0.A00()
                    X.1xf r0 = r11.A00
                    X.1yf r3 = r0.A00(r1)
                    java.lang.String r1 = r0.A02(r1)
                L41:
                    r2 = 1
                    if (r3 != 0) goto L45
                L44:
                    r2 = 0
                L45:
                    if (r1 == 0) goto L4e
                    boolean r0 = r1.equals(r8)
                    r1 = 1
                    if (r0 != 0) goto L4f
                L4e:
                    r1 = 0
                L4f:
                    X.1Ef r0 = r13.A00()
                    int r0 = r0.ordinal()
                    if (r0 == r6) goto L79
                    if (r0 != r7) goto L18
                    if (r2 == 0) goto L74
                    r10 = 3
                    goto L18
                L5f:
                    X.1Bw r0 = X.EnumC23341Bw.Video
                    if (r5 != r0) goto L44
                    X.4J0 r0 = r13.A0A
                    if (r0 == 0) goto L44
                    java.lang.String r1 = r0.A07
                    X.1xf r0 = r11.A00
                    X.1yf r3 = r0.A01(r1)
                    java.lang.String r1 = r0.A03(r1)
                    goto L41
                L74:
                    r10 = 4
                    if (r1 != 0) goto L18
                L77:
                    r10 = 5
                    goto L18
                L79:
                    if (r2 == 0) goto L8b
                    r10 = 0
                L7c:
                    if (r1 != 0) goto L7f
                    r10 = 2
                L7f:
                    boolean r0 = r11.A01
                    if (r0 == 0) goto L18
                    if (r5 == r4) goto L89
                    X.1Bw r0 = X.EnumC23341Bw.VideoCoverImage
                    if (r5 != r0) goto L18
                L89:
                    r9 = 1
                    goto L18
                L8b:
                    r10 = 1
                    goto L7c
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C42931yL.AIp(X.1QW, X.1QY):X.0e4");
            }

            {
                this.A00 = c42511xf;
                this.A01 = A06;
            }
        };
        this.A06 = new C42941yM(this);
        C42981yQ A00 = AbstractC42951yN.A00(userSession);
        if (((UiGraph) A00).A01 == null) {
            ((UiGraph) A00).A01 = this;
            if (c42521xg.A09) {
                InterfaceC16660sJ interfaceC16660sJ = new InterfaceC16660sJ() { // from class: X.B3g
                    @Override // X.InterfaceC16660sJ
                    public final Object invoke(Object obj) {
                        C42411xV c42411xV = C42411xV.this;
                        String str = ((C32066E6s) ((C51753Mtc) obj).A02).A04;
                        if (c42411xV.A0A.A00(str)) {
                            C42411xV.A03(c42411xV, str);
                        }
                        return C0eB.A00;
                    }
                };
                C19L c19l = AbstractC47182KtH.A00;
                C14360o3.A0B(userSession, 0);
                C19L c19l2 = AbstractC47182KtH.A00;
                AbstractC23641Du.A05(AnonymousClass191.A00, new PZX(userSession, interfaceC16660sJ, (InterfaceC23621Ds) null, 23), c19l2);
            }
            if (C18U.A06(c06090Tz, userSession, 36313106674091808L)) {
                this.A00 = C70780Wgt.A06.A00(userSession);
                return;
            }
            return;
        }
        throw new C141786av("UiGraph doesn't support multiple listeners yet.");
    }

    public static C42411xV A00(final UserSession userSession) {
        return (C42411xV) userSession.A01(C42411xV.class, new InterfaceC16820sZ() { // from class: X.1xa
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C42411xV(AbstractC12290kX.A00, UserSession.this);
            }
        });
    }

    public static void A03(final C42411xV c42411xV, String str) {
        C93144Fq A02 = AbstractC42951yN.A00(c42411xV.A04).A02(c42411xV.A0E.A01(str), str, new InterfaceC16660sJ() { // from class: X.B3h
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj) {
                return Boolean.valueOf(!C42411xV.this.A0C.A04((C43121yf) obj));
            }
        });
        if (A02 != null) {
            while (A02.hasNext()) {
                C9BW A00 = C93144Fq.A00(A02, true);
                C9BO c9bo = (C9BO) A00.A01;
                AbstractC05810Sj.A00(c9bo);
                if (c9bo.A00 <= c42411xV.A0A.A01) {
                    c42411xV.A05((C43121yf) A00.A00, str);
                } else {
                    return;
                }
            }
        }
    }

    public static void A04(C42411xV c42411xV, String str, boolean z) {
        UserSession userSession = c42411xV.A04;
        if (C18U.A06(C06090Tz.A05, userSession, 36320756010853235L)) {
            AbstractC46782Cq.A00(userSession).FBX(str, z);
        } else {
            AbstractC54278Nyy.A00(userSession).FBX(str, z);
        }
    }

    private void A05(C43121yf c43121yf, String str) {
        InterfaceC59502nt interfaceC59502nt;
        C75363a3 c75363a3;
        java.util.Set set;
        C42411xV c42411xV;
        InterfaceC42241xE jra;
        String str2;
        ImageUrl BRz;
        ImageCacheKey imageCacheKey;
        String str3;
        UserSession userSession = this.A04;
        if (!C18U.A06(C06090Tz.A05, userSession, 36326326583441223L) || !this.A0C.A04(c43121yf)) {
            C42511xf c42511xf = this.A0C;
            synchronized (c42511xf) {
                C14360o3.A0B(c43121yf, 0);
                C14360o3.A0B(str, 1);
                C3ZM c3zm = c43121yf.A01;
                interfaceC59502nt = c3zm.A00;
                if (interfaceC59502nt != null && (BRz = interfaceC59502nt.BRz()) != null && (imageCacheKey = (ImageCacheKey) BRz.AjX()) != null && (str3 = imageCacheKey.A03) != null) {
                    c42511xf.A00.put(str3, new C09530e4(c43121yf, str));
                }
                c75363a3 = c3zm.A01;
                if (c75363a3 != null && (str2 = c3zm.A02) != null) {
                    c42511xf.A01.put(str2, new C09530e4(c43121yf, str));
                }
            }
            if (interfaceC59502nt != null) {
                new C3ZX(new C1OC(userSession), interfaceC59502nt, userSession).E7X();
            }
            if (c75363a3 != null) {
                this.A0B.A9w(c43121yf, str);
            }
            C42941yM c42941yM = this.A06;
            if (c42941yM != null) {
                if (c75363a3 != null) {
                    java.util.Set set2 = (java.util.Set) c42941yM.A02.get(str);
                    if (set2 != null && set2.remove(c75363a3)) {
                        c42411xV = c42941yM.A00;
                        jra = new JR5(c42411xV, c75363a3, str);
                    } else {
                        return;
                    }
                } else {
                    if (interfaceC59502nt == null || (set = (java.util.Set) c42941yM.A01.get(str)) == null || !set.remove(interfaceC59502nt.BGt().AjX())) {
                        return;
                    }
                    c42411xV = c42941yM.A00;
                    jra = new JRA(interfaceC59502nt.BGt(), c42411xV, str);
                }
                A01(c42411xV, jra);
            }
        }
    }

    @Override // X.InterfaceC42441xY
    public final /* bridge */ /* synthetic */ void DLO(Object obj, String str) {
        A01(this, new JRA((ImageUrl) obj, this, str));
    }

    @Override // X.InterfaceC42441xY
    public final /* bridge */ /* synthetic */ void DLQ(Object obj, final String str) {
        final ImageUrl imageUrl = (ImageUrl) obj;
        A01(this, new InterfaceC42241xE() { // from class: X.Lxi
            @Override // X.InterfaceC42241xE
            public final void accept(Object obj2) {
                C42411xV c42411xV = this;
                ImageUrl imageUrl2 = imageUrl;
                String str2 = str;
                C42571xl c42571xl = c42411xV.A09;
                imageUrl2.AjX();
                synchronized (c42571xl) {
                    c42571xl.A03.get(str2);
                }
                C42941yM c42941yM = c42411xV.A06;
                if (c42941yM != null) {
                    Object AjX = imageUrl2.AjX();
                    java.util.Set set = (java.util.Set) c42941yM.A01.get(str2);
                    if (set != null) {
                        set.remove(AjX);
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC42451xZ
    public final /* bridge */ /* synthetic */ void Dyz(Object obj, String str) {
        A01(this, new JR5(this, (C75363a3) obj, str));
    }

    @Override // X.InterfaceC42451xZ
    public final /* bridge */ /* synthetic */ void Dz2(Object obj, final String str) {
        final C75363a3 c75363a3 = (C75363a3) obj;
        A01(this, new InterfaceC42241xE() { // from class: X.Lxh
            @Override // X.InterfaceC42241xE
            public final void accept(Object obj2) {
                java.util.Set set;
                C42411xV c42411xV = C42411xV.this;
                C75363a3 c75363a32 = c75363a3;
                String str2 = str;
                C42571xl c42571xl = c42411xV.A09;
                synchronized (c42571xl) {
                    c42571xl.A03.get(str2);
                }
                C42941yM c42941yM = c42411xV.A06;
                if (c42941yM != null && (set = (java.util.Set) c42941yM.A02.get(str2)) != null) {
                    set.remove(c75363a32);
                }
            }
        });
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A0B.DyD();
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A03(this.A0D, C42661xu.class);
        C42891yH c42891yH = this.A01;
        if (c42891yH != null) {
            c41451vu.A03(c42891yH.A03, C42661xu.class);
            c42891yH.A02.clear();
        }
    }

    public static void A01(C42411xV c42411xV, InterfaceC42241xE interfaceC42241xE) {
        C14120nc.A00().ATO(new JR4(c42411xV, interfaceC42241xE));
    }

    public static void A06(final String str, final boolean z) {
        final C25821No A00 = C25821No.A00();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            A00.A0M.A01(997783198, new Runnable() { // from class: X.AxW
                @Override // java.lang.Runnable
                public final void run() {
                    C25821No.A0D(C25821No.this, str, z);
                }
            });
        } else {
            C25821No.A0D(A00, str, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (((java.util.concurrent.atomic.AtomicInteger) r0).decrementAndGet() <= 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(java.lang.String r4) {
        /*
            r3 = this;
            X.C11T.A00()
            X.1xl r2 = r3.A09
            monitor-enter(r2)
            X.1xg r0 = r2.A00     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.A08     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L26
            java.util.Map r1 = r2.A02     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r1.get(r4)     // Catch: java.lang.Throwable -> L2e
            X.3AY r0 = (X.C3AY) r0     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L29
            java.lang.Object r0 = r0.A01     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L29
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0     // Catch: java.lang.Throwable -> L2e
            int r0 = r0.decrementAndGet()     // Catch: java.lang.Throwable -> L2e
            if (r0 > 0) goto L29
        L22:
            r1.remove(r4)     // Catch: java.lang.Throwable -> L2e
            goto L29
        L26:
            java.util.Map r1 = r2.A02     // Catch: java.lang.Throwable -> L2e
            goto L22
        L29:
            monitor-exit(r2)
            X.C11T.A00()
            return
        L2e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42411xV.A08(java.lang.String):void");
    }

    @Override // X.InterfaceC42421xW
    public final void F9k() {
        C11T.A00();
        C41451vu.A01.A03(this.A0D, C42661xu.class);
        C11T.A00();
    }
}
