package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: X.63a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1339263a {
    public static final Handler A0E = new Handler(Looper.getMainLooper());
    public C6Er A00;
    public final Handler A01;
    public final C63I A02;
    public final InterfaceC63212ty A03;
    public final C63W A04;
    public final C136206Eu A05;
    public final C1339463c A06;
    public final C63Z A07;
    public final C63O A08;
    public final Object A09;
    public final Object A0A;
    public final Runnable A0B;
    public final List A0C;
    public final Executor A0D;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.6Eu] */
    public C1339263a(C63I c63i, InterfaceC63212ty interfaceC63212ty, C63W c63w, C63C c63c, C63K c63k, final C63Z c63z) {
        final C6Eo c6Eo;
        C6Er c6Er;
        Runnable runnable;
        C14360o3.A0B(c63c, 4);
        final Handler handler = new Handler(AbstractC1339363b.A00.getLooper());
        C1339463c c1339463c = new C1339463c(c63i, c63c, c63k, c63z);
        this.A04 = c63w;
        this.A03 = interfaceC63212ty;
        this.A01 = handler;
        this.A06 = c1339463c;
        this.A07 = c63z;
        this.A02 = c63i;
        Object obj = new Object();
        this.A0A = obj;
        this.A08 = new C63O();
        synchronized (obj) {
            final InterfaceC1339663e interfaceC1339663e = new InterfaceC1339663e() { // from class: X.63d
                @Override // X.InterfaceC1339663e
                public final /* bridge */ /* synthetic */ void DnA(Object obj2) {
                    C6Er c6Er2 = (C6Er) obj2;
                    C14360o3.A0B(c6Er2, 0);
                    C1339263a c1339263a = C1339263a.this;
                    synchronized (c1339263a.A0A) {
                        c1339263a.A00 = c6Er2;
                        c1339263a.A08.A01(new C6FO(c6Er2));
                    }
                }
            };
            synchronized (c63z.A04) {
                final C6Eo A01 = c63z.A02.A01(new InterfaceC1339663e() { // from class: X.63f
                    @Override // X.InterfaceC1339663e
                    public final /* bridge */ /* synthetic */ void DnA(Object obj2) {
                        C6Ep c6Ep = (C6Ep) obj2;
                        C14360o3.A0B(c6Ep, 0);
                        C63Z c63z2 = C63Z.this;
                        Object obj3 = c63z2.A04;
                        InterfaceC1339663e interfaceC1339663e2 = interfaceC1339663e;
                        synchronized (obj3) {
                            C6Er c6Er2 = c63z2.A00;
                            if (c6Er2 == null) {
                                C14360o3.A0F("snapshot");
                                throw C00O.createAndThrow();
                            }
                            C6Er c6Er3 = new C6Er(c6Ep, c6Er2.A01);
                            c63z2.A00 = c6Er3;
                            interfaceC1339663e2.DnA(c6Er3);
                        }
                    }
                });
                C63U c63u = c63z.A03;
                if (c63u != null) {
                    c6Eo = c63u.A01(new InterfaceC1339663e() { // from class: X.6Eq
                        @Override // X.InterfaceC1339663e
                        public final /* bridge */ /* synthetic */ void DnA(Object obj2) {
                            C6Ep c6Ep = (C6Ep) obj2;
                            C14360o3.A0B(c6Ep, 0);
                            C63Z c63z2 = C63Z.this;
                            Object obj3 = c63z2.A04;
                            InterfaceC1339663e interfaceC1339663e2 = interfaceC1339663e;
                            synchronized (obj3) {
                                C6Er c6Er2 = c63z2.A00;
                                if (c6Er2 == null) {
                                    C14360o3.A0F("snapshot");
                                    throw C00O.createAndThrow();
                                }
                                C6Er c6Er3 = new C6Er(c6Er2.A00, c6Ep);
                                c63z2.A00 = c6Er3;
                                interfaceC1339663e2.DnA(c6Er3);
                            }
                        }
                    });
                } else {
                    c6Eo = null;
                }
                c6Er = new C6Er((C6Ep) A01.A00, c6Eo != null ? (C6Ep) c6Eo.A00 : null);
                c63z.A00 = c6Er;
                runnable = new Runnable() { // from class: X.6Es
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6Eo.this.A01.run();
                        C6Eo c6Eo2 = c6Eo;
                        if (c6Eo2 != null) {
                            c6Eo2.A01.run();
                        }
                    }
                };
            }
            this.A00 = c6Er;
            this.A0B = runnable;
        }
        this.A09 = new Object();
        this.A0D = new Executor(handler) { // from class: X.6Et
            public final Handler A00;

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable2) {
                C14360o3.A0B(runnable2, 0);
                Thread currentThread = Thread.currentThread();
                Handler handler2 = this.A00;
                if (currentThread == handler2.getLooper().getThread()) {
                    runnable2.run();
                } else {
                    handler2.post(runnable2);
                }
            }

            {
                this.A00 = handler;
            }
        };
        this.A0C = new ArrayList();
        ?? r1 = new C6DR() { // from class: X.6Eu
            @Override // X.C6DR
            public final void D8j() {
                C1339263a c1339263a = C1339263a.this;
                java.util.Set singleton = Collections.singleton(EnumC61117RfX.A04);
                C14360o3.A07(singleton);
                C63Z c63z2 = c1339263a.A07;
                c63z2.A02.A02(singleton);
                C63U c63u2 = c63z2.A03;
                if (c63u2 != null) {
                    c63u2.A02(singleton);
                }
            }
        };
        this.A05 = r1;
        c63w.A00.add(r1);
    }

    public final VIV A02(String str, Map map, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        C63E c63e;
        VIV A00;
        C63I c63i = this.A02;
        if (c63i != null) {
            c63e = c63i.A00;
        } else {
            c63e = null;
        }
        String A002 = C58674Pzn.A00(c63e, str, map);
        synchronized (this.A09) {
            A00 = A00(this, null, str, A002, j, z);
            if (A00 == null) {
                final C9QZ c9qz = new C9QZ(A002, interfaceC16660sJ, new C9EB(this, 5));
                this.A0C.add(c9qz);
                A00 = new C66236U5g(new Runnable() { // from class: X.9QY
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9QZ c9qz2 = C9QZ.this;
                        c9qz2.A02.invoke(c9qz2);
                    }
                });
            }
        }
        return A00;
    }

    public final void A03(EnumC58683Pzw enumC58683Pzw, MPY mpy, String str, Map map, java.util.Set set, long j, boolean z, boolean z2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        C14360o3.A0B(enumC58683Pzw, 5);
        this.A0D.execute(new RunnableC58676Pzp(enumC58683Pzw, this, mpy, str, map, set, j, z, z2));
    }

    public final void A04(String str, Map map, java.util.Set set) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        C14360o3.A0B(set, 2);
        C63I c63i = this.A02;
        C63E c63e = null;
        if (c63i != null) {
            c63e = c63i.A00;
        }
        String A00 = C58674Pzn.A00(c63e, str, map);
        C63U A002 = this.A07.A00(str);
        C14360o3.A0B(A00, 0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int ordinal = ((EnumC61117RfX) it.next()).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C63Q c63q = A002.A00;
                    c63q.A04.execute(new FutureTask(new TU6(c63q, A00)));
                } else {
                    throw new RuntimeException();
                }
            } else {
                A002.A01.A01(A00);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (X.C58674Pzn.A04(r3.A01, r3.A00, r18, r12) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(java.lang.String r15, java.util.Map r16, java.util.Set r17, long r18) {
        /*
            r14 = this;
            r4 = 0
            r6 = 1
            r5 = r17
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L72
            X.63I r1 = r14.A02
            r0 = 0
            if (r1 == 0) goto L11
            X.63E r0 = r1.A00
        L11:
            r1 = r16
            java.lang.String r1 = X.C58674Pzn.A00(r0, r15, r1)
            X.63Z r0 = r14.A07
            X.63U r2 = r0.A00(r15)
            X.RfX r0 = X.EnumC61117RfX.A04
            boolean r0 = r5.contains(r0)
            r10 = r18
            if (r0 == 0) goto L47
            X.C14360o3.A0B(r1, r4)
            X.0JO r0 = r2.A02
            long r12 = r0.now()
            X.63M r0 = r2.A01
            X.Q0J r3 = r0.Epl(r1)
            if (r3 == 0) goto L47
            boolean r0 = r3 instanceof X.Q0I
            if (r0 == 0) goto L47
            long r8 = r3.A00
            X.Pzw r7 = r3.A01
            boolean r0 = X.C58674Pzn.A04(r7, r8, r10, r12)
            if (r0 == 0) goto L47
        L46:
            return r6
        L47:
            X.RfX r0 = X.EnumC61117RfX.A03
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L72
            r6 = 0
            X.C14360o3.A0B(r1, r4)
            X.63Q r0 = r2.A00
            java.util.concurrent.atomic.AtomicReference r0 = r0.A05
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r0.get(r1)
            X.Q0C r1 = (X.Q0C) r1
            if (r1 == 0) goto L46
            X.0JO r0 = r2.A02
            long r12 = r0.now()
            long r8 = r1.A00
            boolean r6 = X.C58674Pzn.A03(r8, r10, r12)
            return r6
        L72:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1339263a.A05(java.lang.String, java.util.Map, java.util.Set, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (((X.C63H) r1.A00.get(r21)) == null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[Catch: all -> 0x0163, DONT_GENERATE, TryCatch #0 {all -> 0x0163, blocks: (B:5:0x0008, B:8:0x001a, B:10:0x0020, B:12:0x0024, B:14:0x002c, B:16:0x0036, B:18:0x0054, B:19:0x005e, B:21:0x0066, B:23:0x006a, B:25:0x007c, B:27:0x009b, B:28:0x009c, B:29:0x009d, B:31:0x00a5, B:37:0x00bb, B:39:0x00cd, B:41:0x00db, B:53:0x010c, B:45:0x011a, B:50:0x015b, B:51:0x015e, B:58:0x005c, B:59:0x004f, B:44:0x0113), top: B:4:0x0008, outer: #1, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.V4W A00(X.C1339263a r19, X.C6Er r20, java.lang.String r21, java.lang.String r22, long r23, boolean r25) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1339263a.A00(X.63a, X.6Er, java.lang.String, java.lang.String, long, boolean):X.V4W");
    }

    public static final void A01(C1339263a c1339263a, Q08 q08) {
        ArrayList arrayList = new ArrayList();
        synchronized (c1339263a.A09) {
            Iterator it = c1339263a.A0C.iterator();
            while (it.hasNext()) {
                C9QZ c9qz = (C9QZ) it.next();
                InterfaceC16660sJ interfaceC16660sJ = c9qz.A01;
                if (C14360o3.A0K(c9qz.A00, q08.A00())) {
                    arrayList.add(interfaceC16660sJ);
                    it.remove();
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC16660sJ) it2.next()).invoke(q08);
        }
    }
}
