package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2O3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2O3 implements InterfaceC11380iw, InterfaceC13060ls {
    public static C2O3 A05 = null;
    public static final String __redex_internal_original_name = "PrivacyFlow";
    public long A00;
    public C2AG A01;
    public InterfaceC19630xq A02;
    public C2OE A03;
    public boolean A04;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r7 > r5) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A01(com.instagram.common.session.UserSession r9, X.C2O3 r10) {
        /*
            monitor-enter(r10)
            long r3 = r10.A00     // Catch: java.lang.Throwable -> L2c
            r0 = 10000(0x2710, double:4.9407E-320)
            long r7 = r3 + r0
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r10.A04     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L10
            goto L15
        L10:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L1f
            goto L21
        L15:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L28
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L28
        L1f:
            monitor-exit(r10)
            return
        L21:
            r0 = -1
            r10.A00 = r0     // Catch: java.lang.Throwable -> L2c
            r0 = 0
            r10.A04 = r0     // Catch: java.lang.Throwable -> L2c
        L28:
            r10.A02(r9)     // Catch: java.lang.Throwable -> L2c
            goto L1f
        L2c:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2O3.A01(com.instagram.common.session.UserSession, X.2O3):void");
    }

    public final synchronized void A02(final UserSession userSession) {
        if (!A05(userSession) && userSession != null) {
            C25531Mh A0L = C25531Mh.A0L(AbstractC12220kQ.A01(this, userSession));
            A0L.A0M(EnumC907142k.CLIENT_SEND_REQUEST, "trigger_event");
            A0L.Cht();
            this.A04 = true;
            this.A00 = System.currentTimeMillis();
            final C2OE c2oe = this.A03;
            try {
                C2JM c2jm = new C2JM();
                ImmutableList immutableList = C2OE.A01;
                c2jm.A05("supported_behaviors", immutableList);
                boolean z = false;
                if (immutableList != null) {
                    z = true;
                }
                c2jm.A04("surface", "INSTAGRAM_ANDROID");
                C18C.A0E(z);
                C907442n c907442n = new C907442n(c2jm, C907242l.class, "IGPrivacyFlowTriggerQuery", false);
                C907542o c907542o = new C907542o(userSession);
                c907542o.A08(c907442n);
                c907542o.A08 = "ads_viewer_context_policy";
                final C1ON A07 = c907542o.A07(C05F.A01);
                A07.A00 = new C1P1() { // from class: X.42z
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
                    
                        if (r13 == null) goto L28;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x0177 A[Catch: all -> 0x01b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0019, B:6:0x001f, B:8:0x0025, B:10:0x002b, B:13:0x0033, B:15:0x0037, B:17:0x0045, B:19:0x0057, B:21:0x0064, B:25:0x0074, B:27:0x007e, B:29:0x008f, B:31:0x0095, B:37:0x00c1, B:39:0x00e9, B:41:0x00f3, B:43:0x00f7, B:45:0x0103, B:47:0x010b, B:49:0x0117, B:51:0x011f, B:53:0x0125, B:55:0x0150, B:57:0x016f, B:59:0x0177, B:60:0x0183, B:61:0x01a1, B:66:0x014a, B:67:0x012c, B:69:0x0134, B:71:0x013c, B:72:0x0143, B:73:0x0187), top: B:3:0x0019, inners: #2 }] */
                    @Override // X.C1P1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r16) {
                        /*
                            Method dump skipped, instructions count: 442
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C908642z.onSuccessInBackground(java.lang.Object):void");
                    }

                    @Override // X.C1P1
                    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
                        int A03 = C0f9.A03(171546862);
                        C2O3 c2o3 = c2oe.A00;
                        C25531Mh A0L2 = C25531Mh.A0L(AbstractC12220kQ.A01(c2o3, userSession));
                        A0L2.A0M(EnumC907142k.CLIENT_ERROR, "trigger_event");
                        A0L2.A0R("trigger_error", "GraphQL Failure");
                        A0L2.Cht();
                        c2o3.A04 = false;
                        C0w9.A03("PRIVACY_FLOW", AbstractC111324zv.A00(315));
                        C0f9.A0A(-2085576466, A03);
                    }
                };
                C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.430
                    @Override // java.lang.Runnable
                    public final void run() {
                        A07.run();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(750791378, 2, true, true);
                    }
                });
            } catch (IOException e) {
                C0w9.A06("PRIVACY_FLOW", "Error creating query for privacy flow trigger request", e);
            }
        }
    }

    public final boolean A05(UserSession userSession) {
        if (userSession == null || C18U.A06(C06090Tz.A05, userSession, 36312062997169028L)) {
            return false;
        }
        return this.A02.getLong(AnonymousClass001.A0R("privacy_flow_trigger_", userSession.userId), Long.MIN_VALUE) > System.currentTimeMillis();
    }

    @Override // X.InterfaceC13060ls
    public final void Cww(AbstractC12990ll abstractC12990ll) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "privacy_flow_trigger";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.2OE] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, X.0ls, X.2O3] */
    public static synchronized C2O3 A00() {
        C2O3 c2o3;
        synchronized (C2O3.class) {
            C2O3 c2o32 = A05;
            c2o3 = c2o32;
            if (c2o32 == null) {
                C17320tT A01 = AbstractC19750y3.A01("privacy_flow_trigger");
                ?? obj = new Object();
                obj.A04 = false;
                obj.A00 = -1L;
                if (C2OE.A02 == null) {
                    ?? obj2 = new Object();
                    obj2.A00 = obj;
                    C2OE.A02 = obj2;
                    C2OE.A01 = ImmutableList.of((Object) "DEFAULT_LAUNCH");
                }
                obj.A03 = C2OE.A02;
                obj.A02 = A01;
                C24231Gs.A00().A01(obj);
                A05 = obj;
                c2o3 = obj;
            }
        }
        return c2o3;
    }

    public final void A03(final UserSession userSession, boolean z) {
        if (userSession != null && C18U.A06(C06090Tz.A05, userSession, 36312062997234565L)) {
            if (C2OG.A01().A0B() && !z) {
                A01(userSession, this);
                return;
            }
            C2AG c2ag = new C2AG() { // from class: X.2OQ
                @Override // X.C11R
                public final int getRunnableId() {
                    return 750791378;
                }

                @Override // java.util.concurrent.Callable
                public final /* bridge */ /* synthetic */ Object call() {
                    C2O3.A01(userSession, this);
                    return null;
                }
            };
            this.A01 = c2ag;
            C1GJ.A05(c2ag, 750791378, 3, (int) TimeUnit.SECONDS.toMillis(5L), false, true);
        }
    }

    public final void A04(String str, int i) {
        InterfaceC19610xo ARD = this.A02.ARD();
        ARD.E7G(AnonymousClass001.A0R("privacy_flow_trigger_", str), System.currentTimeMillis() + (i * 1000));
        ARD.commit();
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
        UserSession A01;
        if (abstractC12990ll != null && (A01 = AbstractC03270Dk.A01(abstractC12990ll)) != null) {
            A03(A01, false);
        }
    }
}
