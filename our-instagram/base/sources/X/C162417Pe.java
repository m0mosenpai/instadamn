package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7Pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162417Pe implements C7P8 {
    public static final C162427Pf A01 = new Object();
    public final C0KV A00;

    @Override // X.C7P8
    public final boolean ABK() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (X.C162427Pf.A01(r5) != false) goto L8;
     */
    @Override // X.C7P8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFT(com.instagram.common.session.UserSession r4, X.C83403nh r5) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.7Pf r1 = X.C162417Pe.A01
            boolean r0 = X.C162427Pf.A02(r5)
            r2 = 1
            if (r0 != 0) goto L23
            boolean r0 = r1.A04(r5)
            if (r0 != 0) goto L1a
            boolean r0 = X.C162427Pf.A01(r5)
            r1 = 0
            if (r0 == 0) goto L1b
        L1a:
            r1 = 1
        L1b:
            boolean r0 = r5.CSo()
            if (r0 == 0) goto L24
            if (r1 == 0) goto L24
        L23:
            return r2
        L24:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162417Pe.AFT(com.instagram.common.session.UserSession, X.3nh):boolean");
    }

    @Override // X.C7P8
    public final boolean AFY(C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 0);
        return C162427Pf.A01(c83403nh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7P8
    public final boolean AFc(UserSession userSession, C83403nh c83403nh, int i) {
        String str;
        ImmutableList A0H;
        C910143t c910143t;
        C910143t c910143t2;
        ImmutableList A012;
        C9CP c9cp;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        C162427Pf c162427Pf = A01;
        if (!C162427Pf.A02(c83403nh)) {
            return false;
        }
        ImmutableList A0H2 = c83403nh.A0H();
        if (A0H2 != null && A0H2.get(0) != 0) {
            C910143t c910143t3 = (C910143t) A0H2.get(0);
            if (c910143t3 == null || !c910143t3.A04() || c83403nh.A2P || c162427Pf.A04(c83403nh)) {
                return false;
            }
            ImmutableList A0H3 = c83403nh.A0H();
            if (A0H3 != null && (c910143t2 = (C910143t) A0H3.get(0)) != null && (A012 = c910143t2.A01()) != null && (c9cp = (C9CP) AbstractC001800i.A0J(A012)) != null) {
                str = c9cp.A05;
            } else {
                str = null;
            }
            if (C14360o3.A0K(str, "xma_igd_pinned_location_sharing")) {
                return false;
            }
            if (i == 29 && ((c83403nh.A0z != C2EY.A1i || !C18U.A06(C06090Tz.A05, userSession, 36319312902364312L)) && ((A0H = c83403nh.A0H()) == null || A0H.isEmpty() || (c910143t = (C910143t) A0H.get(0)) == null || c910143t.A02 != 9 || !C18U.A06(C06090Tz.A05, userSession, 36319312903478441L)))) {
                return false;
            }
            return true;
        }
        C162427Pf.A00();
        return false;
    }

    @Override // X.C7P8
    public final boolean AFi(C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean AFu(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 1);
        if (c83403nh.A0h() != null) {
            C162427Pf c162427Pf = A01;
            if (C162427Pf.A02(c83403nh) && !c83403nh.A2P && !c162427Pf.A04(c83403nh)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C7P8
    public final boolean AFv(UserSession userSession, C83403nh c83403nh) {
        C2EY c2ey;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        if (c83403nh.A1S() && C18U.A06(C06090Tz.A05, userSession, 36323302926462102L)) {
            return true;
        }
        if ((c83403nh.A10 == C2EY.A0z && !A01.A04(c83403nh) && !C162427Pf.A01(c83403nh)) || (c2ey = c83403nh.A10) == C2EY.A1K) {
            return true;
        }
        if (c2ey == C2EY.A1G && C18U.A06(C06090Tz.A05, userSession, 36313467451738141L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7P8
    public final boolean AFw(UserSession userSession, C83403nh c83403nh) {
        ImmutableList A012;
        String str;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        if (c83403nh.A1S() && C18U.A06(C06090Tz.A05, userSession, 36323302926462102L)) {
            return true;
        }
        if (c83403nh.A10 == C2EY.A0z) {
            ImmutableList A0H = c83403nh.A0H();
            if (A0H != null && !A0H.isEmpty()) {
                if (((C910143t) A0H.get(0)).A02 == 8 && (A012 = ((C910143t) A0H.get(0)).A01()) != null && !A012.isEmpty() && (str = ((C9CP) A012.get(0)).A02) != null && AbstractC001900j.A0a(str, "daily_prompt", false) && !C162427Pf.A01(c83403nh)) {
                    return true;
                }
            } else {
                C162427Pf.A00();
            }
        }
        C2EY c2ey = c83403nh.A10;
        if (c2ey == C2EY.A1K) {
            return true;
        }
        if (c2ey == C2EY.A1G && C18U.A06(C06090Tz.A05, userSession, 36313467451738141L)) {
            return true;
        }
        return false;
    }

    @Override // X.C7P8
    public final boolean AFx(UserSession userSession, C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final boolean AFz(C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 0);
        return A01.A03(c83403nh);
    }

    @Override // X.C7P8
    public final boolean AG0(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        if ((c83403nh.A0z != C2EY.A1i || c83403nh.A10 == C2EY.A0z) && !c83403nh.A1Q()) {
            C162427Pf c162427Pf = A01;
            if (!c162427Pf.A04(c83403nh) || !C18U.A06(C06090Tz.A05, userSession, 36319312903150756L)) {
                if (c162427Pf.A05(c83403nh) && C18U.A06(C06090Tz.A05, userSession, 36319312903216293L)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.C7P8
    public final boolean AGC(UserSession userSession, C83403nh c83403nh, int i) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        if (AbstractC163297So.A00(c83403nh, userSession.userId)) {
            C162427Pf c162427Pf = A01;
            if (C162427Pf.A02(c83403nh) && !c162427Pf.A04(c83403nh)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C7P8
    public final boolean AGD(C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 0);
        return A01.A03(c83403nh);
    }

    @Override // X.C7P8
    public final String C2p(UserSession userSession, C83403nh c83403nh) {
        List list;
        C910143t c910143t;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        C2EY c2ey = c83403nh.A10;
        if (c2ey == C2EY.A1G || (c2ey == C2EY.A1u && !c83403nh.A1S() && C18U.A06(C06090Tz.A05, userSession, 36322538422282555L))) {
            Object obj = c83403nh.A1T;
            if (!(obj instanceof List) || (list = (List) obj) == null || list.isEmpty()) {
                return null;
            }
            Object obj2 = list.get(0);
            if (!(obj2 instanceof C910143t) || (c910143t = (C910143t) obj2) == null) {
                return null;
            }
            return c910143t.A0w;
        }
        if (c83403nh.A0z != C2EY.A1i) {
            return null;
        }
        return c83403nh.A1q;
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
    public final boolean CTC(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        C162427Pf c162427Pf = A01;
        if (C162427Pf.A02(c83403nh) && AbstractC1576275w.A00((C23031Ai) this.A00.AXR(userSession)) && !c162427Pf.A04(c83403nh)) {
            return true;
        }
        return false;
    }

    @Override // X.C7P8
    public final boolean CTE(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        C162427Pf c162427Pf = A01;
        if (C162427Pf.A02(c83403nh) && AbstractC1576275w.A01((C23031Ai) this.A00.AXR(userSession)) && !c162427Pf.A04(c83403nh)) {
            return true;
        }
        return false;
    }

    @Override // X.C7P8
    public final boolean CTQ(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        C162427Pf c162427Pf = A01;
        if (C162427Pf.A02(c83403nh) && AbstractC1576275w.A02((C23031Ai) this.A00.AXR(userSession)) && !c162427Pf.A04(c83403nh)) {
            return true;
        }
        return false;
    }

    @Override // X.C7P8
    public final boolean Cea() {
        return true;
    }

    @Override // X.C7P8
    public final boolean CfJ(InterfaceC83433nk interfaceC83433nk) {
        C14360o3.A0B(interfaceC83433nk, 0);
        return !interfaceC83433nk.CSo();
    }

    public C162417Pe() {
        C162437Pg c162437Pg = C162437Pg.A00;
        C14360o3.A0B(c162437Pg, 1);
        this.A00 = c162437Pg;
    }

    @Override // X.C7P8
    public final boolean CWd(UserSession userSession, C83403nh c83403nh) {
        if (c83403nh != null) {
            C162427Pf c162427Pf = A01;
            if (C162427Pf.A02(c83403nh) && !c162427Pf.A04(c83403nh)) {
                return true;
            }
        }
        return false;
    }
}
