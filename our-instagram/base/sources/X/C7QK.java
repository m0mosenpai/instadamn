package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7QK, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7QK {
    public static final C7QL A00(UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c160787Im, 1);
        C14360o3.A0B(c7im, 2);
        C14360o3.A0B(anonymousClass988, 3);
        return A02(userSession, anonymousClass988, c160787Im, c7im, c160787Im.A0e.A10, null, null, AbstractC09440dt.A01(C7SV.A00), false);
    }

    public static final C7QL A01(UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, AnonymousClass442 anonymousClass442, C2EY c2ey) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c2ey, 3);
        C14360o3.A0B(c7im, 4);
        C14360o3.A0B(anonymousClass988, 5);
        C17050sx A01 = AbstractC09440dt.A01(new C9E3(null, 0));
        boolean A0K = C14360o3.A0K(anonymousClass442.A0U, userSession.userId);
        boolean z = false;
        if (c160787Im.A0e.A2P != c160787Im.A0G.A0x) {
            z = true;
        }
        return new C7QL(anonymousClass988, c7im, c2ey, A01, true, A0K, false, false, z, c160787Im.A0Y);
    }

    public static final C7QL A02(UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C2EY c2ey, Boolean bool, Boolean bool2, InterfaceC09390do interfaceC09390do, boolean z) {
        boolean z2;
        boolean z3;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c160787Im, 1);
        C14360o3.A0B(c7im, 2);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(interfaceC09390do, 4);
        C14360o3.A0B(c2ey, 8);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        boolean A1j = c83403nh.A1j(C08730cb.A00(userSession).A00());
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = c160787Im.A0U;
        }
        if (bool2 != null) {
            z3 = bool2.booleanValue();
        } else {
            z3 = c160787Im.A0V;
        }
        boolean z4 = false;
        if (c83403nh.A2P != c160787Im.A0G.A0x) {
            z4 = true;
        }
        return new C7QL(anonymousClass988, c7im, c2ey, interfaceC09390do, z, A1j, z2, z3, z4, c160787Im.A0Y);
    }

    public static final C7QL A04(UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C2EY c2ey, InterfaceC09390do interfaceC09390do) {
        return A02(userSession, anonymousClass988, c160787Im, c7im, c2ey, null, null, interfaceC09390do, false);
    }

    public static final C7QL A03(UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C2EY c2ey, InterfaceC09390do interfaceC09390do) {
        Boolean bool = Boolean.FALSE;
        return A02(userSession, anonymousClass988, c160787Im, c7im, c2ey, bool, bool, interfaceC09390do, false);
    }
}
