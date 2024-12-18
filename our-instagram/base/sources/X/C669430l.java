package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.io.StringWriter;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.30l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C669430l implements InterfaceC669530m {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C38321qM A04;
    public C75113Zb A05;
    public EnumC71153Hb A06;
    public C65192xH A07;
    public HBC A08;
    public InterfaceC669830p A09;
    public InterfaceC670130s A0A;
    public C31G A0B;
    public Integer A0C;
    public Map A0D;
    public boolean A0E;
    public C1ON A0F;
    public final Context A0G;
    public final C1OK A0H;
    public final UserSession A0I;
    public final C670230t A0J;
    public final C64042vP A0K;
    public final Integer A0L;

    public C669430l(Context context, UserSession userSession, C64042vP c64042vP, ContextualFeedFragment contextualFeedFragment, Integer num) {
        C14360o3.A0B(userSession, 2);
        this.A0G = context;
        this.A0I = userSession;
        this.A0K = c64042vP;
        this.A0L = num;
        this.A03 = -1;
        this.A0C = C05F.A00;
        this.A09 = new C669730o();
        this.A01 = -1;
        this.A02 = -1;
        this.A0H = new C1OK();
        EnumC669930q[] values = EnumC669930q.values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC669930q enumC669930q : values) {
            linkedHashMap.put(enumC669930q, 0);
        }
        this.A0D = new EnumMap(linkedHashMap);
        this.A0J = new C670230t(this.A0I, new C670030r(this), this.A0K, contextualFeedFragment, this.A0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C38321qM r15, X.C75113Zb r16, X.EnumC71153Hb r17, int r18) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C669430l.A05(X.1qM, X.3Zb, X.3Hb, int):void");
    }

    public final void A06(C38321qM c38321qM, C75113Zb c75113Zb, EnumC71153Hb enumC71153Hb, Integer num, int i) {
        EnumC669930q enumC669930q;
        Integer num2;
        String str;
        C3XG A04;
        C38321qM A02;
        this.A0D = AbstractC06930Yk.A03(AbstractC41707Idd.A02(this.A07));
        UserSession userSession = this.A0I;
        if (AbstractC41707Idd.A03(userSession, CJE.A00(userSession, c38321qM, enumC71153Hb), this.A0D)) {
            this.A0K.A0B(c38321qM, null, null, enumC71153Hb.A00, AbstractC111324zv.A00(246));
            return;
        }
        Map map = this.A0D;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36312874749003144L) && !C18U.A06(c06090Tz, userSession, 36312874755098058L)) {
            enumC669930q = EnumC669930q.A03;
        } else {
            enumC669930q = EnumC669930q.A04;
        }
        int A00 = AbstractC41707Idd.A00(userSession, enumC669930q, map);
        String str2 = null;
        C64042vP c64042vP = this.A0K;
        String str3 = enumC71153Hb.A00;
        if (num != null) {
            num2 = Integer.valueOf((i - num.intValue()) - 1);
        } else {
            num2 = null;
        }
        c64042vP.A0A(c38321qM, num2, str3, A00);
        this.A04 = c38321qM;
        this.A05 = c75113Zb;
        this.A03 = i;
        this.A01 = -1;
        this.A0E = false;
        this.A08 = null;
        this.A06 = enumC71153Hb;
        C65192xH c65192xH = this.A07;
        if (c65192xH != null && (A04 = c65192xH.A04(AbstractC41707Idd.A01(userSession, c38321qM, c65192xH, i).A00)) != null && (A02 = C3XH.A02(A04.A05)) != null) {
            str2 = AbstractC41071vF.A07(userSession, A02);
            str = AbstractC41071vF.A0F(userSession, A02);
        } else {
            str = null;
        }
        Boolean valueOf = Boolean.valueOf(AbstractC41071vF.A0O(userSession, c38321qM));
        String A07 = AbstractC41071vF.A07(userSession, c38321qM);
        if (A07 != null) {
            String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
            if (A0F != null) {
                A07(enumC71153Hb, valueOf, Boolean.valueOf(c38321qM.Cff()), Integer.valueOf(A00), Integer.valueOf(A01(c38321qM).A0z()), Integer.valueOf(A01(c38321qM).A0y()), A07, A0F, c38321qM.A0C.BJN(), str2, str, null, null, null, i, false);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A07(EnumC71153Hb enumC71153Hb, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z) {
        String str9;
        UserSession userSession = this.A0I;
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("discover/chaining_experience_contextual_ads/");
        c25621Ms.A0P(null, HBC.class, C41320IQq.class, false);
        c25621Ms.A00 = this.A0H.A00;
        c25621Ms.A9s("container_module", "feed_timeline");
        c25621Ms.A9s("seed_ad_id", str);
        c25621Ms.A9s(AbstractC111324zv.A00(5264), str2);
        c25621Ms.A0D("position", i);
        c25621Ms.A9s("trigger_type", enumC71153Hb.A00);
        c25621Ms.A9s("inventory_source", C74493Wh.A02(str3));
        c25621Ms.A0A(num, "num_multi_ads_in_feed");
        c25621Ms.A0H("next_slot_ad_id", str4);
        c25621Ms.A0H(AbstractC111324zv.A00(1127), str5);
        c25621Ms.A9s("log_exposure_on_server", "true");
        c25621Ms.A0F(AbstractC111324zv.A00(4780), bool);
        c25621Ms.A0F("is_seed_video_ad", bool2);
        c25621Ms.A0A(num2, "seed_media_width");
        c25621Ms.A0A(num3, "seed_media_height");
        c25621Ms.A0H("multi_ad_individual_chain_ad_tracking_token", str6);
        c25621Ms.A0H("multi_ad_individual_chain_ad_ad_id", str7);
        if (enumC71153Hb == EnumC71153Hb.A0B) {
            c25621Ms.A0H(AbstractC111324zv.A00(4099), str8);
            if (z) {
                str9 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str9 = "0";
            }
            c25621Ms.A0H("is_first_page", str9);
        }
        c25621Ms.A0R = true;
        Context context = this.A0G;
        AbstractC23841Er.A00(context, c25621Ms, userSession, new C1CM(context), false);
        C1ON A0N = c25621Ms.A0N();
        this.A09.DGn(new C85633rs(null, null, null, null, null, null, null, null, AbstractC16960so.A1N(str), false, false, false, false));
        A02(A0N, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r19 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r16.Cff() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r17.A2o == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
    
        if (r19 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0076, code lost:
    
        if (r19 == X.EnumC222416a.A05) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A08(X.C38321qM r16, X.C75113Zb r17, X.EnumC71153Hb r18, X.EnumC222416a r19) {
        /*
            r15 = this;
            r2 = 0
            r3 = 1
            r4 = r18
            int r1 = r4.ordinal()
            r9 = 1
            r10 = r16
            r8 = r19
            r5 = r17
            if (r1 == r2) goto L65
            r0 = 4
            if (r1 == r0) goto L4f
            r0 = 20
            if (r1 != r0) goto L33
            com.instagram.common.session.UserSession r7 = r15.A0I
            X.0Tz r6 = X.C06090Tz.A06
            r0 = 36312874751034778(0x81025e004f059a, double:3.02774644054001E-306)
            boolean r0 = X.C18U.A06(r6, r7, r0)
            if (r0 == 0) goto L33
            X.16a r0 = X.EnumC222416a.A05
            if (r8 == r0) goto L2d
            if (r19 != 0) goto L33
        L2d:
            boolean r0 = r10.Cff()
            if (r0 != 0) goto L79
        L33:
            r9 = 0
        L34:
            r6 = 0
            if (r9 == 0) goto Lbb
            X.2vP r9 = r15.A0K
            r0 = 2
            X.C14360o3.A0B(r9, r0)
            boolean r0 = r5.A2N
            if (r0 == 0) goto L9b
            java.lang.String r13 = r4.A00
            r11 = 0
            r0 = 439(0x1b7, float:6.15E-43)
            java.lang.String r14 = X.AbstractC111324zv.A00(r0)
            r12 = r11
            r9.A0B(r10, r11, r12, r13, r14)
            return r2
        L4f:
            com.instagram.common.session.UserSession r7 = r15.A0I
            X.0Tz r6 = X.C06090Tz.A06
            r0 = 36312874751100315(0x81025e0050059b, double:3.027746440581456E-306)
            boolean r0 = X.C18U.A06(r6, r7, r0)
            if (r0 == 0) goto L33
            X.16a r0 = X.EnumC222416a.A05
            if (r8 == r0) goto L79
            if (r19 == 0) goto L79
            goto L33
        L65:
            com.instagram.common.session.UserSession r7 = r15.A0I
            X.0Tz r6 = X.C06090Tz.A06
            r0 = 36312874751165852(0x81025e0051059c, double:3.0277464406229016E-306)
            boolean r0 = X.C18U.A06(r6, r7, r0)
            if (r0 == 0) goto L33
            X.16a r0 = X.EnumC222416a.A05
            if (r8 == r0) goto L79
            goto L33
        L79:
            boolean r0 = r10.CdW()
            if (r0 != 0) goto L33
            X.341 r1 = r5.A0o
            X.341 r0 = X.AnonymousClass341.A0H
            if (r1 != r0) goto L33
            r0 = 36311839658738461(0x81016d0000031d, double:3.027091844003837E-306)
            boolean r0 = X.C18U.A06(r6, r7, r0)
            if (r0 == 0) goto L33
            boolean r0 = r15.CUl()
            if (r0 != 0) goto L33
            boolean r0 = r5.A2o
            if (r0 != 0) goto L33
            goto L34
        L9b:
            r0 = 100
            X.17u r1 = new X.17u
            r1.<init>(r3, r0)
            X.2Ut r0 = X.AbstractC50712Us.A00
            int r0 = X.C17s.A04(r0, r1)
            double r3 = (double) r0
            com.instagram.common.session.UserSession r5 = r15.A0I
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 37157299679789098(0x84025e003a002a, double:3.561764165710508E-306)
            double r1 = X.C18U.A00(r2, r5, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto Lbb
            r6 = 1
        Lbb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C669430l.A08(X.1qM, X.3Zb, X.3Hb, X.16a):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b9, code lost:
    
        if (r0 != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e8, code lost:
    
        if (X.AbstractC41071vF.A0O(r4, r18) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013f, code lost:
    
        if ((r12 + 1) == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0154, code lost:
    
        if (r0 != r13) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0196, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0199, code lost:
    
        if ((r12 + 2) == r6) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019b, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019c, code lost:
    
        if (r16 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019e, code lost:
    
        if (r15 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a0, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x018c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09(X.C38321qM r18, X.C75113Zb r19, X.EnumC71153Hb r20, java.lang.Integer r21) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C669430l.A09(X.1qM, X.3Zb, X.3Hb, java.lang.Integer):boolean");
    }

    @Override // X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        C14360o3.A0B(interfaceC670130s, 0);
        C14360o3.A0B(interfaceC669830p, 1);
        this.A0A = interfaceC670130s;
        this.A09 = interfaceC669830p;
        return true;
    }

    @Override // X.InterfaceC669530m
    public final int BX5() {
        return 0;
    }

    @Override // X.InterfaceC669530m
    public final int Bg5() {
        return 0;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC669530m
    public final void Co5() {
    }

    @Override // X.InterfaceC669530m
    public final void CoL(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, boolean z) {
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        C14360o3.A0B(anonymousClass320, 1);
        C14360o3.A0B(enumC37671p4, 3);
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void Dtv(int i) {
    }

    public static final C1ON A00(EnumC71153Hb enumC71153Hb, C669430l c669430l, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        if (str == null || str2 == null) {
            C0w9.A03(AbstractC111324zv.A00(1668), AnonymousClass001.A0u("seedMediaId or mediaAuthorIgid is null for POE request.seedMediaId = ", str, ", mediaAuthorIgid = ", str2));
        }
        UserSession userSession = c669430l.A0I;
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("discover/chaining_experience_contextual_ads/");
        c25621Ms.A0R(HBC.class, C41320IQq.class);
        c25621Ms.A00 = c669430l.A0H.A00;
        c25621Ms.A9s("container_module", "feed_timeline");
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0d();
        if (str != null) {
            A0A.A0S(AbstractC111324zv.A00(5265), str);
        }
        if (str2 != null) {
            A0A.A0S(AbstractC111324zv.A00(2699), str2);
        }
        A0A.A0a();
        A0A.close();
        String obj = stringWriter.toString();
        C14360o3.A07(obj);
        c25621Ms.A9s(AbstractC111324zv.A00(1159), obj);
        c25621Ms.A9s("trigger_type", enumC71153Hb.A00);
        c25621Ms.A0D("position", i);
        c25621Ms.A9s("inventory_source", C74493Wh.A02(str3));
        c25621Ms.A0D("num_multi_ads_in_feed", i2);
        c25621Ms.A0H("next_slot_ad_id", str4);
        c25621Ms.A0H(AbstractC111324zv.A00(1127), str5);
        Context context = c669430l.A0G;
        AbstractC23841Er.A00(context, c25621Ms, userSession, new C1CM(context), false);
        return c25621Ms.A0N();
    }

    public static final void A02(C1ON c1on, C669430l c669430l) {
        c669430l.A0C = C05F.A01;
        C670230t c670230t = c669430l.A0J;
        c670230t.A03 = true;
        c1on.A00 = new HGL(c670230t);
        c669430l.A0F = c1on;
        C1GJ.A06(c1on, 332178420, 2, true, true);
    }

    public static final void A03(C1ON c1on, C669430l c669430l) {
        c669430l.A0C = C05F.A01;
        C670230t c670230t = c669430l.A0J;
        c670230t.A03 = true;
        c1on.A00 = new HGL(c670230t);
        c669430l.A0F = c1on;
        C1GJ.A06(c1on, 2028084327, 2, true, true);
    }

    public final void A04() {
        EnumC71153Hb enumC71153Hb;
        if (this.A0C == C05F.A01) {
            Integer num = this.A0L;
            Integer num2 = C05F.A00;
            if (num == num2 && (enumC71153Hb = this.A06) != null) {
                C64042vP c64042vP = this.A0K;
                C38321qM c38321qM = this.A04;
                if (c38321qM == null) {
                    C14360o3.A0F("seedMedia");
                    throw C00O.createAndThrow();
                }
                c64042vP.A0B(c38321qM, null, null, enumC71153Hb.A00, "cancel_fetch");
            }
            this.A0J.A03 = false;
            this.A0H.A00();
            this.A0C = num2;
        }
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ boolean AFs() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ String B5L() {
        return "";
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return new HashSet();
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        if (this.A0C == C05F.A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void Cnx(boolean z) {
        throw new UnsupportedOperationException(AbstractC111324zv.A00(53));
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
        this.A0J.A03 = false;
        this.A0H.A00();
    }

    public static final C38321qM A01(C38321qM c38321qM) {
        C38321qM A1e;
        if (c38321qM.A5Q()) {
            return c38321qM.A1d();
        }
        if (!c38321qM.A5M() || (A1e = c38321qM.A1e(0)) == null) {
            return c38321qM;
        }
        return A1e;
    }
}
