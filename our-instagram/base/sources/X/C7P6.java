package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.EnumMap;

/* renamed from: X.7P6, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7P6 {
    public static final EnumMap A00;

    /* JADX WARN: Type inference failed for: r3v1, types: [X.7P8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.7P8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.7P8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.7P8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.7P8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.7P8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.7P8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.7P8, java.lang.Object] */
    static {
        EnumMap enumMap = new EnumMap(C2EY.class);
        A00 = enumMap;
        enumMap.put((EnumMap) C2EY.A1O, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A0p, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A1i, (C2EY) new Object());
        C28541Zp.A00(new C7P8() { // from class: X.7PB
            public final C0KV A00;

            @Override // X.C7P8
            public final boolean ABK() {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFT(UserSession userSession, C83403nh c83403nh) {
                return true;
            }

            @Override // X.C7P8
            public final boolean AFc(UserSession userSession, C83403nh c83403nh, int i) {
                C14360o3.A0B(c83403nh, 1);
                return !c83403nh.A2P;
            }

            @Override // X.C7P8
            public final boolean AFi(C83403nh c83403nh) {
                return true;
            }

            @Override // X.C7P8
            public final boolean AFu(UserSession userSession, C83403nh c83403nh) {
                return true;
            }

            @Override // X.C7P8
            public final boolean AFv(UserSession userSession, C83403nh c83403nh) {
                C14360o3.A0B(userSession, 0);
                return C18U.A06(C06090Tz.A05, userSession, 36311272724169189L);
            }

            @Override // X.C7P8
            public final boolean AFw(UserSession userSession, C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFx(UserSession userSession, C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final boolean AGC(UserSession userSession, C83403nh c83403nh, int i) {
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c83403nh, 1);
                return AbstractC163297So.A00(c83403nh, userSession.userId);
            }

            @Override // X.C7P8
            public final String C2p(UserSession userSession, C83403nh c83403nh) {
                C14360o3.A0B(c83403nh, 1);
                C2EY c2ey = c83403nh.A10;
                AbstractC34140F4q abstractC34140F4q = AbstractC34140F4q.$redex_init_class;
                int ordinal = c2ey.ordinal();
                if (ordinal != 18) {
                    if (ordinal != 15) {
                        return null;
                    }
                    return JSK.A01(c83403nh);
                }
                return c83403nh.A1q;
            }

            @Override // X.C7P8
            public final String CGv() {
                return null;
            }

            @Override // X.C7P8
            public final boolean CQP() {
                return true;
            }

            @Override // X.C7P8
            public final boolean CT9(UserSession userSession) {
                return false;
            }

            @Override // X.C7P8
            public final boolean CTC(UserSession userSession, C83403nh c83403nh) {
                C14360o3.A0B(userSession, 0);
                return AbstractC1576275w.A00((C23031Ai) this.A00.AXR(userSession));
            }

            @Override // X.C7P8
            public final boolean CTE(UserSession userSession, C83403nh c83403nh) {
                C14360o3.A0B(userSession, 0);
                return AbstractC1576275w.A01((C23031Ai) this.A00.AXR(userSession));
            }

            @Override // X.C7P8
            public final boolean CTQ(UserSession userSession, C83403nh c83403nh) {
                C14360o3.A0B(userSession, 0);
                return AbstractC1576275w.A02(AbstractC23021Ah.A00(userSession));
            }

            @Override // X.C7P8
            public final boolean CWd(UserSession userSession, C83403nh c83403nh) {
                return true;
            }

            @Override // X.C7P8
            public final boolean Cea() {
                return true;
            }

            @Override // X.C7P8
            public final boolean CfJ(InterfaceC83433nk interfaceC83433nk) {
                return true;
            }

            {
                C7PC c7pc = C7PC.A00;
                C14360o3.A0B(c7pc, 1);
                this.A00 = c7pc;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AFY(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AFz(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AGD(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AG0(UserSession userSession, C83403nh c83403nh) {
                return false;
            }
        }, enumMap, C2EY.A1Q, C2EY.A1y, C2EY.A0H);
        enumMap.put((EnumMap) C2EY.A1C, (C2EY) new Object());
        C28541Zp.A00(new Object(), enumMap, C2EY.A1F, C2EY.A1x);
        enumMap.put((EnumMap) C2EY.A18, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A19, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A0G, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A15, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A0l, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A1k, (C2EY) new C7P8() { // from class: X.7PJ
            public final C0KV A00;
            public final C0KV A01;

            @Override // X.C7P8
            public final boolean ABK() {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFT(UserSession userSession, C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFc(UserSession userSession, C83403nh c83403nh, int i) {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFi(C83403nh c83403nh) {
                return true;
            }

            @Override // X.C7P8
            public final boolean AFu(UserSession userSession, C83403nh c83403nh) {
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c83403nh, 1);
                Object obj = c83403nh.A1T;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectVideoCallEvent");
                if (!((C101864hx) obj).A00(Boolean.valueOf(c83403nh.A1j((User) this.A01.AXR(userSession)))) && !C18U.A06(C06090Tz.A05, userSession, 36318660067006849L)) {
                    return false;
                }
                return true;
            }

            @Override // X.C7P8
            public final boolean AFv(UserSession userSession, C83403nh c83403nh) {
                long j;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c83403nh, 1);
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession, 36318660066875776L)) {
                    return false;
                }
                Object obj = c83403nh.A1T;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectVideoCallEvent");
                if (((C101864hx) obj).A00(Boolean.valueOf(c83403nh.A1j((User) this.A01.AXR(userSession))))) {
                    j = 36318660066810239L;
                } else {
                    j = 36318660067006849L;
                }
                return C18U.A06(c06090Tz, userSession, j);
            }

            @Override // X.C7P8
            public final boolean AFw(UserSession userSession, C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFx(UserSession userSession, C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final boolean AGC(UserSession userSession, C83403nh c83403nh, int i) {
                return false;
            }

            @Override // X.C7P8
            public final String C2p(UserSession userSession, C83403nh c83403nh) {
                return null;
            }

            @Override // X.C7P8
            public final String CGv() {
                return null;
            }

            @Override // X.C7P8
            public final boolean CQP() {
                return true;
            }

            @Override // X.C7P8
            public final boolean CT9(UserSession userSession) {
                return false;
            }

            @Override // X.C7P8
            public final boolean CTC(UserSession userSession, C83403nh c83403nh) {
                return true;
            }

            @Override // X.C7P8
            public final boolean CTE(UserSession userSession, C83403nh c83403nh) {
                C14360o3.A0B(userSession, 0);
                return AbstractC1576275w.A01((C23031Ai) this.A00.AXR(userSession));
            }

            @Override // X.C7P8
            public final boolean CTQ(UserSession userSession, C83403nh c83403nh) {
                C14360o3.A0B(userSession, 0);
                return AbstractC1576275w.A02(AbstractC23021Ah.A00(userSession));
            }

            @Override // X.C7P8
            public final boolean CWd(UserSession userSession, C83403nh c83403nh) {
                return true;
            }

            @Override // X.C7P8
            public final boolean Cea() {
                return true;
            }

            @Override // X.C7P8
            public final boolean CfJ(InterfaceC83433nk interfaceC83433nk) {
                return false;
            }

            {
                C7PK c7pk = C7PK.A00;
                C7PL c7pl = C7PL.A00;
                C14360o3.A0B(c7pk, 1);
                C14360o3.A0B(c7pl, 2);
                this.A00 = c7pk;
                this.A01 = c7pl;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AFY(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AFz(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AGD(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AG0(UserSession userSession, C83403nh c83403nh) {
                return false;
            }
        });
        enumMap.put((EnumMap) C2EY.A0m, (C2EY) new Object());
        C28541Zp.A00(new Object(), enumMap, C2EY.A1V, C2EY.A20, C2EY.A1z);
        enumMap.put((EnumMap) C2EY.A1A, (C2EY) new Object());
        C28541Zp.A00(new Object(), enumMap, C2EY.A1B, C2EY.A1v);
        enumMap.put((EnumMap) C2EY.A0q, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A1l, (C2EY) new Object());
        C28541Zp.A00(new Object(), enumMap, C2EY.A1g, C2EY.A22);
        C28541Zp.A00(new Object(), enumMap, C2EY.A1a, C2EY.A21);
        C28541Zp.A00(new Object(), enumMap, C2EY.A0t, C2EY.A1t);
        C28541Zp.A00(new Object(), enumMap, C2EY.A0W, C2EY.A1r);
        enumMap.put((EnumMap) C2EY.A0K, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A1f, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A1m, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A0d, (C2EY) new Object());
        C28541Zp.A00(new Object(), enumMap, C2EY.A0M, C2EY.A1q);
        enumMap.put((EnumMap) C2EY.A1d, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A1e, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A0s, (C2EY) new C7P8() { // from class: X.7Pc
            public final C0KV A00 = new C0KV() { // from class: X.7Pd
                @Override // X.C0KV
                public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                    int A03 = C0f9.A03(254238687);
                    int A032 = C0f9.A03(1812836704);
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    C0f9.A0A(97817783, A032);
                    C0f9.A0A(-829574225, A03);
                    return A002;
                }
            };

            @Override // X.C7P8
            public final boolean ABK() {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFc(UserSession userSession, C83403nh c83403nh, int i) {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFi(C83403nh c83403nh) {
                return true;
            }

            @Override // X.C7P8
            public final boolean AFv(UserSession userSession, C83403nh c83403nh) {
                return true;
            }

            @Override // X.C7P8
            public final boolean AFw(UserSession userSession, C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFx(UserSession userSession, C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final String C2p(UserSession userSession, C83403nh c83403nh) {
                return null;
            }

            @Override // X.C7P8
            public final String CGv() {
                return "media_reshare_message";
            }

            @Override // X.C7P8
            public final boolean CQP() {
                return true;
            }

            @Override // X.C7P8
            public final boolean CT9(UserSession userSession) {
                return false;
            }

            @Override // X.C7P8
            public final boolean Cea() {
                return true;
            }

            @Override // X.C7P8
            public final boolean CfJ(InterfaceC83433nk interfaceC83433nk) {
                return true;
            }

            public static boolean A00(C83403nh c83403nh) {
                C910143t c910143t = c83403nh.A0j;
                if (c910143t != null && !"placeholder".equals(c910143t.A14)) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean AFT(UserSession userSession, C83403nh c83403nh) {
                C910143t c910143t = c83403nh.A0j;
                if (c910143t != null && !"sticker".equals(c910143t.A14)) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean AGC(UserSession userSession, C83403nh c83403nh, int i) {
                return AbstractC163297So.A00(c83403nh, userSession.userId);
            }

            @Override // X.C7P8
            public final boolean CWd(UserSession userSession, C83403nh c83403nh) {
                if (c83403nh != null && A00(c83403nh)) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean AFu(UserSession userSession, C83403nh c83403nh) {
                if (c83403nh.A0h() != null && A00(c83403nh) && !c83403nh.A2P) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean CTC(UserSession userSession, C83403nh c83403nh) {
                if (A00(c83403nh) && AbstractC1576275w.A00((C23031Ai) this.A00.AXR(userSession))) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean CTE(UserSession userSession, C83403nh c83403nh) {
                if (A00(c83403nh) && AbstractC1576275w.A01((C23031Ai) this.A00.AXR(userSession))) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean CTQ(UserSession userSession, C83403nh c83403nh) {
                if (A00(c83403nh) && AbstractC1576275w.A02((C23031Ai) this.A00.AXR(userSession))) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AFY(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AFz(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AGD(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AG0(UserSession userSession, C83403nh c83403nh) {
                return false;
            }
        });
        enumMap.put((EnumMap) C2EY.A0g, (C2EY) new C162417Pe());
        enumMap.put((EnumMap) C2EY.A0u, (C2EY) new C7P8() { // from class: X.7Pc
            public final C0KV A00 = new C0KV() { // from class: X.7Pd
                @Override // X.C0KV
                public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                    int A03 = C0f9.A03(254238687);
                    int A032 = C0f9.A03(1812836704);
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    C0f9.A0A(97817783, A032);
                    C0f9.A0A(-829574225, A03);
                    return A002;
                }
            };

            @Override // X.C7P8
            public final boolean ABK() {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFc(UserSession userSession, C83403nh c83403nh, int i) {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFi(C83403nh c83403nh) {
                return true;
            }

            @Override // X.C7P8
            public final boolean AFv(UserSession userSession, C83403nh c83403nh) {
                return true;
            }

            @Override // X.C7P8
            public final boolean AFw(UserSession userSession, C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final boolean AFx(UserSession userSession, C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final String C2p(UserSession userSession, C83403nh c83403nh) {
                return null;
            }

            @Override // X.C7P8
            public final String CGv() {
                return "media_reshare_message";
            }

            @Override // X.C7P8
            public final boolean CQP() {
                return true;
            }

            @Override // X.C7P8
            public final boolean CT9(UserSession userSession) {
                return false;
            }

            @Override // X.C7P8
            public final boolean Cea() {
                return true;
            }

            @Override // X.C7P8
            public final boolean CfJ(InterfaceC83433nk interfaceC83433nk) {
                return true;
            }

            public static boolean A00(C83403nh c83403nh) {
                C910143t c910143t = c83403nh.A0j;
                if (c910143t != null && !"placeholder".equals(c910143t.A14)) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean AFT(UserSession userSession, C83403nh c83403nh) {
                C910143t c910143t = c83403nh.A0j;
                if (c910143t != null && !"sticker".equals(c910143t.A14)) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean AGC(UserSession userSession, C83403nh c83403nh, int i) {
                return AbstractC163297So.A00(c83403nh, userSession.userId);
            }

            @Override // X.C7P8
            public final boolean CWd(UserSession userSession, C83403nh c83403nh) {
                if (c83403nh != null && A00(c83403nh)) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean AFu(UserSession userSession, C83403nh c83403nh) {
                if (c83403nh.A0h() != null && A00(c83403nh) && !c83403nh.A2P) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean CTC(UserSession userSession, C83403nh c83403nh) {
                if (A00(c83403nh) && AbstractC1576275w.A00((C23031Ai) this.A00.AXR(userSession))) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean CTE(UserSession userSession, C83403nh c83403nh) {
                if (A00(c83403nh) && AbstractC1576275w.A01((C23031Ai) this.A00.AXR(userSession))) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final boolean CTQ(UserSession userSession, C83403nh c83403nh) {
                if (A00(c83403nh) && AbstractC1576275w.A02((C23031Ai) this.A00.AXR(userSession))) {
                    return true;
                }
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AFY(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AFz(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AGD(C83403nh c83403nh) {
                return false;
            }

            @Override // X.C7P8
            public final /* synthetic */ boolean AG0(UserSession userSession, C83403nh c83403nh) {
                return false;
            }
        });
        C162417Pe c162417Pe = new C162417Pe();
        C2EY[] c2eyArr = new C2EY[31];
        System.arraycopy(new C2EY[]{C2EY.A11, C2EY.A0z, C2EY.A1U, C2EY.A1w, C2EY.A1p, C2EY.A1u, C2EY.A1X, C2EY.A1b, C2EY.A1L, C2EY.A1c, C2EY.A0L, C2EY.A14, C2EY.A13, C2EY.A0r, C2EY.A1G, C2EY.A1K, C2EY.A0Q, C2EY.A0w, C2EY.A0I, C2EY.A0O, C2EY.A0J, C2EY.A0y, C2EY.A1h, C2EY.A0a, C2EY.A1S, C2EY.A1D, C2EY.A0F}, 0, c2eyArr, 0, 27);
        System.arraycopy(new C2EY[]{C2EY.A0o, C2EY.A1Y, C2EY.A1M, C2EY.A0j}, 0, c2eyArr, 27, 4);
        C28541Zp.A00(c162417Pe, enumMap, c2eyArr);
        enumMap.put((EnumMap) C2EY.A1s, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A1n, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A0k, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A1I, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A0n, (C2EY) new Object());
        enumMap.put((EnumMap) C2EY.A0P, (C2EY) new Object());
    }
}
