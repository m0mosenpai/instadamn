package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FfZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35182FfZ {
    public static final void A00(Context context) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131965083);
        A0I.A09(2131965082);
        A0I.A0R(DialogInterfaceOnClickListenerC35427Fjk.A00, EnumC193348hE.A04, 2131965081);
        AbstractC166987dD.A1W(A0I);
    }

    public static final void A01(Context context, InterfaceC16820sZ interfaceC16820sZ) {
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131965087);
        A0I.A09(2131965084);
        A0I.A0K(DialogInterfaceOnClickListenerC35454FkB.A00(interfaceC16820sZ, 14), 2131965085);
        AbstractC31176DnK.A16(null, A0I, 2131965086);
    }

    public static final boolean A02(UserSession userSession) {
        Boolean BCF;
        Boolean BC0;
        User A0T = AbstractC31178DnM.A0T(userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36317401643291776L) && A0T.isVerified() && (((BCF = A0T.A03.BCF()) == null || !BCF.booleanValue()) && (BC0 = A0T.A03.BC0()) != null && BC0.booleanValue())) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        User A10 = AbstractC166987dD.A10(userSession);
        if (C18U.A06(C06090Tz.A05, userSession, 36317401643291776L) && A10.isVerified()) {
            Boolean BCF = A10.A03.BCF();
            if (BCF == null || !BCF.booleanValue()) {
                Boolean BC0 = A10.A03.BC0();
                if (BC0 == null || !BC0.booleanValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
