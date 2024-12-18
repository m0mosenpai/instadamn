package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: X.1CI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CI implements InterfaceC13050lr {
    public static final Object A09 = new Object();
    public long A00;
    public C14160ng A01;
    public C1I1 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final UserSession A06;
    public final C1CK A07;
    public final C1CJ A08;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        if (r8 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.content.Context r7, android.content.Intent r8, java.lang.String r9) {
        /*
            r6 = this;
            r5 = 0
            com.instagram.common.session.UserSession r4 = r6.A06
            X.0vz r0 = X.AbstractC12960li.A00
            X.18s r0 = X.C226218q.A01(r0)
            boolean r0 = r0.A0Y(r8)
            if (r0 != 0) goto La1
            if (r9 == 0) goto La1
            java.lang.String r0 = "not_initialized"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "feed_timeline"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto La1
        L23:
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36323642228944336(0x810c2900012dd0, double:3.034555836927168E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            r2 = 0
            if (r0 == 0) goto La6
            if (r8 == 0) goto La4
            android.net.Uri r1 = r8.getData()
            if (r1 == 0) goto La4
            java.lang.String r0 = "entry_point"
            java.lang.String r1 = r1.getQueryParameter(r0)
        L40:
            java.lang.String r0 = "via_push_notification"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto La6
            android.net.Uri r1 = r8.getData()
            if (r1 == 0) goto La2
            java.lang.String r0 = "push_category"
            java.lang.String r1 = r1.getQueryParameter(r0)
        L56:
            java.lang.String r0 = "post"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L6c
            android.net.Uri r1 = r8.getData()
            if (r1 == 0) goto L6c
            java.lang.String r0 = "media_id"
            java.lang.String r2 = r1.getQueryParameter(r0)
        L6c:
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_SHOULD_DISABLE_AD_LOAD_ON_MAIN_ACTIVITY"
            boolean r0 = r8.getBooleanExtra(r0, r5)
        L72:
            r6.A04(r7, r4, r2, r0)
            X.1Lr r0 = X.AbstractC25351Lp.A00(r4)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318539807725866(0x8107850000192a, double:3.031329045202806E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L9a
            if (r8 == 0) goto L9a
            android.net.Uri r0 = r8.getData()
            java.lang.String r1 = X.AbstractC34771FTu.A00(r0)
            java.lang.String r0 = r4.userId
            boolean r0 = X.AbstractC002300n.A0g(r1, r0, r5)
            if (r0 == 0) goto La1
        L9a:
            X.1LD r0 = X.C1LB.A00(r4)
            r0.A04(r4)
        La1:
            return
        La2:
            r1 = r2
            goto L56
        La4:
            r1 = r2
            goto L40
        La6:
            r0 = 0
            if (r8 == 0) goto L72
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1CI.A03(android.content.Context, android.content.Intent, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0088 A[Catch: all -> 0x01f8, TryCatch #2 {, blocks: (B:18:0x0023, B:20:0x0027, B:24:0x0030, B:29:0x003e, B:31:0x0045, B:27:0x004c, B:32:0x0051, B:34:0x0057, B:36:0x0066, B:38:0x007a, B:39:0x0084, B:41:0x0088, B:43:0x0092, B:45:0x0096, B:47:0x009c, B:51:0x0191, B:52:0x019b, B:54:0x019f, B:55:0x01c5, B:57:0x01c9, B:58:0x01ef, B:59:0x00ab, B:60:0x00b2, B:67:0x00c1, B:69:0x00e5, B:71:0x00eb, B:73:0x00fc, B:75:0x0102, B:77:0x0117, B:78:0x0125, B:79:0x0131, B:82:0x0160, B:81:0x013f, B:62:0x0169, B:64:0x0176, B:65:0x0184, B:84:0x0162), top: B:17:0x0023, outer: #3, inners: #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019f A[Catch: all -> 0x01f8, TryCatch #2 {, blocks: (B:18:0x0023, B:20:0x0027, B:24:0x0030, B:29:0x003e, B:31:0x0045, B:27:0x004c, B:32:0x0051, B:34:0x0057, B:36:0x0066, B:38:0x007a, B:39:0x0084, B:41:0x0088, B:43:0x0092, B:45:0x0096, B:47:0x009c, B:51:0x0191, B:52:0x019b, B:54:0x019f, B:55:0x01c5, B:57:0x01c9, B:58:0x01ef, B:59:0x00ab, B:60:0x00b2, B:67:0x00c1, B:69:0x00e5, B:71:0x00eb, B:73:0x00fc, B:75:0x0102, B:77:0x0117, B:78:0x0125, B:79:0x0131, B:82:0x0160, B:81:0x013f, B:62:0x0169, B:64:0x0176, B:65:0x0184, B:84:0x0162), top: B:17:0x0023, outer: #3, inners: #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c5 A[Catch: all -> 0x01f8, TryCatch #2 {, blocks: (B:18:0x0023, B:20:0x0027, B:24:0x0030, B:29:0x003e, B:31:0x0045, B:27:0x004c, B:32:0x0051, B:34:0x0057, B:36:0x0066, B:38:0x007a, B:39:0x0084, B:41:0x0088, B:43:0x0092, B:45:0x0096, B:47:0x009c, B:51:0x0191, B:52:0x019b, B:54:0x019f, B:55:0x01c5, B:57:0x01c9, B:58:0x01ef, B:59:0x00ab, B:60:0x00b2, B:67:0x00c1, B:69:0x00e5, B:71:0x00eb, B:73:0x00fc, B:75:0x0102, B:77:0x0117, B:78:0x0125, B:79:0x0131, B:82:0x0160, B:81:0x013f, B:62:0x0169, B:64:0x0176, B:65:0x0184, B:84:0x0162), top: B:17:0x0023, outer: #3, inners: #4, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.content.Context r24, com.instagram.common.session.UserSession r25, java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1CI.A04(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, boolean):void");
    }

    public final void A05(C74283Vj c74283Vj) {
        C38321qM A02;
        C38321qM A022;
        C38321qM A023;
        Iterator it = c74283Vj.A00().iterator();
        C3XG c3xg = null;
        C3XG c3xg2 = null;
        while (it.hasNext() && (!this.A05 || !this.A04)) {
            C3XG c3xg3 = (C3XG) it.next();
            C1XV c1xv = c3xg3.A06;
            if ((c1xv == C1XV.A0Y || c1xv == C1XV.A0H) && (A022 = C3XH.A02(c3xg3.A05)) != null && A022.A55() && !this.A05 && c3xg == null) {
                c3xg = c3xg3;
            }
            InterfaceC38381qS interfaceC38381qS = c3xg3.A05;
            C38321qM A024 = C3XH.A02(interfaceC38381qS);
            if (A024 != null && A024.A55() && (A023 = C3XH.A02(interfaceC38381qS)) != null && A023.CdW() && !this.A04 && c3xg2 == null) {
                c3xg2 = c3xg3;
            }
        }
        if (c3xg != null && (A02 = C3XH.A02(c3xg.A05)) != null) {
            this.A05 = this.A08.A02(A02, true, false, true);
        }
        if (c3xg2 != null && c3xg2 != c3xg) {
            InterfaceC38381qS interfaceC38381qS2 = c3xg2.A05;
            if (C3XH.A02(interfaceC38381qS2) != null) {
                C1CJ c1cj = this.A08;
                C38321qM A025 = C3XH.A02(interfaceC38381qS2);
                if (A025 != null) {
                    this.A04 = c1cj.A02(A025, false, true, false);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void A06(boolean z) {
        final InterfaceC09390do A00;
        if (this.A01 == null && this.A02 == null) {
            if (Systrace.A0E(1L)) {
                C0fO.A01("prepareMainFeedRequest", 2071890181);
            }
            try {
                UserSession userSession = this.A06;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36328057460178050L)) {
                    A00 = new C28111Xp(new C17590tu(new C17800uI("")));
                } else if (C18U.A06(c06090Tz, userSession, 36327108267555122L)) {
                    A00 = new C28111Xp(new C17590tu(AbstractC17610tw.A00(userSession)));
                } else {
                    A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EK(this, 6));
                }
                C14160ng c14160ng = new C14160ng(new Callable() { // from class: X.4z5
                    @Override // java.util.concurrent.Callable
                    public final /* bridge */ /* synthetic */ Object call() {
                        return C1CI.A00((C17590tu) A00.getValue(), C1CI.this, null, false);
                    }
                }, 198, 1, false, true);
                if (!z) {
                    C14120nc.A00().ATN(c14160ng);
                } else {
                    c14160ng.A00.run();
                }
                this.A01 = c14160ng;
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-316906274);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(914046387);
                }
                throw th;
            }
        }
    }

    public /* synthetic */ C1CI(UserSession userSession, C1CJ c1cj) {
        C1CK c1ck = new C1CK(userSession);
        this.A06 = userSession;
        this.A08 = c1cj;
        this.A07 = c1ck;
    }

    public static final C1I0 A00(C17590tu c17590tu, C1CI c1ci, String str, boolean z) {
        String A00;
        boolean z2;
        int i;
        String str2 = str;
        if (Systrace.A0E(1L)) {
            C0fO.A01("createFeedRequest", -1421660832);
        }
        try {
            C1EN c1en = C1EN.A06;
            Long l = null;
            if (C1EO.A00 != null) {
                A00 = C1EO.A00;
                C1EO.A00 = null;
                z2 = true;
            } else {
                A00 = C1EP.A00();
                z2 = false;
            }
            UserSession userSession = c1ci.A06;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36328057456639061L)) {
                l = Long.valueOf(C1AT.A01(userSession).A03(C1AV.A2A).getLong("lastHeadLoadTimeMs", -1L));
            }
            C1CK c1ck = c1ci.A07;
            C14360o3.A0A(A00);
            C1ES A002 = C1ER.A00(userSession, c1en, null, null, false);
            if (C18U.A04(c06090Tz, userSession, 36886592182289118L).length() != 0) {
                str2 = C18U.A04(c06090Tz, userSession, 36886592182289118L);
            }
            Integer num = C05F.A00;
            C1ET c1et = new C1ET(num);
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            String obj = UUID.randomUUID().toString();
            C14360o3.A07(obj);
            C1EU c1eu = new C1EU(c1et, c17590tu, c1en, A002, l, A00, null, null, null, obj, str2, c16920sk, c16920sk, C1EU.A0G.incrementAndGet(), z2, z);
            UserSession userSession2 = c1ck.A00;
            if (C18U.A06(c06090Tz, userSession2, 36316246295187647L)) {
                i = (int) C18U.A01(c06090Tz, userSession2, 36597721271962532L);
            } else {
                i = -10;
            }
            C1I0 A003 = c1ck.A02.A00(c1eu, i);
            C18720vz c18720vz = AbstractC12960li.A00;
            C226418s.A06(C226218q.A01(c18720vz).A02, "ranking_session_id", A00);
            C226418s A01 = C226218q.A01(c18720vz);
            String str3 = A003.A00.A09;
            C226418s.A06(A01.A02, "feed_request_id", str3);
            int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            C1I6 A004 = C1I5.A00(userSession);
            A004.A02 = str3;
            A004.A01 = A00;
            A004.A00 = num;
            if (Systrace.A0E(1L)) {
                C0fO.A00(149725392);
            }
            return A003;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(606866314);
            }
            throw th;
        }
    }

    public static final void A01() {
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        C226418s.A0B(A01, new C3XW(A01.A0G.getValue()), new C9EK(A01, 12));
    }

    public static final void A02(C1CI c1ci, boolean z) {
        IgSignalsTtncEstimator A00;
        Integer num;
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        C226418s.A0B(A01, new C24621If(A01.A0G.getValue()), new C9EK(A01, 9));
        C1KX c1kx = A01.A05;
        if (c1kx != null) {
            int ordinal = c1kx.A0O.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A01;
                }
            } else {
                num = C05F.A00;
            }
            IgSignalsTtncEstimator A002 = AbstractC24631Ig.A00(c1ci.A06);
            if (A002 != null) {
                A002.A05(num, z);
                return;
            }
        }
        if (A01.A07 != null || (A00 = AbstractC24631Ig.A00(c1ci.A06)) == null) {
            return;
        }
        A00.A05(C05F.A00, z);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C11T.A02(new RunnableC43095J3k(this));
    }
}
