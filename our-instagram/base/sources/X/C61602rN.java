package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2rN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61602rN extends AbstractC60592pi implements InterfaceC60442pS, InterfaceC61312qt, InterfaceC61612rO {
    public static final Handler A0d = new Handler(Looper.getMainLooper());
    public static final String __redex_internal_original_name = "StoriesAdsPrefetchController";
    public C69473Ah A01;
    public AbstractC69533An A02;
    public C32S A03;
    public boolean A04;
    public boolean A05;
    public long A06;
    public C61672rU A07;
    public boolean A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final Context A0C;
    public final UserSession A0D;
    public final C61252qn A0F;
    public final Double A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final long A0R;
    public final AbstractC018607g A0S;
    public final InterfaceC11380iw A0T;
    public final InterfaceC60442pS A0U;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final RunnableC61622rP A0E = new RunnableC61622rP(this);
    public final InterfaceC61642rR A0V = new InterfaceC61642rR() { // from class: X.2rQ
        @Override // X.InterfaceC61642rR
        public final void AJs(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, Double d, String str, String str2, boolean z) {
            String str3;
            C61602rN c61602rN = C61602rN.this;
            if (!z && c61602rN.A05) {
                C32S c32s = c61602rN.A03;
                if (c32s != null && c61602rN.A0N) {
                    c32s.A0X.CiF(null, null, null, "INSTAGRAM_PREFETCH_REQUEST_ODML_LOW_VALUE_PREDICTION", false, false);
                }
                c61602rN.A00.markerEnd(424097382, (short) 3);
                return;
            }
            c61602rN.A00.markerEnd(424097382, (short) 2);
            if (str != null) {
                for (Integer num : C05F.A00(8)) {
                    switch (num.intValue()) {
                        case 1:
                            str3 = "STORIES_TRAY_REFRESH";
                            break;
                        case 2:
                            str3 = "FEED_TIMELINE_REFRESH";
                            break;
                        case 3:
                            str3 = "ON_STORIES_LAUNCHING";
                            break;
                        case 4:
                            str3 = "STORIES_TRAY_SCROLL_STATE_CHANGE";
                            break;
                        case 5:
                            str3 = "STORIES_TRAY_CLIENT_SIDE_RESORT";
                            break;
                        case 6:
                            str3 = "SCREEN_TRAY_TIME_THRESHOLD_MET";
                            break;
                        case 7:
                            str3 = "WARM_START_NO_REFRESH";
                            break;
                        default:
                            str3 = AbstractC111324zv.A00(3750);
                            break;
                    }
                    if (str3.equalsIgnoreCase(str)) {
                        C61602rN.A04(new C9C3(d, null, null, 5, false), c61602rN, num, str2);
                    }
                }
            }
            num = null;
            C61602rN.A04(new C9C3(d, null, null, 5, false), c61602rN, num, str2);
        }
    };
    public C006802i A00 = C006802i.A0p;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        if (this.A0X) {
            UserSession userSession = this.A0D;
            InterfaceC11380iw interfaceC11380iw = this.A0T;
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(interfaceC11380iw, 2);
            C64012vM c64012vM = new C64012vM(interfaceC11380iw, userSession, null, null, null);
            this.A03 = C1P7.A01(this.A0C, this.A0S, userSession, this, C3G2.A1L, new C32O() { // from class: X.3GJ
                @Override // X.C32O
                public final void D3D() {
                }

                @Override // X.C32O
                public final void DyU(Collection collection, int i) {
                }

                @Override // X.C32O
                public final /* bridge */ /* synthetic */ void D7b(Object obj, List list, int i) {
                }
            }, c64012vM.A04);
            C61672rU c61672rU = this.A07;
            if (c61672rU != null && this.A0c) {
                InterfaceC61642rR interfaceC61642rR = this.A0V;
                C14360o3.A0B(interfaceC61642rR, 0);
                c61672rU.A00 = new WeakReference(interfaceC61642rR);
            }
        }
    }

    @Override // X.InterfaceC61312qt
    public final void DKn(boolean z) {
    }

    @Override // X.InterfaceC61322qu
    public final void DXf(long j, int i) {
    }

    @Override // X.InterfaceC61322qu
    public final void DXg(long j) {
    }

    @Override // X.InterfaceC61312qt
    public final void DeD(Integer num, int i, long j, boolean z) {
    }

    @Override // X.InterfaceC61312qt
    public final /* synthetic */ void DeG() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_feed_timeline";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A08 = false;
        this.A0F.A0H(this);
        A0d.removeCallbacks(this.A0E);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        this.A08 = true;
        this.A0F.A0G(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r7.A0c() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private double A00(long r12) {
        /*
            r11 = this;
            com.instagram.common.session.UserSession r0 = r11.A0D
            com.instagram.reels.store.ReelStore r1 = X.C1OU.A04(r0)
            r0 = 0
            java.util.List r0 = r1.A0U(r0)
            java.util.Iterator r10 = r0.iterator()
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = 0
        L14:
            long r5 = (long) r9
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 >= 0) goto L4d
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r7 = r10.next()
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7
            boolean r6 = r7.A0e()
            boolean r0 = r7.A0d()
            if (r0 != 0) goto L36
            boolean r5 = r7.A0c()
            r0 = 0
            if (r5 == 0) goto L37
        L36:
            r0 = 1
        L37:
            if (r6 != 0) goto L14
            if (r0 != 0) goto L14
            X.1qd r0 = r7.A0M
            if (r0 == 0) goto L14
            java.lang.Double r0 = r0.A0T
            if (r0 == 0) goto L14
            double r7 = r0.doubleValue()
            double r5 = r3 - r7
            double r1 = r1 * r5
            int r9 = r9 + 1
            goto L14
        L4d:
            int r0 = java.lang.Double.compare(r1, r3)
            if (r0 == 0) goto L54
            double r3 = r3 - r1
        L54:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61602rN.A00(long):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r7.A0c() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.C120595d4 A02() {
        /*
            r15 = this;
            boolean r0 = r15.A0b
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            com.instagram.common.session.UserSession r5 = r15.A0D
            com.instagram.reels.store.ReelStore r0 = X.C1OU.A04(r5)
            r3 = 0
            java.util.List r4 = r0.A0U(r3)
            r10 = 4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r4.iterator()
            r8 = 0
        L1c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r7 = r9.next()
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7
            boolean r6 = r7.A0e()
            boolean r0 = r7.A0d()
            if (r0 != 0) goto L39
            boolean r1 = r7.A0c()
            r0 = 0
            if (r1 == 0) goto L3a
        L39:
            r0 = 1
        L3a:
            if (r6 != 0) goto L1c
            if (r0 != 0) goto L1c
            X.1qd r0 = r7.A0M
            if (r0 == 0) goto L1c
            java.lang.Double r0 = r0.A0T
            if (r0 == 0) goto L1c
            r2.add(r0)
            int r8 = r8 + 1
            if (r8 >= r10) goto L4e
            goto L1c
        L4e:
            r1 = 0
            r14 = 0
        L50:
            int r0 = r4.size()
            if (r1 >= r0) goto L73
            java.lang.Object r0 = r4.get(r1)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            boolean r0 = r0.A0e()
            if (r0 != 0) goto L70
            java.lang.Object r0 = r4.get(r1)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            boolean r0 = r0.A16(r5)
            if (r0 != 0) goto L70
            int r14 = r14 + 1
        L70:
            int r1 = r1 + 1
            goto L50
        L73:
            long r0 = r15.A06
            double r4 = r15.A00(r0)
            double r6 = A01(r2, r3)
            r0 = 1
            double r8 = A01(r2, r0)
            r0 = 2
            double r10 = A01(r2, r0)
            r0 = 3
            double r12 = A01(r2, r0)
            X.5d4 r3 = new X.5d4
            r3.<init>(r4, r6, r8, r10, r12, r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61602rN.A02():X.5d4");
    }

    public static void A03(C9C3 c9c3, C61602rN c61602rN, EnumC37671p4 enumC37671p4, Integer num, String str, int i) {
        String A00;
        if (c61602rN.A08 && c61602rN.A03 != null) {
            AnonymousClass320 A002 = AbstractC74043Tv.A00(c61602rN.A02.A02(), c61602rN.A0F.A0R, i);
            C32S c32s = c61602rN.A03;
            if (num == null) {
                A00 = null;
            } else {
                A00 = AbstractC73373Qn.A00(num);
            }
            double A003 = c61602rN.A00(c61602rN.A0A);
            HashSet hashSet = new HashSet();
            Iterator it = c32s.A0Y.A03().iterator();
            while (it.hasNext()) {
                hashSet.add(c32s.A0R.BF8(((InterfaceC42381xS) it.next()).BUM()));
            }
            Iterator it2 = c32s.A0b.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!((C5I4) entry.getValue()).CWh() && !hashSet.contains(entry.getKey()) && ((C5I4) entry.getValue()).C03() == C5I5.A05) {
                    it2.remove();
                }
            }
            C32S.A07(c32s, true);
            c32s.A0T.CoM(c9c3, A002, enumC37671p4, A00, str, A003, false);
        }
    }

    public static void A04(C9C3 c9c3, C61602rN c61602rN, Integer num, String str) {
        Handler handler = A0d;
        RunnableC61622rP runnableC61622rP = c61602rN.A0E;
        handler.removeCallbacks(runnableC61622rP);
        if (!c61602rN.A0Z) {
            runnableC61622rP.A01 = num;
            runnableC61622rP.A02 = str;
            runnableC61622rP.A00 = c9c3;
            handler.postDelayed(runnableC61622rP, c61602rN.A0R);
            return;
        }
        A03(c9c3, runnableC61622rP.A03, EnumC37671p4.A03, num, str, 0);
    }

    public static void A05(C61602rN c61602rN, Integer num, String str) {
        InterfaceC61642rR interfaceC61642rR;
        long A04;
        if (c61602rN.A0Q) {
            boolean z = c61602rN.A0K;
            if (!z || Double.compare(c61602rN.A00(c61602rN.A0A), c61602rN.A0G.doubleValue()) >= 0) {
                if (!c61602rN.A0H || (!C1BU.A00().A03())) {
                    if (c61602rN.A0I) {
                        C1GI c1gi = C1GI.A02;
                        if (c1gi == null) {
                            c1gi = new C1GI();
                            C1GI.A02 = c1gi;
                        }
                        C14360o3.A0C(c1gi, "null cannot be cast to non-null type com.instagram.common.api.base.LatencyEstimatorRecorder");
                        String A00 = C1HO.A00();
                        synchronized (c1gi) {
                            C14360o3.A0B(A00, 0);
                            if (AbstractC15820qc.A0D()) {
                                A00 = AnonymousClass001.A0R(A00, "_wifi");
                            }
                            C3JR c3jr = (C3JR) c1gi.A01.get(A00);
                            if (c3jr != null) {
                                synchronized (c3jr) {
                                    A04 = c3jr.A00 / c3jr.A01.size();
                                }
                            } else {
                                A04 = c1gi.A00.A04(A00, -1L);
                            }
                        }
                        if (A04 == -1 || A04 >= c61602rN.A09) {
                            return;
                        }
                    }
                    C61672rU c61672rU = c61602rN.A07;
                    if (!z && c61672rU != null) {
                        if (!c61602rN.A0a) {
                            C006802i c006802i = c61602rN.A00;
                            c006802i.markerStart(424097382);
                            C120595d4 A02 = c61602rN.A02();
                            c006802i.markerPoint(424097382, "immediate_signals_extracted");
                            if (!c61602rN.A0c) {
                                interfaceC61642rR = c61602rN.A0V;
                            } else {
                                interfaceC61642rR = null;
                            }
                            c61672rU.A03(c61602rN.A0C.getApplicationContext(), c006802i, interfaceC61642rR, A02, null, null, c61602rN.A0F.A0A, AbstractC73373Qn.A00(num), str);
                            return;
                        }
                        A04(new C9C3(null, c61602rN.A02(), c61602rN.A0F.A0A, 5, true), c61602rN, num, str);
                        return;
                    }
                    A04(null, c61602rN, num, str);
                }
            }
        }
    }

    public final void A06(boolean z) {
        if (this.A0Y && !z && !this.A04 && !this.A0F.A0G) {
            A05(this, C05F.A15, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r5 == false) goto L6;
     */
    @Override // X.InterfaceC61312qt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void De4(boolean r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r3.A0W
            r2 = 1
            if (r0 == 0) goto L8
            r1 = 1
            if (r5 != 0) goto L9
        L8:
            r1 = 0
        L9:
            boolean r0 = r3.A0M
            if (r0 == 0) goto L22
            boolean r0 = r3.A04
            if (r0 != 0) goto L17
            X.2qn r0 = r3.A0F
            boolean r0 = r0.A0G
            if (r0 == 0) goto L22
        L17:
            if (r1 == 0) goto L21
            if (r2 != 0) goto L21
            java.lang.Integer r1 = X.C05F.A0j
            r0 = 0
            A05(r3, r1, r0)
        L21:
            return
        L22:
            r2 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61602rN.De4(boolean, boolean):void");
    }

    @Override // X.InterfaceC61312qt
    public final void DeE(C1OP c1op, String str, int i, long j, boolean z, boolean z2) {
        if (!this.A0M || !this.A04) {
            if (i != -1) {
                UserSession userSession = this.A0D;
                C14360o3.A0B(userSession, 1);
                if (i != 2) {
                    if (!C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(userSession).A00, 36317212663157696L)) {
                        return;
                    }
                }
            }
            A05(this, C05F.A01, AbstractC25631Mt.A00(c1op.A04));
        }
    }

    @Override // X.InterfaceC61612rO
    public final void Dig() {
        if (!this.A0M || !this.A04) {
            A05(this, C05F.A0u, null);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        C32S c32s = this.A03;
        if (c32s != null) {
            c32s.A0B();
            this.A03 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x017d, code lost:
    
        if (X.C18U.A06(r2, r9, 36310538284040316L) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (X.AbstractC61652rS.A00(r9) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C61602rN(X.AbstractC018607g r6, X.AbstractC60672pq r7, X.InterfaceC11380iw r8, com.instagram.common.session.UserSession r9, X.InterfaceC60442pS r10) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61602rN.<init>(X.07g, X.2pq, X.0iw, com.instagram.common.session.UserSession, X.2pS):void");
    }

    public static double A01(List list, int i) {
        if (i < list.size()) {
            return ((Number) list.get(i)).doubleValue();
        }
        return -1.0d;
    }
}
