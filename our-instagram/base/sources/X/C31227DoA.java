package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DoA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31227DoA {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final InterfaceC16820sZ A03;

    public C31227DoA(Context context, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 3);
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = interfaceC16820sZ;
        this.A02 = C37054GUk.A00(this, 25);
    }

    public final boolean A09(C2EC c2ec) {
        UserSession userSession = this.A01;
        if (MU6.A01(userSession, c2ec) && A06(c2ec)) {
            return true;
        }
        if (c2ec.BI1() == 0 && A05(c2ec)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36314910560357284L) || !A08(c2ec)) {
                boolean CVQ = c2ec.CVQ();
                if (AbstractC14490oL.A0C(this.A00)) {
                    return ((!C18U.A06(c06090Tz, userSession, 2342153676346360044L) && !A0D(CVQ)) || c2ec.CX1() || c2ec.CbK() || A00(c2ec.C7g())) ? false : true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean A0B(C7T2 c7t2) {
        String CEy;
        if (!c7t2.CLw() || (CEy = c7t2.CEy()) == null || !((AbstractC27671Vv) this.A02.getValue()).A04(this.A01, CEy)) {
            return false;
        }
        return true;
    }

    public final boolean A0C(C7T2 c7t2) {
        C14360o3.A0B(c7t2, 0);
        UserSession userSession = this.A01;
        boolean z = true;
        if (c7t2.C7g() != 1014 || !C18U.A06(C06090Tz.A05, userSession, 36331291565638888L)) {
            z = false;
        }
        if (z && c7t2.CeV(this.A00, userSession)) {
            return true;
        }
        if (MU6.A04(userSession, c7t2) && c7t2.CeU(this.A00, userSession)) {
            return true;
        }
        if (c7t2.CLw() && c7t2.CWf()) {
            Context context = this.A00;
            if (c7t2.CeT(context, userSession)) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession, 36314910560357284L) || !c7t2.CfZ(context, userSession)) {
                    boolean CVQ = c7t2.CVQ();
                    if (AbstractC14490oL.A0C(context)) {
                        if ((C18U.A06(c06090Tz, userSession, 2342153676346360044L) || A0D(CVQ)) && !c7t2.CX1() && !c7t2.CbK() && !A00(c7t2.C7g())) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean A01(C31227DoA c31227DoA, String str, List list) {
        if (str == null) {
            List list2 = list;
            if (list == null) {
                list2 = C16930sl.A00;
            }
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((User) it.next()).BJ8() == 1) {
                        return false;
                    }
                }
            }
        }
        if (list == null) {
            list = C16930sl.A00;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((User) it2.next()).isVerified()) {
                if (!C18U.A06(C06090Tz.A05, c31227DoA.A01, 36316126036103172L)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final boolean A0D(boolean z) {
        UserSession userSession = this.A01;
        boolean isVerified = AbstractC166997dE.A0Y(userSession).isVerified();
        if (!z && isVerified && C18U.A06(C06090Tz.A05, userSession, 36315460316171516L)) {
            return true;
        }
        return false;
    }

    public static final boolean A00(int i) {
        if (!C4GR.A02(i)) {
            Integer valueOf = Integer.valueOf(i);
            if (!C4GR.A07(valueOf) && !C4GR.A08(valueOf)) {
                return false;
            }
        }
        return true;
    }

    private final boolean A02(C7T2 c7t2) {
        String CEy = c7t2.CEy();
        if (!AbstractC25229BEm.A1a(c7t2.B06(), EnumC53137Neq.A03)) {
            if (CEy == null || CEy.length() == 0 || ((AbstractC27671Vv) this.A02.getValue()).A03(this.A01, CEy)) {
                return false;
            }
        } else if (!c7t2.CKg() && !c7t2.CKe()) {
            return false;
        }
        return true;
    }

    public final boolean A03(C2ED c2ed) {
        String CEy = c2ed.CEy();
        if (CEy != null && CEy.length() != 0 && !((AbstractC27671Vv) this.A02.getValue()).A03(this.A01, CEy) && ((C81663kb) c2ed).A01.A2K) {
            return true;
        }
        return false;
    }

    public final boolean A04(C2ED c2ed) {
        String CEy = c2ed.CEy();
        if (CEy != null && CEy.length() != 0 && !((AbstractC27671Vv) this.A02.getValue()).A03(this.A01, CEy) && !((C81663kb) c2ed).A01.A2K) {
            return true;
        }
        return false;
    }

    public final boolean A05(C2EC c2ec) {
        if (c2ec.BYJ() > 1) {
            if (c2ec.C7I() == null || !AbstractC31283Dp5.A00(c2ec)) {
                if (!C18U.A06(C06090Tz.A05, this.A01, 36312093061809036L)) {
                    return false;
                }
            }
            if (AbstractC31225Do8.A00(c2ec) || C9Gw.A00(c2ec)) {
                return false;
            }
            UserSession userSession = this.A01;
            if (AbstractC207689Gy.A04(userSession, c2ec) || AbstractC207679Gx.A00(userSession, c2ec)) {
                return false;
            }
            boolean isPending = c2ec.isPending();
            boolean CVQ = c2ec.CVQ();
            if (!AbstractC31224Do7.A02(c2ec.BSH(), c2ec.BT2(), isPending, CVQ) && !c2ec.CX1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A06(C2EC c2ec) {
        if (!AbstractC31225Do8.A00(c2ec) && !AbstractC207689Gy.A04(this.A01, c2ec) && !AbstractC31224Do7.A00(c2ec)) {
            return true;
        }
        return false;
    }

    public final boolean A07(C2EC c2ec) {
        if (!AbstractC31225Do8.A00(c2ec) && !AbstractC207689Gy.A04(this.A01, c2ec) && !AbstractC31224Do7.A00(c2ec)) {
            return true;
        }
        return false;
    }

    public final boolean A08(C2EC c2ec) {
        User user = (User) AbstractC001800i.A0N(c2ec.BSH());
        if (user != null && user.A0I() == EnumC222416a.A05 && user.isVerified()) {
            return true;
        }
        return false;
    }

    public final boolean A0A(C7T2 c7t2) {
        if (A02(c7t2) && !c7t2.CKe()) {
            return true;
        }
        if (A02(c7t2) && c7t2.CKe()) {
            return true;
        }
        return false;
    }
}
