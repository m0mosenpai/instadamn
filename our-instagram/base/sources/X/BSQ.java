package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class BSQ {
    public static final void A01(InterfaceC103524lS interfaceC103524lS, UserSession userSession, String str) {
        String str2;
        AbstractC167007dF.A1D(userSession, 0, str);
        C38321qM A00 = A00(userSession, str);
        if (A00 != null) {
            List A3j = A00.A3j();
            if (A3j == null) {
                A3j = C16930sl.A00;
            }
            ArrayList A0U = AbstractC001800i.A0U(A3j);
            InterfaceC103524lS interfaceC103524lS2 = (InterfaceC103524lS) AbstractC001800i.A0J(A0U);
            if (interfaceC103524lS2 != null) {
                str2 = interfaceC103524lS2.getUserId();
            } else {
                str2 = null;
            }
            if (C14360o3.A0K(str2, userSession.userId)) {
                A0U.set(0, interfaceC103524lS);
            } else {
                A0U.add(0, interfaceC103524lS);
            }
            A00.A4Q(A0U);
            C1DW.A00(userSession).A03(A00);
        }
    }

    public static final C38321qM A00(UserSession userSession, String str) {
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h == null) {
            return null;
        }
        return A0h.A1g(userSession);
    }

    public static final void A02(UserSession userSession, String str, String str2, boolean z) {
        C38321qM A00 = A00(userSession, str);
        if (A00 != null) {
            List<InterfaceC103524lS> A3j = A00.A3j();
            if (A3j == null) {
                A3j = C16930sl.A00;
            }
            ArrayList A0q = AbstractC167017dG.A0q(A3j);
            for (InterfaceC103524lS interfaceC103524lS : A3j) {
                if (C14360o3.A0K(interfaceC103524lS.getId(), str2)) {
                    CUR AKP = interfaceC103524lS.AKP();
                    AKP.A02 = Boolean.valueOf(z);
                    interfaceC103524lS = AKP.A00();
                }
                A0q.add(interfaceC103524lS);
            }
            A00.A4Q(A0q);
            C1DW.A00(userSession).A03(A00);
        }
    }
}
