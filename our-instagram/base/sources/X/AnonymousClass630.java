package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoGraphQLServiceJNI;
import com.facebook.pando.TreeJNI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.630, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass630 {
    public static final Handler A0P = new Handler(Looper.getMainLooper());
    public int A00;
    public C66239U5j A01;
    public C6FE A02;
    public C6FJ A03;
    public C6AV A05;
    public C102884kP A06;
    public C103054kg A07;
    public C1338462s A08;
    public final C1339162z A0E;
    public final C63162tt A0K;
    public volatile boolean A0O;
    public final AnonymousClass631 A0D = new Object();
    public AnonymousClass632 A04 = new AnonymousClass632();
    public Map A0A = Collections.emptyMap();
    public final List A0N = new ArrayList();
    public final Map A0J = new HashMap();
    public final Map A0I = new HashMap();
    public final List A0H = new ArrayList();
    public final List A0F = new ArrayList();
    public final List A0G = new ArrayList();
    public WeakReference A09 = new WeakReference(null);
    public final Runnable A0M = new Runnable() { // from class: X.633
        @Override // java.lang.Runnable
        public final void run() {
            AnonymousClass630 anonymousClass630 = AnonymousClass630.this;
            if (anonymousClass630.A00 == 0) {
                anonymousClass630.A09();
            }
        }
    };
    public boolean A0C = false;
    public boolean A0B = false;
    public final Object A0L = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0201, code lost:
    
        r0 = (X.C09530e4) r5.next();
        r4.add(X.C66239U5j.A00(r7, r13, (X.Q08) r0.A01, (X.U5Y) r0.A00, X.C05F.A00));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0219, code lost:
    
        r0 = X.AbstractC06950Ym.A1F(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x021d, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0225, code lost:
    
        X.C1LN.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0228, code lost:
    
        r5 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0230, code lost:
    
        if (r5.hasNext() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0232, code lost:
    
        r0 = (X.C69747Vuh) r5.next();
        r1 = r0.A01;
        r4 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023c, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x023e, code lost:
    
        r11.add(r1.A00);
        r10.add(new android.util.Pair(r1.A01, r1.A02));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024f, code lost:
    
        r29.A04 = r29.A04.A06(X.AbstractC16850sd.A0M(new X.C09530e4(r4.A01, r4.A00)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x026d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0276, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0277, code lost:
    
        X.C1LN.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x021f, code lost:
    
        r0 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0135, code lost:
    
        if (r7 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0137, code lost:
    
        r1 = r7.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0139, code lost:
    
        r13 = X.C6FP.A01(r9, r29.A04, r1);
        r3 = r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0141, code lost:
    
        if (r3 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0147, code lost:
    
        if (r3.isEmpty() != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        X.C1LN.A01("Initialize BloksComponentQueryManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        if (r29.A01 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r2 = (X.C1339263a) r9.A00(com.facebook.R.id.bk_context_key_async_component_store);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        if (r2 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015d, code lost:
    
        r29.A01 = new X.C66239U5j(r29.A02, r29, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        throw new java.lang.RuntimeException("Attempting to process async components but missing component query store");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        X.C1LN.A00();
        X.C1LN.A01("Bloks Setup AsyncComponentQueries");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        r7 = r29.A01;
        r6 = new java.util.ArrayList();
        r15 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017d, code lost:
    
        if (r15.hasNext() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017f, code lost:
    
        r5 = (X.U5Y) r15.next();
        r4 = (java.lang.String) X.AbstractC66235U5f.A00(r13, r5.A00, "appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018f, code lost:
    
        if (r4 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0191, code lost:
    
        r3 = (java.util.Map) X.AbstractC66235U5f.A00(r13, r5.A03, "params");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019b, code lost:
    
        if (r3 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019d, code lost:
    
        r3 = X.AbstractC06930Yk.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a1, code lost:
    
        r0 = (java.lang.Long) X.AbstractC66235U5f.A00(r13, r5.A01, "cacheTtlSeconds");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ab, code lost:
    
        if (r0 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ad, code lost:
    
        r2 = r7.A02.A02(r4, r3, new X.C30172DRc(14, r13, r5, r7), r0.longValue(), r5.A07);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cc, code lost:
    
        if ((r2 instanceof X.C66236U5g) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01da, code lost:
    
        if ((r2 instanceof X.V4W) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dc, code lost:
    
        r6.add(new X.C09530e4(r5, ((X.V4W) r2).A00));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0275, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ce, code lost:
    
        r7.A00.A01(((X.C66236U5g) r2).A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e9, code lost:
    
        r3 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01eb, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ec, code lost:
    
        r4 = new java.util.ArrayList(X.AbstractC06950Ym.A1E(r6, 10));
        r5 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ff, code lost:
    
        if (r5.hasNext() == false) goto L130;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair A00(java.util.List r30) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass630.A00(java.util.List):android.util.Pair");
    }

    private C102884kP A01(List list) {
        C1LN.A01("Bloks SnapshotComponent");
        C102884kP c102884kP = this.A06;
        try {
            if (!list.isEmpty()) {
                c102884kP = C6AU.A00(null, new C140006Ve(list), c102884kP);
            }
            return c102884kP;
        } finally {
            C1LN.A00();
        }
    }

    public static void A02(AnonymousClass630 anonymousClass630) {
        synchronized (anonymousClass630.A0L) {
            if (!anonymousClass630.A0C) {
                anonymousClass630.A0B = true;
                return;
            }
            Handler handler = A0P;
            Runnable runnable = anonymousClass630.A0M;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public final C136326Fl A04(C6FG c6fg, C6FJ c6fj, Map map) {
        AnonymousClass632 anonymousClass632 = this.A04;
        if (!map.isEmpty() || !anonymousClass632.A03.isEmpty()) {
            anonymousClass632 = new AnonymousClass632(anonymousClass632.A00, anonymousClass632.A07, anonymousClass632.A04, anonymousClass632.A08, map, anonymousClass632.A02, anonymousClass632.A05, anonymousClass632.A06, anonymousClass632.A01);
        }
        this.A04 = anonymousClass632;
        this.A02 = new C6FE(c6fg.A00);
        Map map2 = (Map) c6fg.A01.get(R.id.bk_context_key_data_modules);
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(map2.size());
        Iterator it = map2.entrySet().iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C6FM By5 = ((InterfaceC136226Ez) entry.getValue()).By5(c6fg, this);
            Object key = entry.getKey();
            if (By5 != null) {
                obj = By5.A00;
            }
            hashMap.put(key, obj);
            if (By5 != null) {
                this.A02.A01(By5.A01);
            }
        }
        this.A04 = this.A04.A03(hashMap);
        this.A09 = new WeakReference(c6fg);
        this.A03 = c6fj;
        Pair A00 = A00(Collections.singletonList(this.A08));
        this.A08 = null;
        if (!((List) A00.second).isEmpty()) {
            this.A06 = A01((List) A00.second);
        }
        synchronized (this.A0L) {
            this.A0C = true;
            if (this.A0B) {
                A02(this);
            }
        }
        return new C136326Fl(this.A04, this.A06);
    }

    public final AnonymousClass632 A05() {
        AbstractC79383gk.A02("Tree resources can only be read from the UI Thread");
        AnonymousClass632 anonymousClass632 = this.A04;
        Map map = this.A0A;
        if (map != null) {
            return new AnonymousClass632(anonymousClass632.A00, anonymousClass632.A07, anonymousClass632.A04, map, anonymousClass632.A03, anonymousClass632.A02, anonymousClass632.A05, anonymousClass632.A06, anonymousClass632.A01);
        }
        return anonymousClass632;
    }

    public final C102884kP A06() {
        if (this.A07 != null) {
            return this.A06;
        }
        C6AV c6av = this.A05;
        if (c6av != null) {
            return c6av.A01;
        }
        return null;
    }

    public final C102884kP A07() {
        if (this.A0O) {
            AbstractC25241Le.A02("BloksTreeManager", "Trying to access a tree on a destroyed BloksTreeManager");
        }
        AbstractC79383gk.A02("Tree operations are only supported from the UI Thread");
        return A01(this.A0N);
    }

    public final void A09() {
        boolean z;
        if (!this.A0O) {
            AbstractC79383gk.A02("Tree operations are only supported from the UI Thread");
            Map map = this.A0J;
            boolean z2 = true;
            if (!map.isEmpty()) {
                this.A04 = this.A04.A06(map);
                map.clear();
                z = true;
            } else {
                z = false;
            }
            Map map2 = this.A0I;
            if (!map2.isEmpty()) {
                this.A04 = this.A04.A03(map2);
            }
            List list = this.A0H;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list);
                list.clear();
                Pair A00 = A00(arrayList);
                z |= ((Boolean) A00.first).booleanValue();
                this.A0N.addAll((Collection) A00.second);
            }
            C1LN.A01("Bloks ModelMutation");
            List list2 = this.A0N;
            C102884kP A01 = A01(list2);
            if (this.A06 == A01) {
                z2 = false;
            }
            boolean z3 = z | z2;
            this.A06 = A01;
            list2.clear();
            C1LN.A00();
            C6FJ c6fj = this.A03;
            if (c6fj != null && z3) {
                c6fj.DVl(new C136326Fl(this.A04, this.A06));
            }
        }
    }

    public final void A0A() {
        int i;
        X8D[] x8dArr;
        if (!this.A0O) {
            List list = this.A0G;
            synchronized (list) {
                x8dArr = (X8D[]) list.toArray(new X8D[0]);
            }
            for (X8D x8d : x8dArr) {
                C70686Wf7 c70686Wf7 = (C70686Wf7) x8d;
                Object obj = this.A0A.get(c70686Wf7.A06);
                Runnable runnable = c70686Wf7.A01;
                if (runnable != null && (obj instanceof TreeJNI)) {
                    c70686Wf7.A00 = (TreeJNI) obj;
                    runnable.run();
                    c70686Wf7.A01 = null;
                }
            }
        }
    }

    public final void A0B() {
        int i;
        X8D[] x8dArr;
        if (!this.A0O) {
            List list = this.A0G;
            synchronized (list) {
                x8dArr = (X8D[]) list.toArray(new X8D[0]);
            }
            for (X8D x8d : x8dArr) {
                C6FE c6fe = this.A02;
                C70686Wf7 c70686Wf7 = (C70686Wf7) x8d;
                PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI = ((PandoGraphQLServiceJNI) c70686Wf7.A04).mGraphqlConsistency;
                TreeJNI treeJNI = c70686Wf7.A00;
                if (treeJNI != null) {
                    C42102IlC c42102IlC = c70686Wf7.A02;
                    if (pandoGraphQLConsistencyJNI != null) {
                        RunnableC29569D0w runnableC29569D0w = new RunnableC29569D0w(pandoGraphQLConsistencyJNI.subscribe(treeJNI, TreeJNI.class, c42102IlC, C6F2.A01).cancelToken);
                        c70686Wf7.A01 = runnableC29569D0w;
                        c6fe.A01(runnableC29569D0w);
                        c70686Wf7.A00 = null;
                    }
                }
            }
        }
    }

    public final void A0C(C1338462s c1338462s, Map map) {
        AbstractC79383gk.A02("Tree operations are only supported from the UI Thread");
        this.A0N.addAll((Collection) A00(Collections.singletonList(c1338462s)).second);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.A04.A08);
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!hashMap.isEmpty()) {
            this.A04 = this.A04.A06(hashMap);
            hashMap.putAll(this.A0A);
            this.A0A = hashMap;
        }
    }

    public final void A0D(C6DY c6dy) {
        AbstractC79383gk.A02("Tree operations are only supported from the UI Thread");
        Map A0M = AbstractC16850sd.A0M(new C09530e4(c6dy.A01, c6dy.A00));
        this.A04 = this.A04.A06(A0M);
        this.A0A.putAll(A0M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r3 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.C6DX r6) {
        /*
            r5 = this;
            boolean r0 = r5.A0O
            if (r0 != 0) goto L3b
            java.lang.String r0 = "Tree operations are only supported from the UI Thread"
            X.AbstractC79383gk.A02(r0)
            boolean r4 = r6 instanceof X.C6DY
            if (r4 != 0) goto L24
            boolean r0 = r6 instanceof X.C6DW
            if (r0 == 0) goto L50
            r3 = r6
            X.6DW r3 = (X.C6DW) r3
            if (r3 == 0) goto L24
        L16:
            java.util.concurrent.atomic.AtomicInteger r0 = X.AbstractC102954kW.A02
            r0.incrementAndGet()
            java.util.Map r2 = r5.A0I
            java.lang.String r1 = r3.A01
            java.lang.Object r0 = r3.A00
            r2.put(r1, r0)
        L24:
            if (r4 == 0) goto L3c
            X.6DY r6 = (X.C6DY) r6
            if (r6 == 0) goto L3b
        L2a:
            java.util.concurrent.atomic.AtomicInteger r0 = X.AbstractC102954kW.A06
            r0.incrementAndGet()
            java.util.Map r2 = r5.A0J
            java.lang.String r1 = r6.A01
            java.lang.Object r0 = r6.A00
            r2.put(r1, r0)
            A02(r5)
        L3b:
            return
        L3c:
            boolean r0 = r6 instanceof X.C6DW
            if (r0 != 0) goto L3b
            boolean r0 = r6 instanceof X.Gs8
            if (r0 == 0) goto L61
            X.Gs8 r6 = (X.Gs8) r6
            java.lang.String r1 = r6.A03
            java.lang.Object r0 = r6.A01
            X.6DY r6 = new X.6DY
            r6.<init>(r1, r0)
            goto L2a
        L50:
            boolean r0 = r6 instanceof X.Gs8
            if (r0 == 0) goto L67
            r0 = r6
            X.Gs8 r0 = (X.Gs8) r0
            java.lang.String r1 = r0.A02
            java.lang.Object r0 = r0.A00
            X.6DW r3 = new X.6DW
            r3.<init>(r1, r0)
            goto L16
        L61:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L67:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass630.A0E(X.6DX):void");
    }

    public final void A0F(C6AV c6av, int i) {
        int i2;
        InterfaceC131615wx[] interfaceC131615wxArr;
        String str;
        String str2;
        AbstractC79383gk.A02("Committing Variables and Bound tree is only supported from the UI Thread");
        this.A05 = c6av;
        C6FG c6fg = (C6FG) this.A09.get();
        List<C1338962x> list = c6av.A05;
        for (C1338962x c1338962x : list) {
            this.A04 = this.A04.A04(c1338962x.A06).A00(c1338962x.A00).A01(c1338962x.A03).A05(c1338962x.A07).A02(c1338962x.A04);
        }
        list.clear();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = c6av.A03;
        for (Map.Entry entry : hashMap2.entrySet()) {
            C6DU c6du = (C6DU) entry.getValue();
            hashMap.put(entry.getKey(), c6du.BHk());
            c6du.AIf(c6fg, this, this.A0K);
        }
        hashMap2.clear();
        this.A04 = this.A04.A06(hashMap);
        this.A0A = c6av.A08;
        List list2 = this.A0F;
        synchronized (list2) {
            interfaceC131615wxArr = (InterfaceC131615wx[]) list2.toArray(new InterfaceC131615wx[0]);
        }
        for (InterfaceC131615wx interfaceC131615wx : interfaceC131615wxArr) {
            interfaceC131615wx.D6P(this.A0A, i);
        }
        if (c6fg != null) {
            for (C25688BWy c25688BWy : c6av.A04) {
                C102884kP c102884kP = c25688BWy.A01;
                Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
                if (A06 == null) {
                    str = "BloksTreeManager";
                    str2 = "Binding was targeting a controller but the returned controller was null";
                } else {
                    int i3 = c102884kP.A05;
                    int i4 = c25688BWy.A00;
                    Object obj = c25688BWy.A02;
                    if (i3 == 13688) {
                        C6W1 c6w1 = (C6W1) A06;
                        if (obj == null) {
                            str = "ViewTransformsBindControllerOverride";
                            str2 = "Trying to set null value for a view transform property";
                        } else {
                            c6w1.EPu(null, obj, i4);
                        }
                    } else {
                        throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i3)));
                    }
                }
                AbstractC25241Le.A02(str, str2);
            }
        }
    }

    public final void A0G(XAK xak, AbstractC66258U6c abstractC66258U6c) {
        if (!this.A0O) {
            AbstractC79383gk.A02("Tree operations are only supported from the UI Thread");
            this.A0N.add(new Pair(xak, abstractC66258U6c));
        }
    }

    public final void A0H(C140076Vl c140076Vl, int i) {
        C103054kg c103054kg;
        C103054kg c103054kg2;
        int i2;
        InterfaceC131615wx[] interfaceC131615wxArr;
        AbstractC79383gk.A02("Evaluation Context can only be set from the UI Thread");
        this.A06 = c140076Vl.A00;
        C103054kg c103054kg3 = this.A07;
        if (c103054kg3 != null) {
            C140056Vj c140056Vj = c103054kg3.A03;
            c103054kg2 = c140076Vl.A01;
            if (c140056Vj != c103054kg2.A03) {
                c103054kg3.A01.A03.A00(C05F.A0C);
                c103054kg = c103054kg2.A01(c103054kg3.A03);
            } else {
                return;
            }
        } else {
            c103054kg = c140076Vl.A01;
            c103054kg2 = c103054kg;
        }
        AnonymousClass631 anonymousClass631 = this.A0D;
        AbstractC79383gk.A02("EvaluationContext can only be set from the UI Thread");
        anonymousClass631.A00 = c103054kg;
        this.A07 = c103054kg;
        this.A0A = new HashMap(c103054kg2.A01.A00.A08);
        this.A07.A01.A03.A00(C05F.A01);
        List list = this.A0F;
        synchronized (list) {
            interfaceC131615wxArr = (InterfaceC131615wx[]) list.toArray(new InterfaceC131615wx[0]);
        }
        for (InterfaceC131615wx interfaceC131615wx : interfaceC131615wxArr) {
            interfaceC131615wx.D6P(this.A0A, i);
        }
    }

    public final void A0I(final Object obj, final Object obj2, final String str, final String str2) {
        A03(new Runnable() { // from class: X.GsG
            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass630 anonymousClass630 = AnonymousClass630.this;
                String str3 = str;
                anonymousClass630.A0E(new Gs8(obj, obj2, str3, str2));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.631, java.lang.Object] */
    public AnonymousClass630(C1338462s c1338462s, C63162tt c63162tt, C1339162z c1339162z) {
        this.A06 = c1338462s.A02;
        this.A08 = c1338462s;
        this.A0K = c63162tt;
        this.A0E = c1339162z;
    }

    public static void A03(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            A0P.post(runnable);
        }
    }

    public final void A08() {
        if (AbstractC79383gk.A03()) {
            int i = this.A00;
            if (i > 0) {
                int i2 = i - 1;
                this.A00 = i2;
                if (i2 == 0 && this.A0N.size() > 0) {
                    A09();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Negative recursion level.");
        }
    }
}
