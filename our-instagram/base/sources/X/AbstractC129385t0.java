package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5t0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC129385t0 {
    public static final boolean A03(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        return C18U.A06(c06090Tz, userSession, 36326163374683864L) && C18U.A06(c06090Tz, userSession, 36326163375011546L);
    }

    public static final C5FS A00(C38321qM c38321qM) {
        InterfaceC39271s5 AaR;
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null && (AaR = injected.AaR()) != null) {
            return AaR.B5x();
        }
        return null;
    }

    public static final C5FT A01(C38321qM c38321qM) {
        InterfaceC39271s5 AaR;
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null && (AaR = injected.AaR()) != null) {
            return AaR.BJ2();
        }
        return null;
    }

    public static final boolean A02(InterfaceC39271s5 interfaceC39271s5, UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        if (interfaceC39271s5 != null && interfaceC39271s5.C1P() != null) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            boolean A06 = C18U.A06(c06090Tz, userSession, 36323680883650030L);
            C14360o3.A0A(Boolean.valueOf(A06));
            if (A06) {
                return true;
            }
        }
        return false;
    }
}
