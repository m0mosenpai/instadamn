package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6X6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6X6 {
    public static final C6X6 A00 = new Object();

    public static final int A00(UserSession userSession, C81613kW c81613kW) {
        C14360o3.A0B(userSession, 0);
        if (A0F(userSession, c81613kW)) {
            return 604800;
        }
        return (int) C18U.A01(C06090Tz.A05, userSession, 36601758541353313L);
    }

    public static final EnumC92794Ds A01(UserSession userSession, C81613kW c81613kW) {
        C14360o3.A0B(userSession, 0);
        if (A0U(c81613kW)) {
            return EnumC92794Ds.A05;
        }
        if (A0K(userSession, c81613kW) || (c81613kW != null && (c81613kW.A04.A01 & 64) > 0)) {
            return EnumC92794Ds.A04;
        }
        return null;
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!C18U.A06(C06090Tz.A05, userSession, 36320283567726891L)) {
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            if (((Boolean) A002.A13.CES(A002, C23031Ai.A8c[2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        if (A05(userSession)) {
            return C18U.A06(C06090Tz.A05, userSession, 2342163292778209554L);
        }
        return false;
    }

    public static final boolean A08(UserSession userSession, C7TT c7tt) {
        C1118752z c1118752z;
        C14360o3.A0B(userSession, 0);
        if (c7tt != null && (c1118752z = c7tt.A0N) != null && c1118752z.A08 && A05(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A09(UserSession userSession, C7TT c7tt) {
        C14360o3.A0B(c7tt, 1);
        return A0L(userSession, c7tt.A0G, A0W(c7tt.A0b, c7tt.A0r, c7tt.A0y, c7tt.A0o, c7tt.A1G));
    }

    public static final boolean A0A(UserSession userSession, C7TT c7tt, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c7tt, 1);
        C14360o3.A0B(str, 3);
        boolean A08 = A08(userSession, c7tt);
        if (!c7tt.A14) {
            if (!str.equals(AbstractC43591JPw.A00(397))) {
                if (A0C(userSession, c7tt, true)) {
                    if (str.equals(AbstractC43591JPw.A00(1085))) {
                        if (A08) {
                            return false;
                        }
                    } else if (!str.equals(AbstractC43591JPw.A00(396))) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return A08;
        }
        return false;
    }

    public static final boolean A0B(UserSession userSession, C7TT c7tt, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c7tt, 2);
        if (!A0C(userSession, c7tt, z)) {
            if (A08(userSession, c7tt) && !c7tt.A14) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A0E(UserSession userSession, C81613kW c81613kW) {
        C14360o3.A0B(userSession, 0);
        if (!C18U.A06(C06090Tz.A05, userSession, 36320283566612770L) && !A0I(userSession, c81613kW)) {
            return false;
        }
        return true;
    }

    public static final boolean A0F(UserSession userSession, C81613kW c81613kW) {
        C14360o3.A0B(userSession, 0);
        if (!A0K(userSession, c81613kW) && !A0G(userSession, c81613kW)) {
            return false;
        }
        return true;
    }

    public static final boolean A0I(UserSession userSession, C81613kW c81613kW) {
        C14360o3.A0B(userSession, 0);
        if (c81613kW == null || A03(userSession) || A0H(userSession, c81613kW) || !A0U(c81613kW) || !C9H1.A00(userSession).booleanValue() || !A0G(userSession, c81613kW) || !C18U.A06(C06090Tz.A05, userSession, 2342168601357857974L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0L(UserSession userSession, C81613kW c81613kW, boolean z) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36320283567726891L) && z && A05(userSession) && c81613kW != null && (c81613kW.A04.A01 & 576) > 0 && !C161867Mw.A02(c81613kW)) {
            if (!A03(userSession)) {
                if (C18U.A06(c06090Tz, userSession, 36320283567464744L) || (c81613kW.A04.A01 & 1024) > 0) {
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    A002.A13.Egi(A002, true, C23031Ai.A8c[2]);
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean A0M(UserSession userSession, C2EF c2ef) {
        return c2ef != null && c2ef.Ay8() && A05(userSession);
    }

    public static final boolean A0O(UserSession userSession, C2EC c2ec) {
        C14360o3.A0B(userSession, 0);
        return A0L(userSession, c2ec.Aic(), A0P(userSession, c2ec));
    }

    public static final boolean A0Q(UserSession userSession, C2EC c2ec) {
        C14360o3.A0B(c2ec, 1);
        if (A0P(userSession, c2ec)) {
            if (C18U.A06(C06090Tz.A05, userSession, 2342163292778995992L) || A0O(userSession, c2ec) || C9H1.A00(userSession).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0S(UserSession userSession, InterfaceC163837Ux interfaceC163837Ux) {
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        InterfaceC83713oG C7i = interfaceC163837Ux.C7i();
        C14360o3.A07(C7i);
        boolean z = C7i instanceof InterfaceC83703oF;
        C7TT C7W = interfaceC163837Ux.C7W();
        C14360o3.A07(C7W);
        if (A0C(userSession, C7W, z) && !A08(userSession, interfaceC163837Ux.C7W())) {
            InterfaceC19630xq interfaceC19630xq = A002.A01;
            if (interfaceC19630xq.getInt("direct_dm_mode_display_count", 0) < 5 && TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - interfaceC19630xq.getLong("direct_dm_mode_seen_timestamp_ms", 0L)) >= 1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0W(List list, boolean z, boolean z2, boolean z3, boolean z4) {
        User user;
        C14360o3.A0B(list, 3);
        if (!z && !z2 && !z3 && (user = (User) AbstractC001800i.A0N(list)) != null && !user.A2O() && !user.CQf() && !user.isRestricted() && !z4) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 2342163292781551917L) && !C18U.A06(c06090Tz, userSession, 36320283568775475L)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        if (!C18U.A06(C06090Tz.A05, userSession, 2342163292778144017L) && !C9H1.A00(userSession).booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean A07(UserSession userSession, C7TT c7tt) {
        if (!C18U.A06(C06090Tz.A05, userSession, 2342163292778995992L) && !A09(userSession, c7tt) && !C9H1.A00(userSession).booleanValue()) {
            return false;
        }
        return true;
    }

    public static final boolean A0D(UserSession userSession, C7TT c7tt, boolean z) {
        if (z) {
            if (A0W(c7tt.A0b, c7tt.A0r, c7tt.A0y, c7tt.A0o, c7tt.A1G)) {
                C81613kW c81613kW = c7tt.A0G;
                if (A0H(userSession, c81613kW) || A0G(userSession, c81613kW)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0K(UserSession userSession, C81613kW c81613kW) {
        if (!C18U.A06(C06090Tz.A05, userSession, 36322830480190131L)) {
            if (c81613kW != null && (c81613kW.A04.A01 & 512) > 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A0N(UserSession userSession, C2EC c2ec) {
        Long l;
        C1118752z Ay9;
        if (c2ec != null && (Ay9 = c2ec.Ay9()) != null) {
            l = Ay9.A04;
        } else {
            l = null;
        }
        boolean z = false;
        if (l != null) {
            z = true;
        }
        if (AbstractC109484wa.A00(userSession).A01() && A0T(userSession, z)) {
            return true;
        }
        return false;
    }

    public static final boolean A0T(UserSession userSession, boolean z) {
        if (z && C18U.A06(C06090Tz.A05, userSession, 36320283568120110L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0U(C81613kW c81613kW) {
        if (c81613kW != null && (c81613kW.A04.A01 & C3OO.FLAG_MOVED) > 0) {
            return true;
        }
        return false;
    }

    public static final boolean A0V(E70 e70) {
        boolean A002 = LCG.A00(e70.A0A);
        boolean z = e70.A0n;
        boolean z2 = false;
        if (e70.A09 == 1012) {
            z2 = true;
        }
        List A09 = e70.A09();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A09, 10));
        Iterator it = A09.iterator();
        while (it.hasNext()) {
            arrayList.add(((C32107E9f) it.next()).A00);
        }
        return A0W(arrayList, A002, z, z2, AbstractC31224Do7.A04((List) e70.A0a.getValue(), e70.A0C(), A002));
    }

    public static final boolean A04(UserSession userSession) {
        if (A05(userSession) && C18U.A06(C06090Tz.A05, userSession, 36323917106785981L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0C(UserSession userSession, C7TT c7tt, boolean z) {
        if (A0D(userSession, c7tt, z) && !c7tt.A0x && !c7tt.A14) {
            if (C161867Mw.A02(c7tt.A0G) && C18U.A06(C06090Tz.A05, userSession, 2342163292781224233L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0G(UserSession userSession, C81613kW c81613kW) {
        if (A0U(c81613kW) && C18U.A06(C06090Tz.A05, userSession, 2342168601357857974L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0H(UserSession userSession, C81613kW c81613kW) {
        if (A06(userSession)) {
            if ((c81613kW != null && (c81613kW.A04.A01 & 64) > 0) || A0K(userSession, c81613kW)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0J(UserSession userSession, C81613kW c81613kW) {
        if (!A0H(userSession, c81613kW) && !A0G(userSession, c81613kW)) {
            return false;
        }
        return true;
    }

    public static final boolean A0P(UserSession userSession, C2EC c2ec) {
        boolean CVQ = c2ec.CVQ();
        boolean CX1 = c2ec.CX1();
        boolean CPl = c2ec.CPl();
        if (A0W(c2ec.BSH(), CVQ, CX1, CPl, AbstractC31224Do7.A04(c2ec.BSH(), c2ec.isPending(), c2ec.CVQ())) && A05(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A0R(UserSession userSession, InterfaceC163837Ux interfaceC163837Ux) {
        C7TT C7W = interfaceC163837Ux.C7W();
        InterfaceC83713oG C7i = interfaceC163837Ux.C7i();
        C14360o3.A07(C7i);
        if (C7i instanceof InterfaceC83703oF) {
            if (A0W(C7W.A0b, C7W.A0r, C7W.A0y, C7W.A0o, C7W.A1G) && A05(userSession)) {
                return true;
            }
        }
        return false;
    }
}
