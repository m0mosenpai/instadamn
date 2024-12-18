package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.98R, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C98R {
    public final UserSession A00;
    public final C2DS A01;
    public final Map A02;

    public C98R(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        Map A00 = C98S.A00();
        C2DS A002 = AbstractC28761aE.A00(userSession);
        C14360o3.A0B(A00, 2);
        C14360o3.A0B(A002, 3);
        this.A00 = userSession;
        this.A02 = A00;
        this.A01 = A002;
    }

    public final boolean A00(InterfaceC83713oG interfaceC83713oG, int i) {
        C98U c98u;
        if (interfaceC83713oG == null || (c98u = (C98U) this.A02.get(Integer.valueOf(i))) == null) {
            return false;
        }
        InterfaceC83703oF A02 = AbstractC140946Yw.A02(interfaceC83713oG);
        if (A02 == null) {
            UserSession userSession = this.A00;
            if (c98u instanceof C2055398c) {
                C47142Eg A00 = AbstractC47132Ef.A00(userSession);
                if (!((Boolean) A00.A0Z.get()).booleanValue() && !((Boolean) A00.A0R.get()).booleanValue()) {
                    return false;
                }
            } else {
                if (c98u instanceof C2055998i) {
                    return false;
                }
                if (c98u instanceof C2055198a) {
                    return C18U.A06(C06090Tz.A06, userSession, 36317045159105302L);
                }
                if ((c98u instanceof C2055798g) || (c98u instanceof C2055598e)) {
                    return false;
                }
                if (c98u instanceof C98W) {
                    return ((C98W) c98u).A00;
                }
            }
            return true;
        }
        C81663kb B3U = this.A01.B3U(AbstractC140956Yx.A01(A02));
        if (B3U != null) {
            return C98S.A01(this.A00, B3U, c98u);
        }
        return false;
    }
}
