package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61842rl implements InterfaceC60602pj {
    public int A00;
    public long A01;
    public C673932e A02;
    public AnonymousClass316 A03;
    public C31T A04;
    public C31S A05;
    public C65192xH A06;
    public InterfaceC670430v A07;
    public EnumC73363Qm A08;
    public C669430l A09;
    public C669430l A0A;
    public C1I2 A0B;
    public C32S A0C;
    public AnonymousClass315 A0D;
    public C31E A0E;
    public C673732c A0F;
    public C674432j A0G;
    public C3BJ A0H;
    public String A0I;
    public String A0J;
    public List A0K;
    public InterfaceC16820sZ A0L;
    public boolean A0M;
    public boolean A0N;
    public C71143Ha A0O;
    public final Handler A0P;
    public final UserSession A0Q;
    public final InterfaceC15680qO A0R;
    public final InterfaceC60442pS A0S;
    public final AbstractC61692rW A0T;
    public final C62212sM A0U;
    public final C61512rE A0V;
    public final C61882rp A0W;
    public final C61912rs A0X;
    public final C61762rd A0Y;
    public final C61442r7 A0Z;
    public final C61552rI A0a;
    public final C61862rn A0b;
    public final C61212qj A0c;
    public final C62142sF A0d;
    public final C61922rt A0e;
    public final C61562rJ A0f;
    public final C61572rK A0g;
    public final C61892rq A0h;
    public final C61742rb A0i;
    public final C1PH A0j;
    public final C1M1 A0k;
    public final C62182sJ A0l;
    public final C60662pp A0m;
    public final C61832rk A0n;
    public final C61902rr A0o;
    public final InterfaceC09390do A0p;
    public final InterfaceC16820sZ A0q;

    public final void A05(C9BW c9bw) {
        C674432j c674432j;
        this.A0a.A00("FEED_REQUEST_FINISHED");
        int ordinal = ((EnumC73363Qm) c9bw.A01).ordinal();
        if (ordinal != 2) {
            if (ordinal == 0) {
                if (!C18U.A06(C06090Tz.A05, C3GD.A00(this.A0Q).A02, 36317594915509622L) && (c674432j = this.A0G) != null) {
                    c674432j.A04 = true;
                    c674432j.A00 = 0;
                    return;
                }
                return;
            }
            return;
        }
        this.A0m.A0X(false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r0.mStatusCode != 429) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C9BW r11, X.AbstractC115105If r12, X.C1I1 r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61842rl.A06(X.9BW, X.5If, X.1I1, java.lang.String, boolean):void");
    }

    public final boolean A0A(C1EN c1en, String str, Map map) {
        C14360o3.A0B(c1en, 0);
        return this.A0e.A0B(c1en, str, map);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.30n, X.3Ha] */
    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        W5F w5f;
        C14360o3.A0B(view, 0);
        C674432j c674432j = this.A0G;
        if (c674432j != null) {
            c674432j.A04 = true;
            c674432j.A00 = 0;
        }
        C673932e c673932e = this.A02;
        if (c673932e != null) {
            this.A0m.A0A().A1y.EDY(c673932e);
        }
        AnonymousClass316 anonymousClass316 = this.A03;
        if (anonymousClass316 != null) {
            this.A0m.A0A().A1y.EDY(anonymousClass316);
        }
        C1I2 c1i2 = this.A0B;
        if (c1i2 != null) {
            this.A0m.A0A().A1y.EDY(c1i2);
        }
        C31S c31s = this.A05;
        if (c31s != null) {
            C19700xy c19700xy = C17280tP.A4E;
            Context context = view.getContext();
            C14360o3.A07(context);
            if (c19700xy.A01(context).A0U() && (w5f = c31s.A00) != null) {
                View inflate = ((ViewStub) view.requireViewById(R.id.feed_sponsored_pool_debug_overlay)).inflate();
                C14360o3.A0A(inflate);
                w5f.A02(inflate);
            }
        }
        final C669430l c669430l = this.A09;
        if (c669430l != null) {
            final UserSession userSession = this.A0Q;
            C3HZ A00 = C3HY.A00(userSession);
            ?? r0 = new InterfaceC669630n(userSession, c669430l) { // from class: X.3Ha
                public boolean A00;
                public final Map A01;
                public final UserSession A02;
                public final C669430l A03;
                public final Map A04;
                public final Map A05;
                public final java.util.Set A06 = new LinkedHashSet();
                public final boolean A07;

                @Override // X.InterfaceC669630n
                public final String B5L() {
                    return "feed_iaa";
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
                
                    if (X.C17s.A04(X.AbstractC50712Us.A00, new X.C17u(1, 100)) > X.C18U.A00(X.C06090Tz.A06, r28.A02, 37160516607082618L)) goto L16;
                 */
                @Override // X.InterfaceC669630n
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void CKM(X.C206209Bd r29, java.util.List r30) {
                    /*
                        Method dump skipped, instructions count: 574
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C71143Ha.CKM(X.9Bd, java.util.List):void");
                }

                {
                    this.A03 = c669430l;
                    this.A02 = userSession;
                    AnonymousClass317 anonymousClass317 = AnonymousClass317.A0K;
                    EnumC71153Hb enumC71153Hb = EnumC71153Hb.A0I;
                    C09530e4 c09530e4 = new C09530e4(anonymousClass317, enumC71153Hb);
                    AnonymousClass317 anonymousClass3172 = AnonymousClass317.A0X;
                    EnumC71153Hb enumC71153Hb2 = EnumC71153Hb.A0Q;
                    this.A04 = AbstractC06930Yk.A06(c09530e4, new C09530e4(anonymousClass3172, enumC71153Hb2));
                    AnonymousClass317 anonymousClass3173 = AnonymousClass317.A0W;
                    EnumC71153Hb enumC71153Hb3 = EnumC71153Hb.A0P;
                    this.A05 = AbstractC16850sd.A0M(new C09530e4(anonymousClass3173, enumC71153Hb3));
                    this.A01 = AbstractC06930Yk.A06(new C09530e4(AnonymousClass317.A06, EnumC71153Hb.A05), new C09530e4(AnonymousClass317.A0D, EnumC71153Hb.A0E), new C09530e4(AnonymousClass317.A0A, EnumC71153Hb.A0C), new C09530e4(AnonymousClass317.A0L, EnumC71153Hb.A0J), new C09530e4(AnonymousClass317.A0O, EnumC71153Hb.A0K), new C09530e4(AnonymousClass317.A0B, EnumC71153Hb.A0D), new C09530e4(AnonymousClass317.A0M, EnumC71153Hb.A09), new C09530e4(AnonymousClass317.A0Q, EnumC71153Hb.A0M), new C09530e4(anonymousClass317, enumC71153Hb), new C09530e4(anonymousClass3172, enumC71153Hb2), new C09530e4(AnonymousClass317.A0V, EnumC71153Hb.A0O), new C09530e4(AnonymousClass317.A0I, EnumC71153Hb.A0G), new C09530e4(anonymousClass3173, enumC71153Hb3));
                    this.A07 = C18U.A06(C06090Tz.A06, userSession, 36316091676364754L);
                }

                @Override // X.InterfaceC669630n
                public final java.util.Set Bts() {
                    Boolean bool;
                    Boolean bool2;
                    if (!this.A07) {
                        return C16910sj.A00;
                    }
                    if (!this.A00) {
                        java.util.Set keySet = this.A04.keySet();
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(keySet, 10));
                        Iterator it = keySet.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AnonymousClass317) it.next()).A01);
                        }
                        ArrayList A0U = AbstractC001800i.A0U(arrayList);
                        UserSession userSession2 = this.A02;
                        C06090Tz c06090Tz = C06090Tz.A06;
                        List A0R = AbstractC001900j.A0R(C18U.A04(c06090Tz, userSession2, 36879041629847787L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                        List<String> A0R2 = AbstractC001900j.A0R(C18U.A04(c06090Tz, userSession2, 36879041630241004L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                        A0U.addAll(A0R);
                        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A0U, 10));
                        Iterator it2 = A0U.iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            AnonymousClass317[] values = AnonymousClass317.values();
                            int length = values.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    AnonymousClass317 anonymousClass317 = values[i];
                                    if (C14360o3.A0K(anonymousClass317.A01, AbstractC001900j.A0B(str).toString())) {
                                        bool2 = Boolean.valueOf(this.A06.add(new C206209Bd(EnumC64262vl.A05, anonymousClass317, EnumC64222vh.A06)));
                                        break;
                                    }
                                    i++;
                                } else {
                                    bool2 = null;
                                    break;
                                }
                            }
                            arrayList2.add(bool2);
                        }
                        ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(A0R2, 10));
                        for (String str2 : A0R2) {
                            AnonymousClass317[] values2 = AnonymousClass317.values();
                            int length2 = values2.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length2) {
                                    AnonymousClass317 anonymousClass3172 = values2[i2];
                                    if (C14360o3.A0K(anonymousClass3172.A01, AbstractC001900j.A0B(str2).toString())) {
                                        bool = Boolean.valueOf(this.A06.add(new C206209Bd(EnumC64262vl.A04, anonymousClass3172, EnumC64222vh.A06)));
                                        break;
                                    }
                                    i2++;
                                } else {
                                    bool = null;
                                    break;
                                }
                            }
                            arrayList3.add(bool);
                        }
                        A0U.addAll(A0R2);
                        this.A00 = true;
                    }
                    ImmutableSet A03 = ImmutableSet.A03(this.A06);
                    C14360o3.A07(A03);
                    return A03;
                }
            };
            A00.A00(r0);
            this.A0O = r0;
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final InterfaceC15680qO A00(C61842rl c61842rl) {
        if (C18U.A06(C06090Tz.A05, c61842rl.A0Q, 36325695223706905L)) {
            return c61842rl.A0l;
        }
        return c61842rl.A0R;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01cc, code lost:
    
        if (r14.A0c != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f3, code lost:
    
        if (r22 != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0266, code lost:
    
        if (r5 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0306, code lost:
    
        if (X.C18U.A06(r6, r15, 36317594915771770L) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0338, code lost:
    
        if (r19 != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x033a, code lost:
    
        if (r23 != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0336, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2) > X.C18U.A01(r6, X.C3GD.A00(r15).A02, 36599069892873639L)) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (X.C18U.A06(r6, r11, 36317594918655376L) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (r1 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010c, code lost:
    
        if (r1.contains("TOUCH") != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017a, code lost:
    
        if (r13.equals(r14) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a0, code lost:
    
        if (X.C14360o3.A0K(((X.C74283Vj) r0.get(0)).A0I, r32.A0I) == false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Integer A01(X.C1I1 r31, X.C74283Vj r32, X.EnumC73363Qm r33, int r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61842rl.A01(X.1I1, X.3Vj, X.3Qm, int, boolean):java.lang.Integer");
    }

    private final void A02(int i) {
        C674432j c674432j = this.A0G;
        if (c674432j != null) {
            if (i > 0) {
                c674432j.A00 = i;
                return;
            }
            long A01 = C18U.A01(C06090Tz.A05, this.A0Q, 36599069893004712L);
            if (A01 > 0) {
                long max = Math.max(0L, A01);
                if (max < 100) {
                    return;
                }
                c674432j.A04 = false;
                this.A0P.postDelayed(new J4B(c674432j), max);
                return;
            }
            c674432j.A04 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(X.C1EU r29, X.C74283Vj r30, X.EnumC73363Qm r31, X.C61842rl r32, java.lang.Integer r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61842rl.A03(X.1EU, X.3Vj, X.3Qm, X.2rl, java.lang.Integer, boolean, boolean, boolean):boolean");
    }

    public final void A04() {
        if (Systrace.A0E(1L)) {
            C0fO.A01("MainFeedDeliveryController.start", -1117460952);
        }
        try {
            this.A0e.A09(this, false);
            C18150uz.A0B.A03(A00(this));
            if (Systrace.A0E(1L)) {
                C0fO.A00(-236283220);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1825362048);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.HA1, X.1um] */
    public final void A08(JHB jhb, boolean z) {
        Long l;
        EnumC74483Wg enumC74483Wg = C61922rt.A01(this.A0e).A01;
        if (enumC74483Wg != null) {
            if (enumC74483Wg != EnumC74483Wg.A04 || z) {
                C62152sG c62152sG = this.A0d.A02;
                C62162sH c62162sH = c62152sG.A02;
                HA1 ha1 = c62162sH.A01;
                if ((ha1 == null || !ha1.A00) && !c62162sH.A03) {
                    HGN hgn = new HGN(jhb, c62162sH);
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = c62162sH.A00;
                    UserSession userSession = c62152sG.A01;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (j > C18U.A01(c06090Tz, userSession, 36607814445110940L) || ((l = c62162sH.A02) != null && currentTimeMillis - l.longValue() >= TimeUnit.SECONDS.toMillis(C18U.A01(c06090Tz, userSession, 36607814445242013L)))) {
                        ?? c40791um = new C40791um();
                        c40791um.A00 = true;
                        hgn.A00(c40791um);
                        return;
                    }
                    c62162sH.A03 = true;
                    C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                    c25621Ms.A06();
                    c25621Ms.A0B("feed/new_feed_posts_exist/");
                    if (C18U.A06(c06090Tz, userSession, 36326339468605258L)) {
                        c25621Ms.A9s("can_source_bumpable_post", "true");
                    }
                    c25621Ms.A0R(HA1.class, C41322IQs.class);
                    C1ON A0N = c25621Ms.A0N();
                    A0N.A00 = hgn;
                    c62152sG.A00.schedule(A0N);
                }
            }
        }
    }

    public final void A09(Integer num) {
        C61892rq c61892rq = this.A0h;
        RunnableC43154J5r runnableC43154J5r = new RunnableC43154J5r(this, num, c61892rq.A04, c61892rq.A03);
        if (C18U.A06(C06090Tz.A05, this.A0Q, 2342156502435366946L)) {
            if (!r6.isEmpty()) {
                if (num != C05F.A01 && num != C05F.A0u) {
                    if (num != C05F.A15) {
                        c61892rq.A01 = false;
                    }
                } else {
                    c61892rq.A01 = false;
                    this.A0m.A0D();
                    this.A0P.postDelayed(runnableC43154J5r, 500L);
                    return;
                }
            } else {
                return;
            }
        }
        runnableC43154J5r.run();
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        C32S c32s = this.A0C;
        if (c32s != null) {
            c32s.A0B();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C673932e c673932e = this.A02;
        if (c673932e != null) {
            this.A0m.A0A().A1y.F9f(c673932e);
        }
        C1I2 c1i2 = this.A0B;
        if (c1i2 != null) {
            this.A0m.A0A().A1y.F9f(c1i2);
        }
        C71143Ha c71143Ha = this.A0O;
        if (c71143Ha != null) {
            C3HY.A00(this.A0Q).A01(c71143Ha);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        C32S c32s = this.A0C;
        if (c32s != null) {
            c32s.A0Z.DrD();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C669430l c669430l = this.A09;
        if (c669430l != null) {
            c669430l.A04();
        }
        C32S c32s = this.A0C;
        if (c32s != null) {
            c32s.A0Z.DrJ();
        }
    }

    public /* synthetic */ C61842rl(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC60442pS interfaceC60442pS, AbstractC61692rW abstractC61692rW, C61512rE c61512rE, C61762rd c61762rd, C61602rN c61602rN, C61442r7 c61442r7, C61552rI c61552rI, C61212qj c61212qj, C61562rJ c61562rJ, C61572rK c61572rK, C61582rL c61582rL, C61742rb c61742rb, InterfaceC61432r6 interfaceC61432r6, C1M1 c1m1, C60662pp c60662pp, C61832rk c61832rk) {
        C61862rn A00 = C61852rm.A00(userSession);
        C61882rp A002 = AbstractC61872ro.A00(userSession);
        C14360o3.A0B(c1m1, 6);
        C14360o3.A0B(c61212qj, 9);
        C14360o3.A0B(c61572rK, 13);
        C14360o3.A0B(A00, 14);
        C14360o3.A0B(A002, 22);
        this.A0Q = userSession;
        this.A0m = c60662pp;
        this.A0S = interfaceC60442pS;
        this.A0Z = c61442r7;
        this.A0k = c1m1;
        this.A0a = c61552rI;
        this.A0n = c61832rk;
        this.A0c = c61212qj;
        this.A0V = c61512rE;
        this.A0f = c61562rJ;
        this.A0g = c61572rK;
        this.A0b = A00;
        this.A0T = abstractC61692rW;
        this.A0i = c61742rb;
        this.A0Y = c61762rd;
        this.A0W = A002;
        C28071Xl.A00(c60662pp.requireContext(), userSession);
        this.A0h = new C61892rq(userSession);
        this.A0o = new C61902rr(c60662pp, userSession, interfaceC60442pS, c61442r7);
        C61912rs c61912rs = new C61912rs(userSession);
        this.A0X = c61912rs;
        this.A0e = new C61922rt(context, abstractC018607g, userSession, interfaceC60442pS, c61912rs, c61602rN, c61442r7, c61552rI, c61562rJ, c61582rL, c61742rb, interfaceC61432r6, c1m1);
        this.A0d = new C62142sF(abstractC018607g, userSession);
        this.A0P = new Handler(Looper.getMainLooper());
        this.A0p = AbstractC09440dt.A01(C62172sI.A00);
        this.A0I = "";
        this.A0J = "";
        C9EN c9en = new C9EN(this, 41);
        this.A0q = c9en;
        this.A0l = new C62182sJ(c9en);
        this.A0R = new InterfaceC15680qO() { // from class: X.2sL
            @Override // X.InterfaceC15680qO
            public final void onConnectionChanged(NetworkInfo networkInfo) {
                if (networkInfo != null && networkInfo.isConnected()) {
                    final C61842rl c61842rl = C61842rl.this;
                    ((Handler) c61842rl.A0p.getValue()).post(new Runnable() { // from class: X.3Jh
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC16820sZ interfaceC16820sZ = C61842rl.this.A0L;
                            if (interfaceC16820sZ != null) {
                                interfaceC16820sZ.invoke();
                            }
                        }
                    });
                }
            }
        };
        C1PH A003 = C1PH.A00(userSession);
        C14360o3.A07(A003);
        this.A0j = A003;
        this.A0U = new C62212sM(userSession);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x01cd, code lost:
    
        if (X.C3Q3.A00(r7.A00).A00() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0698, code lost:
    
        if (r1 != 1) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0708, code lost:
    
        if (r1 == X.C05F.A01) goto L358;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:297:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06f1  */
    /* JADX WARN: Type inference failed for: r12v6, types: [X.05A] */
    /* JADX WARN: Type inference failed for: r35v0, types: [X.3Vj, X.1um, X.3Vk] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v9, types: [X.0sl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.C9BW r33, X.C1I1 r34, X.C74283Vj r35, int r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 2496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61842rl.A07(X.9BW, X.1I1, X.3Vj, int, boolean):void");
    }
}
