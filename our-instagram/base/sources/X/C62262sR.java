package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2sR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62262sR extends C1P1 {
    public int A00;
    public final java.util.Set A01 = new LinkedHashSet();
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final /* synthetic */ C1I1 A03;
    public final /* synthetic */ C61922rt A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C62262sR(C1I1 c1i1, C61922rt c61922rt, boolean z, boolean z2) {
        this.A04 = c61922rt;
        this.A03 = c1i1;
        this.A06 = z;
        this.A05 = z2;
    }

    private final boolean A00() {
        C1I1 c1i1 = this.A03;
        boolean z = c1i1 instanceof C24561Hz;
        boolean A02 = c1i1.A00.A02();
        if (z) {
            if (A02 && this.A00 == 0) {
                return true;
            }
            return false;
        }
        return A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (X.C14360o3.A0K(r5.A04, r13) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C74283Vj r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62262sR.A01(X.3Vj, boolean):void");
    }

    @Override // X.C1P1
    public final void onResponseStarted() {
        IgSignalsTtncEstimator A00 = AbstractC24631Ig.A00(this.A04.A0K);
        if (A00 != null) {
            A00.A04();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r0 != null) goto L21;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62262sR.onSuccessInBackground(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        boolean A02;
        String str2;
        int A03 = C0f9.A03(-543596776);
        C14360o3.A0B(abstractC115105If, 0);
        C61922rt c61922rt = this.A04;
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A04;
        java.util.Set set = c61922rt.A0D;
        if (set != null) {
            c61922rt.A0X.FCF(enumC74603Ws, set);
            c61922rt.A0D = null;
        }
        UserSession userSession = c61922rt.A0K;
        C06090Tz c06090Tz = C06090Tz.A05;
        c61922rt.A0g = C18U.A06(c06090Tz, userSession, 36317594915771770L);
        Runnable runnable = c61922rt.A0f;
        if (runnable != null) {
            runnable.run();
        }
        c61922rt.A0f = null;
        IgSignalsTtncEstimator A00 = AbstractC24631Ig.A00(userSession);
        if (A00 != null) {
            A00.A03();
        }
        C71303Hr A01 = C61922rt.A01(c61922rt);
        EnumC74483Wg enumC74483Wg = EnumC74483Wg.A05;
        A01.A00(enumC74483Wg);
        int i = -1;
        C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
        if (c40781ul != null) {
            i = c40781ul.mStatusCode;
        } else {
            Throwable A012 = abstractC115105If.A01();
            if (A012 instanceof C53093Ne6) {
                C14360o3.A0C(A012, "null cannot be cast to non-null type com.instagram.common.api.base.HttpResponseParseException");
                i = ((C53093Ne6) A012).A00;
            }
        }
        C1I1 c1i1 = this.A03;
        C1EU c1eu = c1i1.A00;
        C1EN c1en = c1eu.A04;
        C1EN c1en2 = C1EN.A06;
        if (c1en == c1en2) {
            C61542rH A002 = AbstractC61532rG.A00(userSession);
            if (c40781ul == null || (str2 = c40781ul.getClientFacingErrorMessage()) == null) {
                str2 = "";
            }
            Long l = A002.A00;
            if (l != null) {
                A002.A02.flowEndFail(l.longValue(), str2, null);
            }
            A002.A00 = null;
        } else if (c1en == C1EN.A0K) {
            C61542rH A003 = AbstractC61532rG.A00(userSession);
            if (c40781ul == null || (str = c40781ul.getClientFacingErrorMessage()) == null) {
                str = "";
            }
            Long l2 = A003.A01;
            if (l2 != null) {
                A003.A02.flowEndFail(l2.longValue(), str, null);
            }
            A003.A01 = null;
        }
        synchronized (c61922rt.A0Z) {
            try {
                c61922rt.A0a.put(new C09530e4(c1eu.A0A, c1eu.A08), enumC74483Wg);
                if (c61922rt.A0A != null) {
                    C14360o3.A0B(c1en, 1);
                    if (c1en != C1EN.A0H && c1en != c1en2) {
                        if (!c61922rt.A0d) {
                            A02 = c61922rt.A0Q.A02();
                        } else {
                            MainFeedLocalDataSource mainFeedLocalDataSource = c61922rt.A06;
                            if (mainFeedLocalDataSource == null) {
                                C14360o3.A0F("mainFeedLocalDataSource");
                                throw C00O.createAndThrow();
                            }
                            A02 = mainFeedLocalDataSource.A0A.A02();
                        }
                        if (A02) {
                            C1QT c1qt = C61852rm.A00(userSession).A04;
                            long generateFlowId = c1qt.generateFlowId(974460658, c1eu.A01);
                            if (c1qt.isOngoingFlow(generateFlowId)) {
                                c1qt.flowMarkPoint(generateFlowId, "FLASH_FEED_FALL_BACK");
                            }
                            c61922rt.A06(null, new C42711Iv6(c1i1, c61922rt), new C4QH((int) C18U.A01(c06090Tz, userSession, 36592571606434420L), 0), C16930sl.A00, 4, true);
                        }
                    }
                    c61922rt.A0V.Dfw(abstractC115105If, c1i1, i);
                    C9BW c9bw = new C9BW(EnumC73363Qm.A05, C05F.A00);
                    C61842rl c61842rl = c61922rt.A0A;
                    C14360o3.A0A(c61842rl);
                    c61842rl.A06(c9bw, abstractC115105If, c1i1, "network fail", A00());
                }
            } catch (Throwable th) {
                C0f9.A0A(-1100109834, A03);
                throw th;
            }
        }
        C0f9.A0A(-1793647375, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        String clientFacingErrorMessage;
        String clientFacingErrorMessage2;
        int A03 = C0f9.A03(1599741089);
        C14360o3.A0B(abstractC115105If, 0);
        C61922rt c61922rt = this.A04;
        UserSession userSession = c61922rt.A0K;
        IgSignalsTtncEstimator A00 = AbstractC24631Ig.A00(userSession);
        if (A00 != null) {
            A00.A03();
        }
        C61992s0 c61992s0 = c61922rt.A0V;
        C1I1 c1i1 = this.A03;
        c61992s0.Dfx(c1i1);
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A04;
        java.util.Set set = c61922rt.A0D;
        if (set != null) {
            c61922rt.A0X.FCF(enumC74603Ws, set);
            c61922rt.A0D = null;
        }
        C1EN c1en = c1i1.A00.A04;
        boolean z = false;
        if (c1en == C1EN.A06) {
            z = true;
        }
        String str = "";
        if (z) {
            C61542rH A002 = AbstractC61532rG.A00(userSession);
            C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
            if (c40781ul != null && (clientFacingErrorMessage2 = c40781ul.getClientFacingErrorMessage()) != null) {
                str = clientFacingErrorMessage2;
            }
            Long l = A002.A00;
            if (l != null) {
                A002.A02.flowEndFail(l.longValue(), str, null);
            }
            A002.A00 = null;
        } else if (c1en == C1EN.A0K) {
            C61542rH A003 = AbstractC61532rG.A00(userSession);
            C40781ul c40781ul2 = (C40781ul) abstractC115105If.A00();
            if (c40781ul2 != null && (clientFacingErrorMessage = c40781ul2.getClientFacingErrorMessage()) != null) {
                str = clientFacingErrorMessage;
            }
            Long l2 = A003.A01;
            if (l2 != null) {
                A003.A02.flowEndFail(l2.longValue(), str, null);
            }
            A003.A01 = null;
        }
        C24651Ii c24651Ii = (C24651Ii) c61922rt.A0c.getValue();
        if (c24651Ii != null) {
            c24651Ii.A04("FEED_NETWORK_REQUEST");
        }
        C0f9.A0A(885655556, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(266651858);
        C1I1 c1i1 = this.A03;
        boolean z = c1i1 instanceof C24561Hz;
        if (z) {
            C61922rt c61922rt = this.A04;
            if (C61922rt.A01(c61922rt).A01 == EnumC74483Wg.A04) {
                if (!C18U.A06(C06090Tz.A05, c61922rt.A0K, 36317594919572886L) || c1i1.A00.A04 == C1EN.A06 || C14360o3.A0K(c61922rt.A04, c1i1)) {
                    C61922rt.A01(c61922rt).A00(EnumC74483Wg.A03);
                }
            }
        }
        C61922rt c61922rt2 = this.A04;
        c61922rt2.A0V.Dg1(c1i1);
        synchronized (c61922rt2.A0Z) {
            if (z) {
                try {
                    Map map = c61922rt2.A0a;
                    C1EU c1eu = c1i1.A00;
                    map.put(new C09530e4(c1eu.A0A, c1eu.A08), EnumC74483Wg.A03);
                } catch (Throwable th) {
                    C0f9.A0A(1372463728, A03);
                    throw th;
                }
            }
            C9BW c9bw = new C9BW(EnumC73363Qm.A05, C05F.A00);
            C61842rl c61842rl = c61922rt2.A0A;
            if (c61842rl != null) {
                c61842rl.A05(c9bw);
            }
        }
        boolean z2 = false;
        if (c1i1.A00.A04 == C1EN.A06) {
            z2 = true;
        }
        if (z2 || C14360o3.A0K(c61922rt2.A04, c1i1)) {
            c61922rt2.A04 = null;
        }
        C61922rt.A03(c61922rt2);
        C3GD.A00(c61922rt2.A0K).A01 = null;
        C24651Ii c24651Ii = (C24651Ii) c61922rt2.A0c.getValue();
        if (c24651Ii != null) {
            c24651Ii.A04("FEED_NETWORK_REQUEST");
        }
        C0f9.A0A(-1089131208, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
    
        if (r5.A0D.containsKey("cached_feed_item_ids") != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62262sR.onStart():void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean contains;
        int i;
        int A03 = C0f9.A03(14584813);
        C74283Vj c74283Vj = (C74283Vj) obj;
        int A032 = C0f9.A03(-500264476);
        C14360o3.A0B(c74283Vj, 0);
        java.util.Set set = this.A01;
        synchronized (set) {
            try {
                contains = set.contains(c74283Vj);
            } catch (Throwable th) {
                C0f9.A0A(1561083996, A032);
                throw th;
            }
        }
        if (contains) {
            i = -747145369;
        } else {
            C61922rt c61922rt = this.A04;
            EnumC74603Ws enumC74603Ws = EnumC74603Ws.A05;
            java.util.Set set2 = c61922rt.A0D;
            if (set2 != null) {
                c61922rt.A0X.FCF(enumC74603Ws, set2);
                c61922rt.A0D = null;
            }
            A01(c74283Vj, false);
            i = -1587953592;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(1380035401, A03);
    }
}
