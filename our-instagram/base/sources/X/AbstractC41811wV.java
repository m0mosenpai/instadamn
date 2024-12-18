package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1wV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41811wV {
    public static volatile HeroPlayerSetting A00;

    public static int A00(Context context, int i) {
        return (int) AbstractC25551Ml.A00(context, C1Mk.A07, "", 1.0f, i, false).A00();
    }

    public static C42301xK A06() {
        C438220p c438220p = new C438220p();
        c438220p.A02(550000);
        c438220p.A06(3000000);
        c438220p.A05(8000000);
        c438220p.A04(20000000);
        return c438220p.A00();
    }

    public static C42301xK A07(UserSession userSession) {
        C438220p c438220p = new C438220p();
        c438220p.A07(AnonymousClass293.A00(userSession).booleanValue());
        c438220p.A01(AnonymousClass294.A00(userSession).intValue());
        c438220p.A02(AnonymousClass295.A00(userSession).intValue());
        c438220p.A06(AnonymousClass296.A00(userSession).intValue());
        c438220p.A05(AnonymousClass297.A00(userSession).intValue());
        c438220p.A04(AnonymousClass298.A00(userSession).intValue());
        c438220p.A03(AnonymousClass299.A00(userSession).intValue());
        return c438220p.A00();
    }

    public static C42301xK A08(UserSession userSession) {
        C438220p c438220p = new C438220p();
        c438220p.A07(true);
        c438220p.A01(AbstractC438920w.A00(userSession).intValue());
        c438220p.A02(AbstractC439020x.A00(userSession).intValue());
        c438220p.A06(AbstractC439120y.A00(userSession).intValue());
        c438220p.A05(AbstractC439220z.A00(userSession).intValue());
        c438220p.A04(AnonymousClass210.A00(userSession).intValue());
        c438220p.A03(AbstractC438820v.A00(userSession).intValue());
        return c438220p.A00();
    }

    public static C42301xK A09(UserSession userSession) {
        C438220p c438220p = new C438220p();
        c438220p.A07(true);
        c438220p.A01(AbstractC438320q.A00(userSession).intValue());
        c438220p.A02(AbstractC438420r.A00(userSession).intValue());
        c438220p.A06(AbstractC438520s.A00(userSession).intValue());
        c438220p.A05(AbstractC438620t.A00(userSession).intValue());
        c438220p.A04(AbstractC438720u.A00(userSession).intValue());
        c438220p.A03(AbstractC438820v.A00(userSession).intValue());
        return c438220p.A00();
    }

    public static C42301xK A0C(UserSession userSession) {
        C438220p c438220p = new C438220p();
        c438220p.A07(AbstractC458628u.A00(userSession).booleanValue());
        c438220p.A01(AbstractC458828w.A00(userSession).intValue());
        c438220p.A02(AbstractC458928x.A00(userSession).intValue());
        c438220p.A06(AbstractC459028y.A00(userSession).intValue());
        c438220p.A05(AbstractC459128z.A00(userSession).intValue());
        c438220p.A04(AnonymousClass290.A00(userSession).intValue());
        c438220p.A03(AnonymousClass291.A00(userSession).intValue());
        return c438220p.A00();
    }

    public static C42231xD A0D() {
        C437620j c437620j = new C437620j();
        c437620j.A01();
        return c437620j.A00();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.27H] */
    public static C41861wa A0F(UserSession userSession) {
        ?? r1 = new Object() { // from class: X.27H
            public boolean A0e;
            public boolean A0f;
            public boolean A0g;
            public boolean A0h;
            public boolean A0i;
            public boolean A0j;
            public boolean A0k;
            public boolean A0l;
            public boolean A0R = false;
            public boolean A0M = false;
            public boolean A0d = false;
            public boolean A0c = false;
            public boolean A0b = false;
            public boolean A0a = false;
            public boolean A0E = false;
            public boolean A0K = false;
            public boolean A0P = false;
            public boolean A0Q = false;
            public boolean A0C = false;
            public boolean A0D = false;
            public boolean A0O = false;
            public boolean A0Z = false;
            public boolean A0J = false;
            public boolean A0L = false;
            public boolean A0I = false;
            public boolean A06 = false;
            public boolean A0H = false;
            public boolean A09 = false;
            public long A02 = -1;
            public boolean A0F = false;
            public int A01 = 0;
            public boolean A05 = false;
            public boolean A0B = false;
            public boolean A0A = false;
            public boolean A0N = false;
            public boolean A0W = false;
            public boolean A0V = false;
            public boolean A0Y = false;
            public boolean A0G = false;
            public boolean A07 = false;
            public boolean A03 = false;
            public int A00 = 100;
            public boolean A0U = false;
            public boolean A0T = false;
            public boolean A04 = false;
            public boolean A08 = false;
            public boolean A0S = false;
            public boolean A0X = false;

            public final C41861wa A00() {
                boolean z = this.A0R;
                boolean z2 = this.A0M;
                boolean z3 = this.A0d;
                boolean z4 = this.A0c;
                boolean z5 = this.A0b;
                boolean z6 = this.A0a;
                boolean z7 = this.A0E;
                boolean z8 = this.A0K;
                boolean z9 = this.A0P;
                boolean z10 = this.A0Q;
                boolean z11 = this.A0C;
                boolean z12 = this.A0D;
                boolean z13 = this.A0O;
                boolean z14 = this.A0Z;
                boolean z15 = this.A0J;
                boolean z16 = this.A0L;
                boolean z17 = this.A0I;
                boolean z18 = this.A06;
                boolean z19 = this.A0H;
                boolean z20 = this.A09;
                long j = this.A02;
                boolean z21 = this.A0F;
                return new C41861wa(this.A01, this.A00, j, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, this.A0h, this.A05, this.A0B, this.A0i, this.A0j, this.A0k, this.A0g, this.A0f, this.A0A, this.A0N, this.A0W, this.A0e, this.A0l, this.A0V, this.A0Y, this.A0G, this.A07, this.A03, this.A0U, this.A0T, this.A04, this.A08, this.A0S, this.A0X);
            }

            public final void A01(int i) {
                this.A00 = i;
            }

            public final void A02(int i) {
                this.A01 = i;
            }

            public final void A03(long j) {
                this.A02 = j;
            }

            public final void A04(boolean z) {
                this.A03 = z;
            }

            public final void A05(boolean z) {
                this.A0e = z;
            }

            public final void A06(boolean z) {
                this.A04 = z;
            }

            public final void A07(boolean z) {
                this.A0f = z;
            }

            public final void A08(boolean z) {
                this.A05 = z;
            }

            public final void A09(boolean z) {
                this.A06 = z;
            }

            public final void A0A(boolean z) {
                this.A07 = z;
            }

            public final void A0B(boolean z) {
                this.A08 = z;
            }

            public final void A0C(boolean z) {
                this.A0g = z;
            }

            public final void A0D(boolean z) {
                this.A09 = z;
            }

            public final void A0E(boolean z) {
                this.A0A = z;
            }

            public final void A0F(boolean z) {
                this.A0B = z;
            }

            public final void A0G(boolean z) {
                this.A0C = z;
            }

            public final void A0H(boolean z) {
                this.A0D = z;
            }

            public final void A0I(boolean z) {
                this.A0h = z;
            }

            public final void A0J(boolean z) {
                this.A0E = z;
            }

            public final void A0K(boolean z) {
                this.A0F = z;
            }

            public final void A0L(boolean z) {
                this.A0G = z;
            }

            public final void A0M(boolean z) {
                this.A0H = z;
            }

            public final void A0N(boolean z) {
                this.A0I = z;
            }

            public final void A0O(boolean z) {
                this.A0J = z;
            }

            public final void A0P(boolean z) {
                this.A0K = z;
            }

            public final void A0Q(boolean z) {
                this.A0L = z;
            }

            public final void A0R(boolean z) {
                this.A0M = z;
            }

            public final void A0S(boolean z) {
                this.A0N = z;
            }

            public final void A0T(boolean z) {
                this.A0i = z;
            }

            public final void A0U(boolean z) {
                this.A0O = z;
            }

            public final void A0V(boolean z) {
                this.A0P = z;
            }

            public final void A0W(boolean z) {
                this.A0Q = z;
            }

            public final void A0X(boolean z) {
                this.A0j = z;
            }

            public final void A0Y(boolean z) {
                this.A0R = z;
            }

            public final void A0Z(boolean z) {
                this.A0k = z;
            }

            public final void A0a(boolean z) {
                this.A0S = z;
            }

            public final void A0b(boolean z) {
                this.A0T = z;
            }

            public final void A0c(boolean z) {
                this.A0U = z;
            }

            public final void A0d(boolean z) {
                this.A0V = z;
            }

            public final void A0e(boolean z) {
                this.A0W = z;
            }

            public final void A0f(boolean z) {
                this.A0X = z;
            }

            public final void A0g(boolean z) {
                this.A0Y = z;
            }

            public final void A0h(boolean z) {
                this.A0Z = z;
            }

            public final void A0i(boolean z) {
                this.A0l = z;
            }

            public final void A0j(boolean z) {
                this.A0a = z;
            }

            public final void A0k(boolean z) {
                this.A0b = z;
            }

            public final void A0l(boolean z) {
                this.A0c = z;
            }

            public final void A0m(boolean z) {
                this.A0d = z;
            }
        };
        r1.A0Y(C27K.A00(userSession).booleanValue());
        r1.A0R(C27M.A00(userSession).booleanValue());
        r1.A0N(C27O.A00(userSession).booleanValue());
        r1.A0m(C27P.A00(userSession).booleanValue());
        r1.A0l(C27Q.A00(userSession).booleanValue());
        r1.A0k(C27R.A00(userSession).booleanValue());
        r1.A0j(C27T.A00(userSession).booleanValue());
        r1.A0J(C27U.A00(userSession).booleanValue());
        r1.A09(C27W.A00(userSession).booleanValue());
        r1.A0M(AbstractC454127a.A00(userSession).booleanValue());
        r1.A0D(AbstractC454727h.A00(userSession).booleanValue());
        r1.A0P(AbstractC454827i.A00(userSession).booleanValue());
        r1.A0V(AbstractC455027k.A00(userSession).booleanValue());
        r1.A0W(AbstractC455227m.A00(userSession).booleanValue());
        r1.A0G(AbstractC455427o.A00(userSession).booleanValue());
        r1.A0H(AbstractC455727r.A00(userSession).booleanValue());
        r1.A0U(AbstractC456027u.A00(userSession).booleanValue());
        r1.A0h(AbstractC456227w.A00(userSession).booleanValue());
        r1.A0O(AbstractC456427y.A00(userSession).booleanValue());
        r1.A0Q(AbstractC456527z.A00(userSession).booleanValue());
        r1.A03(AnonymousClass281.A00(userSession).longValue());
        r1.A0K(AnonymousClass284.A00(userSession).booleanValue());
        r1.A02(AnonymousClass285.A00(userSession).intValue());
        r1.A0I(AnonymousClass286.A00(userSession).booleanValue());
        r1.A08(AnonymousClass287.A00(userSession).booleanValue());
        r1.A0F(AnonymousClass288.A00(userSession).booleanValue());
        r1.A0T(AnonymousClass289.A00(userSession).booleanValue());
        r1.A0X(C28A.A00(userSession).booleanValue());
        r1.A0Z(C28B.A00(userSession).booleanValue());
        r1.A0C(C28C.A00(userSession).booleanValue());
        r1.A07(C28D.A00(userSession).booleanValue());
        r1.A0E(C28E.A00(userSession).booleanValue());
        r1.A0S(C28F.A00(userSession).booleanValue());
        r1.A0e(C28G.A00(userSession).booleanValue());
        r1.A0i(C28H.A00(userSession).booleanValue());
        r1.A05(C28I.A00(userSession).booleanValue());
        r1.A0d(C28J.A00(userSession).booleanValue());
        r1.A01(C28K.A00(userSession).intValue());
        r1.A0g(C28L.A00(userSession).booleanValue());
        r1.A0L(C28M.A00(userSession).booleanValue());
        r1.A0A(C28N.A00(userSession).booleanValue());
        r1.A04(C28O.A00(userSession).booleanValue());
        r1.A0c(C28P.A00(userSession).booleanValue());
        r1.A0b(C28Q.A00(userSession).booleanValue());
        r1.A06(C28R.A00(userSession).booleanValue());
        r1.A0f(C28S.A00(userSession).booleanValue());
        r1.A0B(C28T.A00(userSession).booleanValue());
        r1.A0a(C28U.A00(userSession).booleanValue());
        return r1.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x019f, code lost:
    
        if (X.C21D.A00(r7).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0228, code lost:
    
        if (X.AbstractC22764A2i.A00(r7).booleanValue() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0262, code lost:
    
        if (X.AbstractC22778A2w.A00(r7).booleanValue() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0525, code lost:
    
        if (X.AbstractC443122n.A00(r7).booleanValue() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0053, code lost:
    
        if (X.AbstractC42641xs.A00(r7).booleanValue() != false) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v104, types: [X.21Y] */
    /* JADX WARN: Type inference failed for: r0v403, types: [X.28X] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.video.heroplayer.setting.HeroPlayerSetting A0G(android.content.Context r6, com.instagram.common.session.UserSession r7) {
        /*
            Method dump skipped, instructions count: 2867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41811wV.A0G(android.content.Context, com.instagram.common.session.UserSession):com.facebook.video.heroplayer.setting.HeroPlayerSetting");
    }

    public static String A0J(Context context, long j) {
        C1Mk c1Mk = C1Mk.A07;
        C1N3 A002 = AbstractC25551Ml.A00(context, c1Mk, "", 0.1f, j, true);
        if (A002.A00() <= 0) {
            A002 = AbstractC25551Ml.A00(context, c1Mk, "", 0.1f, j, false);
        }
        if (A002.A00() <= 0) {
            C0w9.A03("IgExoVideoCache", "Couldn't create exo video cache");
        }
        return A002.A01().getAbsolutePath();
    }

    public static ArrayList A0L(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)) {
            String[] split = str2.split(":");
            arrayList.add(new Pair(Integer.valueOf(Integer.parseInt(split[0].trim())), Integer.valueOf(Integer.parseInt(split[1].trim()))));
        }
        return arrayList;
    }

    public static HashMap A0M(UserSession userSession) {
        Boolean A002;
        C441321v A01;
        HashMap hashMap = new HashMap();
        C440521n c440521n = new C440521n();
        c440521n.A0C(AbstractC441121t.A00(userSession).intValue());
        c440521n.A0N("low");
        c440521n.A0M("");
        C441321v A012 = c440521n.A01();
        if (C21W.A00(userSession).booleanValue()) {
            A002 = AbstractC441421w.A01(userSession);
        } else {
            A002 = AbstractC441421w.A00(userSession);
        }
        if (A002.booleanValue()) {
            A01 = C441321v.A01(AbstractC22779A2x.A00(userSession));
            A012 = C441321v.A01(AbstractC22780A2y.A00(userSession));
        } else {
            C440521n c440521n2 = new C440521n();
            c440521n2.A0L(AbstractC441521x.A00(userSession));
            c440521n2.A09(AbstractC441721z.A00(userSession).intValue());
            c440521n2.A0J(AnonymousClass220.A00(userSession).intValue());
            c440521n2.A0G(AnonymousClass221.A00(userSession).intValue());
            c440521n2.A02(AnonymousClass222.A00(userSession).doubleValue());
            c440521n2.A0K(AnonymousClass223.A00(userSession).intValue());
            c440521n2.A03(AnonymousClass224.A00(userSession).doubleValue());
            c440521n2.A04(AnonymousClass226.A00(userSession).longValue());
            c440521n2.A07(AnonymousClass227.A00(userSession).doubleValue());
            c440521n2.A08(AnonymousClass228.A00(userSession).doubleValue());
            c440521n2.A0S(C22A.A00(userSession).booleanValue());
            c440521n2.A0O(C22B.A00(userSession).booleanValue());
            c440521n2.A0P(C22D.A00(userSession).booleanValue());
            c440521n2.A0E(C22E.A00(userSession).intValue());
            c440521n2.A0D(C22G.A00(userSession).intValue());
            c440521n2.A0F(C22H.A00(userSession).intValue());
            c440521n2.A05(C22I.A00(userSession).doubleValue());
            c440521n2.A06(C22J.A00(userSession).doubleValue());
            c440521n2.A0M(C22K.A00(userSession));
            c440521n2.A0Q(C22L.A00(userSession).booleanValue());
            c440521n2.A0A(C22N.A00(userSession).intValue());
            c440521n2.A0H(C22O.A00(userSession).intValue());
            c440521n2.A0N(C22Q.A00(userSession));
            c440521n2.A0I(C22R.A00(userSession).intValue());
            c440521n2.A0B(C22S.A00(userSession).intValue());
            c440521n2.A0R(C22T.A00(userSession).booleanValue());
            A01 = c440521n2.A01();
        }
        if (C22U.A00(userSession).booleanValue()) {
            hashMap.put(EnumC440821q.A02, A01);
            hashMap.put(EnumC440821q.A04, A012);
        }
        return hashMap;
    }

    public static HashSet A0O(String str) {
        String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        HashSet hashSet = new HashSet();
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                hashSet.add(str2);
            }
        }
        return hashSet;
    }

    public static void A0P(C446523v c446523v, UserSession userSession, int i) {
        c446523v.A0D(Math.min(396, i));
        c446523v.A0E(Math.min(504, i));
        int min = Math.min(i, 504);
        c446523v.A0B(min);
        c446523v.A0C(min);
        double doubleValue = C24F.A00(userSession).doubleValue();
        double doubleValue2 = C24G.A00(userSession).doubleValue();
        C24I.A00(userSession);
        C24J.A00(userSession);
        c446523v.A0C(AnonymousClass247.A00(userSession).intValue());
        c446523v.A0B(C24K.A00(userSession).intValue());
        c446523v.A0D(AnonymousClass246.A00(userSession).intValue());
        c446523v.A0E(C24S.A00(userSession).intValue());
        c446523v.A07((float) doubleValue);
        c446523v.A06((float) doubleValue2);
        C24T.A00(userSession);
        C24V.A00(userSession);
        C24W.A00(userSession);
        C24X.A00(userSession);
        C24Y.A00(userSession);
        C24Z.A00(userSession);
        AbstractC447124b.A00(userSession);
    }

    public static int A01(UserSession userSession) {
        Long A002;
        if (AbstractC442322f.A00(userSession).booleanValue()) {
            A002 = AbstractC106584rC.A00(userSession);
        } else {
            A002 = AbstractC442522h.A00(userSession);
        }
        return A002.intValue();
    }

    public static int A02(UserSession userSession) {
        return AbstractC442722j.A00(userSession).intValue();
    }

    public static int A03(UserSession userSession) {
        int i = 104857600;
        if (C0JK.A01().A08()) {
            i = 183500800;
        }
        if (AbstractC42991yS.A00(userSession).booleanValue()) {
            return i + (AbstractC22765A2j.A00(userSession).intValue() * 1024 * 1024);
        }
        return i;
    }

    public static int A04(UserSession userSession) {
        int intValue = C23M.A00(userSession).intValue();
        if (intValue <= 1) {
            return C23N.A00(userSession).intValue();
        }
        return intValue;
    }

    public static int A05(UserSession userSession, int i) {
        ArrayList A0L = A0L(AbstractC107204sR.A00(userSession));
        C46642Cc.A08 = new InterfaceC16820sZ() { // from class: X.4sS
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                Long valueOf;
                valueOf = Long.valueOf(C0JK.A01().A06());
                return valueOf;
            }
        };
        HashMap hashMap = new HashMap();
        Pair pair = (Pair) A0L.get(1);
        C4HI c4hi = C4HI.A0C;
        if (pair != null) {
            hashMap.put(c4hi, pair.first);
        } else {
            hashMap.put(c4hi, -1);
        }
        Pair pair2 = (Pair) A0L.get(2);
        C4HI c4hi2 = C4HI.A0D;
        if (pair2 != null) {
            hashMap.put(c4hi2, pair2.first);
        } else {
            hashMap.put(c4hi2, -1);
        }
        C206209Bd c206209Bd = new C206209Bd();
        EnumC46722Ck enumC46722Ck = EnumC46722Ck.A0B;
        c206209Bd.A03(enumC46722Ck);
        c206209Bd.A04(hashMap);
        C46642Cc.A03 = c206209Bd.A02();
        HashMap hashMap2 = new HashMap();
        Pair pair3 = (Pair) A0L.get(0);
        if (pair3 != null) {
            hashMap2.put(c4hi, Integer.valueOf(((Number) pair3.second).intValue() * 1048576));
        } else {
            hashMap2.put(c4hi, -1);
        }
        Pair pair4 = (Pair) A0L.get(1);
        if (pair4 != null) {
            hashMap2.put(c4hi2, Integer.valueOf(((Number) pair4.second).intValue() * 1048576));
        } else {
            hashMap2.put(c4hi2, -1);
        }
        Pair pair5 = (Pair) A0L.get(2);
        if (pair5 != null) {
            hashMap2.put(C4HI.A0B, Integer.valueOf(((Number) pair5.second).intValue() * 1048576));
        } else {
            hashMap2.put(C4HI.A0B, -1);
        }
        C206209Bd c206209Bd2 = new C206209Bd();
        c206209Bd2.A03(enumC46722Ck);
        c206209Bd2.A04(hashMap2);
        C46642Cc.A00 = c206209Bd2.A02();
        return C46642Cc.A00(i);
    }

    public static C42301xK A0A(UserSession userSession) {
        Long A002;
        boolean booleanValue = C28Y.A00(userSession).booleanValue();
        C438220p c438220p = new C438220p();
        c438220p.A07(true);
        if (booleanValue) {
            c438220p.A01(AbstractC22766A2k.A00(userSession).intValue());
            c438220p.A02(AbstractC22767A2l.A00(userSession).intValue());
            c438220p.A06(AbstractC22771A2p.A00(userSession).intValue());
            c438220p.A05(AbstractC22770A2o.A00(userSession).intValue());
            c438220p.A04(AbstractC22769A2n.A00(userSession).intValue());
            A002 = AbstractC22768A2m.A00(userSession);
        } else {
            c438220p.A01(C28Z.A00(userSession).intValue());
            c438220p.A02(AbstractC456628a.A00(userSession).intValue());
            c438220p.A06(AbstractC456728b.A00(userSession).intValue());
            c438220p.A05(AbstractC456828c.A00(userSession).intValue());
            c438220p.A04(AbstractC456928d.A00(userSession).intValue());
            A002 = AbstractC457028e.A00(userSession);
        }
        c438220p.A03(A002.intValue());
        return c438220p.A00();
    }

    public static C42301xK A0B(UserSession userSession) {
        Long A002;
        boolean booleanValue = AbstractC457128f.A00(userSession).booleanValue();
        C438220p c438220p = new C438220p();
        c438220p.A07(true);
        if (booleanValue) {
            c438220p.A01(AbstractC22772A2q.A00(userSession).intValue());
            c438220p.A02(AbstractC22773A2r.A00(userSession).intValue());
            c438220p.A06(AbstractC22777A2v.A00(userSession).intValue());
            c438220p.A05(AbstractC22776A2u.A00(userSession).intValue());
            c438220p.A04(AbstractC22775A2t.A00(userSession).intValue());
            A002 = AbstractC22774A2s.A00(userSession);
        } else {
            c438220p.A01(AbstractC457328h.A00(userSession).intValue());
            c438220p.A02(AbstractC457528j.A00(userSession).intValue());
            c438220p.A06(AbstractC457728l.A00(userSession).intValue());
            c438220p.A05(AbstractC457828m.A00(userSession).intValue());
            c438220p.A04(AbstractC457928n.A00(userSession).intValue());
            A002 = AbstractC458128p.A00(userSession);
        }
        c438220p.A03(A002.intValue());
        return c438220p.A00();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1yi] */
    public static C41961wm A0E(Context context, UserSession userSession) {
        int A002;
        int A03 = A03(userSession);
        if (AbstractC43021yV.A00(userSession).booleanValue()) {
            A002 = A05(userSession, A03);
        } else {
            A002 = A00(context, A03);
        }
        ?? r2 = new Object() { // from class: X.1yi
            public long A0P;
            public String A0Q;
            public String A0R;
            public boolean A0S;
            public boolean A0T;
            public int A06 = 104857600;
            public boolean A0M = true;
            public boolean A0O = false;
            public int A09 = 1048576;
            public double A01 = 0.3d;
            public boolean A0N = false;
            public boolean A0E = false;
            public int A08 = 0;
            public double A00 = 0.1d;
            public long A0C = 0;
            public long A0B = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
            public long A0A = 3600000;
            public boolean A0K = false;
            public boolean A0H = false;
            public int A02 = 0;
            public int A04 = -1;
            public int A03 = -1;
            public boolean A0J = false;
            public int A07 = 10;
            public boolean A0I = false;
            public int A05 = 1;
            public boolean A0D = false;
            public boolean A0G = false;
            public boolean A0L = false;
            public boolean A0F = false;

            public final void A01() {
                this.A0S = true;
            }

            public final void A02() {
                this.A0K = true;
            }

            public final void A03() {
                this.A0E = true;
            }

            public final C41961wm A00() {
                String str = this.A0Q;
                String str2 = this.A0R;
                boolean z = this.A0S;
                int i = this.A06;
                boolean z2 = this.A0M;
                boolean z3 = this.A0O;
                int i2 = this.A09;
                double d = this.A01;
                boolean z4 = this.A0N;
                boolean z5 = this.A0E;
                int i3 = this.A08;
                double d2 = this.A00;
                long j = this.A0C;
                long j2 = this.A0B;
                long j3 = this.A0A;
                boolean z6 = this.A0K;
                boolean z7 = this.A0H;
                int i4 = this.A02;
                int i5 = this.A04;
                int i6 = this.A03;
                boolean z8 = this.A0J;
                return new C41961wm(str, str2, d, d2, i, i2, i3, i4, i5, i6, this.A07, this.A05, j, j2, j3, this.A0P, z, z2, z3, z4, z5, z6, z7, z8, this.A0T, this.A0I, this.A0D, this.A0L, this.A0F);
            }

            public final void A04(double d) {
                this.A00 = d;
            }

            public final void A05(double d) {
                this.A01 = d;
            }

            public final void A06(int i) {
                this.A02 = i;
            }

            public final void A07(int i) {
                this.A03 = i;
            }

            public final void A08(int i) {
                this.A04 = i;
            }

            public final void A09(int i) {
                this.A05 = i;
            }

            public final void A0A(int i) {
                this.A06 = i;
            }

            public final void A0B(int i) {
                this.A07 = i;
            }

            public final void A0C(int i) {
                this.A08 = i;
            }

            public final void A0D(int i) {
                this.A09 = i;
            }

            public final void A0E(long j) {
                this.A0P = j;
            }

            public final void A0F(long j) {
                this.A0A = j;
            }

            public final void A0G(long j) {
                this.A0B = j;
            }

            public final void A0H(long j) {
                this.A0C = j;
            }

            public final void A0I(String str) {
                this.A0Q = str;
            }

            public final void A0J(String str) {
                this.A0R = str;
            }

            public final void A0K(boolean z) {
                this.A0D = z;
            }

            public final void A0L(boolean z) {
                this.A0F = z;
            }

            public final void A0M(boolean z) {
                this.A0G = z;
            }

            public final void A0N(boolean z) {
                this.A0H = z;
            }

            public final void A0O(boolean z) {
                this.A0I = z;
            }

            public final void A0P(boolean z) {
                this.A0J = z;
            }

            public final void A0Q(boolean z) {
                this.A0N = z;
            }

            public final void A0R(boolean z) {
                this.A0O = z;
            }

            public final void A0S(boolean z) {
                this.A0T = z;
            }

            public final void A0T(boolean z) {
                this.A0L = z;
            }

            public final void A0U(boolean z) {
                this.A0M = z;
            }
        };
        r2.A0A(A002);
        r2.A0I(A0K(context.getCacheDir()));
        r2.A0J(A0J(context, A03));
        r2.A01();
        r2.A0H(TimeUnit.HOURS.toMillis(168L));
        r2.A0G(TimeUnit.MINUTES.toMillis(1L));
        r2.A0F(TimeUnit.HOURS.toMillis(1L));
        r2.A02();
        r2.A0N(C20L.A00(userSession).booleanValue());
        r2.A06(C20M.A00(userSession).intValue());
        r2.A08(C20N.A00(userSession).intValue());
        r2.A07(C20O.A00(userSession).intValue());
        r2.A0R(C20P.A00(userSession).booleanValue());
        r2.A0D(C20Q.A00(userSession).intValue());
        r2.A05(C20R.A00(userSession).doubleValue());
        r2.A0O(C20S.A00(userSession).booleanValue());
        r2.A09(C20T.A00(userSession).intValue());
        r2.A0Q(C20U.A00(userSession).booleanValue());
        r2.A0C(C20V.A00(userSession).intValue());
        r2.A04(C20W.A00(userSession).doubleValue());
        r2.A0U(C20X.A00(userSession).booleanValue());
        r2.A03();
        r2.A0S(C20Z.A00(userSession).booleanValue());
        r2.A0P(AbstractC436920a.A00(userSession).booleanValue());
        r2.A0B(AbstractC437020c.A00(userSession).intValue());
        r2.A0M(AbstractC437120d.A00(userSession).booleanValue());
        r2.A0K(AbstractC437220e.A00(userSession).booleanValue());
        r2.A0T(AbstractC437320f.A00(userSession).booleanValue());
        r2.A0L(C20g.A00(userSession).booleanValue());
        r2.A0E(AbstractC437420h.A00(userSession).longValue());
        return r2.A00();
    }

    public static C42351xP A0H(UserSession userSession) {
        boolean booleanValue = C23T.A00(userSession).booleanValue();
        boolean booleanValue2 = C23U.A00(userSession).booleanValue();
        String A002 = C23V.A00(userSession);
        String A003 = C23W.A00(userSession);
        boolean booleanValue3 = C23X.A00(userSession).booleanValue();
        boolean booleanValue4 = C23Y.A00(userSession).booleanValue();
        boolean booleanValue5 = C23Z.A00(userSession).booleanValue();
        long longValue = AbstractC444423a.A00(userSession).longValue();
        boolean booleanValue6 = AbstractC444523b.A00(userSession).booleanValue();
        boolean booleanValue7 = AbstractC444623c.A00(userSession).booleanValue();
        boolean booleanValue8 = AbstractC444723d.A00(userSession).booleanValue();
        boolean booleanValue9 = AbstractC444823e.A00(userSession).booleanValue();
        boolean booleanValue10 = AbstractC444923f.A00(userSession).booleanValue();
        boolean booleanValue11 = AbstractC445023g.A00(userSession).booleanValue();
        boolean booleanValue12 = AbstractC445123h.A00(userSession).booleanValue();
        boolean booleanValue13 = AbstractC445223i.A00(userSession).booleanValue();
        Long A004 = AbstractC445323j.A00(userSession);
        Long A005 = AbstractC445423k.A00(userSession);
        boolean booleanValue14 = AbstractC445523l.A00(userSession).booleanValue();
        boolean booleanValue15 = AbstractC445623m.A00(userSession).booleanValue();
        C42351xP c42351xP = new C42351xP();
        c42351xP.A06(booleanValue);
        c42351xP.A0K(booleanValue2);
        c42351xP.A04(A002);
        c42351xP.A05(A003);
        c42351xP.A0F(booleanValue3);
        c42351xP.A0H(booleanValue4);
        c42351xP.A09(booleanValue5);
        c42351xP.A03(longValue);
        c42351xP.A02(longValue);
        c42351xP.A07(booleanValue6);
        c42351xP.A0G(booleanValue7);
        c42351xP.A0I(booleanValue8);
        c42351xP.A0J(booleanValue9);
        c42351xP.A0A(booleanValue10);
        c42351xP.A0D(booleanValue11);
        c42351xP.A0E(booleanValue12);
        c42351xP.A08(booleanValue13);
        c42351xP.A01(A004.longValue());
        c42351xP.A00(A005.longValue());
        c42351xP.A0B(booleanValue14);
        c42351xP.A0C(booleanValue15);
        return c42351xP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    public static String A0K(File file) {
        try {
            file = file.getCanonicalPath();
            return file;
        } catch (IOException unused) {
            return file.toString();
        }
    }

    public static HashSet A0N(UserSession userSession) {
        return A0O(AnonymousClass213.A00(userSession));
    }

    public static boolean A0Q() {
        return C21A.A02();
    }

    public static boolean A0R(UserSession userSession) {
        boolean booleanValue = AbstractC442422g.A00(userSession).booleanValue();
        if (!A0V(userSession) && !booleanValue) {
            return false;
        }
        return true;
    }

    public static boolean A0S(UserSession userSession) {
        boolean booleanValue = AbstractC442222e.A00(userSession).booleanValue();
        if (!A0V(userSession) && !booleanValue) {
            return false;
        }
        return true;
    }

    public static boolean A0T(UserSession userSession) {
        boolean A02 = AbstractC443022m.A02(userSession);
        boolean A002 = AbstractC443022m.A00(userSession);
        boolean booleanValue = AbstractC443122n.A00(userSession).booleanValue();
        boolean A022 = C21A.A02();
        boolean A01 = AbstractC443022m.A01(userSession);
        if (!A02 && !A002 && !booleanValue && !A022 && !A01) {
            return false;
        }
        return true;
    }

    public static boolean A0U(UserSession userSession) {
        boolean booleanValue = AbstractC443822u.A00(userSession).booleanValue();
        if (!A0V(userSession) && !booleanValue) {
            return false;
        }
        return true;
    }

    public static boolean A0V(UserSession userSession) {
        return AbstractC442322f.A00(userSession).booleanValue();
    }

    public static boolean A0W(UserSession userSession) {
        return AbstractC458228q.A00(userSession).booleanValue();
    }

    public static boolean A0X(UserSession userSession) {
        return AbstractC442622i.A00(userSession).booleanValue();
    }

    public static boolean A0Y(UserSession userSession) {
        return AbstractC458528t.A00(userSession).booleanValue();
    }
}
