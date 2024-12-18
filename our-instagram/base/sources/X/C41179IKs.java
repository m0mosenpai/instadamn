package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IKs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41179IKs {
    public final List A00(Context context, UserSession userSession, C38321qM c38321qM, boolean z) {
        List<JKA> AvR;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 1), userSession, 36323019458620266L)) {
            List<InterfaceC1118152j> AvS = c38321qM.A0C.AvS();
            if (AvS != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                for (InterfaceC1118152j interfaceC1118152j : AvS) {
                    A1E.add(new HE0(context, interfaceC1118152j, userSession, interfaceC1118152j.getId(), ""));
                }
                return A1E;
            }
        } else if (z) {
            List<JKF> AvR2 = c38321qM.A0C.AvR();
            if (AvR2 != null) {
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (JKF jkf : AvR2) {
                    String Byp = jkf.Byp();
                    if (Byp != null) {
                        A1E2.add(new HE0(context, null, userSession, jkf.Byk(), Byp));
                    }
                }
                return A1E2;
            }
        } else {
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            if (A0u != null && (AvR = A0u.AvR()) != null) {
                ArrayList A1E3 = AbstractC166987dD.A1E();
                for (JKA jka : AvR) {
                    String Byp2 = jka.Byp();
                    if (Byp2 != null) {
                        A1E3.add(new HE0(context, null, userSession, jka.Byk(), Byp2));
                    }
                }
                return A1E3;
            }
        }
        return C16930sl.A00;
    }
}
