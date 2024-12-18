package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.77s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1580877s {
    public static final String A00(C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 0);
        C2EY c2ey = c83403nh.A10;
        AbstractC1580977t abstractC1580977t = AbstractC1580977t.$redex_init_class;
        int ordinal = c2ey.ordinal();
        if (ordinal != 2) {
            if (ordinal != 11) {
                return c83403nh.A1q;
            }
            Object obj = c83403nh.A1T;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectLink");
            return ((C206409Bx) obj).A01;
        }
        Object obj2 = c83403nh.A1T;
        if (obj2 instanceof List) {
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (List) obj2) {
                if (obj3 instanceof String) {
                    arrayList.add(obj3);
                }
            }
            obj2 = AbstractC001800i.A0L(arrayList);
        } else if (obj2 instanceof String) {
            C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
        } else {
            return "";
        }
        return (String) obj2;
    }

    public static final boolean A01(UserSession userSession, C83403nh c83403nh) {
        String str;
        if (!C18U.A06(C06090Tz.A05, userSession, 36319377327988025L)) {
            return true;
        }
        synchronized (c83403nh) {
            str = c83403nh.A1g;
        }
        if (str == null) {
            return false;
        }
        return !C14360o3.A0K(AbstractC001900j.A0R(str, new String[]{"_"}, 0).get(0), AbstractC001900j.A0R(C1Q2.A00(), new String[]{"_"}, 0).get(0));
    }

    public static final boolean A03(C83403nh c83403nh) {
        String str;
        String A0p;
        synchronized (c83403nh) {
            str = c83403nh.A1s;
        }
        if (!AbstractC002300n.A0g(str, C1Q2.A00(), false) || (A0p = c83403nh.A0p()) == null || A0p.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C160787Im c160787Im) {
        String str;
        String A0p;
        C83403nh c83403nh = c160787Im.A0e;
        synchronized (c83403nh) {
            str = c83403nh.A1s;
        }
        if (!AbstractC002300n.A0g(str, C1Q2.A00(), false) || (A0p = c83403nh.A0p()) == null || A0p.length() == 0) {
            return false;
        }
        return true;
    }

    public final String A04(UserSession userSession, C160787Im c160787Im) {
        String A00;
        C83403nh c83403nh = c160787Im.A0e;
        String A0p = c83403nh.A0p();
        if (A0p != null && A02(c160787Im) && c160787Im.A0N == C05F.A01) {
            if ((c160787Im.A0G.A08 != 29 || C14360o3.A0K(userSession.userId, c83403nh.BtE())) && (A00 = A00(c83403nh)) != null) {
                int length = A00.length();
                c160787Im.A09 = new C51737MtK(length, length + 1 + A0p.length(), 16);
                return AnonymousClass001.A0T(A00, A0p, '\n');
            }
        } else {
            A0p = A00(c83403nh);
            if (A0p == null) {
                return "";
            }
        }
        return A0p;
    }
}
