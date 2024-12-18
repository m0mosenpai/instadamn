package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gho, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37655Gho {
    public static final java.util.Set A00;
    public static final java.util.Set A01;
    public static final java.util.Set A02;

    public static final EnumC37735GjA A00(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.CdW()) {
            return EnumC37735GjA.A02;
        }
        if (c38321qM.A5M()) {
            if (c38321qM.A5p()) {
                return EnumC37735GjA.A03;
            }
            if (c38321qM.A6V(0)) {
                return EnumC37735GjA.A05;
            }
            C38321qM A1e = c38321qM.A1e(0);
            if (A1e != null && A1e.A5x()) {
                return EnumC37735GjA.A04;
            }
            throw new IllegalStateException("ClipsOrganicType: Unsupported carousel type");
        }
        if (c38321qM.Cff()) {
            return EnumC37735GjA.A06;
        }
        if (c38321qM.A5x()) {
            if (c38321qM.A5p()) {
                return EnumC37735GjA.A08;
            }
            return EnumC37735GjA.A07;
        }
        return EnumC37735GjA.A09;
    }

    public static final boolean A03(C120985dq c120985dq) {
        EnumC37735GjA enumC37735GjA;
        C14360o3.A0B(c120985dq, 0);
        java.util.Set set = A00;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            enumC37735GjA = A00(c38321qM);
        } else {
            enumC37735GjA = null;
        }
        return AbstractC001800i.A0u(set, enumC37735GjA);
    }

    public static final boolean A05(C120985dq c120985dq, UserSession userSession) {
        InterfaceC104924o5 interfaceC104924o5;
        C14360o3.A0B(c120985dq, 0);
        C14360o3.A0B(userSession, 1);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && A00(c38321qM).equals(EnumC37735GjA.A03)) {
            return true;
        }
        if (c120985dq.A0F() && (interfaceC104924o5 = c120985dq.A06().A0I) != null && interfaceC104924o5.BVT() != null && C18U.A06(C06090Tz.A05, userSession, 36320506902946397L)) {
            return true;
        }
        return false;
    }

    static {
        EnumC37735GjA enumC37735GjA = EnumC37735GjA.A03;
        A00 = AbstractC16830sb.A07(enumC37735GjA, EnumC37735GjA.A04, EnumC37735GjA.A05);
        EnumC37735GjA enumC37735GjA2 = EnumC37735GjA.A08;
        A02 = AbstractC16830sb.A07(enumC37735GjA2, EnumC37735GjA.A07);
        A01 = AbstractC16830sb.A07(enumC37735GjA2, enumC37735GjA);
    }

    public static final List A01(C120985dq c120985dq) {
        List list = c120985dq.A0R;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                C38321qM c38321qM = (C38321qM) obj;
                if (c38321qM.Cff() || c38321qM.A5p()) {
                    A1E.add(obj);
                }
            }
            return A1E;
        }
        return null;
    }

    public static final boolean A02(C120985dq c120985dq) {
        List A012;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null || !c38321qM.A5M() || (A012 = A01(c120985dq)) == null || !(!A012.isEmpty())) {
            return false;
        }
        return true;
    }

    public static final boolean A04(C120985dq c120985dq) {
        EnumC37735GjA enumC37735GjA;
        java.util.Set set = A02;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            enumC37735GjA = A00(c38321qM);
        } else {
            enumC37735GjA = null;
        }
        if (!AbstractC001800i.A0u(set, enumC37735GjA) && !A03(c120985dq)) {
            return false;
        }
        return true;
    }
}
